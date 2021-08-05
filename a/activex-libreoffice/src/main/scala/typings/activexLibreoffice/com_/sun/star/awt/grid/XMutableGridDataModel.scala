package typings.activexLibreoffice.com_.sun.star.awt.grid

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.util.XCloneable
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to modify the data represented by a {@link XGridDataModel} */
trait XMutableGridDataModel
  extends StObject
     with XGridDataModel {
  
  /**
    * registers listener to be notified of data changes in the model
    * @param Listener specifies the listener to register
    */
  def addGridDataListener(Listener: XGridDataListener): Unit
  
  /**
    * appends a row to the model.
    * @param Heading denotes the heading of the row.
    * @param Data specifies the content of the row.
    */
  def addRow(Heading: js.Any, Data: SeqEquiv[js.Any]): Unit
  
  /**
    * appends multiple rows of data to the model.
    * @param Headings denotes the headings of the to-be-added rows.
    * @param Data specifies the data of the rows to be added.
    * @throws com::sun::star::lang::IllegalArgumentException if `Titles` and `Data` are of different length.
    */
  def addRows(Headings: SeqEquiv[js.Any], Data: SeqEquiv[SeqEquiv[js.Any]]): Unit
  
  /**
    * inserts a row into the set of data rows
    * @param Index denotes the position at which the row is to be inserted
    * @param Heading denotes the heading of the row.
    * @param Data specifies the content of the row.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Index` is smaller than `0` or greater than the number of rows in the model.
    */
  def insertRow(Index: Double, Heading: js.Any, Data: SeqEquiv[js.Any]): Unit
  
  /**
    * inserts multiple rows of data into the model.
    * @param Index denotes the position at which the rows are to be inserted
    * @param Headings denotes the headings of the to-be-added rows.
    * @param Data specifies the data of the rows to be added.
    * @throws com::sun::star::lang::IllegalArgumentException if `Titles` and `Data` are of different length.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Index` is smaller than `0` or greater than the number of rows in the model.
    */
  def insertRows(Index: Double, Headings: SeqEquiv[js.Any], Data: SeqEquiv[SeqEquiv[js.Any]]): Unit
  
  /** Removes all rows from the model. */
  def removeAllRows(): Unit
  
  /**
    * revokes a listener which was previously registered via {@link addGridDataListener()}
    * @param Listener specifies the listener to revoke.
    */
  def removeGridDataListener(Listener: XGridDataListener): Unit
  
  /**
    * removes a row of data from the model
    * @param RowIndex the index of the row that should be removed.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given index is invalid
    */
  def removeRow(RowIndex: Double): Unit
  
  /**
    * updates the content of the given cell
    * @param ColumnIndex the column index of the to-be-updated cell
    * @param RowIndex the row index of the to-be-updated cell
    * @param Value the new value of the cell.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the row or column index is invalid
    */
  def updateCellData(ColumnIndex: Double, RowIndex: Double, Value: js.Any): Unit
  
  /**
    * updates the tooltip to be displayed for a given cell
    * @see XGridDataModel.getCellToolTip
    */
  def updateCellToolTip(ColumnIndex: Double, RowIndex: Double, Value: js.Any): Unit
  
  /**
    * updates the content of a given row.
    *
    * The change in the data model will be notified to registered listeners via {@link XGridDataListener.dataChanged()} . The {@link
    * GridDataEvent.FirstColumn} and {@link GridDataEvent.LastColumn} will denote the smallest respectively largest column index from ColumnIndexes.
    * @param ColumnIndexes contains the column indexes of the cells, which should be updated
    * @param RowIndex contains the index of the row whose data is to be updated
    * @param Values specifies the new values of the cells.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if one of the row indexes or the column index is invalid
    * @throws com::sun::star::lang::IllegalArgumentException if the lengths of the `ColumnIndexes` and `Values` sequences are not equal.
    */
  def updateRowData(ColumnIndexes: SeqEquiv[Double], RowIndex: Double, Values: SeqEquiv[js.Any]): Unit
  
  /**
    * sets a new title for a given row.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given index does not denote a valid row.
    */
  def updateRowHeading(RowIndex: Double, Heading: js.Any): Unit
  
  /**
    * updates the tooltip for all cells of a given row
    *
    * Effectively this method is a shortcut for calling {@link updateCellToolTip()} multiple times in a row, for all cells of a given row.
    * @see XGridDataModel.getCellToolTip
    * @see updateCellToolTip
    */
  def updateRowToolTip(RowIndex: Double, Value: js.Any): Unit
}
object XMutableGridDataModel {
  
