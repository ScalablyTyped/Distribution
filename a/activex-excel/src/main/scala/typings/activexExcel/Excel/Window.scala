package typings.activexExcel.Excel

import typings.activexExcel.activexExcelBooleans.`true`
import typings.activexExcel.activexExcelNumbers.`0`
import typings.activexExcel.activexExcelNumbers.`1`
import typings.std.SafeArray
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
  val ActiveSheet: Sheet | Null = js.native
  val ActiveSheetView: SheetView | Null = js.native
  val Application: typings.activexExcel.Excel.Application = js.native
  var AutoFilterDateGrouping: Boolean = js.native
  var Caption: String = js.native
  val Creator: XlCreator = js.native
  var DisplayFormulas: Boolean = js.native
  var DisplayGridlines: Boolean = js.native
  var DisplayHeadings: Boolean = js.native
  var DisplayHorizontalScrollBar: Boolean = js.native
  var DisplayOutline: Boolean = js.native
  var DisplayRightToLeft: Boolean = js.native
  var DisplayRuler: Boolean = js.native
  var DisplayVerticalScrollBar: Boolean = js.native
  var DisplayWhitespace: Boolean = js.native
  var DisplayWorkbookTabs: Boolean = js.native
  var DisplayZeros: Boolean = js.native
  var EnableResize: Boolean = js.native
  @JSName("Excel.Window_typekey")
  var ExcelDotWindow_typekey: Window = js.native
  var FreezePanes: Boolean = js.native
  var GridlineColor: Double = js.native
  var GridlineColorIndex: XlColorIndex = js.native
  var Height: Double = js.native
  val Index: Double = js.native
  var Left: Double = js.native
  var OnWindow: String = js.native
  @JSName("Panes")
  val Panes_Original: Panes = js.native
  val Parent: js.Any = js.native
  @JSName("RangeSelection")
  val RangeSelection_Original: Range = js.native
  var ScrollColumn: Double = js.native
  var ScrollRow: Double = js.native
  @JSName("SelectedSheets")
  val SelectedSheets_Original: Sheets[Sheet] = js.native
  val Selection: js.Any = js.native
  @JSName("SheetViews")
  val SheetViews_Original: SheetViews = js.native
  var Split: Boolean = js.native
  var SplitColumn: Double = js.native
  var SplitHorizontal: Double = js.native
  var SplitRow: Double = js.native
  var SplitVertical: Double = js.native
  var TabRatio: Double = js.native
  var Top: Double = js.native
  val Type: XlWindowType = js.native
  val UsableHeight: Double = js.native
  val UsableWidth: Double = js.native
  var View: XlWindowView = js.native
  var Visible: Boolean = js.native
  @JSName("VisibleRange")
  val VisibleRange_Original: Range = js.native
  var Width: Double = js.native
  val WindowNumber: Double = js.native
  var WindowState: XlWindowState = js.native
  var Zoom: Double | `true` = js.native
  var _DisplayRightToLeft: Boolean = js.native
  def Activate(): js.Any = js.native
  def ActivateNext(): js.Any = js.native
  def ActivatePrevious(): js.Any = js.native
  def ActiveCell(Address: String): Range = js.native
  def ActiveCell(RowIndex: Double): Range = js.native
  def ActiveCell(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def Close(): Boolean = js.native
  def Close(SaveChanges: Boolean): Boolean = js.native
  def Close(SaveChanges: Boolean, Filename: String): Boolean = js.native
  def Close(SaveChanges: Boolean, Filename: String, RouteWorkbook: Boolean): Boolean = js.native
  def LargeScroll(): js.Any = js.native
  def LargeScroll(Down: Double): js.Any = js.native
  def LargeScroll(Down: Double, Up: Double): js.Any = js.native
  def LargeScroll(Down: Double, Up: Double, ToRight: Double): js.Any = js.native
  def LargeScroll(Down: Double, Up: Double, ToRight: Double, ToLeft: Double): js.Any = js.native
  def NewWindow(): Window = js.native
  def Panes(Index: Double): Pane = js.native
  def PointsToScreenPixelsX(Points: Double): Double = js.native
  def PointsToScreenPixelsY(Points: Double): Double = js.native
  def PrintOut[T /* <: js.UndefOr[Boolean] */](
    From: js.UndefOr[Double],
    To: js.UndefOr[Double],
    Copies: js.UndefOr[Double],
    Preview: js.UndefOr[Boolean],
    ActivePrinter: js.UndefOr[String],
    PrintToFile: js.UndefOr[T],
    Collate: js.UndefOr[Boolean],
    PrToFileName: js.UndefOr[PrintToFileName[T]]
  ): js.Any = js.native
  def PrintPreview(): js.Any = js.native
  def PrintPreview(EnableChanges: Boolean): js.Any = js.native
  def RangeFromPoint(x: Double, y: Double): Shape | Range | Null = js.native
  def RangeSelection(Address: String): Range = js.native
  def RangeSelection(RowIndex: Double): Range = js.native
  def RangeSelection(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def ScrollIntoView(Left: Double, Top: Double, Width: Double, Height: Double): Unit = js.native
  def ScrollIntoView(Left: Double, Top: Double, Width: Double, Height: Double, Start: Boolean): Unit = js.native
  def ScrollWorkbookTabs(Sheets: Double): js.Any = js.native
  def ScrollWorkbookTabs(Sheets: `0`, Position: `1`): js.Any = js.native
  @JSName("ScrollWorkbookTabs")
  def ScrollWorkbookTabs_0(Sheets: `0`, Position: `0`): js.Any = js.native
  def SelectedSheets(Indexes: SafeArray[String | Double]): Sheets[Sheet] = js.native
  def SelectedSheets(Index: String): Sheet = js.native
  def SelectedSheets(Index: Double): Sheet = js.native
  def SheetViews(Index: js.Any): SheetView = js.native
  def SmallScroll(): js.Any = js.native
  def SmallScroll(Down: Double): js.Any = js.native
  def SmallScroll(Down: Double, Up: Double): js.Any = js.native
  def SmallScroll(Down: Double, Up: Double, ToRight: Double): js.Any = js.native
  def SmallScroll(Down: Double, Up: Double, ToRight: Double, ToLeft: Double): js.Any = js.native
  def VisibleRange(Address: String): Range = js.native
  def VisibleRange(RowIndex: Double): Range = js.native
  def VisibleRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
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

