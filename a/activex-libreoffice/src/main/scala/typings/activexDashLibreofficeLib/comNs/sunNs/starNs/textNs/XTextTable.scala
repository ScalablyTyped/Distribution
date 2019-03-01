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
  val CellNames: activexDashInteropLib.SafeArray[java.lang.String]
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
  def getCellNames(): activexDashInteropLib.SafeArray[java.lang.String]
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
    CellNames: activexDashInteropLib.SafeArray[java.lang.String],
    Columns: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XTableColumns,
    Rows: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XTableRows,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    attach: js.Function1[XTextRange, scala.Unit],
    createCursorByCellName: js.Function1[java.lang.String, XTextTableCursor],
    dispose: js.Function0[scala.Unit],
    getAnchor: js.Function0[XTextRange],
    getCellByName: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCell],
    getCellNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getColumns: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XTableColumns],
    getRows: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XTableRows],
    initialize: js.Function2[scala.Double, scala.Double, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit]
  ): XTextTable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Anchor")(Anchor)
    __obj.updateDynamic("CellNames")(CellNames)
    __obj.updateDynamic("Columns")(Columns)
    __obj.updateDynamic("Rows")(Rows)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("attach")(attach)
    __obj.updateDynamic("createCursorByCellName")(createCursorByCellName)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getAnchor")(getAnchor)
    __obj.updateDynamic("getCellByName")(getCellByName)
    __obj.updateDynamic("getCellNames")(getCellNames)
    __obj.updateDynamic("getColumns")(getColumns)
    __obj.updateDynamic("getRows")(getRows)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.asInstanceOf[XTextTable]
  }
}

