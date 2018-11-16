package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.PageSetup")
@js.native
class PageSetup protected () extends js.Object {
  var AlignMarginsHeaderFooter: scala.Boolean = js.native
  val Application: Application = js.native
  var BlackAndWhite: scala.Boolean = js.native
  var BottomMargin: scala.Double = js.native
  var CenterFooter: java.lang.String = js.native
  val CenterFooterPicture: Graphic = js.native
  var CenterHeader: java.lang.String = js.native
  val CenterHeaderPicture: Graphic = js.native
  var CenterHorizontally: scala.Boolean = js.native
  var CenterVertically: scala.Boolean = js.native
  var ChartSize: XlObjectSize = js.native
  val Creator: XlCreator = js.native
  var DifferentFirstPageHeaderFooter: scala.Boolean = js.native
  var Draft: scala.Boolean = js.native
  val EvenPage: Page = js.native
  var `Excel.PageSetup_typekey`: PageSetup = js.native
  val FirstPage: Page = js.native
  var FirstPageNumber: scala.Double = js.native
  var FitToPagesTall: scala.Double | activexDashExcelLib.activexDashExcelLibNumbers.`false` = js.native
  var FitToPagesWide: scala.Double | activexDashExcelLib.activexDashExcelLibNumbers.`false` = js.native
  var FooterMargin: scala.Double = js.native
  var HeaderMargin: scala.Double = js.native
  var LeftFooter: java.lang.String = js.native
  val LeftFooterPicture: Graphic = js.native
  var LeftHeader: java.lang.String = js.native
  val LeftHeaderPicture: Graphic = js.native
  var LeftMargin: scala.Double = js.native
  var OddAndEvenPagesHeaderFooter: scala.Boolean = js.native
  var Order: XlOrder = js.native
  var Orientation: XlPageOrientation = js.native
  @JSName("Pages")
  val Pages_Original: Pages = js.native
  var PaperSize: XlPaperSize = js.native
  val Parent: js.Any = js.native
  var PrintArea: java.lang.String = js.native
  var PrintComments: XlPrintLocation = js.native
  var PrintErrors: XlPrintErrors = js.native
  var PrintGridlines: scala.Boolean = js.native
  var PrintHeadings: scala.Boolean = js.native
  var PrintNotes: scala.Boolean = js.native
  @JSName("PrintQuality")
  var PrintQuality_Original: activexDashInteropLib.SafeArray[scala.Double] with (js.Function1[
    /* Index */ activexDashExcelLib.activexDashExcelLibNumbers.`1` | activexDashExcelLib.activexDashExcelLibNumbers.`2`, 
    scala.Double
  ]) = js.native
  var PrintTitleColumns: java.lang.String = js.native
  var PrintTitleRows: java.lang.String = js.native
  var RightFooter: java.lang.String = js.native
  val RightFooterPicture: Graphic = js.native
  var RightHeader: java.lang.String = js.native
  val RightHeaderPicture: Graphic = js.native
  var RightMargin: scala.Double = js.native
  var ScaleWithDocHeaderFooter: scala.Boolean = js.native
  var TopMargin: scala.Double = js.native
  /** Represents a percentage between 10 and 400 */
  var Zoom: scala.Double = js.native
  def Pages(Index: scala.Double): Page = js.native
  def PrintQuality(Index: activexDashExcelLib.activexDashExcelLibNumbers.`1`): scala.Double = js.native
  def PrintQuality(Index: activexDashExcelLib.activexDashExcelLibNumbers.`2`): scala.Double = js.native
}

