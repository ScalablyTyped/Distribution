package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageSetup extends StObject {
  
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
  
  def SetAsTemplateDefault(): Unit = js.native
  
  var ShowGrid: Boolean = js.native
  
  var SuppressEndnotes: Double = js.native
  
  var TextColumns: typings.activexWord.Word.TextColumns = js.native
  
  def TogglePortrait(): Unit = js.native
  
  var TopMargin: Double = js.native
  
  var TwoPagesOnOne: Boolean = js.native
  
  var VerticalAlignment: WdVerticalAlignment = js.native
  
  @JSName("Word.PageSetup_typekey")
  var WordDotPageSetup_typekey: PageSetup = js.native
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
  implicit class PageSetupMutableBuilder[Self <: PageSetup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBookFoldPrinting(value: Boolean): Self = StObject.set(x, "BookFoldPrinting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBookFoldPrintingSheets(value: Double): Self = StObject.set(x, "BookFoldPrintingSheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBookFoldRevPrinting(value: Boolean): Self = StObject.set(x, "BookFoldRevPrinting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomMargin(value: Double): Self = StObject.set(x, "BottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharsLine(value: Double): Self = StObject.set(x, "CharsLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDifferentFirstPageHeaderFooter(value: Double): Self = StObject.set(x, "DifferentFirstPageHeaderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPageTray(value: WdPaperTray): Self = StObject.set(x, "FirstPageTray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterDistance(value: Double): Self = StObject.set(x, "FooterDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGutter(value: Double): Self = StObject.set(x, "Gutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGutterOnTop(value: Boolean): Self = StObject.set(x, "GutterOnTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGutterPos(value: WdGutterStyle): Self = StObject.set(x, "GutterPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGutterStyle(value: WdGutterStyleOld): Self = StObject.set(x, "GutterStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderDistance(value: Double): Self = StObject.set(x, "HeaderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutMode(value: WdLayoutMode): Self = StObject.set(x, "LayoutMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftMargin(value: Double): Self = StObject.set(x, "LeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumbering(value: LineNumbering): Self = StObject.set(x, "LineNumbering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesPage(value: Double): Self = StObject.set(x, "LinesPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMirrorMargins(value: Double): Self = StObject.set(x, "MirrorMargins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOddAndEvenPagesHeaderFooter(value: Double): Self = StObject.set(x, "OddAndEvenPagesHeaderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: WdOrientation): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherPagesTray(value: WdPaperTray): Self = StObject.set(x, "OtherPagesTray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageHeight(value: Double): Self = StObject.set(x, "PageHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageWidth(value: Double): Self = StObject.set(x, "PageWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaperSize(value: WdPaperSize): Self = StObject.set(x, "PaperSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightMargin(value: Double): Self = StObject.set(x, "RightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionDirection(value: WdSectionDirection): Self = StObject.set(x, "SectionDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionStart(value: WdSectionStart): Self = StObject.set(x, "SectionStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAsTemplateDefault(value: () => Unit): Self = StObject.set(x, "SetAsTemplateDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowGrid(value: Boolean): Self = StObject.set(x, "ShowGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressEndnotes(value: Double): Self = StObject.set(x, "SuppressEndnotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColumns(value: TextColumns): Self = StObject.set(x, "TextColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTogglePortrait(value: () => Unit): Self = StObject.set(x, "TogglePortrait", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTopMargin(value: Double): Self = StObject.set(x, "TopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwoPagesOnOne(value: Boolean): Self = StObject.set(x, "TwoPagesOnOne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignment(value: WdVerticalAlignment): Self = StObject.set(x, "VerticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotPageSetup_typekey(value: PageSetup): Self = StObject.set(x, "Word.PageSetup_typekey", value.asInstanceOf[js.Any])
  }
}
