package typings.activexLibreoffice.com_.sun.star.chart2.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightedRange extends js.Object {
  /**
    * If the highlighted range is visually highlighted and this member is `TRUE` , the range given in {@link RangeRepresentation} may be included in a
    * merged range rectangle spanning a bigger range.
    */
  var AllowMerginigWithOtherRanges: Boolean
  /** Only take the cell at position Index out of the given Range. If this value is -1 take the whole sequence. */
  var Index: Double
  /** Use this color for marking the range. This color may be ignored and replaced by a better fitting color, if it would be otherwise not well visible. */
  var PreferredColor: Double
  /** The range representation string of the highlighted range. */
  var RangeRepresentation: String
}

object HighlightedRange {
  @scala.inline
  def apply(
    AllowMerginigWithOtherRanges: Boolean,
    Index: Double,
    PreferredColor: Double,
    RangeRepresentation: String
  ): HighlightedRange = {
    val __obj = js.Dynamic.literal(AllowMerginigWithOtherRanges = AllowMerginigWithOtherRanges.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], PreferredColor = PreferredColor.asInstanceOf[js.Any], RangeRepresentation = RangeRepresentation.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightedRange]
  }
}

