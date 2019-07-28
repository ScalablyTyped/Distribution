package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XDrawPageSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.XTableChartsSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XProtectable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a complete spreadsheet in a spreadsheet document.
  *
  * This service extents the service {@link SheetCellRange} . A spreadsheet is nothing else than a cell range with extended functionality.
  * @see com.sun.star.sheet.SpreadsheetDocument
  */
trait Spreadsheet
  extends SheetCellRange
     with Scenario
     with XSpreadsheet
     with XProtectable
     with XDataPilotTablesSupplier
     with XScenariosSupplier
     with XSheetAnnotationsSupplier
     with XDrawPageSupplier
     with XTableChartsSupplier
     with XCellRangeMovement
     with XPrintAreas
     with XSheetPageBreak
     with XSheetOutline
     with XSheetAuditing
     with XSheetLinkable
     with XExternalSheetName {
  /**
    * specifies whether the sheet has an automatic print area.
    *
    * The automatic print area is used to print a sheet without explicit print areas, also if other sheets have print areas.
    *
    * If the property is true, and there are print areas on other sheets, the used area of this sheet is also printed.
    *
    * If the property is false, and there are print areas on other sheets, only these specified print areas are printed.
    *
    * If there are no print areas on the other sheets it does not matter whether property is true or false.
    *
    * This property can only be true, if there are no print areas given on this sheet. If the property is set to true the print areas of this sheet will be
    * removed.
    * @see XPrintAreas
    */
  var AutomaticPrintArea: Boolean
  /** specifies all conditional formats of that sheet */
  var ConditionalFormats: XConditionalFormats
  /** specifies if the sheet is visible. */
  var IsVisible: Boolean
  /** specifies the page style of the sheet. */
  var PageStyle: String
  /** specifies the color of the sheet tab, if any. */
  var TabColor: Color
  /**
    * specifies the direction of the columns in the spreadsheet.
    *
    * Possible values are {@link com.sun.star.text.WritingMode2.LR_TB} to order the columns from left to right, and {@link
    * com.sun.star.text.WritingMode2.RL_TB} to order the columns from right to left.
    * @see com.sun.star.text.WritingMode2
    */
  var TableLayout: Double
}

object Spreadsheet {
  @scala.inline
  def apply(
    AutomaticPrintArea: Boolean,
    ConditionalFormats: XConditionalFormats,
    IsVisible: Boolean,
    PageStyle: String,
    Scenario: Scenario = null,
    SheetCellRange: SheetCellRange = null,
    TabColor: Color,
    TableLayout: Double,
    XCellRangeMovement: XCellRangeMovement = null,
    XDataPilotTablesSupplier: XDataPilotTablesSupplier = null,
    XDrawPageSupplier: XDrawPageSupplier = null,
    XExternalSheetName: XExternalSheetName = null,
    XPrintAreas: XPrintAreas = null,
    XProtectable: XProtectable = null,
    XScenariosSupplier: XScenariosSupplier = null,
    XSheetAnnotationsSupplier: XSheetAnnotationsSupplier = null,
    XSheetAuditing: XSheetAuditing = null,
    XSheetLinkable: XSheetLinkable = null,
    XSheetOutline: XSheetOutline = null,
    XSheetPageBreak: XSheetPageBreak = null,
    XSpreadsheet: XSpreadsheet = null,
    XTableChartsSupplier: XTableChartsSupplier = null
  ): Spreadsheet = {
    val __obj = js.Dynamic.literal(AutomaticPrintArea = AutomaticPrintArea, ConditionalFormats = ConditionalFormats, IsVisible = IsVisible, PageStyle = PageStyle, TabColor = TabColor, TableLayout = TableLayout)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, Scenario)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, SheetCellRange)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XCellRangeMovement)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XDataPilotTablesSupplier)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XDrawPageSupplier)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XExternalSheetName)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XPrintAreas)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XProtectable)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XScenariosSupplier)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XSheetAnnotationsSupplier)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XSheetAuditing)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XSheetLinkable)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XSheetOutline)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XSheetPageBreak)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XSpreadsheet)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XTableChartsSupplier)
    __obj.asInstanceOf[Spreadsheet]
  }
}

