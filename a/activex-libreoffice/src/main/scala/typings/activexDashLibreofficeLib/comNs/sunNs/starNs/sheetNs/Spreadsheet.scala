package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

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
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XProtectable
     with XDataPilotTablesSupplier
     with XScenariosSupplier
     with XSheetAnnotationsSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPageSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XTableChartsSupplier
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
  var AutomaticPrintArea: scala.Boolean
  /** specifies all conditional formats of that sheet */
  var ConditionalFormats: XConditionalFormats
  /** specifies if the sheet is visible. */
  var IsVisible: scala.Boolean
  /** specifies the page style of the sheet. */
  var PageStyle: java.lang.String
  /** specifies the color of the sheet tab, if any. */
  var TabColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * specifies the direction of the columns in the spreadsheet.
    *
    * Possible values are {@link com.sun.star.text.WritingMode2.LR_TB} to order the columns from left to right, and {@link
    * com.sun.star.text.WritingMode2.RL_TB} to order the columns from right to left.
    * @see com.sun.star.text.WritingMode2
    */
  var TableLayout: scala.Double
}

