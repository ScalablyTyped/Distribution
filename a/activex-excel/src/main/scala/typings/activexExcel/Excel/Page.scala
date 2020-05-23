package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page extends js.Object {
  val CenterFooter: HeaderFooter
  val CenterHeader: HeaderFooter
  @JSName("Excel.Page_typekey")
  var ExcelDotPage_typekey: Page
  val LeftFooter: HeaderFooter
  val LeftHeader: HeaderFooter
  val RightFooter: HeaderFooter
  val RightHeader: HeaderFooter
}

object Page {
  @scala.inline
  def apply(
    CenterFooter: HeaderFooter,
    CenterHeader: HeaderFooter,
    ExcelDotPage_typekey: Page,
    LeftFooter: HeaderFooter,
    LeftHeader: HeaderFooter,
    RightFooter: HeaderFooter,
    RightHeader: HeaderFooter
  ): Page = {
    val __obj = js.Dynamic.literal(CenterFooter = CenterFooter.asInstanceOf[js.Any], CenterHeader = CenterHeader.asInstanceOf[js.Any], LeftFooter = LeftFooter.asInstanceOf[js.Any], LeftHeader = LeftHeader.asInstanceOf[js.Any], RightFooter = RightFooter.asInstanceOf[js.Any], RightHeader = RightHeader.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Page_typekey")(ExcelDotPage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
}

