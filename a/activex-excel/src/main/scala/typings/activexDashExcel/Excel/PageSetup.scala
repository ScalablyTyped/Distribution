package typings.activexDashExcel.Excel

import typings.activexDashExcel.activexDashExcelBooleans.`false`
import typings.activexDashExcel.activexDashExcelNumbers.`1`
import typings.activexDashExcel.activexDashExcelNumbers.`2`
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.PageSetup")
@js.native
class PageSetup protected () extends js.Object {
  var AlignMarginsHeaderFooter: Boolean = js.native
  val Application: typings.activexDashExcel.Excel.Application = js.native
  var BlackAndWhite: Boolean = js.native
  var BottomMargin: Double = js.native
  var CenterFooter: String = js.native
  val CenterFooterPicture: Graphic = js.native
  var CenterHeader: String = js.native
  val CenterHeaderPicture: Graphic = js.native
  var CenterHorizontally: Boolean = js.native
  var CenterVertically: Boolean = js.native
  var ChartSize: XlObjectSize = js.native
  val Creator: XlCreator = js.native
  var DifferentFirstPageHeaderFooter: Boolean = js.native
  var Draft: Boolean = js.native
  val EvenPage: Page = js.native
  @JSName("Excel.PageSetup_typekey")
  var ExcelDotPageSetup_typekey: PageSetup = js.native
  val FirstPage: Page = js.native
  var FirstPageNumber: Double = js.native
  var FitToPagesTall: Double | `false` = js.native
  var FitToPagesWide: Double | `false` = js.native
  var FooterMargin: Double = js.native
  var HeaderMargin: Double = js.native
  var LeftFooter: String = js.native
  val LeftFooterPicture: Graphic = js.native
  var LeftHeader: String = js.native
  val LeftHeaderPicture: Graphic = js.native
  var LeftMargin: Double = js.native
  var OddAndEvenPagesHeaderFooter: Boolean = js.native
  var Order: XlOrder = js.native
  var Orientation: XlPageOrientation = js.native
  @JSName("Pages")
  val Pages_Original: Pages = js.native
  var PaperSize: XlPaperSize = js.native
  val Parent: js.Any = js.native
  var PrintArea: String = js.native
  var PrintComments: XlPrintLocation = js.native
  var PrintErrors: XlPrintErrors = js.native
  var PrintGridlines: Boolean = js.native
  var PrintHeadings: Boolean = js.native
  var PrintNotes: Boolean = js.native
  @JSName("PrintQuality")
  var PrintQuality_Original: SafeArray[Double] with (js.Function1[/* Index */ `1` | `2`, Double]) = js.native
  var PrintTitleColumns: String = js.native
  var PrintTitleRows: String = js.native
  var RightFooter: String = js.native
  val RightFooterPicture: Graphic = js.native
  var RightHeader: String = js.native
  val RightHeaderPicture: Graphic = js.native
  var RightMargin: Double = js.native
  var ScaleWithDocHeaderFooter: Boolean = js.native
  var TopMargin: Double = js.native
  /** Represents a percentage between 10 and 400 */
  var Zoom: Double = js.native
  def Pages(Index: Double): Page = js.native
  @JSName("PrintQuality")
  def PrintQuality_1(Index: `1`): Double = js.native
  @JSName("PrintQuality")
  def PrintQuality_2(Index: `2`): Double = js.native
}

