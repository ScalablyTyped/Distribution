package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.Pages
import typings.activexExcel.Excel.XlCreator
import typings.activexExcel.Excel.XlObjectSize
import typings.activexExcel.Excel.XlOrder
import typings.activexExcel.Excel.XlPageOrientation
import typings.activexExcel.Excel.XlPaperSize
import typings.activexExcel.Excel.XlPrintErrors
import typings.activexExcel.Excel.XlPrintLocation
import typings.activexExcel.activexExcelBooleans.`false`
import typings.activexExcel.activexExcelNumbers.`1`
import typings.activexExcel.activexExcelNumbers.`2`
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.PageSetup")
@js.native
class PageSetup protected ()
  extends StObject
     with typings.activexExcel.Excel.PageSetup {
  
  /* CompleteClass */
  var AlignMarginsHeaderFooter: Boolean = js.native
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  var BlackAndWhite: Boolean = js.native
  
  /* CompleteClass */
  var BottomMargin: Double = js.native
  
  /* CompleteClass */
  var CenterFooter: String = js.native
  
  /* CompleteClass */
  override val CenterFooterPicture: typings.activexExcel.Excel.Graphic = js.native
  
  /* CompleteClass */
  var CenterHeader: String = js.native
  
  /* CompleteClass */
  override val CenterHeaderPicture: typings.activexExcel.Excel.Graphic = js.native
  
  /* CompleteClass */
  var CenterHorizontally: Boolean = js.native
  
  /* CompleteClass */
  var CenterVertically: Boolean = js.native
  
  /* CompleteClass */
  var ChartSize: XlObjectSize = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  var DifferentFirstPageHeaderFooter: Boolean = js.native
  
  /* CompleteClass */
  var Draft: Boolean = js.native
  
  /* CompleteClass */
  override val EvenPage: typings.activexExcel.Excel.Page = js.native
  
  /* CompleteClass */
  @JSName("Excel.PageSetup_typekey")
  var ExcelDotPageSetup_typekey: typings.activexExcel.Excel.PageSetup = js.native
  
  /* CompleteClass */
  override val FirstPage: typings.activexExcel.Excel.Page = js.native
  
  /* CompleteClass */
  var FirstPageNumber: Double = js.native
  
  /* CompleteClass */
  var FitToPagesTall: Double | `false` = js.native
  
  /* CompleteClass */
  var FitToPagesWide: Double | `false` = js.native
  
  /* CompleteClass */
  var FooterMargin: Double = js.native
  
  /* CompleteClass */
  var HeaderMargin: Double = js.native
  
  /* CompleteClass */
  var LeftFooter: String = js.native
  
  /* CompleteClass */
  override val LeftFooterPicture: typings.activexExcel.Excel.Graphic = js.native
  
  /* CompleteClass */
  var LeftHeader: String = js.native
  
  /* CompleteClass */
  override val LeftHeaderPicture: typings.activexExcel.Excel.Graphic = js.native
  
  /* CompleteClass */
  var LeftMargin: Double = js.native
  
  /* CompleteClass */
  var OddAndEvenPagesHeaderFooter: Boolean = js.native
  
  /* CompleteClass */
  var Order: XlOrder = js.native
  
  /* CompleteClass */
  var Orientation: XlPageOrientation = js.native
  
  /* CompleteClass */
  override def Pages(Index: Double): typings.activexExcel.Excel.Page = js.native
  /* CompleteClass */
  @JSName("Pages")
  override val Pages_Original: Pages = js.native
  
  /* CompleteClass */
  var PaperSize: XlPaperSize = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var PrintArea: String = js.native
  
  /* CompleteClass */
  var PrintComments: XlPrintLocation = js.native
  
  /* CompleteClass */
  var PrintErrors: XlPrintErrors = js.native
  
  /* CompleteClass */
  var PrintGridlines: Boolean = js.native
  
  /* CompleteClass */
  var PrintHeadings: Boolean = js.native
  
  /* CompleteClass */
  var PrintNotes: Boolean = js.native
  
  /* CompleteClass */
  @JSName("PrintQuality")
  override def PrintQuality_1(Index: `1`): Double = js.native
  /* CompleteClass */
  @JSName("PrintQuality")
  override def PrintQuality_2(Index: `2`): Double = js.native
  /* CompleteClass */
  @JSName("PrintQuality")
  var PrintQuality_Original: SafeArray[Double] & (js.Function1[/* Index */ `1` | `2`, Double]) = js.native
  
  /* CompleteClass */
  var PrintTitleColumns: String = js.native
  
  /* CompleteClass */
  var PrintTitleRows: String = js.native
  
  /* CompleteClass */
  var RightFooter: String = js.native
  
  /* CompleteClass */
  override val RightFooterPicture: typings.activexExcel.Excel.Graphic = js.native
  
  /* CompleteClass */
  var RightHeader: String = js.native
  
  /* CompleteClass */
  override val RightHeaderPicture: typings.activexExcel.Excel.Graphic = js.native
  
  /* CompleteClass */
  var RightMargin: Double = js.native
  
  /* CompleteClass */
  var ScaleWithDocHeaderFooter: Boolean = js.native
  
  /* CompleteClass */
  var TopMargin: Double = js.native
  
  /** Represents a percentage between 10 and 400 */
  /* CompleteClass */
  var Zoom: Double = js.native
}
