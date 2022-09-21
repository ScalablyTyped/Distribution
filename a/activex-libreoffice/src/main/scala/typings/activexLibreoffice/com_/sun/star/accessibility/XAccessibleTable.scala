package typings.activexLibreoffice.com_.sun.star.accessibility

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends StObject
     with XInterface {
  
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
  val AccessibleColumnCount: Double
  
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
  val AccessibleRowCount: Double
  
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
  val SelectedAccessibleColumns: SafeArray[Double]
  
  /**
    * Returns a list of the indices of completely selected rows in a table.
    * @returns The returned sequence contains indices of all completely selected rows in the table. This sequence is in ascending order. If no row is selected t
    */
  val SelectedAccessibleRows: SafeArray[Double]
  
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
  def getAccessibleCellAt(nRow: Double, nColumn: Double): XAccessible
  
  /**
    * Translate the given child index into the corresponding column index.
    * @param nChildIndex Index of the child of the table for which to return the column index.
    * @returns Returns the column index of the cell of the specified child or the index of the first column if the child spans multiple columns.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if nChildIndex addresses an invalid column.
    */
  def getAccessibleColumn(nChildIndex: Double): Double
  
  /**
    * Returns the number of used columns in the table.
    *
    * The implementation, however, may allow the access of columns beyond this number.
    * @returns Returns the number of used columns in the table or 0 for an empty table.
    */
  def getAccessibleColumnCount(): Double
  
  /**
    * Returns the description text of the specified column in the table.
    * @param nColumn The index of the column for which to retrieve the description.
    * @returns Returns the description text of the specified row in the table if such a description exists. Otherwise an empty string is returned.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified column index is not valid, i.e. lies not inside the valid range of 0 up to {@lin
    */
  def getAccessibleColumnDescription(nColumn: Double): String
  
  /**
    * Returns the number of columns occupied by the {@link Accessible} at the specified row and column in the table.
    *
    * The result differs from 1 if the specified cell spans multiple columns.
    * @param nRow Row index of the accessible for which to return the column extent.
    * @param nColumn Column index of the accessible for which to return the column extent.
    * @returns Returns the column extent of the specified.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified column index is not valid, i.e. lies not inside the valid range of 0 up to {@lin
    */
  def getAccessibleColumnExtentAt(nRow: Double, nColumn: Double): Double
  
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
  def getAccessibleIndex(nRow: Double, nColumn: Double): Double
  
  /**
    * Translate the given child index into the corresponding row index.
    * @param nChildIndex Index of the child of the table for which to return the row index.
    * @returns Returns the row index of the cell of the specified child or the index of the first row if the child spans multiple rows.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if nChildIndex addresses an invalid row.
    */
  def getAccessibleRow(nChildIndex: Double): Double
  
  /**
    * Returns the number of used rows in the table.
    *
    * The implementation, however, may allow the access of columns beyond this number.
    * @returns Returns the number of used rows in the table or 0 for an empty table.
    */
  def getAccessibleRowCount(): Double
  
  /**
    * Returns the description text of the specified row in the table.
    * @param nRow The index of the row for which to retrieve the description.
    * @returns Returns the description text of the specified row in the table if such a description exists. Otherwise an empty string is returned.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified row index is not valid, i.e. lies not inside the valid range of 0 up to {@link X
    */
  def getAccessibleRowDescription(nRow: Double): String
  
  /**
    * Returns the number of rows occupied by the {@link Accessible} at the specified row and column in the table.
    *
    * The result differs from 1 if the specified cell spans multiple rows.
    * @param nRow Row index of the accessible for which to return the column extent.
    * @param nColumn Column index of the accessible for which to return the column extent.
    * @returns Returns the row extent of the specified cell.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified row index is not valid, i.e. lies not inside the valid range of 0 up to {@link X
    */
  def getAccessibleRowExtentAt(nRow: Double, nColumn: Double): Double
  
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
  def getSelectedAccessibleColumns(): SafeArray[Double]
  
  /**
    * Returns a list of the indices of completely selected rows in a table.
    * @returns The returned sequence contains indices of all completely selected rows in the table. This sequence is in ascending order. If no row is selected t
    */
  def getSelectedAccessibleRows(): SafeArray[Double]
  
  /**
    * Returns a boolean value indicating whether the specified column is completely selected.
    * @param nColumn Index of the column for which to determine whether it is selected.
    * @returns Returns `TRUE` if the specified column is selected completely and `FALSE` otherwise.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified column index is not valid, i.e. lies not inside the valid range of 0 up to {@lin
    */
  def isAccessibleColumnSelected(nColumn: Double): Boolean
  
  /**
    * Returns a boolean value indicating whether the specified row is completely selected.
    * @param nRow Index of the row for which to determine whether it is selected.
    * @returns Returns `TRUE` if the specified row is selected completely and `FALSE` otherwise.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified row index is not valid, i.e. lies not inside the valid range of 0 up to {@link X
    */
  def isAccessibleRowSelected(nRow: Double): Boolean
  
  /**
    * Returns a boolean value indicating whether the accessible at the specified row and column is selected.
    * @param nRow Row index of the cell for which to determine if the accessible object that spans that cell is selected.
    * @param nColumn Column index of the cell for which to determine if the accessible object that spans that cell is selected.
    * @returns Returns `TRUE` if the given row and column indices are valid and the specified accessible object is selected. Otherwise `FALSE` is returned.
    */
  def isAccessibleSelected(nRow: Double, nColumn: Double): Boolean
}
object XAccessibleTable {
  
