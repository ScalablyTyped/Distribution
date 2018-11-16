package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Window")
@js.native
class Window protected () extends js.Object {
  val Active: scala.Boolean = js.native
  val ActivePane: Pane = js.native
  val Application: Application = js.native
  var Caption: java.lang.String = js.native
  val Creator: scala.Double = js.native
  var DisplayHorizontalScrollBar: scala.Boolean = js.native
  var DisplayLeftScrollBar: scala.Boolean = js.native
  var DisplayRightRuler: scala.Boolean = js.native
  var DisplayRulers: scala.Boolean = js.native
  var DisplayScreenTips: scala.Boolean = js.native
  var DisplayVerticalRuler: scala.Boolean = js.native
  var DisplayVerticalScrollBar: scala.Boolean = js.native
  val Document: Document = js.native
  var DocumentMap: scala.Boolean = js.native
  var DocumentMapPercentWidth: scala.Double = js.native
  var EnvelopeVisible: scala.Boolean = js.native
  var Height: scala.Double = js.native
  var HorizontalPercentScrolled: scala.Double = js.native
  var IMEMode: WdIMEMode = js.native
  val Index: scala.Double = js.native
  var Left: scala.Double = js.native
  val Next: Window = js.native
  val Panes: Panes = js.native
  val Parent: js.Any = js.native
  val Previous: Window = js.native
  val Selection: Selection = js.native
  var ShowSourceDocuments: WdShowSourceDocuments = js.native
  var Split: scala.Boolean = js.native
  var SplitVertical: scala.Double = js.native
  var StyleAreaWidth: scala.Double = js.native
  var Thumbnails: scala.Boolean = js.native
  var Top: scala.Double = js.native
  val Type: WdWindowType = js.native
  val UsableHeight: scala.Double = js.native
  val UsableWidth: scala.Double = js.native
  var VerticalPercentScrolled: scala.Double = js.native
  val View: View = js.native
  var Visible: scala.Boolean = js.native
  var Width: scala.Double = js.native
  val WindowNumber: scala.Double = js.native
  var WindowState: WdWindowState = js.native
  var `Word.Window_typekey`: Window = js.native
  def Activate(): scala.Unit = js.native
  def Close(): scala.Unit = js.native
  def Close(SaveChanges: js.Any): scala.Unit = js.native
  def Close(SaveChanges: js.Any, RouteDocument: js.Any): scala.Unit = js.native
  def GetPoint(
    ScreenPixelsLeft: scala.Double,
    ScreenPixelsTop: scala.Double,
    ScreenPixelsWidth: scala.Double,
    ScreenPixelsHeight: scala.Double,
    obj: js.Any
  ): scala.Unit = js.native
  def LargeScroll(): scala.Unit = js.native
  def LargeScroll(Down: js.Any): scala.Unit = js.native
  def LargeScroll(Down: js.Any, Up: js.Any): scala.Unit = js.native
  def LargeScroll(Down: js.Any, Up: js.Any, ToRight: js.Any): scala.Unit = js.native
  def LargeScroll(Down: js.Any, Up: js.Any, ToRight: js.Any, ToLeft: js.Any): scala.Unit = js.native
  def NewWindow(): Window = js.native
  def PageScroll(): scala.Unit = js.native
  def PageScroll(Down: js.Any): scala.Unit = js.native
  def PageScroll(Down: js.Any, Up: js.Any): scala.Unit = js.native
  def PrintOut(
    Background: js.UndefOr[js.Any],
    Append: js.UndefOr[js.Any],
    Range: js.UndefOr[js.Any],
    OutputFileName: js.UndefOr[js.Any],
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    Item: js.UndefOr[js.Any],
    Copies: js.UndefOr[js.Any],
    Pages: js.UndefOr[js.Any],
    PageType: js.UndefOr[js.Any],
    PrintToFile: js.UndefOr[js.Any],
    Collate: js.UndefOr[js.Any],
    ActivePrinterMacGX: js.UndefOr[js.Any],
    ManualDuplexPrint: js.UndefOr[js.Any],
    PrintZoomColumn: js.UndefOr[js.Any],
    PrintZoomRow: js.UndefOr[js.Any],
    PrintZoomPaperWidth: js.UndefOr[js.Any],
    PrintZoomPaperHeight: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def PrintOut2000(
    Background: js.UndefOr[js.Any],
    Append: js.UndefOr[js.Any],
    Range: js.UndefOr[js.Any],
    OutputFileName: js.UndefOr[js.Any],
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    Item: js.UndefOr[js.Any],
    Copies: js.UndefOr[js.Any],
    Pages: js.UndefOr[js.Any],
    PageType: js.UndefOr[js.Any],
    PrintToFile: js.UndefOr[js.Any],
    Collate: js.UndefOr[js.Any],
    ActivePrinterMacGX: js.UndefOr[js.Any],
    ManualDuplexPrint: js.UndefOr[js.Any],
    PrintZoomColumn: js.UndefOr[js.Any],
    PrintZoomRow: js.UndefOr[js.Any],
    PrintZoomPaperWidth: js.UndefOr[js.Any],
    PrintZoomPaperHeight: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def PrintOutOld(
    Background: js.UndefOr[js.Any],
    Append: js.UndefOr[js.Any],
    Range: js.UndefOr[js.Any],
    OutputFileName: js.UndefOr[js.Any],
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    Item: js.UndefOr[js.Any],
    Copies: js.UndefOr[js.Any],
    Pages: js.UndefOr[js.Any],
    PageType: js.UndefOr[js.Any],
    PrintToFile: js.UndefOr[js.Any],
    Collate: js.UndefOr[js.Any],
    ActivePrinterMacGX: js.UndefOr[js.Any],
    ManualDuplexPrint: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def RangeFromPoint(x: scala.Double, y: scala.Double): js.Any = js.native
  def ScrollIntoView(obj: js.Any): scala.Unit = js.native
  def ScrollIntoView(obj: js.Any, Start: js.Any): scala.Unit = js.native
  def SetFocus(): scala.Unit = js.native
  def SmallScroll(): scala.Unit = js.native
  def SmallScroll(Down: js.Any): scala.Unit = js.native
  def SmallScroll(Down: js.Any, Up: js.Any): scala.Unit = js.native
  def SmallScroll(Down: js.Any, Up: js.Any, ToRight: js.Any): scala.Unit = js.native
  def SmallScroll(Down: js.Any, Up: js.Any, ToRight: js.Any, ToLeft: js.Any): scala.Unit = js.native
  def ToggleRibbon(): scala.Unit = js.native
  def ToggleShowAllReviewers(): scala.Unit = js.native
}

