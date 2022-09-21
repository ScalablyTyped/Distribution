package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  def Activate(): Unit = js.native
  
  val Active: Boolean = js.native
  
  val ActivePane: Pane = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var Caption: String = js.native
  
  def Close(): Unit = js.native
  def Close(SaveChanges: Any): Unit = js.native
  def Close(SaveChanges: Any, RouteDocument: Any): Unit = js.native
  def Close(SaveChanges: Unit, RouteDocument: Any): Unit = js.native
  
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
    obj: Any
  ): Unit = js.native
  
  var Height: Double = js.native
  
  var HorizontalPercentScrolled: Double = js.native
  
  var IMEMode: WdIMEMode = js.native
  
  val Index: Double = js.native
  
  def LargeScroll(): Unit = js.native
  def LargeScroll(Down: Any): Unit = js.native
  def LargeScroll(Down: Any, Up: Any): Unit = js.native
  def LargeScroll(Down: Any, Up: Any, ToRight: Any): Unit = js.native
  def LargeScroll(Down: Any, Up: Any, ToRight: Any, ToLeft: Any): Unit = js.native
  def LargeScroll(Down: Any, Up: Any, ToRight: Unit, ToLeft: Any): Unit = js.native
  def LargeScroll(Down: Any, Up: Unit, ToRight: Any): Unit = js.native
  def LargeScroll(Down: Any, Up: Unit, ToRight: Any, ToLeft: Any): Unit = js.native
  def LargeScroll(Down: Any, Up: Unit, ToRight: Unit, ToLeft: Any): Unit = js.native
  def LargeScroll(Down: Unit, Up: Any): Unit = js.native
  def LargeScroll(Down: Unit, Up: Any, ToRight: Any): Unit = js.native
  def LargeScroll(Down: Unit, Up: Any, ToRight: Any, ToLeft: Any): Unit = js.native
  def LargeScroll(Down: Unit, Up: Any, ToRight: Unit, ToLeft: Any): Unit = js.native
  def LargeScroll(Down: Unit, Up: Unit, ToRight: Any): Unit = js.native
  def LargeScroll(Down: Unit, Up: Unit, ToRight: Any, ToLeft: Any): Unit = js.native
  def LargeScroll(Down: Unit, Up: Unit, ToRight: Unit, ToLeft: Any): Unit = js.native
  
  var Left: Double = js.native
  
  def NewWindow(): Window = js.native
  
  val Next: Window = js.native
  
  def PageScroll(): Unit = js.native
  def PageScroll(Down: Any): Unit = js.native
  def PageScroll(Down: Any, Up: Any): Unit = js.native
  def PageScroll(Down: Unit, Up: Any): Unit = js.native
  
  val Panes: typings.activexWord.Word.Panes = js.native
  
  val Parent: Any = js.native
  
  val Previous: Window = js.native
  
  def PrintOut(
    Background: js.UndefOr[Any],
    Append: js.UndefOr[Any],
    Range: js.UndefOr[Any],
    OutputFileName: js.UndefOr[Any],
    From: js.UndefOr[Any],
    To: js.UndefOr[Any],
    Item: js.UndefOr[Any],
    Copies: js.UndefOr[Any],
    Pages: js.UndefOr[Any],
    PageType: js.UndefOr[Any],
    PrintToFile: js.UndefOr[Any],
    Collate: js.UndefOr[Any],
    ActivePrinterMacGX: js.UndefOr[Any],
    ManualDuplexPrint: js.UndefOr[Any],
    PrintZoomColumn: js.UndefOr[Any],
    PrintZoomRow: js.UndefOr[Any],
    PrintZoomPaperWidth: js.UndefOr[Any],
    PrintZoomPaperHeight: js.UndefOr[Any]
  ): Unit = js.native
  
  def PrintOut2000(
    Background: js.UndefOr[Any],
    Append: js.UndefOr[Any],
    Range: js.UndefOr[Any],
    OutputFileName: js.UndefOr[Any],
    From: js.UndefOr[Any],
    To: js.UndefOr[Any],
    Item: js.UndefOr[Any],
    Copies: js.UndefOr[Any],
    Pages: js.UndefOr[Any],
    PageType: js.UndefOr[Any],
    PrintToFile: js.UndefOr[Any],
    Collate: js.UndefOr[Any],
    ActivePrinterMacGX: js.UndefOr[Any],
    ManualDuplexPrint: js.UndefOr[Any],
    PrintZoomColumn: js.UndefOr[Any],
    PrintZoomRow: js.UndefOr[Any],
    PrintZoomPaperWidth: js.UndefOr[Any],
    PrintZoomPaperHeight: js.UndefOr[Any]
  ): Unit = js.native
  
  def PrintOutOld(
    Background: js.UndefOr[Any],
    Append: js.UndefOr[Any],
    Range: js.UndefOr[Any],
    OutputFileName: js.UndefOr[Any],
    From: js.UndefOr[Any],
    To: js.UndefOr[Any],
    Item: js.UndefOr[Any],
    Copies: js.UndefOr[Any],
    Pages: js.UndefOr[Any],
    PageType: js.UndefOr[Any],
    PrintToFile: js.UndefOr[Any],
    Collate: js.UndefOr[Any],
    ActivePrinterMacGX: js.UndefOr[Any],
    ManualDuplexPrint: js.UndefOr[Any]
  ): Unit = js.native
  
  def RangeFromPoint(x: Double, y: Double): Any = js.native
  
  def ScrollIntoView(obj: Any): Unit = js.native
  def ScrollIntoView(obj: Any, Start: Any): Unit = js.native
  
  val Selection: typings.activexWord.Word.Selection = js.native
  
  def SetFocus(): Unit = js.native
  
  var ShowSourceDocuments: WdShowSourceDocuments = js.native
  
  def SmallScroll(): Unit = js.native
  def SmallScroll(Down: Any): Unit = js.native
  def SmallScroll(Down: Any, Up: Any): Unit = js.native
  def SmallScroll(Down: Any, Up: Any, ToRight: Any): Unit = js.native
  def SmallScroll(Down: Any, Up: Any, ToRight: Any, ToLeft: Any): Unit = js.native
  def SmallScroll(Down: Any, Up: Any, ToRight: Unit, ToLeft: Any): Unit = js.native
  def SmallScroll(Down: Any, Up: Unit, ToRight: Any): Unit = js.native
  def SmallScroll(Down: Any, Up: Unit, ToRight: Any, ToLeft: Any): Unit = js.native
  def SmallScroll(Down: Any, Up: Unit, ToRight: Unit, ToLeft: Any): Unit = js.native
  def SmallScroll(Down: Unit, Up: Any): Unit = js.native
  def SmallScroll(Down: Unit, Up: Any, ToRight: Any): Unit = js.native
  def SmallScroll(Down: Unit, Up: Any, ToRight: Any, ToLeft: Any): Unit = js.native
  def SmallScroll(Down: Unit, Up: Any, ToRight: Unit, ToLeft: Any): Unit = js.native
  def SmallScroll(Down: Unit, Up: Unit, ToRight: Any): Unit = js.native
  def SmallScroll(Down: Unit, Up: Unit, ToRight: Any, ToLeft: Any): Unit = js.native
  def SmallScroll(Down: Unit, Up: Unit, ToRight: Unit, ToLeft: Any): Unit = js.native
  
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
  
  /* private */ @JSName("Word.Window_typekey")
  var WordDotWindow_typekey: Window = js.native
}
