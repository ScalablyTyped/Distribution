package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.table.XCell
import typings.activexLibreoffice.com_.sun.star.table.XTableColumns
import typings.activexLibreoffice.com_.sun.star.table.XTableRows
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * manages a text table.
  * @see com.sun.star.text.TextTable
  * @see com.sun.star.text.Cell
  */
@js.native
trait XTextTable extends XTextContent {
  
  /** @returns the names of all cells of this text table. */
  val CellNames: SafeArray[String] = js.native
  
  /**
    * @returns the access object for the text table columns.
    * @see com.sun.star.table.XTableColumns
    */
  val Columns: XTableColumns = js.native
  
  /**
    * @returns the access object for the text table rows.
    * @see com.sun.star.table.XTableRows
    */
  val Rows: XTableRows = js.native
  
  /**
    * creates a text table cursor and returns the {@link XTextTableCursor} interface.
    *
    * Initially the cursor is positioned in the cell with the specified name.
    * @see com.sun.star.text.TextTableCursor
    */
  def createCursorByCellName(aCellName: String): XTextTableCursor = js.native
  
  /**
    * @param aCellName is a concatenation of the alphanumeric column name and the index of the row.  Example: The cell in the 4th column and third row has the
    * @returns the {@link com.sun.star.table.XCell} interface of the cell with the specified name.
    * @see com.sun.star.table.Cell
    * @see com.sun.star.table.XCell
    */
  def getCellByName(aCellName: String): XCell = js.native
  
  /** @returns the names of all cells of this text table. */
  def getCellNames(): SafeArray[String] = js.native
  
  /**
    * @returns the access object for the text table columns.
    * @see com.sun.star.table.XTableColumns
    */
  def getColumns(): XTableColumns = js.native
  
  /**
    * @returns the access object for the text table rows.
    * @see com.sun.star.table.XTableRows
    */
  def getRows(): XTableRows = js.native
  
  /**
    * determines the numbers of rows and columns of the text table.
    *
    * This method must be called after the object is created and before the object is insert or attached elsewhere.
    */
  def initialize(nRows: Double, nColumns: Double): Unit = js.native
}
object XTextTable {
  
  @scala.inline
  def apply(
    Anchor: XTextRange,
    CellNames: SafeArray[String],
    Columns: XTableColumns,
    Rows: XTableRows,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attach: XTextRange => Unit,
    createCursorByCellName: String => XTextTableCursor,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getCellByName: String => XCell,
    getCellNames: () => SafeArray[String],
    getColumns: () => XTableColumns,
    getRows: () => XTableRows,
    initialize: (Double, Double) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): XTextTable = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], CellNames = CellNames.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], Rows = Rows.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), createCursorByCellName = js.Any.fromFunction1(createCursorByCellName), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getCellByName = js.Any.fromFunction1(getCellByName), getCellNames = js.Any.fromFunction0(getCellNames), getColumns = js.Any.fromFunction0(getColumns), getRows = js.Any.fromFunction0(getRows), initialize = js.Any.fromFunction2(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[XTextTable]
  }
  
  @scala.inline
  implicit class XTextTableOps[Self <: XTextTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCellNames(value: SafeArray[String]): Self = this.set("CellNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumns(value: XTableColumns): Self = this.set("Columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: XTableRows): Self = this.set("Rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateCursorByCellName(value: String => XTextTableCursor): Self = this.set("createCursorByCellName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCellByName(value: String => XCell): Self = this.set("getCellByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCellNames(value: () => SafeArray[String]): Self = this.set("getCellNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetColumns(value: () => XTableColumns): Self = this.set("getColumns", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRows(value: () => XTableRows): Self = this.set("getRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitialize(value: (Double, Double) => Unit): Self = this.set("initialize", js.Any.fromFunction2(value))
  }
}
