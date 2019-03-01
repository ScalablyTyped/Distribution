package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implement this interface to give access to a two-dimensional table.
  *
  * The {@link XAccessibleTable} interface is used to represent two-dimensional tables. This interface combines the two interfaces
  * `javax.accessibility.AccessibleTable` and `javax.accessibility.AccessibleExtendedTable` of the Java Accessibility API (version 1.4).
  *
  * All {@link XAccessible} objects that represent cells or cell-clusters of a table have to be at the same time children of the table. This is necessary
  * to be able to convert row and column indices into child indices and vice versa with the methods {@link XAccessibleTable.getAccessibleIndex()} , {@link
  * XAccessibleTable.getAccessibleRow()} , and {@link XAccessibleTable.getAccessibleColumn()} .
  *
  * The range of valid coordinates for this interface are implementation dependent. However, that range includes at least the intervals from the from the
  * first row or column with the index 0 up to the last (but not including) used row or column as returned by {@link
  * XAccessibleTable.getAccessibleRowCount()} and {@link XAccessibleTable.getAccessibleColumnCount()} . In case of the Calc the current range of valid
  * indices for retrieving data include the maximal table size  -  256 columns and 32000 rows  -  minus one.
  * @since OOo 1.1.2
  */
trait XAccessibleTable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Returns the caption for the table.
    * @returns If the table has a caption then a reference to it is returned, else an empty reference is returned.
    */
  val AccessibleCaption: XAccessible
  /**
    * Returns the number of used columns in the table.
    *
    * The implementation, however, may allow the access of columns beyond this number.
    * @returns Returns the number of used columns in the table or 0 for an empty table.
    */
  val AccessibleColumnCount: scala.Double
  /**
    * Returns the column headers as an {@link XAccessibleTable} object.
    *
    * Content and size of the returned table are implementation dependent.
    * @returns Returns always a valid reference to an {@link XAccessibleTable} object.
    */
  val AccessibleColumnHeaders: XAccessibleTable
  /**
    * Returns the number of used rows in the table.
    *
    * The implementation, however, may allow the access of columns beyond this number.
    * @returns Returns the number of used rows in the table or 0 for an empty table.
    */
  val AccessibleRowCount: scala.Double
  /**
    * Returns the row headers as an {@link XAccessibleTable} object.
    *
    * Content and size of the returned table are implementation dependent.
    * @returns Returns always a valid reference to an {@link XAccessibleTable} object.
    */
  val AccessibleRowHeaders: XAccessibleTable
  /**
    * Returns the summary description of the table.
    * @returns Returns a reference to an implementation dependent {@link XAccessible} object representing the table's summary or an empty reference if the table
    */
  val AccessibleSummary: XAccessible
  /**
    * Returns a list of the indices of completely selected columns in a table.
    * @returns The returned sequence contains indices of all completely selected columns in the table. This sequence is in ascending order. If no column is sele
    */
  val SelectedAccessibleColumns: activexDashInteropLib.SafeArray[scala.Double]
  /**
    * Returns a list of the indices of completely selected rows in a table.
    * @returns The returned sequence contains indices of all completely selected rows in the table. This sequence is in ascending order. If no row is selected t
    */
  val SelectedAccessibleRows: activexDashInteropLib.SafeArray[scala.Double]
  /**
    * Returns the caption for the table.
    * @returns If the table has a caption then a reference to it is returned, else an empty reference is returned.
    */
  def getAccessibleCaption(): XAccessible
  /**
    * Returns the {@link XAccessible} object at the specified row and column in the table.
    *
    * This method has been renamed from the Java name `getAccessibleAt` to {@link XAccessibleTable.getAccessibleCellAt()} to avoid ambiguities with the
    * XAccessibleComponent::getAccessibleAt() method when accessed, for instance, from StarBasic.
    * @param nRow The row index for which to retrieve the cell.
    * @param nColumn The column index for which to retrieve the cell.
    * @returns If both row and column index are valid then the corresponding {@link XAccessible} object is returned that represents the requested cell regardles
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified column and/or row index is not valid, i.e. lies not inside the valid range of 0
    */
  def getAccessibleCellAt(nRow: scala.Double, nColumn: scala.Double): XAccessible
  /**
    * Translate the given child index into the corresponding column index.
    * @param nChildIndex Index of the child of the table for which to return the column index.
    * @returns Returns the column index of the cell of the specified child or the index of the first column if the child spans multiple columns.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if nChildIndex addresses an invalid column.
    */
  def getAccessibleColumn(nChildIndex: scala.Double): scala.Double
  /**
    * Returns the number of used columns in the table.
    *
    * The implementation, however, may allow the access of columns beyond this number.
    * @returns Returns the number of used columns in the table or 0 for an empty table.
    */
  def getAccessibleColumnCount(): scala.Double
  /**
    * Returns the description text of the specified column in the table.
    * @param nColumn The index of the column for which to retrieve the description.
    * @returns Returns the description text of the specified row in the table if such a description exists. Otherwise an empty string is returned.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified column index is not valid, i.e. lies not inside the valid range of 0 up to {@lin
    */
  def getAccessibleColumnDescription(nColumn: scala.Double): java.lang.String
  /**
    * Returns the number of columns occupied by the {@link Accessible} at the specified row and column in the table.
    *
    * The result differs from 1 if the specified cell spans multiple columns.
    * @param nRow Row index of the accessible for which to return the column extent.
    * @param nColumn Column index of the accessible for which to return the column extent.
    * @returns Returns the column extent of the specified.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified column index is not valid, i.e. lies not inside the valid range of 0 up to {@lin
    */
  def getAccessibleColumnExtentAt(nRow: scala.Double, nColumn: scala.Double): scala.Double
  /**
    * Returns the column headers as an {@link XAccessibleTable} object.
    *
    * Content and size of the returned table are implementation dependent.
    * @returns Returns always a valid reference to an {@link XAccessibleTable} object.
    */
  def getAccessibleColumnHeaders(): XAccessibleTable
  /**
    * Returns the child index of the accessible object that spans the specified cell.
    *
    * This is the same index that would be returned by calling {@link XAccessibleContext.getAccessibleIndexInParent()} for that accessible object.
    * @param nRow Row index of the accessible object for which to return the child index.
    * @param nColumn Row index of the accessible object for which to return the child index.
    * @returns Child index of the specified accessible object or -1 if one or both of the given indices is/are invalid.
    */
  def getAccessibleIndex(nRow: scala.Double, nColumn: scala.Double): scala.Double
  /**
    * Translate the given child index into the corresponding row index.
    * @param nChildIndex Index of the child of the table for which to return the row index.
    * @returns Returns the row index of the cell of the specified child or the index of the first row if the child spans multiple rows.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if nChildIndex addresses an invalid row.
    */
  def getAccessibleRow(nChildIndex: scala.Double): scala.Double
  /**
    * Returns the number of used rows in the table.
    *
    * The implementation, however, may allow the access of columns beyond this number.
    * @returns Returns the number of used rows in the table or 0 for an empty table.
    */
  def getAccessibleRowCount(): scala.Double
  /**
    * Returns the description text of the specified row in the table.
    * @param nRow The index of the row for which to retrieve the description.
    * @returns Returns the description text of the specified row in the table if such a description exists. Otherwise an empty string is returned.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified row index is not valid, i.e. lies not inside the valid range of 0 up to {@link X
    */
  def getAccessibleRowDescription(nRow: scala.Double): java.lang.String
  /**
    * Returns the number of rows occupied by the {@link Accessible} at the specified row and column in the table.
    *
    * The result differs from 1 if the specified cell spans multiple rows.
    * @param nRow Row index of the accessible for which to return the column extent.
    * @param nColumn Column index of the accessible for which to return the column extent.
    * @returns Returns the row extent of the specified cell.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified row index is not valid, i.e. lies not inside the valid range of 0 up to {@link X
    */
  def getAccessibleRowExtentAt(nRow: scala.Double, nColumn: scala.Double): scala.Double
  /**
    * Returns the row headers as an {@link XAccessibleTable} object.
    *
    * Content and size of the returned table are implementation dependent.
    * @returns Returns always a valid reference to an {@link XAccessibleTable} object.
    */
  def getAccessibleRowHeaders(): XAccessibleTable
  /**
    * Returns the summary description of the table.
    * @returns Returns a reference to an implementation dependent {@link XAccessible} object representing the table's summary or an empty reference if the table
    */
  def getAccessibleSummary(): XAccessible
  /**
    * Returns a list of the indices of completely selected columns in a table.
    * @returns The returned sequence contains indices of all completely selected columns in the table. This sequence is in ascending order. If no column is sele
    */
  def getSelectedAccessibleColumns(): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * Returns a list of the indices of completely selected rows in a table.
    * @returns The returned sequence contains indices of all completely selected rows in the table. This sequence is in ascending order. If no row is selected t
    */
  def getSelectedAccessibleRows(): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * Returns a boolean value indicating whether the specified column is completely selected.
    * @param nColumn Index of the column for which to determine whether it is selected.
    * @returns Returns `TRUE` if the specified column is selected completely and `FALSE` otherwise.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified column index is not valid, i.e. lies not inside the valid range of 0 up to {@lin
    */
  def isAccessibleColumnSelected(nColumn: scala.Double): scala.Boolean
  /**
    * Returns a boolean value indicating whether the specified row is completely selected.
    * @param nRow Index of the row for which to determine whether it is selected.
    * @returns Returns `TRUE` if the specified row is selected completely and `FALSE` otherwise.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified row index is not valid, i.e. lies not inside the valid range of 0 up to {@link X
    */
  def isAccessibleRowSelected(nRow: scala.Double): scala.Boolean
  /**
    * Returns a boolean value indicating whether the accessible at the specified row and column is selected.
    * @param nRow Row index of the cell for which to determine if the accessible object that spans that cell is selected.
    * @param nColumn Column index of the cell for which to determine if the accessible object that spans that cell is selected.
    * @returns Returns `TRUE` if the given row and column indices are valid and the specified accessible object is selected. Otherwise `FALSE` is returned.
    */
  def isAccessibleSelected(nRow: scala.Double, nColumn: scala.Double): scala.Boolean
}

