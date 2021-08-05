package typings.activexExcel.Excel

import typings.activexExcel.activexExcelBooleans.`false`
import typings.activexExcel.activexExcelNumbers.`1`
import typings.activexExcel.activexExcelNumbers.`2`
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageSetup extends StObject {
  
  var AlignMarginsHeaderFooter: Boolean
  
  val Application: typings.activexExcel.Excel.Application
  
  var BlackAndWhite: Boolean
  
  var BottomMargin: Double
  
  var CenterFooter: String
  
  val CenterFooterPicture: Graphic
  
  var CenterHeader: String
  
  val CenterHeaderPicture: Graphic
  
  var CenterHorizontally: Boolean
  
  var CenterVertically: Boolean
  
  var ChartSize: XlObjectSize
  
  val Creator: XlCreator
  
  var DifferentFirstPageHeaderFooter: Boolean
  
  var Draft: Boolean
  
  val EvenPage: Page
  
  /* private */ @JSName("Excel.PageSetup_typekey")
  var ExcelDotPageSetup_typekey: PageSetup
  
  val FirstPage: Page
  
  var FirstPageNumber: Double
  
  var FitToPagesTall: Double | `false`
  
  var FitToPagesWide: Double | `false`
  
  var FooterMargin: Double
  
  var HeaderMargin: Double
  
  var LeftFooter: String
  
  val LeftFooterPicture: Graphic
  
  var LeftHeader: String
  
  val LeftHeaderPicture: Graphic
  
  var LeftMargin: Double
  
  var OddAndEvenPagesHeaderFooter: Boolean
  
  var Order: XlOrder
  
  var Orientation: XlPageOrientation
  
  def Pages(Index: Double): Page
  @JSName("Pages")
  val Pages_Original: Pages
  
  var PaperSize: XlPaperSize
  
  val Parent: js.Any
  
  var PrintArea: String
  
  var PrintComments: XlPrintLocation
  
  var PrintErrors: XlPrintErrors
  
  var PrintGridlines: Boolean
  
  var PrintHeadings: Boolean
  
  var PrintNotes: Boolean
  
  @JSName("PrintQuality")
  def PrintQuality_1(Index: `1`): Double
  @JSName("PrintQuality")
  def PrintQuality_2(Index: `2`): Double
  @JSName("PrintQuality")
  var PrintQuality_Original: SafeArray[Double] & (js.Function1[/* Index */ `1` | `2`, Double])
  
  var PrintTitleColumns: String
  
  var PrintTitleRows: String
  
  var RightFooter: String
  
  val RightFooterPicture: Graphic
  
  var RightHeader: String
  
  val RightHeaderPicture: Graphic
  
  var RightMargin: Double
  
  var ScaleWithDocHeaderFooter: Boolean
  
  var TopMargin: Double
  
  /** Represents a percentage between 10 and 400 */
  var Zoom: Double
}
object PageSetup {
  
