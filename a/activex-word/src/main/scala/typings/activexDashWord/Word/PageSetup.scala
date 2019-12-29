package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.PageSetup")
@js.native
class PageSetup protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  var BookFoldPrinting: Boolean = js.native
  var BookFoldPrintingSheets: Double = js.native
  var BookFoldRevPrinting: Boolean = js.native
  var BottomMargin: Double = js.native
  var CharsLine: Double = js.native
  val Creator: Double = js.native
  var DifferentFirstPageHeaderFooter: Double = js.native
  var FirstPageTray: WdPaperTray = js.native
  var FooterDistance: Double = js.native
  var Gutter: Double = js.native
  var GutterOnTop: Boolean = js.native
  var GutterPos: WdGutterStyle = js.native
  var GutterStyle: WdGutterStyleOld = js.native
  var HeaderDistance: Double = js.native
  var LayoutMode: WdLayoutMode = js.native
  var LeftMargin: Double = js.native
  var LineNumbering: typings.activexDashWord.Word.LineNumbering = js.native
  var LinesPage: Double = js.native
  var MirrorMargins: Double = js.native
  var OddAndEvenPagesHeaderFooter: Double = js.native
  var Orientation: WdOrientation = js.native
  var OtherPagesTray: WdPaperTray = js.native
  var PageHeight: Double = js.native
  var PageWidth: Double = js.native
  var PaperSize: WdPaperSize = js.native
  val Parent: js.Any = js.native
  var RightMargin: Double = js.native
  var SectionDirection: WdSectionDirection = js.native
  var SectionStart: WdSectionStart = js.native
  var ShowGrid: Boolean = js.native
  var SuppressEndnotes: Double = js.native
  var TextColumns: typings.activexDashWord.Word.TextColumns = js.native
  var TopMargin: Double = js.native
  var TwoPagesOnOne: Boolean = js.native
  var VerticalAlignment: WdVerticalAlignment = js.native
  @JSName("Word.PageSetup_typekey")
  var WordDotPageSetup_typekey: PageSetup = js.native
  def SetAsTemplateDefault(): Unit = js.native
  def TogglePortrait(): Unit = js.native
}

