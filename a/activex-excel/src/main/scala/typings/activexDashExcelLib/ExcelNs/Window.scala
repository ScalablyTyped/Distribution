package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Window")
@js.native
class Window protected () extends js.Object {
  @JSName("ActiveCell")
  val ActiveCell_Original: Range = js.native
  val ActiveChart: Chart = js.native
  val ActivePane: Pane = js.native
  val ActiveSheet: Sheet | scala.Null = js.native
  val ActiveSheetView: SheetView | scala.Null = js.native
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  var AutoFilterDateGrouping: scala.Boolean = js.native
  var Caption: java.lang.String = js.native
  val Creator: XlCreator = js.native
  var DisplayFormulas: scala.Boolean = js.native
  var DisplayGridlines: scala.Boolean = js.native
  var DisplayHeadings: scala.Boolean = js.native
  var DisplayHorizontalScrollBar: scala.Boolean = js.native
  var DisplayOutline: scala.Boolean = js.native
  var DisplayRightToLeft: scala.Boolean = js.native
  var DisplayRuler: scala.Boolean = js.native
  var DisplayVerticalScrollBar: scala.Boolean = js.native
  var DisplayWhitespace: scala.Boolean = js.native
  var DisplayWorkbookTabs: scala.Boolean = js.native
  var DisplayZeros: scala.Boolean = js.native
  var EnableResize: scala.Boolean = js.native
  var `Excel.Window_typekey`: Window = js.native
  var FreezePanes: scala.Boolean = js.native
  var GridlineColor: scala.Double = js.native
  var GridlineColorIndex: XlColorIndex = js.native
  var Height: scala.Double = js.native
  val Index: scala.Double = js.native
  var Left: scala.Double = js.native
  var OnWindow: java.lang.String = js.native
  @JSName("Panes")
  val Panes_Original: Panes = js.native
  val Parent: js.Any = js.native
  @JSName("RangeSelection")
  val RangeSelection_Original: Range = js.native
  var ScrollColumn: scala.Double = js.native
  var ScrollRow: scala.Double = js.native
  @JSName("SelectedSheets")
  val SelectedSheets_Original: Sheets[Sheet] = js.native
  val Selection: js.Any = js.native
  @JSName("SheetViews")
  val SheetViews_Original: SheetViews = js.native
  var Split: scala.Boolean = js.native
  var SplitColumn: scala.Double = js.native
  var SplitHorizontal: scala.Double = js.native
  var SplitRow: scala.Double = js.native
  var SplitVertical: scala.Double = js.native
  var TabRatio: scala.Double = js.native
  var Top: scala.Double = js.native
  val Type: XlWindowType = js.native
  val UsableHeight: scala.Double = js.native
  val UsableWidth: scala.Double = js.native
  var View: XlWindowView = js.native
  var Visible: scala.Boolean = js.native
  @JSName("VisibleRange")
  val VisibleRange_Original: Range = js.native
  var Width: scala.Double = js.native
  val WindowNumber: scala.Double = js.native
  var WindowState: XlWindowState = js.native
  var Zoom: scala.Double | activexDashExcelLib.activexDashExcelLibNumbers.`true` = js.native
  var _DisplayRightToLeft: scala.Boolean = js.native
  def Activate(): js.Any = js.native
  def ActivateNext(): js.Any = js.native
  def ActivatePrevious(): js.Any = js.native
  def ActiveCell(Address: java.lang.String): Range = js.native
  def ActiveCell(RowIndex: scala.Double): Range = js.native
  def ActiveCell(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Close(): scala.Boolean = js.native
  def Close(SaveChanges: scala.Boolean): scala.Boolean = js.native
  def Close(SaveChanges: scala.Boolean, Filename: java.lang.String): scala.Boolean = js.native
  def Close(SaveChanges: scala.Boolean, Filename: java.lang.String, RouteWorkbook: scala.Boolean): scala.Boolean = js.native
  def LargeScroll(): js.Any = js.native
  def LargeScroll(Down: scala.Double): js.Any = js.native
  def LargeScroll(Down: scala.Double, Up: scala.Double): js.Any = js.native
  def LargeScroll(Down: scala.Double, Up: scala.Double, ToRight: scala.Double): js.Any = js.native
  def LargeScroll(Down: scala.Double, Up: scala.Double, ToRight: scala.Double, ToLeft: scala.Double): js.Any = js.native
  def NewWindow(): Window = js.native
  def Panes(Index: scala.Double): Pane = js.native
  def PointsToScreenPixelsX(Points: scala.Double): scala.Double = js.native
  def PointsToScreenPixelsY(Points: scala.Double): scala.Double = js.native
  def PrintOut(
    From: js.UndefOr[scala.Double],
    To: js.UndefOr[scala.Double],
    Copies: js.UndefOr[scala.Double],
    Preview: js.UndefOr[scala.Boolean],
    ActivePrinter: js.UndefOr[java.lang.String],
    PrintToFile: js.UndefOr[scala.Boolean],
    Collate: js.UndefOr[scala.Boolean],
    PrToFileName: js.UndefOr[PrintToFileName[js.UndefOr[scala.Boolean]]]
  ): js.Any = js.native
  def PrintPreview(): js.Any = js.native
  def PrintPreview(EnableChanges: scala.Boolean): js.Any = js.native
  def RangeFromPoint(x: scala.Double, y: scala.Double): Shape | Range | scala.Null = js.native
  def RangeSelection(Address: java.lang.String): Range = js.native
  def RangeSelection(RowIndex: scala.Double): Range = js.native
  def RangeSelection(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def ScrollIntoView(Left: scala.Double, Top: scala.Double, Width: scala.Double, Height: scala.Double): scala.Unit = js.native
  def ScrollIntoView(
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double,
    Start: scala.Boolean
  ): scala.Unit = js.native
  def ScrollWorkbookTabs(Sheets: activexDashExcelLib.activexDashExcelLibNumbers.`0`, Position: Constants): js.Any = js.native
  def ScrollWorkbookTabs(Sheets: scala.Double): js.Any = js.native
  def SelectedSheets(Indexes: stdLib.SafeArray[java.lang.String | scala.Double]): Sheets[Sheet] = js.native
  def SelectedSheets(Index: java.lang.String): Sheet = js.native
  def SelectedSheets(Index: scala.Double): Sheet = js.native
  def SheetViews(Index: js.Any): SheetView = js.native
  def SmallScroll(): js.Any = js.native
  def SmallScroll(Down: scala.Double): js.Any = js.native
  def SmallScroll(Down: scala.Double, Up: scala.Double): js.Any = js.native
  def SmallScroll(Down: scala.Double, Up: scala.Double, ToRight: scala.Double): js.Any = js.native
  def SmallScroll(Down: scala.Double, Up: scala.Double, ToRight: scala.Double, ToLeft: scala.Double): js.Any = js.native
  def VisibleRange(Address: java.lang.String): Range = js.native
  def VisibleRange(RowIndex: scala.Double): Range = js.native
  def VisibleRange(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def _PrintOut(
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    Copies: js.UndefOr[js.Any],
    Preview: js.UndefOr[js.Any],
    ActivePrinter: js.UndefOr[js.Any],
    PrintToFile: js.UndefOr[js.Any],
    Collate: js.UndefOr[js.Any],
    PrToFileName: js.UndefOr[js.Any]
  ): js.Any = js.native
}