  inline def apply(
    AlignMarginsHeaderFooter: Boolean,
    Application: Application,
    BlackAndWhite: Boolean,
    BottomMargin: Double,
    CenterFooter: String,
    CenterFooterPicture: Graphic,
    CenterHeader: String,
    CenterHeaderPicture: Graphic,
    CenterHorizontally: Boolean,
    CenterVertically: Boolean,
    ChartSize: XlObjectSize,
    Creator: XlCreator,
    DifferentFirstPageHeaderFooter: Boolean,
    Draft: Boolean,
    EvenPage: Page,
    ExcelDotPageSetup_typekey: PageSetup,
    FirstPage: Page,
    FirstPageNumber: Double,
    FitToPagesTall: Double | `false`,
    FitToPagesWide: Double | `false`,
    FooterMargin: Double,
    HeaderMargin: Double,
    LeftFooter: String,
    LeftFooterPicture: Graphic,
    LeftHeader: String,
    LeftHeaderPicture: Graphic,
    LeftMargin: Double,
    OddAndEvenPagesHeaderFooter: Boolean,
    Order: XlOrder,
    Orientation: XlPageOrientation,
    Pages: Pages,
    PaperSize: XlPaperSize,
    Parent: js.Any,
    PrintArea: String,
    PrintComments: XlPrintLocation,
    PrintErrors: XlPrintErrors,
    PrintGridlines: Boolean,
    PrintHeadings: Boolean,
    PrintNotes: Boolean,
    PrintQuality: SafeArray[Double] & (js.Function1[/* Index */ `1` | `2`, Double]),
    PrintTitleColumns: String,
    PrintTitleRows: String,
    RightFooter: String,
    RightFooterPicture: Graphic,
    RightHeader: String,
    RightHeaderPicture: Graphic,
    RightMargin: Double,
    ScaleWithDocHeaderFooter: Boolean,
    TopMargin: Double,
    Zoom: Double
  ): PageSetup = {
    val __obj = js.Dynamic.literal(AlignMarginsHeaderFooter = AlignMarginsHeaderFooter.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], BlackAndWhite = BlackAndWhite.asInstanceOf[js.Any], BottomMargin = BottomMargin.asInstanceOf[js.Any], CenterFooter = CenterFooter.asInstanceOf[js.Any], CenterFooterPicture = CenterFooterPicture.asInstanceOf[js.Any], CenterHeader = CenterHeader.asInstanceOf[js.Any], CenterHeaderPicture = CenterHeaderPicture.asInstanceOf[js.Any], CenterHorizontally = CenterHorizontally.asInstanceOf[js.Any], CenterVertically = CenterVertically.asInstanceOf[js.Any], ChartSize = ChartSize.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DifferentFirstPageHeaderFooter = DifferentFirstPageHeaderFooter.asInstanceOf[js.Any], Draft = Draft.asInstanceOf[js.Any], EvenPage = EvenPage.asInstanceOf[js.Any], FirstPage = FirstPage.asInstanceOf[js.Any], FirstPageNumber = FirstPageNumber.asInstanceOf[js.Any], FitToPagesTall = FitToPagesTall.asInstanceOf[js.Any], FitToPagesWide = FitToPagesWide.asInstanceOf[js.Any], FooterMargin = FooterMargin.asInstanceOf[js.Any], HeaderMargin = HeaderMargin.asInstanceOf[js.Any], LeftFooter = LeftFooter.asInstanceOf[js.Any], LeftFooterPicture = LeftFooterPicture.asInstanceOf[js.Any], LeftHeader = LeftHeader.asInstanceOf[js.Any], LeftHeaderPicture = LeftHeaderPicture.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], OddAndEvenPagesHeaderFooter = OddAndEvenPagesHeaderFooter.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any], PaperSize = PaperSize.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PrintArea = PrintArea.asInstanceOf[js.Any], PrintComments = PrintComments.asInstanceOf[js.Any], PrintErrors = PrintErrors.asInstanceOf[js.Any], PrintGridlines = PrintGridlines.asInstanceOf[js.Any], PrintHeadings = PrintHeadings.asInstanceOf[js.Any], PrintNotes = PrintNotes.asInstanceOf[js.Any], PrintQuality = PrintQuality.asInstanceOf[js.Any], PrintTitleColumns = PrintTitleColumns.asInstanceOf[js.Any], PrintTitleRows = PrintTitleRows.asInstanceOf[js.Any], RightFooter = RightFooter.asInstanceOf[js.Any], RightFooterPicture = RightFooterPicture.asInstanceOf[js.Any], RightHeader = RightHeader.asInstanceOf[js.Any], RightHeaderPicture = RightHeaderPicture.asInstanceOf[js.Any], RightMargin = RightMargin.asInstanceOf[js.Any], ScaleWithDocHeaderFooter = ScaleWithDocHeaderFooter.asInstanceOf[js.Any], TopMargin = TopMargin.asInstanceOf[js.Any], Zoom = Zoom.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.PageSetup_typekey")(ExcelDotPageSetup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageSetup]
  }
  
  extension [Self <: PageSetup](x: Self) {
    
    inline def setAlignMarginsHeaderFooter(value: Boolean): Self = StObject.set(x, "AlignMarginsHeaderFooter", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBlackAndWhite(value: Boolean): Self = StObject.set(x, "BlackAndWhite", value.asInstanceOf[js.Any])
    
    inline def setBottomMargin(value: Double): Self = StObject.set(x, "BottomMargin", value.asInstanceOf[js.Any])
    
    inline def setCenterFooter(value: String): Self = StObject.set(x, "CenterFooter", value.asInstanceOf[js.Any])
    
    inline def setCenterFooterPicture(value: Graphic): Self = StObject.set(x, "CenterFooterPicture", value.asInstanceOf[js.Any])
    
    inline def setCenterHeader(value: String): Self = StObject.set(x, "CenterHeader", value.asInstanceOf[js.Any])
    
    inline def setCenterHeaderPicture(value: Graphic): Self = StObject.set(x, "CenterHeaderPicture", value.asInstanceOf[js.Any])
    
    inline def setCenterHorizontally(value: Boolean): Self = StObject.set(x, "CenterHorizontally", value.asInstanceOf[js.Any])
    
    inline def setCenterVertically(value: Boolean): Self = StObject.set(x, "CenterVertically", value.asInstanceOf[js.Any])
    
    inline def setChartSize(value: XlObjectSize): Self = StObject.set(x, "ChartSize", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDifferentFirstPageHeaderFooter(value: Boolean): Self = StObject.set(x, "DifferentFirstPageHeaderFooter", value.asInstanceOf[js.Any])
    
    inline def setDraft(value: Boolean): Self = StObject.set(x, "Draft", value.asInstanceOf[js.Any])
    
    inline def setEvenPage(value: Page): Self = StObject.set(x, "EvenPage", value.asInstanceOf[js.Any])
    
    inline def setExcelDotPageSetup_typekey(value: PageSetup): Self = StObject.set(x, "Excel.PageSetup_typekey", value.asInstanceOf[js.Any])
    
    inline def setFirstPage(value: Page): Self = StObject.set(x, "FirstPage", value.asInstanceOf[js.Any])
    
    inline def setFirstPageNumber(value: Double): Self = StObject.set(x, "FirstPageNumber", value.asInstanceOf[js.Any])
    
    inline def setFitToPagesTall(value: Double | `false`): Self = StObject.set(x, "FitToPagesTall", value.asInstanceOf[js.Any])
    
    inline def setFitToPagesWide(value: Double | `false`): Self = StObject.set(x, "FitToPagesWide", value.asInstanceOf[js.Any])
    
    inline def setFooterMargin(value: Double): Self = StObject.set(x, "FooterMargin", value.asInstanceOf[js.Any])
    
    inline def setHeaderMargin(value: Double): Self = StObject.set(x, "HeaderMargin", value.asInstanceOf[js.Any])
    
    inline def setLeftFooter(value: String): Self = StObject.set(x, "LeftFooter", value.asInstanceOf[js.Any])
    
    inline def setLeftFooterPicture(value: Graphic): Self = StObject.set(x, "LeftFooterPicture", value.asInstanceOf[js.Any])
    
    inline def setLeftHeader(value: String): Self = StObject.set(x, "LeftHeader", value.asInstanceOf[js.Any])
    
    inline def setLeftHeaderPicture(value: Graphic): Self = StObject.set(x, "LeftHeaderPicture", value.asInstanceOf[js.Any])
    
    inline def setLeftMargin(value: Double): Self = StObject.set(x, "LeftMargin", value.asInstanceOf[js.Any])
    
    inline def setOddAndEvenPagesHeaderFooter(value: Boolean): Self = StObject.set(x, "OddAndEvenPagesHeaderFooter", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: XlOrder): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: XlPageOrientation): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    inline def setPages(value: Pages): Self = StObject.set(x, "Pages", value.asInstanceOf[js.Any])
    
    inline def setPaperSize(value: XlPaperSize): Self = StObject.set(x, "PaperSize", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPrintArea(value: String): Self = StObject.set(x, "PrintArea", value.asInstanceOf[js.Any])
    
    inline def setPrintComments(value: XlPrintLocation): Self = StObject.set(x, "PrintComments", value.asInstanceOf[js.Any])
    
    inline def setPrintErrors(value: XlPrintErrors): Self = StObject.set(x, "PrintErrors", value.asInstanceOf[js.Any])
    
    inline def setPrintGridlines(value: Boolean): Self = StObject.set(x, "PrintGridlines", value.asInstanceOf[js.Any])
    
    inline def setPrintHeadings(value: Boolean): Self = StObject.set(x, "PrintHeadings", value.asInstanceOf[js.Any])
    
    inline def setPrintNotes(value: Boolean): Self = StObject.set(x, "PrintNotes", value.asInstanceOf[js.Any])
    
    inline def setPrintQuality(value: SafeArray[Double] & (js.Function1[/* Index */ `1` | `2`, Double])): Self = StObject.set(x, "PrintQuality", value.asInstanceOf[js.Any])
    
    inline def setPrintTitleColumns(value: String): Self = StObject.set(x, "PrintTitleColumns", value.asInstanceOf[js.Any])
    
    inline def setPrintTitleRows(value: String): Self = StObject.set(x, "PrintTitleRows", value.asInstanceOf[js.Any])
    
    inline def setRightFooter(value: String): Self = StObject.set(x, "RightFooter", value.asInstanceOf[js.Any])
    
    inline def setRightFooterPicture(value: Graphic): Self = StObject.set(x, "RightFooterPicture", value.asInstanceOf[js.Any])
    
    inline def setRightHeader(value: String): Self = StObject.set(x, "RightHeader", value.asInstanceOf[js.Any])
    
    inline def setRightHeaderPicture(value: Graphic): Self = StObject.set(x, "RightHeaderPicture", value.asInstanceOf[js.Any])
    
    inline def setRightMargin(value: Double): Self = StObject.set(x, "RightMargin", value.asInstanceOf[js.Any])
    
    inline def setScaleWithDocHeaderFooter(value: Boolean): Self = StObject.set(x, "ScaleWithDocHeaderFooter", value.asInstanceOf[js.Any])
    
    inline def setTopMargin(value: Double): Self = StObject.set(x, "TopMargin", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: Double): Self = StObject.set(x, "Zoom", value.asInstanceOf[js.Any])
  }
}
