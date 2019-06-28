package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteSegmentRequest extends js.Object {
  /**
    * The criteria that define the dimensions for the segment.
    */
  var Dimensions: js.UndefOr[SegmentDimensions] = js.undefined
  /**
    * The name of the segment.
    */
  var Name: js.UndefOr[__string] = js.undefined
  /**
    * The segment group to use and the dimensions to apply to the group's base segments in order to build the segment. A segment group can consist of zero or more base segments. Your request can include only one segment group.
    */
  var SegmentGroups: js.UndefOr[SegmentGroupList] = js.undefined
  /**
    * A string-to-string map of key-value pairs that defines the tags to associate with the segment. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOf__string] = js.undefined
}

object WriteSegmentRequest {
  @scala.inline
  def apply(
    Dimensions: SegmentDimensions = null,
    Name: __string = null,
    SegmentGroups: SegmentGroupList = null,
    tags: MapOf__string = null
  ): WriteSegmentRequest = {
    val __obj = js.Dynamic.literal()
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (SegmentGroups != null) __obj.updateDynamic("SegmentGroups")(SegmentGroups)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[WriteSegmentRequest]
  }
}

