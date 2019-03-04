package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to page breaks in a sheet.
  * @deprecated Deprecated
  */
trait XSheetPageBreak
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns a sequence of descriptions of all horizontal page breaks on the sheet.
    *
    * This includes manual and automatic page breaks. To add or remove manual breaks, use the {@link com.sun.star.table.TableColumn.IsStartOfNewPage}
    * property of the column.
    * @returns a sequence of structs containing column page break data.
    */
  val ColumnPageBreaks: activexDashInteropLib.SafeArray[TablePageBreakData]
  /**
    * returns a sequence of descriptions of all vertical page breaks on the sheet.
    *
    * This includes manual and automatic page breaks. To add or remove manual breaks, use the {@link com.sun.star.table.TableRow.IsStartOfNewPage} property
    * of the row.
    * @returns a sequence of structs containing row page break data.
    */
  val RowPageBreaks: activexDashInteropLib.SafeArray[TablePageBreakData]
  /**
    * returns a sequence of descriptions of all horizontal page breaks on the sheet.
    *
    * This includes manual and automatic page breaks. To add or remove manual breaks, use the {@link com.sun.star.table.TableColumn.IsStartOfNewPage}
    * property of the column.
    * @returns a sequence of structs containing column page break data.
    */
  def getColumnPageBreaks(): activexDashInteropLib.SafeArray[TablePageBreakData]
  /**
    * returns a sequence of descriptions of all vertical page breaks on the sheet.
    *
    * This includes manual and automatic page breaks. To add or remove manual breaks, use the {@link com.sun.star.table.TableRow.IsStartOfNewPage} property
    * of the row.
    * @returns a sequence of structs containing row page break data.
    */
  def getRowPageBreaks(): activexDashInteropLib.SafeArray[TablePageBreakData]
  /** removes all manual page breaks on the sheet. */
  def removeAllManualPageBreaks(): scala.Unit
}

object XSheetPageBreak {
  @scala.inline
  def apply(
    ColumnPageBreaks: activexDashInteropLib.SafeArray[TablePageBreakData],
    RowPageBreaks: activexDashInteropLib.SafeArray[TablePageBreakData],
    acquire: js.Function0[scala.Unit],
    getColumnPageBreaks: js.Function0[activexDashInteropLib.SafeArray[TablePageBreakData]],
    getRowPageBreaks: js.Function0[activexDashInteropLib.SafeArray[TablePageBreakData]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeAllManualPageBreaks: js.Function0[scala.Unit]
  ): XSheetPageBreak = {
    val __obj = js.Dynamic.literal(ColumnPageBreaks = ColumnPageBreaks, RowPageBreaks = RowPageBreaks, acquire = acquire, getColumnPageBreaks = getColumnPageBreaks, getRowPageBreaks = getRowPageBreaks, queryInterface = queryInterface, release = release, removeAllManualPageBreaks = removeAllManualPageBreaks)
  
    __obj.asInstanceOf[XSheetPageBreak]
  }
}

