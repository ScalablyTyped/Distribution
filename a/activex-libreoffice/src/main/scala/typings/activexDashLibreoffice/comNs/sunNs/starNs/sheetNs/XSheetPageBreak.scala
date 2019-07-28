package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to page breaks in a sheet.
  * @deprecated Deprecated
  */
trait XSheetPageBreak extends XInterface {
  /**
    * returns a sequence of descriptions of all horizontal page breaks on the sheet.
    *
    * This includes manual and automatic page breaks. To add or remove manual breaks, use the {@link com.sun.star.table.TableColumn.IsStartOfNewPage}
    * property of the column.
    * @returns a sequence of structs containing column page break data.
    */
  val ColumnPageBreaks: SafeArray[TablePageBreakData]
  /**
    * returns a sequence of descriptions of all vertical page breaks on the sheet.
    *
    * This includes manual and automatic page breaks. To add or remove manual breaks, use the {@link com.sun.star.table.TableRow.IsStartOfNewPage} property
    * of the row.
    * @returns a sequence of structs containing row page break data.
    */
  val RowPageBreaks: SafeArray[TablePageBreakData]
  /**
    * returns a sequence of descriptions of all horizontal page breaks on the sheet.
    *
    * This includes manual and automatic page breaks. To add or remove manual breaks, use the {@link com.sun.star.table.TableColumn.IsStartOfNewPage}
    * property of the column.
    * @returns a sequence of structs containing column page break data.
    */
  def getColumnPageBreaks(): SafeArray[TablePageBreakData]
  /**
    * returns a sequence of descriptions of all vertical page breaks on the sheet.
    *
    * This includes manual and automatic page breaks. To add or remove manual breaks, use the {@link com.sun.star.table.TableRow.IsStartOfNewPage} property
    * of the row.
    * @returns a sequence of structs containing row page break data.
    */
  def getRowPageBreaks(): SafeArray[TablePageBreakData]
  /** removes all manual page breaks on the sheet. */
  def removeAllManualPageBreaks(): Unit
}

object XSheetPageBreak {
  @scala.inline
  def apply(
    ColumnPageBreaks: SafeArray[TablePageBreakData],
    RowPageBreaks: SafeArray[TablePageBreakData],
    acquire: () => Unit,
    getColumnPageBreaks: () => SafeArray[TablePageBreakData],
    getRowPageBreaks: () => SafeArray[TablePageBreakData],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeAllManualPageBreaks: () => Unit
  ): XSheetPageBreak = {
    val __obj = js.Dynamic.literal(ColumnPageBreaks = ColumnPageBreaks, RowPageBreaks = RowPageBreaks, acquire = js.Any.fromFunction0(acquire), getColumnPageBreaks = js.Any.fromFunction0(getColumnPageBreaks), getRowPageBreaks = js.Any.fromFunction0(getRowPageBreaks), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAllManualPageBreaks = js.Any.fromFunction0(removeAllManualPageBreaks))
  
    __obj.asInstanceOf[XSheetPageBreak]
  }
}

