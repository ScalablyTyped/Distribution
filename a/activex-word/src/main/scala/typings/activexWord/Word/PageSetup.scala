package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageSetup extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
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
  var LineNumbering: typings.activexWord.Word.LineNumbering = js.native
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
  var TextColumns: typings.activexWord.Word.TextColumns = js.native
  var TopMargin: Double = js.native
  var TwoPagesOnOne: Boolean = js.native
  var VerticalAlignment: WdVerticalAlignment = js.native
  @JSName("Word.PageSetup_typekey")
  var WordDotPageSetup_typekey: PageSetup = js.native
  def SetAsTemplateDefault(): Unit = js.native
  def TogglePortrait(): Unit = js.native
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
  @scala.inline
  implicit class PageSetupOps[Self <: PageSetup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setBookFoldPrinting(value: Boolean): Self = this.set("BookFoldPrinting", value.asInstanceOf[js.Any])
    @scala.inline
    def setBookFoldPrintingSheets(value: Double): Self = this.set("BookFoldPrintingSheets", value.asInstanceOf[js.Any])
    @scala.inline
    def setBookFoldRevPrinting(value: Boolean): Self = this.set("BookFoldRevPrinting", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottomMargin(value: Double): Self = this.set("BottomMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharsLine(value: Double): Self = this.set("CharsLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDifferentFirstPageHeaderFooter(value: Double): Self = this.set("DifferentFirstPageHeaderFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstPageTray(value: WdPaperTray): Self = this.set("FirstPageTray", value.asInstanceOf[js.Any])
    @scala.inline
    def setFooterDistance(value: Double): Self = this.set("FooterDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setGutter(value: Double): Self = this.set("Gutter", value.asInstanceOf[js.Any])
    @scala.inline
    def setGutterOnTop(value: Boolean): Self = this.set("GutterOnTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setGutterPos(value: WdGutterStyle): Self = this.set("GutterPos", value.asInstanceOf[js.Any])
    @scala.inline
    def setGutterStyle(value: WdGutterStyleOld): Self = this.set("GutterStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderDistance(value: Double): Self = this.set("HeaderDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayoutMode(value: WdLayoutMode): Self = this.set("LayoutMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftMargin(value: Double): Self = this.set("LeftMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineNumbering(value: LineNumbering): Self = this.set("LineNumbering", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinesPage(value: Double): Self = this.set("LinesPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setMirrorMargins(value: Double): Self = this.set("MirrorMargins", value.asInstanceOf[js.Any])
    @scala.inline
    def setOddAndEvenPagesHeaderFooter(value: Double): Self = this.set("OddAndEvenPagesHeaderFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientation(value: WdOrientation): Self = this.set("Orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setOtherPagesTray(value: WdPaperTray): Self = this.set("OtherPagesTray", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageHeight(value: Double): Self = this.set("PageHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageWidth(value: Double): Self = this.set("PageWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaperSize(value: WdPaperSize): Self = this.set("PaperSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightMargin(value: Double): Self = this.set("RightMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setSectionDirection(value: WdSectionDirection): Self = this.set("SectionDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setSectionStart(value: WdSectionStart): Self = this.set("SectionStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetAsTemplateDefault(value: () => Unit): Self = this.set("SetAsTemplateDefault", js.Any.fromFunction0(value))
    @scala.inline
    def setShowGrid(value: Boolean): Self = this.set("ShowGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuppressEndnotes(value: Double): Self = this.set("SuppressEndnotes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextColumns(value: TextColumns): Self = this.set("TextColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setTogglePortrait(value: () => Unit): Self = this.set("TogglePortrait", js.Any.fromFunction0(value))
    @scala.inline
    def setTopMargin(value: Double): Self = this.set("TopMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwoPagesOnOne(value: Boolean): Self = this.set("TwoPagesOnOne", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticalAlignment(value: WdVerticalAlignment): Self = this.set("VerticalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotPageSetup_typekey(value: PageSetup): Self = this.set("Word.PageSetup_typekey", value.asInstanceOf[js.Any])
  }
  
}

