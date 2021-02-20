package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.com_.sun.star.drawing.XDrawPageSupplier
import typings.activexLibreoffice.com_.sun.star.table.XTableChartsSupplier
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.activexLibreoffice.com_.sun.star.util.XProtectable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a complete spreadsheet in a spreadsheet document.
  *
  * This service extents the service {@link SheetCellRange} . A spreadsheet is nothing else than a cell range with extended functionality.
  * @see com.sun.star.sheet.SpreadsheetDocument
  */
@js.native
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
  var AutomaticPrintArea: Boolean = js.native
  
  /** specifies all conditional formats of that sheet */
  var ConditionalFormats: XConditionalFormats = js.native
  
  /** specifies if the sheet is visible. */
  var IsVisible: Boolean = js.native
  
  /** specifies the page style of the sheet. */
  var PageStyle: String = js.native
  
  /** specifies the color of the sheet tab, if any. */
  var TabColor: Color = js.native
  
  /**
    * specifies the direction of the columns in the spreadsheet.
    *
    * Possible values are {@link com.sun.star.text.WritingMode2.LR_TB} to order the columns from left to right, and {@link
    * com.sun.star.text.WritingMode2.RL_TB} to order the columns from right to left.
    * @see com.sun.star.text.WritingMode2
    */
  var TableLayout: Double = js.native
}
object Spreadsheet {
  
  @scala.inline
  def apply(
    AutomaticPrintArea: Boolean,
    ConditionalFormats: XConditionalFormats,
    IsVisible: Boolean,
    PageStyle: String,
    Scenario: Scenario,
    SheetCellRange: SheetCellRange,
    TabColor: Color,
    TableLayout: Double,
    XCellRangeMovement: XCellRangeMovement,
    XDataPilotTablesSupplier: XDataPilotTablesSupplier,
    XDrawPageSupplier: XDrawPageSupplier,
    XExternalSheetName: XExternalSheetName,
    XPrintAreas: XPrintAreas,
    XProtectable: XProtectable,
    XScenariosSupplier: XScenariosSupplier,
    XSheetAnnotationsSupplier: XSheetAnnotationsSupplier,
    XSheetAuditing: XSheetAuditing,
    XSheetLinkable: XSheetLinkable,
    XSheetOutline: XSheetOutline,
    XSheetPageBreak: XSheetPageBreak,
    XSpreadsheet: XSpreadsheet,
    XTableChartsSupplier: XTableChartsSupplier
  ): Spreadsheet = {
    val __obj = js.Dynamic.literal(AutomaticPrintArea = AutomaticPrintArea.asInstanceOf[js.Any], ConditionalFormats = ConditionalFormats.asInstanceOf[js.Any], IsVisible = IsVisible.asInstanceOf[js.Any], PageStyle = PageStyle.asInstanceOf[js.Any], TabColor = TabColor.asInstanceOf[js.Any], TableLayout = TableLayout.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, Scenario)
    js.Dynamic.global.Object.assign(__obj, SheetCellRange)
    js.Dynamic.global.Object.assign(__obj, XCellRangeMovement)
    js.Dynamic.global.Object.assign(__obj, XDataPilotTablesSupplier)
    js.Dynamic.global.Object.assign(__obj, XDrawPageSupplier)
    js.Dynamic.global.Object.assign(__obj, XExternalSheetName)
    js.Dynamic.global.Object.assign(__obj, XPrintAreas)
    js.Dynamic.global.Object.assign(__obj, XProtectable)
    js.Dynamic.global.Object.assign(__obj, XScenariosSupplier)
    js.Dynamic.global.Object.assign(__obj, XSheetAnnotationsSupplier)
    js.Dynamic.global.Object.assign(__obj, XSheetAuditing)
    js.Dynamic.global.Object.assign(__obj, XSheetLinkable)
    js.Dynamic.global.Object.assign(__obj, XSheetOutline)
    js.Dynamic.global.Object.assign(__obj, XSheetPageBreak)
    js.Dynamic.global.Object.assign(__obj, XSpreadsheet)
    js.Dynamic.global.Object.assign(__obj, XTableChartsSupplier)
    __obj.asInstanceOf[Spreadsheet]
  }
  
  @scala.inline
  implicit class SpreadsheetMutableBuilder[Self <: Spreadsheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomaticPrintArea(value: Boolean): Self = StObject.set(x, "AutomaticPrintArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalFormats(value: XConditionalFormats): Self = StObject.set(x, "ConditionalFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = StObject.set(x, "IsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageStyle(value: String): Self = StObject.set(x, "PageStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabColor(value: Color): Self = StObject.set(x, "TabColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableLayout(value: Double): Self = StObject.set(x, "TableLayout", value.asInstanceOf[js.Any])
  }
}
