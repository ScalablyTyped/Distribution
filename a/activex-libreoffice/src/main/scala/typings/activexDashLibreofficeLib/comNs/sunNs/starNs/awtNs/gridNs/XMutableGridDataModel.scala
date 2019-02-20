package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to modify the data represented by a {@link XGridDataModel} */
trait XMutableGridDataModel extends XGridDataModel {
  /**
    * registers listener to be notified of data changes in the model
    * @param Listener specifies the listener to register
    */
  def addGridDataListener(Listener: XGridDataListener): scala.Unit
  /**
    * appends a row to the model.
    * @param Heading denotes the heading of the row.
    * @param Data specifies the content of the row.
    */
  def addRow(Heading: js.Any, Data: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]): scala.Unit
  /**
    * appends multiple rows of data to the model.
    * @param Headings denotes the headings of the to-be-added rows.
    * @param Data specifies the data of the rows to be added.
    * @throws com::sun::star::lang::IllegalArgumentException if `Titles` and `Data` are of different length.
    */
  def addRows(
    Headings: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_],
    Data: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]]
  ): scala.Unit
  /**
    * inserts a row into the set of data rows
    * @param Index denotes the position at which the row is to be inserted
    * @param Heading denotes the heading of the row.
    * @param Data specifies the content of the row.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Index` is smaller than `0` or greater than the number of rows in the model.
    */
  def insertRow(Index: scala.Double, Heading: js.Any, Data: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]): scala.Unit
  /**
    * inserts multiple rows of data into the model.
    * @param Index denotes the position at which the rows are to be inserted
    * @param Headings denotes the headings of the to-be-added rows.
    * @param Data specifies the data of the rows to be added.
    * @throws com::sun::star::lang::IllegalArgumentException if `Titles` and `Data` are of different length.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Index` is smaller than `0` or greater than the number of rows in the model.
    */
  def insertRows(
    Index: scala.Double,
    Headings: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_],
    Data: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]]
  ): scala.Unit
  /** Removes all rows from the model. */
  def removeAllRows(): scala.Unit
  /**
    * revokes a listener which was previously registered via {@link addGridDataListener()}
    * @param Listener specifies the listener to revoke.
    */
  def removeGridDataListener(Listener: XGridDataListener): scala.Unit
  /**
    * removes a row of data from the model
    * @param RowIndex the index of the row that should be removed.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given index is invalid
    */
  def removeRow(RowIndex: scala.Double): scala.Unit
  /**
    * updates the content of the given cell
    * @param ColumnIndex the column index of the to-be-updated cell
    * @param RowIndex the row index of the to-be-updated cell
    * @param Value the new value of the cell.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the row or column index is invalid
    */
  def updateCellData(ColumnIndex: scala.Double, RowIndex: scala.Double, Value: js.Any): scala.Unit
  /**
    * updates the tooltip to be displayed for a given cell
    * @see XGridDataModel.getCellToolTip
    */
  def updateCellToolTip(ColumnIndex: scala.Double, RowIndex: scala.Double, Value: js.Any): scala.Unit
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
  def updateRowData(
    ColumnIndexes: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double],
    RowIndex: scala.Double,
    Values: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): scala.Unit
  /**
    * sets a new title for a given row.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given index does not denote a valid row.
    */
  def updateRowHeading(RowIndex: scala.Double, Heading: js.Any): scala.Unit
  /**
    * updates the tooltip for all cells of a given row
    *
    * Effectively this method is a shortcut for calling {@link updateCellToolTip()} multiple times in a row, for all cells of a given row.
    * @see XGridDataModel.getCellToolTip
    * @see updateCellToolTip
    */
  def updateRowToolTip(RowIndex: scala.Double, Value: js.Any): scala.Unit
}

