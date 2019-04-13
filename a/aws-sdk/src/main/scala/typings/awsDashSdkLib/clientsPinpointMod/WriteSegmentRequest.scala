package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteSegmentRequest extends js.Object {
  /**
    * The segment dimensions attributes.
    */
  var Dimensions: js.UndefOr[SegmentDimensions] = js.undefined
  /**
    * The name of segment
    */
  var Name: js.UndefOr[__string] = js.undefined
  /**
    * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source segments. Your request can only include one segment group. Your request can include either a SegmentGroups object or a Dimensions object, but not both.
    */
  var SegmentGroups: js.UndefOr[SegmentGroupList] = js.undefined
  /**
    * The Tags for the segments.
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

