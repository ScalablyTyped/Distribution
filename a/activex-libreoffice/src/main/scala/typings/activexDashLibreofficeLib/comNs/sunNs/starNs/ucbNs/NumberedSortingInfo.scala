package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains information for sorting a {@link ContentResultSet} .
  *
  * In contrast to the struct {@link SortingInfo} this struct is used to be on the safe side, that no one asks for sorting by a property which is not
  * contained in a {@link ContentResultSet} .
  */
trait NumberedSortingInfo extends js.Object {
  /** contains a flag indicating the sort mode (ascending or descending). */
  var Ascending: scala.Boolean
  /** sort the result set by this column. Index starts with `1` . */
  var ColumnIndex: scala.Double
}

object NumberedSortingInfo {
  @scala.inline
  def apply(Ascending: scala.Boolean, ColumnIndex: scala.Double): NumberedSortingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Ascending")(Ascending)
    __obj.updateDynamic("ColumnIndex")(ColumnIndex)
    __obj.asInstanceOf[NumberedSortingInfo]
  }
}

