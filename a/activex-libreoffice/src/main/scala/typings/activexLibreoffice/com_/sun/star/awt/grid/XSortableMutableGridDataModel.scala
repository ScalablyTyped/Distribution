package typings.activexLibreoffice.com_.sun.star.awt.grid

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.Pair
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.util.XCloneable
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes a grid control data model whose data can be modified and sorted. */
@js.native
trait XSortableMutableGridDataModel
  extends XMutableGridDataModel
     with XSortableGridData
object XSortableMutableGridDataModel {
  
  @scala.inline
  def apply(
    ColumnCount: Double,
    CurrentSortOrder: Pair[Double, Boolean],
    RowCount: Double,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addGridDataListener: XGridDataListener => Unit,
    addRow: (js.Any, SeqEquiv[_]) => Unit,
    addRows: (SeqEquiv[_], SeqEquiv[SeqEquiv[_]]) => Unit,
    createClone: () => XCloneable,
    dispose: () => Unit,
    getCellData: (Double, Double) => js.Any,
    getCellToolTip: (Double, Double) => js.Any,
    getCurrentSortOrder: () => Pair[Double, Boolean],
    getRowData: Double => SafeArray[_],
    getRowHeading: Double => js.Any,
    insertRow: (Double, js.Any, SeqEquiv[_]) => Unit,
    insertRows: (Double, SeqEquiv[_], SeqEquiv[SeqEquiv[_]]) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeAllRows: () => Unit,
    removeColumnSort: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeGridDataListener: XGridDataListener => Unit,
    removeRow: Double => Unit,
    sortByColumn: (Double, Boolean) => Unit,
    updateCellData: (Double, Double, js.Any) => Unit,
    updateCellToolTip: (Double, Double, js.Any) => Unit,
    updateRowData: (SeqEquiv[Double], Double, SeqEquiv[_]) => Unit,
    updateRowHeading: (Double, js.Any) => Unit,
    updateRowToolTip: (Double, js.Any) => Unit
  ): XSortableMutableGridDataModel = {
    val __obj = js.Dynamic.literal(ColumnCount = ColumnCount.asInstanceOf[js.Any], CurrentSortOrder = CurrentSortOrder.asInstanceOf[js.Any], RowCount = RowCount.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addGridDataListener = js.Any.fromFunction1(addGridDataListener), addRow = js.Any.fromFunction2(addRow), addRows = js.Any.fromFunction2(addRows), createClone = js.Any.fromFunction0(createClone), dispose = js.Any.fromFunction0(dispose), getCellData = js.Any.fromFunction2(getCellData), getCellToolTip = js.Any.fromFunction2(getCellToolTip), getCurrentSortOrder = js.Any.fromFunction0(getCurrentSortOrder), getRowData = js.Any.fromFunction1(getRowData), getRowHeading = js.Any.fromFunction1(getRowHeading), insertRow = js.Any.fromFunction3(insertRow), insertRows = js.Any.fromFunction3(insertRows), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAllRows = js.Any.fromFunction0(removeAllRows), removeColumnSort = js.Any.fromFunction0(removeColumnSort), removeEventListener = js.Any.fromFunction1(removeEventListener), removeGridDataListener = js.Any.fromFunction1(removeGridDataListener), removeRow = js.Any.fromFunction1(removeRow), sortByColumn = js.Any.fromFunction2(sortByColumn), updateCellData = js.Any.fromFunction3(updateCellData), updateCellToolTip = js.Any.fromFunction3(updateCellToolTip), updateRowData = js.Any.fromFunction3(updateRowData), updateRowHeading = js.Any.fromFunction2(updateRowHeading), updateRowToolTip = js.Any.fromFunction2(updateRowToolTip))
    __obj.asInstanceOf[XSortableMutableGridDataModel]
  }
}
