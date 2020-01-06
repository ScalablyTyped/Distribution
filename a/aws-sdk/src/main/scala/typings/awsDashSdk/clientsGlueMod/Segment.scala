package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Segment extends js.Object {
  /**
    * The zero-based index number of the segment. For example, if the total number of segments is 4, SegmentNumber values range from 0 through 3.
    */
  var SegmentNumber: NonNegativeInteger = js.native
  /**
    * The total number of segments.
    */
  var TotalSegments: TotalSegmentsInteger = js.native
}

object Segment {
  @scala.inline
  def apply(SegmentNumber: NonNegativeInteger, TotalSegments: TotalSegmentsInteger): Segment = {
    val __obj = js.Dynamic.literal(SegmentNumber = SegmentNumber.asInstanceOf[js.Any], TotalSegments = TotalSegments.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Segment]
  }
}

