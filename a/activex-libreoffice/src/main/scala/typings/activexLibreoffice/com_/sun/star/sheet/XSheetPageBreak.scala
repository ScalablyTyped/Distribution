package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to page breaks in a sheet.
  * @deprecated Deprecated
  */
@js.native
trait XSheetPageBreak extends XInterface {
  
  /**
    * returns a sequence of descriptions of all horizontal page breaks on the sheet.
    *
    * This includes manual and automatic page breaks. To add or remove manual breaks, use the {@link com.sun.star.table.TableColumn.IsStartOfNewPage}
    * property of the column.
    * @returns a sequence of structs containing column page break data.
    */
  val ColumnPageBreaks: SafeArray[TablePageBreakData] = js.native
  
  /**
    * returns a sequence of descriptions of all vertical page breaks on the sheet.
    *
    * This includes manual and automatic page breaks. To add or remove manual breaks, use the {@link com.sun.star.table.TableRow.IsStartOfNewPage} property
    * of the row.
    * @returns a sequence of structs containing row page break data.
    */
  val RowPageBreaks: SafeArray[TablePageBreakData] = js.native
  
  /**
    * returns a sequence of descriptions of all horizontal page breaks on the sheet.
    *
    * This includes manual and automatic page breaks. To add or remove manual breaks, use the {@link com.sun.star.table.TableColumn.IsStartOfNewPage}
    * property of the column.
    * @returns a sequence of structs containing column page break data.
    */
  def getColumnPageBreaks(): SafeArray[TablePageBreakData] = js.native
  
  /**
    * returns a sequence of descriptions of all vertical page breaks on the sheet.
    *
    * This includes manual and automatic page breaks. To add or remove manual breaks, use the {@link com.sun.star.table.TableRow.IsStartOfNewPage} property
    * of the row.
    * @returns a sequence of structs containing row page break data.
    */
  def getRowPageBreaks(): SafeArray[TablePageBreakData] = js.native
  
  /** removes all manual page breaks on the sheet. */
  def removeAllManualPageBreaks(): Unit = js.native
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
    val __obj = js.Dynamic.literal(ColumnPageBreaks = ColumnPageBreaks.asInstanceOf[js.Any], RowPageBreaks = RowPageBreaks.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getColumnPageBreaks = js.Any.fromFunction0(getColumnPageBreaks), getRowPageBreaks = js.Any.fromFunction0(getRowPageBreaks), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAllManualPageBreaks = js.Any.fromFunction0(removeAllManualPageBreaks))
    __obj.asInstanceOf[XSheetPageBreak]
  }
  
  @scala.inline
  implicit class XSheetPageBreakOps[Self <: XSheetPageBreak] (val x: Self) extends AnyVal {
    
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
    def setColumnPageBreaks(value: SafeArray[TablePageBreakData]): Self = this.set("ColumnPageBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowPageBreaks(value: SafeArray[TablePageBreakData]): Self = this.set("RowPageBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetColumnPageBreaks(value: () => SafeArray[TablePageBreakData]): Self = this.set("getColumnPageBreaks", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRowPageBreaks(value: () => SafeArray[TablePageBreakData]): Self = this.set("getRowPageBreaks", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveAllManualPageBreaks(value: () => Unit): Self = this.set("removeAllManualPageBreaks", js.Any.fromFunction0(value))
  }
}
