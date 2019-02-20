package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a sheet which has print areas. */
trait XPrintAreas
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns a sequence containing all print areas of the sheet. */
  var PrintAreas: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress]
  /** returns, whether the title columns are repeated on all subsequent print pages to the right. */
  var PrintTitleColumns: scala.Boolean
  /** returns, whether the title rows are repeated on all subsequent print pages to the bottom. */
  var PrintTitleRows: scala.Boolean
  /**
    * returns the range that is specified as title columns range.
    *
    * Title columns can be automatically repeated on all subsequent print pages to the right, using {@link XPrintAreas.setPrintTitleColumns()} .
    * @returns the range of columns that is specified as title columns range.
    */
  var TitleColumns: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress
  /**
    * returns the range that is specified as title rows range.
    *
    * Title rows can be automatically repeated on all subsequent print pages to the bottom, using {@link XPrintAreas.setPrintTitleRows()} .
    * @returns the range of rows that is specified as title rows range.
    */
  var TitleRows: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress
  /** returns a sequence containing all print areas of the sheet. */
  def getPrintAreas(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress]
  /** returns, whether the title columns are repeated on all subsequent print pages to the right. */
  def getPrintTitleColumns(): scala.Boolean
  /** returns, whether the title rows are repeated on all subsequent print pages to the bottom. */
  def getPrintTitleRows(): scala.Boolean
  /**
    * returns the range that is specified as title columns range.
    *
    * Title columns can be automatically repeated on all subsequent print pages to the right, using {@link XPrintAreas.setPrintTitleColumns()} .
    * @returns the range of columns that is specified as title columns range.
    */
  def getTitleColumns(): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress
  /**
    * returns the range that is specified as title rows range.
    *
    * Title rows can be automatically repeated on all subsequent print pages to the bottom, using {@link XPrintAreas.setPrintTitleRows()} .
    * @returns the range of rows that is specified as title rows range.
    */
  def getTitleRows(): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress
  /**
    * sets the print areas of the sheet.
    *
    * If none of the sheets in a document have print areas, the whole sheets are printed. If any sheet contains print areas, other sheets without print
    * areas are not printed.
    * @param aPrintAreas a sequence containing all print areas for this sheet.
    */
  def setPrintAreas(
    aPrintAreas: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress]
  ): scala.Unit
  /**
    * specifies whether the title columns are repeated on all subsequent print pages to the right.
    * @param bPrintTitleColumns if `TRUE` , title columns are repeated on each page.
    */
  def setPrintTitleColumns(bPrintTitleColumns: scala.Boolean): scala.Unit
  /**
    * specifies whether the title rows are repeated on all subsequent print pages to the bottom.
    * @param bPrintTitleRows if `TRUE` , title rows are repeated on each page.
    */
  def setPrintTitleRows(bPrintTitleRows: scala.Boolean): scala.Unit
  /**
    * specifies a range of columns as title columns range.
    *
    * The rows of the passed range are ignored.
    *
    * Title columns can be automatically repeated on all subsequent print pages to the right, using {@link XPrintAreas.setPrintTitleColumns()} .
    * @param aTitleColumns the title columns range.
    */
  def setTitleColumns(aTitleColumns: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress): scala.Unit
  /**
    * specifies a range of rows as title rows range.
    *
    * The columns of the passed range are ignored.
    *
    * Title rows can be automatically repeated on all subsequent print pages to the bottom, using {@link XPrintAreas.setPrintTitleRows()} .
    * @param aTitleRows the title rows range.
    */
  def setTitleRows(aTitleRows: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress): scala.Unit
}

