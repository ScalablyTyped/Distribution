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

object XPrintAreas {
  @scala.inline
  def apply(
    PrintAreas: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress],
    PrintTitleColumns: scala.Boolean,
    PrintTitleRows: scala.Boolean,
    TitleColumns: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    TitleRows: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    acquire: js.Function0[scala.Unit],
    getPrintAreas: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress]
    ],
    getPrintTitleColumns: js.Function0[scala.Boolean],
    getPrintTitleRows: js.Function0[scala.Boolean],
    getTitleColumns: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress],
    getTitleRows: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setPrintAreas: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress], 
      scala.Unit
    ],
    setPrintTitleColumns: js.Function1[scala.Boolean, scala.Unit],
    setPrintTitleRows: js.Function1[scala.Boolean, scala.Unit],
    setTitleColumns: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, scala.Unit],
    setTitleRows: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, scala.Unit]
  ): XPrintAreas = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PrintAreas")(PrintAreas)
    __obj.updateDynamic("PrintTitleColumns")(PrintTitleColumns)
    __obj.updateDynamic("PrintTitleRows")(PrintTitleRows)
    __obj.updateDynamic("TitleColumns")(TitleColumns)
    __obj.updateDynamic("TitleRows")(TitleRows)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getPrintAreas")(getPrintAreas)
    __obj.updateDynamic("getPrintTitleColumns")(getPrintTitleColumns)
    __obj.updateDynamic("getPrintTitleRows")(getPrintTitleRows)
    __obj.updateDynamic("getTitleColumns")(getTitleColumns)
    __obj.updateDynamic("getTitleRows")(getTitleRows)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setPrintAreas")(setPrintAreas)
    __obj.updateDynamic("setPrintTitleColumns")(setPrintTitleColumns)
    __obj.updateDynamic("setPrintTitleRows")(setPrintTitleRows)
    __obj.updateDynamic("setTitleColumns")(setTitleColumns)
    __obj.updateDynamic("setTitleRows")(setTitleRows)
    __obj.asInstanceOf[XPrintAreas]
  }
}

