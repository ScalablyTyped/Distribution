package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentGroup extends js.Object {
  /**
    * List of dimensions to include or exclude.
    */
  var Dimensions: js.UndefOr[ListOfSegmentDimensions] = js.undefined
  /**
    * The base segment that you build your segment on. The source segment defines the starting "universe" of endpoints. When you add dimensions to the segment, it filters the source segment based on the dimensions that you specify. You can specify more than one dimensional segment. You can only specify one imported segment.
  NOTE: If you specify an imported segment for this attribute, the segment size estimate that appears in the Amazon Pinpoint console shows the size of the imported segment, without any filters applied to it.
    */
  var SourceSegments: js.UndefOr[ListOfSegmentReference] = js.undefined
  /**
    * Specify how to handle multiple source segments. For example, if you specify three source segments, should the resulting segment be based on any or all of the segments? Acceptable values: ANY or ALL.
    */
  var SourceType: js.UndefOr[SourceType] = js.undefined
  /**
    * Specify how to handle multiple segment dimensions. For example, if you specify three dimensions, should the resulting segment include endpoints that are matched by all, any, or none of the dimensions? Acceptable values: ALL, ANY, or NONE.
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

