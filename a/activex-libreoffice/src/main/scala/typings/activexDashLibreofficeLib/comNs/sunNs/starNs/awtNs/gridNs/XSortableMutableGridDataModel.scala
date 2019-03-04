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
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addGridDataListener: js.Function1[XGridDataListener, scala.Unit],
    addRow: js.Function2[js.Any, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    addRows: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]], 
      scala.Unit
    ],
    createClone: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable],
    dispose: js.Function0[scala.Unit],
    getCellData: js.Function2[scala.Double, scala.Double, js.Any],
    getCellToolTip: js.Function2[scala.Double, scala.Double, js.Any],
    getCurrentSortOrder: js.Function0[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Pair[scala.Double, scala.Boolean]
    ],
    getRowData: js.Function1[scala.Double, activexDashInteropLib.SafeArray[_]],
    getRowHeading: js.Function1[scala.Double, js.Any],
    insertRow: js.Function3[scala.Double, js.Any, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    insertRows: js.Function3[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]], 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeAllRows: js.Function0[scala.Unit],
    removeColumnSort: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeGridDataListener: js.Function1[XGridDataListener, scala.Unit],
    removeRow: js.Function1[scala.Double, scala.Unit],
    sortByColumn: js.Function2[scala.Double, scala.Boolean, scala.Unit],
    updateCellData: js.Function3[scala.Double, scala.Double, js.Any, scala.Unit],
    updateCellToolTip: js.Function3[scala.Double, scala.Double, js.Any, scala.Unit],
    updateRowData: js.Function3[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      scala.Unit
    ],
    updateRowHeading: js.Function2[scala.Double, js.Any, scala.Unit],
    updateRowToolTip: js.Function2[scala.Double, js.Any, scala.Unit]
  ): XSortableMutableGridDataModel = {
    val __obj = js.Dynamic.literal(ColumnCount = ColumnCount, CurrentSortOrder = CurrentSortOrder, RowCount = RowCount, acquire = acquire, addEventListener = addEventListener, addGridDataListener = addGridDataListener, addRow = addRow, addRows = addRows, createClone = createClone, dispose = dispose, getCellData = getCellData, getCellToolTip = getCellToolTip, getCurrentSortOrder = getCurrentSortOrder, getRowData = getRowData, getRowHeading = getRowHeading, insertRow = insertRow, insertRows = insertRows, queryInterface = queryInterface, release = release, removeAllRows = removeAllRows, removeColumnSort = removeColumnSort, removeEventListener = removeEventListener, removeGridDataListener = removeGridDataListener, removeRow = removeRow, sortByColumn = sortByColumn, updateCellData = updateCellData, updateCellToolTip = updateCellToolTip, updateRowData = updateRowData, updateRowHeading = updateRowHeading, updateRowToolTip = updateRowToolTip)
  
    __obj.asInstanceOf[XSortableMutableGridDataModel]
  }
}

