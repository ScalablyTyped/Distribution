package typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XFastPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XModifiable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XModifyListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XTable
  extends XModifiable
     with XComponent
     with XCellRange
     with XColumnRowRange
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
  @scala.inline
  def apply(
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
    getFastPropertyValue: Double => js.Any,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getRows: () => XTableRows,
    isModified: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeModifyListener: XModifyListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setFastPropertyValue: (Double, js.Any) => Unit,
    setModified: Boolean => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): XTable = {
    val __obj = js.Dynamic.literal(ColumnCount = ColumnCount, Columns = Columns, PropertySetInfo = PropertySetInfo, RowCount = RowCount, Rows = Rows, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addModifyListener = js.Any.fromFunction1(addModifyListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createCursor = js.Any.fromFunction0(createCursor), createCursorByRange = js.Any.fromFunction1(createCursorByRange), dispose = js.Any.fromFunction0(dispose), getCellByPosition = js.Any.fromFunction2(getCellByPosition), getCellRangeByName = js.Any.fromFunction1(getCellRangeByName), getCellRangeByPosition = js.Any.fromFunction4(getCellRangeByPosition), getColumns = js.Any.fromFunction0(getColumns), getFastPropertyValue = js.Any.fromFunction1(getFastPropertyValue), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRows = js.Any.fromFunction0(getRows), isModified = js.Any.fromFunction0(isModified), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeModifyListener = js.Any.fromFunction1(removeModifyListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setFastPropertyValue = js.Any.fromFunction2(setFastPropertyValue), setModified = js.Any.fromFunction1(setModified), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[XTable]
  }
}

