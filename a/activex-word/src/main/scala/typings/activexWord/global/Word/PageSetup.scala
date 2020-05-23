package typings.activexWord.global.Word

import typings.activexWord.Word.WdGutterStyle
import typings.activexWord.Word.WdGutterStyleOld
import typings.activexWord.Word.WdLayoutMode
import typings.activexWord.Word.WdOrientation
import typings.activexWord.Word.WdPaperSize
import typings.activexWord.Word.WdPaperTray
import typings.activexWord.Word.WdSectionDirection
import typings.activexWord.Word.WdSectionStart
import typings.activexWord.Word.WdVerticalAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.PageSetup")
@js.native
class PageSetup protected ()
  extends typings.activexWord.Word.PageSetup {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override var BookFoldPrinting: Boolean = js.native
  /* CompleteClass */
  override var BookFoldPrintingSheets: Double = js.native
  /* CompleteClass */
  override var BookFoldRevPrinting: Boolean = js.native
  /* CompleteClass */
  override var BottomMargin: Double = js.native
  /* CompleteClass */
  override var CharsLine: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override var DifferentFirstPageHeaderFooter: Double = js.native
  /* CompleteClass */
  override var FirstPageTray: WdPaperTray = js.native
  /* CompleteClass */
  override var FooterDistance: Double = js.native
  /* CompleteClass */
  override var Gutter: Double = js.native
  /* CompleteClass */
  override var GutterOnTop: Boolean = js.native
  /* CompleteClass */
  override var GutterPos: WdGutterStyle = js.native
  /* CompleteClass */
  override var GutterStyle: WdGutterStyleOld = js.native
  /* CompleteClass */
  override var HeaderDistance: Double = js.native
  /* CompleteClass */
  override var LayoutMode: WdLayoutMode = js.native
  /* CompleteClass */
  override var LeftMargin: Double = js.native
  /* CompleteClass */
  override var LineNumbering: typings.activexWord.Word.LineNumbering = js.native
  /* CompleteClass */
  override var LinesPage: Double = js.native
  /* CompleteClass */
  override var MirrorMargins: Double = js.native
  /* CompleteClass */
  override var OddAndEvenPagesHeaderFooter: Double = js.native
  /* CompleteClass */
  override var Orientation: WdOrientation = js.native
  /* CompleteClass */
  override var OtherPagesTray: WdPaperTray = js.native
  /* CompleteClass */
  override var PageHeight: Double = js.native
  /* CompleteClass */
  override var PageWidth: Double = js.native
  /* CompleteClass */
  override var PaperSize: WdPaperSize = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var RightMargin: Double = js.native
  /* CompleteClass */
  override var SectionDirection: WdSectionDirection = js.native
  /* CompleteClass */
  override var SectionStart: WdSectionStart = js.native
  /* CompleteClass */
  override var ShowGrid: Boolean = js.native
  /* CompleteClass */
  override var SuppressEndnotes: Double = js.native
  /* CompleteClass */
  override var TextColumns: typings.activexWord.Word.TextColumns = js.native
  /* CompleteClass */
  override var TopMargin: Double = js.native
  /* CompleteClass */
  override var TwoPagesOnOne: Boolean = js.native
  /* CompleteClass */
  override var VerticalAlignment: WdVerticalAlignment = js.native
  /* CompleteClass */
  @JSName("Word.PageSetup_typekey")
  override var WordDotPageSetup_typekey: typings.activexWord.Word.PageSetup = js.native
  /* CompleteClass */
  override def SetAsTemplateDefault(): Unit = js.native
  /* CompleteClass */
  override def TogglePortrait(): Unit = js.native
}

