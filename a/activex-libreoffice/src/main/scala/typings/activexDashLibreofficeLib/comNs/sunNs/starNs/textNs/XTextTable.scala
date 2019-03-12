package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * manages a text table.
  * @see com.sun.star.text.TextTable
  * @see com.sun.star.text.Cell
  */
trait XTextTable extends XTextContent {
  /** @returns the names of all cells of this text table. */
  val CellNames: stdLib.SafeArray[java.lang.String]
  /**
    * @returns the access object for the text table columns.
    * @see com.sun.star.table.XTableColumns
    */
  val Columns: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XTableColumns
  /**
    * @returns the access object for the text table rows.
    * @see com.sun.star.table.XTableRows
    */
  val Rows: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XTableRows
  /**
    * creates a text table cursor and returns the {@link XTextTableCursor} interface.
    *
    * Initially the cursor is positioned in the cell with the specified name.
    * @see com.sun.star.text.TextTableCursor
    */
  def createCursorByCellName(aCellName: java.lang.String): XTextTableCursor
  /**
    * @param aCellName is a concatenation of the alphanumeric column name and the index of the row.  Example: The cell in the 4th column and third row has the
    * @returns the {@link com.sun.star.table.XCell} interface of the cell with the specified name.
    * @see com.sun.star.table.Cell
    * @see com.sun.star.table.XCell
    */
  def getCellByName(aCellName: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCell
  /** @returns the names of all cells of this text table. */
  def getCellNames(): stdLib.SafeArray[java.lang.String]
  /**
    * @returns the access object for the text table columns.
    * @see com.sun.star.table.XTableColumns
    */
  def getColumns(): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XTableColumns
  /**
    * @returns the access object for the text table rows.
    * @see com.sun.star.table.XTableRows
    */
  def getRows(): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XTableRows
  /**
    * determines the numbers of rows and columns of the text table.
    *
    * This method must be called after the object is created and before the object is insert or attached elsewhere.
    */
  def initialize(nRows: scala.Double, nColumns: scala.Double): scala.Unit
}

object XTextTable {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    CellNames: stdLib.SafeArray[java.lang.String],
    Columns: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XTableColumns,
    Rows: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XTableRows,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    attach: XTextRange => scala.Unit,
    createCursorByCellName: java.lang.String => XTextTableCursor,
    dispose: () => scala.Unit,
    getAnchor: () => XTextRange,
    getCellByName: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCell,
    getCellNames: () => stdLib.SafeArray[java.lang.String],
    getColumns: () => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XTableColumns,
    getRows: () => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XTableRows,
    initialize: (scala.Double, scala.Double) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit
  ): XTextTable = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, CellNames = CellNames, Columns = Columns, Rows = Rows, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), createCursorByCellName = js.Any.fromFunction1(createCursorByCellName), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getCellByName = js.Any.fromFunction1(getCellByName), getCellNames = js.Any.fromFunction0(getCellNames), getColumns = js.Any.fromFunction0(getColumns), getRows = js.Any.fromFunction0(getRows), initialize = js.Any.fromFunction2(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[XTextTable]
  }
}

