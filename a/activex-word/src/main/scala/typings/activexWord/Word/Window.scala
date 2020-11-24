package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends js.Object {
  
  def Activate(): Unit = js.native
  
  val Active: Boolean = js.native
  
  val ActivePane: Pane = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var Caption: String = js.native
  
  def Close(): Unit = js.native
  def Close(SaveChanges: js.UndefOr[scala.Nothing], RouteDocument: js.Any): Unit = js.native
  def Close(SaveChanges: js.Any): Unit = js.native
  def Close(SaveChanges: js.Any, RouteDocument: js.Any): Unit = js.native
  
  val Creator: Double = js.native
  
  var DisplayHorizontalScrollBar: Boolean = js.native
  
  var DisplayLeftScrollBar: Boolean = js.native
  
  var DisplayRightRuler: Boolean = js.native
  
  var DisplayRulers: Boolean = js.native
  
  var DisplayScreenTips: Boolean = js.native
  
  var DisplayVerticalRuler: Boolean = js.native
  
  var DisplayVerticalScrollBar: Boolean = js.native
  
  val Document: typings.activexWord.Word.Document = js.native
  
  var DocumentMap: Boolean = js.native
  
  var DocumentMapPercentWidth: Double = js.native
  
  var EnvelopeVisible: Boolean = js.native
  
  def GetPoint(
    ScreenPixelsLeft: Double,
    ScreenPixelsTop: Double,
    ScreenPixelsWidth: Double,
    ScreenPixelsHeight: Double,
    obj: js.Any
  ): Unit = js.native
  
  var Height: Double = js.native
  
  var HorizontalPercentScrolled: Double = js.native
  
  var IMEMode: WdIMEMode = js.native
  
  val Index: Double = js.native
  
  def LargeScroll(): Unit = js.native
  def LargeScroll(
    Down: js.UndefOr[scala.Nothing],
    Up: js.UndefOr[scala.Nothing],
    ToRight: js.UndefOr[scala.Nothing],
    ToLeft: js.Any
  ): Unit = js.native
  def LargeScroll(Down: js.UndefOr[scala.Nothing], Up: js.UndefOr[scala.Nothing], ToRight: js.Any): Unit = js.native
  def LargeScroll(Down: js.UndefOr[scala.Nothing], Up: js.UndefOr[scala.Nothing], ToRight: js.Any, ToLeft: js.Any): Unit = js.native
  def LargeScroll(Down: js.UndefOr[scala.Nothing], Up: js.Any): Unit = js.native
  def LargeScroll(Down: js.UndefOr[scala.Nothing], Up: js.Any, ToRight: js.UndefOr[scala.Nothing], ToLeft: js.Any): Unit = js.native
  def LargeScroll(Down: js.UndefOr[scala.Nothing], Up: js.Any, ToRight: js.Any): Unit = js.native
  def LargeScroll(Down: js.UndefOr[scala.Nothing], Up: js.Any, ToRight: js.Any, ToLeft: js.Any): Unit = js.native
  def LargeScroll(Down: js.Any): Unit = js.native
  def LargeScroll(Down: js.Any, Up: js.UndefOr[scala.Nothing], ToRight: js.UndefOr[scala.Nothing], ToLeft: js.Any): Unit = js.native
  def LargeScroll(Down: js.Any, Up: js.UndefOr[scala.Nothing], ToRight: js.Any): Unit = js.native
  def LargeScroll(Down: js.Any, Up: js.UndefOr[scala.Nothing], ToRight: js.Any, ToLeft: js.Any): Unit = js.native
  def LargeScroll(Down: js.Any, Up: js.Any): Unit = js.native
  def LargeScroll(Down: js.Any, Up: js.Any, ToRight: js.UndefOr[scala.Nothing], ToLeft: js.Any): Unit = js.native
  def LargeScroll(Down: js.Any, Up: js.Any, ToRight: js.Any): Unit = js.native
  def LargeScroll(Down: js.Any, Up: js.Any, ToRight: js.Any, ToLeft: js.Any): Unit = js.native
  
  var Left: Double = js.native
  
  def NewWindow(): Window = js.native
  
  val Next: Window = js.native
  
  def PageScroll(): Unit = js.native
  def PageScroll(Down: js.UndefOr[scala.Nothing], Up: js.Any): Unit = js.native
  def PageScroll(Down: js.Any): Unit = js.native
  def PageScroll(Down: js.Any, Up: js.Any): Unit = js.native
  
  val Panes: typings.activexWord.Word.Panes = js.native
  
  val Parent: js.Any = js.native
  
  val Previous: Window = js.native
  
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
  ): Unit = js.native
  
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
  ): Unit = js.native
  
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
  ): Unit = js.native
  
  def RangeFromPoint(x: Double, y: Double): js.Any = js.native
  
  def ScrollIntoView(obj: js.Any): Unit = js.native
  def ScrollIntoView(obj: js.Any, Start: js.Any): Unit = js.native
  
  val Selection: typings.activexWord.Word.Selection = js.native
  
  def SetFocus(): Unit = js.native
  
  var ShowSourceDocuments: WdShowSourceDocuments = js.native
  
  def SmallScroll(): Unit = js.native
  def SmallScroll(
    Down: js.UndefOr[scala.Nothing],
    Up: js.UndefOr[scala.Nothing],
    ToRight: js.UndefOr[scala.Nothing],
    ToLeft: js.Any
  ): Unit = js.native
  def SmallScroll(Down: js.UndefOr[scala.Nothing], Up: js.UndefOr[scala.Nothing], ToRight: js.Any): Unit = js.native
  def SmallScroll(Down: js.UndefOr[scala.Nothing], Up: js.UndefOr[scala.Nothing], ToRight: js.Any, ToLeft: js.Any): Unit = js.native
  def SmallScroll(Down: js.UndefOr[scala.Nothing], Up: js.Any): Unit = js.native
  def SmallScroll(Down: js.UndefOr[scala.Nothing], Up: js.Any, ToRight: js.UndefOr[scala.Nothing], ToLeft: js.Any): Unit = js.native
  def SmallScroll(Down: js.UndefOr[scala.Nothing], Up: js.Any, ToRight: js.Any): Unit = js.native
  def SmallScroll(Down: js.UndefOr[scala.Nothing], Up: js.Any, ToRight: js.Any, ToLeft: js.Any): Unit = js.native
  def SmallScroll(Down: js.Any): Unit = js.native
  def SmallScroll(Down: js.Any, Up: js.UndefOr[scala.Nothing], ToRight: js.UndefOr[scala.Nothing], ToLeft: js.Any): Unit = js.native
  def SmallScroll(Down: js.Any, Up: js.UndefOr[scala.Nothing], ToRight: js.Any): Unit = js.native
  def SmallScroll(Down: js.Any, Up: js.UndefOr[scala.Nothing], ToRight: js.Any, ToLeft: js.Any): Unit = js.native
  def SmallScroll(Down: js.Any, Up: js.Any): Unit = js.native
  def SmallScroll(Down: js.Any, Up: js.Any, ToRight: js.UndefOr[scala.Nothing], ToLeft: js.Any): Unit = js.native
  def SmallScroll(Down: js.Any, Up: js.Any, ToRight: js.Any): Unit = js.native
  def SmallScroll(Down: js.Any, Up: js.Any, ToRight: js.Any, ToLeft: js.Any): Unit = js.native
  
  var Split: Boolean = js.native
  
  var SplitVertical: Double = js.native
  
  var StyleAreaWidth: Double = js.native
  
  var Thumbnails: Boolean = js.native
  
  def ToggleRibbon(): Unit = js.native
  
  def ToggleShowAllReviewers(): Unit = js.native
  
  var Top: Double = js.native
  
  val Type: WdWindowType = js.native
  
  val UsableHeight: Double = js.native
  
  val UsableWidth: Double = js.native
  
  var VerticalPercentScrolled: Double = js.native
  
  val View: typings.activexWord.Word.View = js.native
  
  var Visible: Boolean = js.native
  
  var Width: Double = js.native
  
  val WindowNumber: Double = js.native
  
  var WindowState: WdWindowState = js.native
  
  @JSName("Word.Window_typekey")
  var WordDotWindow_typekey: Window = js.native
}
