package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Segment extends js.Object {
  /**
    * The zero-based index number of the this segment. For example, if the total number of segments is 4, SegmentNumber values will range from zero through three.
    */
  var SegmentNumber: NonNegativeInteger
  /**
    * The total numer of segments.
    */
  var TotalSegments: TotalSegmentsInteger
}

object Segment {
  @scala.inline
  def apply(SegmentNumber: NonNegativeInteger, TotalSegments: TotalSegmentsInteger): Segment = {
    val __obj = js.Dynamic.literal(SegmentNumber = SegmentNumber, TotalSegments = TotalSegments)
  
    __obj.asInstanceOf[Segment]
  }
}

