package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightedRange extends js.Object {
  /**
    * If the highlighted range is visually highlighted and this member is `TRUE` , the range given in {@link RangeRepresentation} may be included in a
    * merged range rectangle spanning a bigger range.
    */
  var AllowMerginigWithOtherRanges: scala.Boolean
  /** Only take the cell at position Index out of the given Range. If this value is -1 take the whole sequence. */
  var Index: scala.Double
  /** Use this color for marking the range. This color may be ignored and replaced by a better fitting color, if it would be otherwise not well visible. */
  var PreferredColor: scala.Double
  /** The range representation string of the highlighted range. */
  var RangeRepresentation: java.lang.String
}

