package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentGroup extends js.Object {
  /**
    * An array that defines the dimensions for the segment.
    */
  var Dimensions: js.UndefOr[ListOfSegmentDimensions] = js.undefined
  /**
    * The base segment to build the segment on. A base segment, also referred to as a source segment, defines the initial population of endpoints for a segment. When you add dimensions to a segment, Amazon Pinpoint filters the base segment by using the dimensions that you specify. You can specify more than one dimensional segment or only one imported segment. If you specify an imported segment, the Amazon Pinpoint console displays a segment size estimate that indicates the size of the imported segment without any filters applied to it.
    */
  var SourceSegments: js.UndefOr[ListOfSegmentReference] = js.undefined
  /**
    * Specifies how to handle multiple base segments for the segment. For example, if you specify three base segments for the segment, whether the resulting segment is based on all, any, or none of the base segments.
    */
  var SourceType: js.UndefOr[SourceType] = js.undefined
  /**
    * Specifies how to handle multiple dimensions for the segment. For example, if you specify three dimensions for the segment, whether the resulting segment includes endpoints that match all, any, or none of the dimensions.
    */
  var Type: js.UndefOr[Type] = js.undefined
}

object SegmentGroup {
  @scala.inline
  def apply(
    Dimensions: ListOfSegmentDimensions = null,
    SourceSegments: ListOfSegmentReference = null,
    SourceType: SourceType = null,
    Type: Type = null
  ): SegmentGroup = {
    val __obj = js.Dynamic.literal()
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions)
    if (SourceSegments != null) __obj.updateDynamic("SourceSegments")(SourceSegments)
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentGroup]
  }
}