object XAccessibleTable {
  @scala.inline
  def apply(
    AccessibleCaption: XAccessible,
    AccessibleColumnCount: scala.Double,
    AccessibleColumnHeaders: XAccessibleTable,
    AccessibleRowCount: scala.Double,
    AccessibleRowHeaders: XAccessibleTable,
    AccessibleSummary: XAccessible,
    SelectedAccessibleColumns: activexDashInteropLib.SafeArray[scala.Double],
    SelectedAccessibleRows: activexDashInteropLib.SafeArray[scala.Double],
    acquire: js.Function0[scala.Unit],
    getAccessibleCaption: js.Function0[XAccessible],
    getAccessibleCellAt: js.Function2[scala.Double, scala.Double, XAccessible],
    getAccessibleColumn: js.Function1[scala.Double, scala.Double],
    getAccessibleColumnCount: js.Function0[scala.Double],
    getAccessibleColumnDescription: js.Function1[scala.Double, java.lang.String],
    getAccessibleColumnExtentAt: js.Function2[scala.Double, scala.Double, scala.Double],
    getAccessibleColumnHeaders: js.Function0[XAccessibleTable],
    getAccessibleIndex: js.Function2[scala.Double, scala.Double, scala.Double],
    getAccessibleRow: js.Function1[scala.Double, scala.Double],
    getAccessibleRowCount: js.Function0[scala.Double],
    getAccessibleRowDescription: js.Function1[scala.Double, java.lang.String],
    getAccessibleRowExtentAt: js.Function2[scala.Double, scala.Double, scala.Double],
    getAccessibleRowHeaders: js.Function0[XAccessibleTable],
    getAccessibleSummary: js.Function0[XAccessible],
    getSelectedAccessibleColumns: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getSelectedAccessibleRows: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    isAccessibleColumnSelected: js.Function1[scala.Double, scala.Boolean],
    isAccessibleRowSelected: js.Function1[scala.Double, scala.Boolean],
    isAccessibleSelected: js.Function2[scala.Double, scala.Double, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XAccessibleTable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AccessibleCaption")(AccessibleCaption)
    __obj.updateDynamic("AccessibleColumnCount")(AccessibleColumnCount)
    __obj.updateDynamic("AccessibleColumnHeaders")(AccessibleColumnHeaders)
    __obj.updateDynamic("AccessibleRowCount")(AccessibleRowCount)
    __obj.updateDynamic("AccessibleRowHeaders")(AccessibleRowHeaders)
    __obj.updateDynamic("AccessibleSummary")(AccessibleSummary)
    __obj.updateDynamic("SelectedAccessibleColumns")(SelectedAccessibleColumns)
    __obj.updateDynamic("SelectedAccessibleRows")(SelectedAccessibleRows)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getAccessibleCaption")(getAccessibleCaption)
    __obj.updateDynamic("getAccessibleCellAt")(getAccessibleCellAt)
    __obj.updateDynamic("getAccessibleColumn")(getAccessibleColumn)
    __obj.updateDynamic("getAccessibleColumnCount")(getAccessibleColumnCount)
    __obj.updateDynamic("getAccessibleColumnDescription")(getAccessibleColumnDescription)
    __obj.updateDynamic("getAccessibleColumnExtentAt")(getAccessibleColumnExtentAt)
    __obj.updateDynamic("getAccessibleColumnHeaders")(getAccessibleColumnHeaders)
    __obj.updateDynamic("getAccessibleIndex")(getAccessibleIndex)
    __obj.updateDynamic("getAccessibleRow")(getAccessibleRow)
    __obj.updateDynamic("getAccessibleRowCount")(getAccessibleRowCount)
    __obj.updateDynamic("getAccessibleRowDescription")(getAccessibleRowDescription)
    __obj.updateDynamic("getAccessibleRowExtentAt")(getAccessibleRowExtentAt)
    __obj.updateDynamic("getAccessibleRowHeaders")(getAccessibleRowHeaders)
    __obj.updateDynamic("getAccessibleSummary")(getAccessibleSummary)
    __obj.updateDynamic("getSelectedAccessibleColumns")(getSelectedAccessibleColumns)
    __obj.updateDynamic("getSelectedAccessibleRows")(getSelectedAccessibleRows)
    __obj.updateDynamic("isAccessibleColumnSelected")(isAccessibleColumnSelected)
    __obj.updateDynamic("isAccessibleRowSelected")(isAccessibleRowSelected)
    __obj.updateDynamic("isAccessibleSelected")(isAccessibleSelected)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XAccessibleTable]
  }
}