  inline def apply(
    AccessibleCaption: XAccessible,
    AccessibleColumnCount: Double,
    AccessibleColumnHeaders: XAccessibleTable,
    AccessibleRowCount: Double,
    AccessibleRowHeaders: XAccessibleTable,
    AccessibleSummary: XAccessible,
    SelectedAccessibleColumns: SafeArray[Double],
    SelectedAccessibleRows: SafeArray[Double],
    acquire: () => Unit,
    getAccessibleCaption: () => XAccessible,
    getAccessibleCellAt: (Double, Double) => XAccessible,
    getAccessibleColumn: Double => Double,
    getAccessibleColumnCount: () => Double,
    getAccessibleColumnDescription: Double => String,
    getAccessibleColumnExtentAt: (Double, Double) => Double,
    getAccessibleColumnHeaders: () => XAccessibleTable,
    getAccessibleIndex: (Double, Double) => Double,
    getAccessibleRow: Double => Double,
    getAccessibleRowCount: () => Double,
    getAccessibleRowDescription: Double => String,
    getAccessibleRowExtentAt: (Double, Double) => Double,
    getAccessibleRowHeaders: () => XAccessibleTable,
    getAccessibleSummary: () => XAccessible,
    getSelectedAccessibleColumns: () => SafeArray[Double],
    getSelectedAccessibleRows: () => SafeArray[Double],
    isAccessibleColumnSelected: Double => Boolean,
    isAccessibleRowSelected: Double => Boolean,
    isAccessibleSelected: (Double, Double) => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XAccessibleTable = {
    val __obj = js.Dynamic.literal(AccessibleCaption = AccessibleCaption.asInstanceOf[js.Any], AccessibleColumnCount = AccessibleColumnCount.asInstanceOf[js.Any], AccessibleColumnHeaders = AccessibleColumnHeaders.asInstanceOf[js.Any], AccessibleRowCount = AccessibleRowCount.asInstanceOf[js.Any], AccessibleRowHeaders = AccessibleRowHeaders.asInstanceOf[js.Any], AccessibleSummary = AccessibleSummary.asInstanceOf[js.Any], SelectedAccessibleColumns = SelectedAccessibleColumns.asInstanceOf[js.Any], SelectedAccessibleRows = SelectedAccessibleRows.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAccessibleCaption = js.Any.fromFunction0(getAccessibleCaption), getAccessibleCellAt = js.Any.fromFunction2(getAccessibleCellAt), getAccessibleColumn = js.Any.fromFunction1(getAccessibleColumn), getAccessibleColumnCount = js.Any.fromFunction0(getAccessibleColumnCount), getAccessibleColumnDescription = js.Any.fromFunction1(getAccessibleColumnDescription), getAccessibleColumnExtentAt = js.Any.fromFunction2(getAccessibleColumnExtentAt), getAccessibleColumnHeaders = js.Any.fromFunction0(getAccessibleColumnHeaders), getAccessibleIndex = js.Any.fromFunction2(getAccessibleIndex), getAccessibleRow = js.Any.fromFunction1(getAccessibleRow), getAccessibleRowCount = js.Any.fromFunction0(getAccessibleRowCount), getAccessibleRowDescription = js.Any.fromFunction1(getAccessibleRowDescription), getAccessibleRowExtentAt = js.Any.fromFunction2(getAccessibleRowExtentAt), getAccessibleRowHeaders = js.Any.fromFunction0(getAccessibleRowHeaders), getAccessibleSummary = js.Any.fromFunction0(getAccessibleSummary), getSelectedAccessibleColumns = js.Any.fromFunction0(getSelectedAccessibleColumns), getSelectedAccessibleRows = js.Any.fromFunction0(getSelectedAccessibleRows), isAccessibleColumnSelected = js.Any.fromFunction1(isAccessibleColumnSelected), isAccessibleRowSelected = js.Any.fromFunction1(isAccessibleRowSelected), isAccessibleSelected = js.Any.fromFunction2(isAccessibleSelected), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAccessibleTable]
  }
  
  extension [Self <: XAccessibleTable](x: Self) {
    
    inline def setAccessibleCaption(value: XAccessible): Self = StObject.set(x, "AccessibleCaption", value.asInstanceOf[js.Any])
    
    inline def setAccessibleColumnCount(value: Double): Self = StObject.set(x, "AccessibleColumnCount", value.asInstanceOf[js.Any])
    
    inline def setAccessibleColumnHeaders(value: XAccessibleTable): Self = StObject.set(x, "AccessibleColumnHeaders", value.asInstanceOf[js.Any])
    
    inline def setAccessibleRowCount(value: Double): Self = StObject.set(x, "AccessibleRowCount", value.asInstanceOf[js.Any])
    
    inline def setAccessibleRowHeaders(value: XAccessibleTable): Self = StObject.set(x, "AccessibleRowHeaders", value.asInstanceOf[js.Any])
    
    inline def setAccessibleSummary(value: XAccessible): Self = StObject.set(x, "AccessibleSummary", value.asInstanceOf[js.Any])
    
    inline def setGetAccessibleCaption(value: () => XAccessible): Self = StObject.set(x, "getAccessibleCaption", js.Any.fromFunction0(value))
    
    inline def setGetAccessibleCellAt(value: (Double, Double) => XAccessible): Self = StObject.set(x, "getAccessibleCellAt", js.Any.fromFunction2(value))
    
    inline def setGetAccessibleColumn(value: Double => Double): Self = StObject.set(x, "getAccessibleColumn", js.Any.fromFunction1(value))
    
    inline def setGetAccessibleColumnCount(value: () => Double): Self = StObject.set(x, "getAccessibleColumnCount", js.Any.fromFunction0(value))
    
    inline def setGetAccessibleColumnDescription(value: Double => String): Self = StObject.set(x, "getAccessibleColumnDescription", js.Any.fromFunction1(value))
    
    inline def setGetAccessibleColumnExtentAt(value: (Double, Double) => Double): Self = StObject.set(x, "getAccessibleColumnExtentAt", js.Any.fromFunction2(value))
    
    inline def setGetAccessibleColumnHeaders(value: () => XAccessibleTable): Self = StObject.set(x, "getAccessibleColumnHeaders", js.Any.fromFunction0(value))
    
    inline def setGetAccessibleIndex(value: (Double, Double) => Double): Self = StObject.set(x, "getAccessibleIndex", js.Any.fromFunction2(value))
    
    inline def setGetAccessibleRow(value: Double => Double): Self = StObject.set(x, "getAccessibleRow", js.Any.fromFunction1(value))
    
    inline def setGetAccessibleRowCount(value: () => Double): Self = StObject.set(x, "getAccessibleRowCount", js.Any.fromFunction0(value))
    
    inline def setGetAccessibleRowDescription(value: Double => String): Self = StObject.set(x, "getAccessibleRowDescription", js.Any.fromFunction1(value))
    
    inline def setGetAccessibleRowExtentAt(value: (Double, Double) => Double): Self = StObject.set(x, "getAccessibleRowExtentAt", js.Any.fromFunction2(value))
    
    inline def setGetAccessibleRowHeaders(value: () => XAccessibleTable): Self = StObject.set(x, "getAccessibleRowHeaders", js.Any.fromFunction0(value))
    
    inline def setGetAccessibleSummary(value: () => XAccessible): Self = StObject.set(x, "getAccessibleSummary", js.Any.fromFunction0(value))
    
    inline def setGetSelectedAccessibleColumns(value: () => SafeArray[Double]): Self = StObject.set(x, "getSelectedAccessibleColumns", js.Any.fromFunction0(value))
    
    inline def setGetSelectedAccessibleRows(value: () => SafeArray[Double]): Self = StObject.set(x, "getSelectedAccessibleRows", js.Any.fromFunction0(value))
    
    inline def setIsAccessibleColumnSelected(value: Double => Boolean): Self = StObject.set(x, "isAccessibleColumnSelected", js.Any.fromFunction1(value))
    
    inline def setIsAccessibleRowSelected(value: Double => Boolean): Self = StObject.set(x, "isAccessibleRowSelected", js.Any.fromFunction1(value))
    
    inline def setIsAccessibleSelected(value: (Double, Double) => Boolean): Self = StObject.set(x, "isAccessibleSelected", js.Any.fromFunction2(value))
    
    inline def setSelectedAccessibleColumns(value: SafeArray[Double]): Self = StObject.set(x, "SelectedAccessibleColumns", value.asInstanceOf[js.Any])
    
    inline def setSelectedAccessibleRows(value: SafeArray[Double]): Self = StObject.set(x, "SelectedAccessibleRows", value.asInstanceOf[js.Any])
  }
}