  inline def apply(
    ColumnCount: Double,
    RowCount: Double,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addGridDataListener: XGridDataListener => Unit,
    addRow: (js.Any, SeqEquiv[js.Any]) => Unit,
    addRows: (SeqEquiv[js.Any], SeqEquiv[SeqEquiv[js.Any]]) => Unit,
    createClone: () => XCloneable,
    dispose: () => Unit,
    getCellData: (Double, Double) => js.Any,
    getCellToolTip: (Double, Double) => js.Any,
    getRowData: Double => SafeArray[js.Any],
    getRowHeading: Double => js.Any,
    insertRow: (Double, js.Any, SeqEquiv[js.Any]) => Unit,
    insertRows: (Double, SeqEquiv[js.Any], SeqEquiv[SeqEquiv[js.Any]]) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeAllRows: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeGridDataListener: XGridDataListener => Unit,
    removeRow: Double => Unit,
    updateCellData: (Double, Double, js.Any) => Unit,
    updateCellToolTip: (Double, Double, js.Any) => Unit,
    updateRowData: (SeqEquiv[Double], Double, SeqEquiv[js.Any]) => Unit,
    updateRowHeading: (Double, js.Any) => Unit,
    updateRowToolTip: (Double, js.Any) => Unit
  ): XMutableGridDataModel = {
    val __obj = js.Dynamic.literal(ColumnCount = ColumnCount.asInstanceOf[js.Any], RowCount = RowCount.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addGridDataListener = js.Any.fromFunction1(addGridDataListener), addRow = js.Any.fromFunction2(addRow), addRows = js.Any.fromFunction2(addRows), createClone = js.Any.fromFunction0(createClone), dispose = js.Any.fromFunction0(dispose), getCellData = js.Any.fromFunction2(getCellData), getCellToolTip = js.Any.fromFunction2(getCellToolTip), getRowData = js.Any.fromFunction1(getRowData), getRowHeading = js.Any.fromFunction1(getRowHeading), insertRow = js.Any.fromFunction3(insertRow), insertRows = js.Any.fromFunction3(insertRows), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAllRows = js.Any.fromFunction0(removeAllRows), removeEventListener = js.Any.fromFunction1(removeEventListener), removeGridDataListener = js.Any.fromFunction1(removeGridDataListener), removeRow = js.Any.fromFunction1(removeRow), updateCellData = js.Any.fromFunction3(updateCellData), updateCellToolTip = js.Any.fromFunction3(updateCellToolTip), updateRowData = js.Any.fromFunction3(updateRowData), updateRowHeading = js.Any.fromFunction2(updateRowHeading), updateRowToolTip = js.Any.fromFunction2(updateRowToolTip))
    __obj.asInstanceOf[XMutableGridDataModel]
  }
  
  extension [Self <: XMutableGridDataModel](x: Self) {
    
    inline def setAddGridDataListener(value: XGridDataListener => Unit): Self = StObject.set(x, "addGridDataListener", js.Any.fromFunction1(value))
    
    inline def setAddRow(value: (js.Any, SeqEquiv[js.Any]) => Unit): Self = StObject.set(x, "addRow", js.Any.fromFunction2(value))
    
    inline def setAddRows(value: (SeqEquiv[js.Any], SeqEquiv[SeqEquiv[js.Any]]) => Unit): Self = StObject.set(x, "addRows", js.Any.fromFunction2(value))
    
    inline def setInsertRow(value: (Double, js.Any, SeqEquiv[js.Any]) => Unit): Self = StObject.set(x, "insertRow", js.Any.fromFunction3(value))
    
    inline def setInsertRows(value: (Double, SeqEquiv[js.Any], SeqEquiv[SeqEquiv[js.Any]]) => Unit): Self = StObject.set(x, "insertRows", js.Any.fromFunction3(value))
    
    inline def setRemoveAllRows(value: () => Unit): Self = StObject.set(x, "removeAllRows", js.Any.fromFunction0(value))
    
    inline def setRemoveGridDataListener(value: XGridDataListener => Unit): Self = StObject.set(x, "removeGridDataListener", js.Any.fromFunction1(value))
    
    inline def setRemoveRow(value: Double => Unit): Self = StObject.set(x, "removeRow", js.Any.fromFunction1(value))
    
    inline def setUpdateCellData(value: (Double, Double, js.Any) => Unit): Self = StObject.set(x, "updateCellData", js.Any.fromFunction3(value))
    
    inline def setUpdateCellToolTip(value: (Double, Double, js.Any) => Unit): Self = StObject.set(x, "updateCellToolTip", js.Any.fromFunction3(value))
    
    inline def setUpdateRowData(value: (SeqEquiv[Double], Double, SeqEquiv[js.Any]) => Unit): Self = StObject.set(x, "updateRowData", js.Any.fromFunction3(value))
    
    inline def setUpdateRowHeading(value: (Double, js.Any) => Unit): Self = StObject.set(x, "updateRowHeading", js.Any.fromFunction2(value))
    
    inline def setUpdateRowToolTip(value: (Double, js.Any) => Unit): Self = StObject.set(x, "updateRowToolTip", js.Any.fromFunction2(value))
  }
}
