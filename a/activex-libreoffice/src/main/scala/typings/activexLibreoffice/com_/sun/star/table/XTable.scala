package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.util.XModifiable
import typings.activexLibreoffice.com_.sun.star.util.XModifyListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XTable
  extends StObject
     with XComponent
     with XCellRange
     with XColumnRowRange
     with XModifiable
     with XPropertySet
     with XFastPropertySet {
  
  /** stores the current column count of this table */
  var ColumnCount: Double
  
  /** stores the current row count of this table */
  var RowCount: Double
  
  /**
    * creates a cell cursor including the whole table
    * @see com.sun.star.table.CellCursor
    */
  def createCursor(): XCellCursor
  
  /**
    * creates a cell cursor to travel in the given range context.
    * @param Range the cell range for the cursor.
    * @see com.sun.star.table.CellCursor
    * @throws com::sun::star::lang::IllegalArgumentException if the given reference is empty or not a range from this table.
    */
  def createCursorByRange(Range: XCellRange): XCellCursor
}
object XTable {
  
  inline def apply(
    ColumnCount: Double,
    Columns: XTableColumns,
    PropertySetInfo: XPropertySetInfo,
    RowCount: Double,
    Rows: XTableRows,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addModifyListener: XModifyListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createCursor: () => XCellCursor,
    createCursorByRange: XCellRange => XCellCursor,
    dispose: () => Unit,
    getCellByPosition: (Double, Double) => XCell,
    getCellRangeByName: String => XCellRange,
    getCellRangeByPosition: (Double, Double, Double, Double) => XCellRange,
    getColumns: () => XTableColumns,
    getFastPropertyValue: Double => Any,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => Any,
    getRows: () => XTableRows,
    isModified: () => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeModifyListener: XModifyListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setFastPropertyValue: (Double, Any) => Unit,
    setModified: Boolean => Unit,
    setPropertyValue: (String, Any) => Unit
  ): XTable = {
    val __obj = js.Dynamic.literal(ColumnCount = ColumnCount.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RowCount = RowCount.asInstanceOf[js.Any], Rows = Rows.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addModifyListener = js.Any.fromFunction1(addModifyListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createCursor = js.Any.fromFunction0(createCursor), createCursorByRange = js.Any.fromFunction1(createCursorByRange), dispose = js.Any.fromFunction0(dispose), getCellByPosition = js.Any.fromFunction2(getCellByPosition), getCellRangeByName = js.Any.fromFunction1(getCellRangeByName), getCellRangeByPosition = js.Any.fromFunction4(getCellRangeByPosition), getColumns = js.Any.fromFunction0(getColumns), getFastPropertyValue = js.Any.fromFunction1(getFastPropertyValue), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRows = js.Any.fromFunction0(getRows), isModified = js.Any.fromFunction0(isModified), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeModifyListener = js.Any.fromFunction1(removeModifyListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setFastPropertyValue = js.Any.fromFunction2(setFastPropertyValue), setModified = js.Any.fromFunction1(setModified), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[XTable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XTable] (val x: Self) extends AnyVal {
    
    inline def setColumnCount(value: Double): Self = StObject.set(x, "ColumnCount", value.asInstanceOf[js.Any])
    
    inline def setCreateCursor(value: () => XCellCursor): Self = StObject.set(x, "createCursor", js.Any.fromFunction0(value))
    
    inline def setCreateCursorByRange(value: XCellRange => XCellCursor): Self = StObject.set(x, "createCursorByRange", js.Any.fromFunction1(value))
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "RowCount", value.asInstanceOf[js.Any])
  }
}
