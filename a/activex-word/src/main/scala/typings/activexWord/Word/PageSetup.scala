package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageSetup extends js.Object {
  val Application: typings.activexWord.Word.Application
  var BookFoldPrinting: Boolean
  var BookFoldPrintingSheets: Double
  var BookFoldRevPrinting: Boolean
  var BottomMargin: Double
  var CharsLine: Double
  val Creator: Double
  var DifferentFirstPageHeaderFooter: Double
  var FirstPageTray: WdPaperTray
  var FooterDistance: Double
  var Gutter: Double
  var GutterOnTop: Boolean
  var GutterPos: WdGutterStyle
  var GutterStyle: WdGutterStyleOld
  var HeaderDistance: Double
  var LayoutMode: WdLayoutMode
  var LeftMargin: Double
  var LineNumbering: typings.activexWord.Word.LineNumbering
  var LinesPage: Double
  var MirrorMargins: Double
  var OddAndEvenPagesHeaderFooter: Double
  var Orientation: WdOrientation
  var OtherPagesTray: WdPaperTray
  var PageHeight: Double
  var PageWidth: Double
  var PaperSize: WdPaperSize
  val Parent: js.Any
  var RightMargin: Double
  var SectionDirection: WdSectionDirection
  var SectionStart: WdSectionStart
  var ShowGrid: Boolean
  var SuppressEndnotes: Double
  var TextColumns: typings.activexWord.Word.TextColumns
  var TopMargin: Double
  var TwoPagesOnOne: Boolean
  var VerticalAlignment: WdVerticalAlignment
  @JSName("Word.PageSetup_typekey")
  var WordDotPageSetup_typekey: PageSetup
  def SetAsTemplateDefault(): Unit
  def TogglePortrait(): Unit
}

object PageSetup {
  @scala.inline
  def apply(
    Application: Application,
    BookFoldPrinting: Boolean,
    BookFoldPrintingSheets: Double,
    BookFoldRevPrinting: Boolean,
    BottomMargin: Double,
    CharsLine: Double,
    Creator: Double,
    DifferentFirstPageHeaderFooter: Double,
    FirstPageTray: WdPaperTray,
    FooterDistance: Double,
    Gutter: Double,
    GutterOnTop: Boolean,
    GutterPos: WdGutterStyle,
    GutterStyle: WdGutterStyleOld,
    HeaderDistance: Double,
    LayoutMode: WdLayoutMode,
    LeftMargin: Double,
    LineNumbering: LineNumbering,
    LinesPage: Double,
    MirrorMargins: Double,
    OddAndEvenPagesHeaderFooter: Double,
    Orientation: WdOrientation,
    OtherPagesTray: WdPaperTray,
    PageHeight: Double,
    PageWidth: Double,
    PaperSize: WdPaperSize,
    Parent: js.Any,
    RightMargin: Double,
    SectionDirection: WdSectionDirection,
    SectionStart: WdSectionStart,
    SetAsTemplateDefault: () => Unit,
    ShowGrid: Boolean,
    SuppressEndnotes: Double,
    TextColumns: TextColumns,
    TogglePortrait: () => Unit,
    TopMargin: Double,
    TwoPagesOnOne: Boolean,
    VerticalAlignment: WdVerticalAlignment,
    WordDotPageSetup_typekey: PageSetup
  ): PageSetup = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BookFoldPrinting = BookFoldPrinting.asInstanceOf[js.Any], BookFoldPrintingSheets = BookFoldPrintingSheets.asInstanceOf[js.Any], BookFoldRevPrinting = BookFoldRevPrinting.asInstanceOf[js.Any], BottomMargin = BottomMargin.asInstanceOf[js.Any], CharsLine = CharsLine.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DifferentFirstPageHeaderFooter = DifferentFirstPageHeaderFooter.asInstanceOf[js.Any], FirstPageTray = FirstPageTray.asInstanceOf[js.Any], FooterDistance = FooterDistance.asInstanceOf[js.Any], Gutter = Gutter.asInstanceOf[js.Any], GutterOnTop = GutterOnTop.asInstanceOf[js.Any], GutterPos = GutterPos.asInstanceOf[js.Any], GutterStyle = GutterStyle.asInstanceOf[js.Any], HeaderDistance = HeaderDistance.asInstanceOf[js.Any], LayoutMode = LayoutMode.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], LineNumbering = LineNumbering.asInstanceOf[js.Any], LinesPage = LinesPage.asInstanceOf[js.Any], MirrorMargins = MirrorMargins.asInstanceOf[js.Any], OddAndEvenPagesHeaderFooter = OddAndEvenPagesHeaderFooter.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], OtherPagesTray = OtherPagesTray.asInstanceOf[js.Any], PageHeight = PageHeight.asInstanceOf[js.Any], PageWidth = PageWidth.asInstanceOf[js.Any], PaperSize = PaperSize.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RightMargin = RightMargin.asInstanceOf[js.Any], SectionDirection = SectionDirection.asInstanceOf[js.Any], SectionStart = SectionStart.asInstanceOf[js.Any], SetAsTemplateDefault = js.Any.fromFunction0(SetAsTemplateDefault), ShowGrid = ShowGrid.asInstanceOf[js.Any], SuppressEndnotes = SuppressEndnotes.asInstanceOf[js.Any], TextColumns = TextColumns.asInstanceOf[js.Any], TogglePortrait = js.Any.fromFunction0(TogglePortrait), TopMargin = TopMargin.asInstanceOf[js.Any], TwoPagesOnOne = TwoPagesOnOne.asInstanceOf[js.Any], VerticalAlignment = VerticalAlignment.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.PageSetup_typekey")(WordDotPageSetup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageSetup]
  }
}

