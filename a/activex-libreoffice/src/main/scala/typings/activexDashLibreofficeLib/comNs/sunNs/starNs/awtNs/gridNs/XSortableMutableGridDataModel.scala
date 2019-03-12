package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes a grid control data model whose data can be modified and sorted. */
trait XSortableMutableGridDataModel
  extends XMutableGridDataModel
     with XSortableGridData

object XSortableMutableGridDataModel {
  @scala.inline
  def apply(
    ColumnCount: scala.Double,
    CurrentSortOrder: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Pair[scala.Double, scala.Boolean],
    RowCount: scala.Double,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addGridDataListener: XGridDataListener => scala.Unit,
    addRow: (js.Any, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]) => scala.Unit,
    addRows: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]]) => scala.Unit,
    createClone: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable,
    dispose: () => scala.Unit,
    getCellData: (scala.Double, scala.Double) => js.Any,
    getCellToolTip: (scala.Double, scala.Double) => js.Any,
    getCurrentSortOrder: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Pair[scala.Double, scala.Boolean],
    getRowData: scala.Double => stdLib.SafeArray[_],
    getRowHeading: scala.Double => js.Any,
    insertRow: (scala.Double, js.Any, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]) => scala.Unit,
    insertRows: (scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]]) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeAllRows: () => scala.Unit,
    removeColumnSort: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeGridDataListener: XGridDataListener => scala.Unit,
    removeRow: scala.Double => scala.Unit,
    sortByColumn: (scala.Double, scala.Boolean) => scala.Unit,
    updateCellData: (scala.Double, scala.Double, js.Any) => scala.Unit,
    updateCellToolTip: (scala.Double, scala.Double, js.Any) => scala.Unit,
    updateRowData: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]) => scala.Unit,
    updateRowHeading: (scala.Double, js.Any) => scala.Unit,
    updateRowToolTip: (scala.Double, js.Any) => scala.Unit
  ): XSortableMutableGridDataModel = {
    val __obj = js.Dynamic.literal(ColumnCount = ColumnCount, CurrentSortOrder = CurrentSortOrder, RowCount = RowCount, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addGridDataListener = js.Any.fromFunction1(addGridDataListener), addRow = js.Any.fromFunction2(addRow), addRows = js.Any.fromFunction2(addRows), createClone = js.Any.fromFunction0(createClone), dispose = js.Any.fromFunction0(dispose), getCellData = js.Any.fromFunction2(getCellData), getCellToolTip = js.Any.fromFunction2(getCellToolTip), getCurrentSortOrder = js.Any.fromFunction0(getCurrentSortOrder), getRowData = js.Any.fromFunction1(getRowData), getRowHeading = js.Any.fromFunction1(getRowHeading), insertRow = js.Any.fromFunction3(insertRow), insertRows = js.Any.fromFunction3(insertRows), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAllRows = js.Any.fromFunction0(removeAllRows), removeColumnSort = js.Any.fromFunction0(removeColumnSort), removeEventListener = js.Any.fromFunction1(removeEventListener), removeGridDataListener = js.Any.fromFunction1(removeGridDataListener), removeRow = js.Any.fromFunction1(removeRow), sortByColumn = js.Any.fromFunction2(sortByColumn), updateCellData = js.Any.fromFunction3(updateCellData), updateCellToolTip = js.Any.fromFunction3(updateCellToolTip), updateRowData = js.Any.fromFunction3(updateRowData), updateRowHeading = js.Any.fromFunction2(updateRowHeading), updateRowToolTip = js.Any.fromFunction2(updateRowToolTip))
  
    __obj.asInstanceOf[XSortableMutableGridDataModel]
  }
}

