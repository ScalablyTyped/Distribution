package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to sort the data represented by a {@link XGridDataModel} */
trait XSortableGridData extends js.Object {
  /**
    * returns the current sort order.
    * @returns a structure describing the current sort order. com::sun::star::beans::Pair::First denotes the column by which the data is sorted, or -1 if the da
    */
  val CurrentSortOrder: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Pair[scala.Double, scala.Boolean]
  /**
    * returns the current sort order.
    * @returns a structure describing the current sort order. com::sun::star::beans::Pair::First denotes the column by which the data is sorted, or -1 if the da
    */
  def getCurrentSortOrder(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Pair[scala.Double, scala.Boolean]
  /** removes any possibly present sorting of the grid data */
  def removeColumnSort(): scala.Unit
  /**
    * sorts the rows represented by the model by a given column's data.
    * @param ColumnIndex the index of the column whose data should be used as sort key
    * @param SortAscending is `TRUE` if the data should be sorted ascending, `FALSE` otherwise.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `ColumnIndex` does not denote a valid column.
    */
  def sortByColumn(ColumnIndex: scala.Double, SortAscending: scala.Boolean): scala.Unit
}

object XSortableGridData {
  @scala.inline
  def apply(
    CurrentSortOrder: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Pair[scala.Double, scala.Boolean],
    getCurrentSortOrder: js.Function0[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Pair[scala.Double, scala.Boolean]
    ],
    removeColumnSort: js.Function0[scala.Unit],
    sortByColumn: js.Function2[scala.Double, scala.Boolean, scala.Unit]
  ): XSortableGridData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CurrentSortOrder")(CurrentSortOrder)
    __obj.updateDynamic("getCurrentSortOrder")(getCurrentSortOrder)
    __obj.updateDynamic("removeColumnSort")(removeColumnSort)
    __obj.updateDynamic("sortByColumn")(sortByColumn)
    __obj.asInstanceOf[XSortableGridData]
  }
}

