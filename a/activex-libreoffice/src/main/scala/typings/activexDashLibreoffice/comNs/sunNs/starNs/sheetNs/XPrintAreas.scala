package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellRangeAddress
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a sheet which has print areas. */
trait XPrintAreas extends XInterface {
  /** returns a sequence containing all print areas of the sheet. */
  var PrintAreas: SafeArray[CellRangeAddress]
  /** returns, whether the title columns are repeated on all subsequent print pages to the right. */
  var PrintTitleColumns: Boolean
  /** returns, whether the title rows are repeated on all subsequent print pages to the bottom. */
  var PrintTitleRows: Boolean
  /**
    * returns the range that is specified as title columns range.
    *
    * Title columns can be automatically repeated on all subsequent print pages to the right, using {@link XPrintAreas.setPrintTitleColumns()} .
    * @returns the range of columns that is specified as title columns range.
    */
  var TitleColumns: CellRangeAddress
  /**
    * returns the range that is specified as title rows range.
    *
    * Title rows can be automatically repeated on all subsequent print pages to the bottom, using {@link XPrintAreas.setPrintTitleRows()} .
    * @returns the range of rows that is specified as title rows range.
    */
  var TitleRows: CellRangeAddress
  /** returns a sequence containing all print areas of the sheet. */
  def getPrintAreas(): SafeArray[CellRangeAddress]
  /** returns, whether the title columns are repeated on all subsequent print pages to the right. */
  def getPrintTitleColumns(): Boolean
  /** returns, whether the title rows are repeated on all subsequent print pages to the bottom. */
  def getPrintTitleRows(): Boolean
  /**
    * returns the range that is specified as title columns range.
    *
    * Title columns can be automatically repeated on all subsequent print pages to the right, using {@link XPrintAreas.setPrintTitleColumns()} .
    * @returns the range of columns that is specified as title columns range.
    */
  def getTitleColumns(): CellRangeAddress
  /**
    * returns the range that is specified as title rows range.
    *
    * Title rows can be automatically repeated on all subsequent print pages to the bottom, using {@link XPrintAreas.setPrintTitleRows()} .
    * @returns the range of rows that is specified as title rows range.
    */
  def getTitleRows(): CellRangeAddress
  /**
    * sets the print areas of the sheet.
    *
    * If none of the sheets in a document have print areas, the whole sheets are printed. If any sheet contains print areas, other sheets without print
    * areas are not printed.
    * @param aPrintAreas a sequence containing all print areas for this sheet.
    */
  def setPrintAreas(aPrintAreas: SeqEquiv[CellRangeAddress]): Unit
  /**
    * specifies whether the title columns are repeated on all subsequent print pages to the right.
    * @param bPrintTitleColumns if `TRUE` , title columns are repeated on each page.
    */
  def setPrintTitleColumns(bPrintTitleColumns: Boolean): Unit
  /**
    * specifies whether the title rows are repeated on all subsequent print pages to the bottom.
    * @param bPrintTitleRows if `TRUE` , title rows are repeated on each page.
    */
  def setPrintTitleRows(bPrintTitleRows: Boolean): Unit
  /**
    * specifies a range of columns as title columns range.
    *
    * The rows of the passed range are ignored.
    *
    * Title columns can be automatically repeated on all subsequent print pages to the right, using {@link XPrintAreas.setPrintTitleColumns()} .
    * @param aTitleColumns the title columns range.
    */
  def setTitleColumns(aTitleColumns: CellRangeAddress): Unit
  /**
    * specifies a range of rows as title rows range.
    *
    * The columns of the passed range are ignored.
    *
    * Title rows can be automatically repeated on all subsequent print pages to the bottom, using {@link XPrintAreas.setPrintTitleRows()} .
    * @param aTitleRows the title rows range.
    */
  def setTitleRows(aTitleRows: CellRangeAddress): Unit
}

object XPrintAreas {
  @scala.inline
  def apply(
    PrintAreas: SafeArray[CellRangeAddress],
    PrintTitleColumns: Boolean,
    PrintTitleRows: Boolean,
    TitleColumns: CellRangeAddress,
    TitleRows: CellRangeAddress,
    acquire: () => Unit,
    getPrintAreas: () => SafeArray[CellRangeAddress],
    getPrintTitleColumns: () => Boolean,
    getPrintTitleRows: () => Boolean,
    getTitleColumns: () => CellRangeAddress,
    getTitleRows: () => CellRangeAddress,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setPrintAreas: SeqEquiv[CellRangeAddress] => Unit,
    setPrintTitleColumns: Boolean => Unit,
    setPrintTitleRows: Boolean => Unit,
    setTitleColumns: CellRangeAddress => Unit,
    setTitleRows: CellRangeAddress => Unit
  ): XPrintAreas = {
    val __obj = js.Dynamic.literal(PrintAreas = PrintAreas, PrintTitleColumns = PrintTitleColumns, PrintTitleRows = PrintTitleRows, TitleColumns = TitleColumns, TitleRows = TitleRows, acquire = js.Any.fromFunction0(acquire), getPrintAreas = js.Any.fromFunction0(getPrintAreas), getPrintTitleColumns = js.Any.fromFunction0(getPrintTitleColumns), getPrintTitleRows = js.Any.fromFunction0(getPrintTitleRows), getTitleColumns = js.Any.fromFunction0(getTitleColumns), getTitleRows = js.Any.fromFunction0(getTitleRows), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setPrintAreas = js.Any.fromFunction1(setPrintAreas), setPrintTitleColumns = js.Any.fromFunction1(setPrintTitleColumns), setPrintTitleRows = js.Any.fromFunction1(setPrintTitleRows), setTitleColumns = js.Any.fromFunction1(setTitleColumns), setTitleRows = js.Any.fromFunction1(setTitleRows))
  
    __obj.asInstanceOf[XPrintAreas]
  }
}

