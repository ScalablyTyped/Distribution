package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Page extends js.Object {
  val CenterFooter: HeaderFooter = js.native
  val CenterHeader: HeaderFooter = js.native
  @JSName("Excel.Page_typekey")
  var ExcelDotPage_typekey: Page = js.native
  val LeftFooter: HeaderFooter = js.native
  val LeftHeader: HeaderFooter = js.native
  val RightFooter: HeaderFooter = js.native
  val RightHeader: HeaderFooter = js.native
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
  @scala.inline
  implicit class PageOps[Self <: Page] (val x: Self) extends AnyVal {
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
    def setCenterFooter(value: HeaderFooter): Self = this.set("CenterFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def setCenterHeader(value: HeaderFooter): Self = this.set("CenterHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcelDotPage_typekey(value: Page): Self = this.set("Excel.Page_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftFooter(value: HeaderFooter): Self = this.set("LeftFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftHeader(value: HeaderFooter): Self = this.set("LeftHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightFooter(value: HeaderFooter): Self = this.set("RightFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightHeader(value: HeaderFooter): Self = this.set("RightHeader", value.asInstanceOf[js.Any])
  }
  
}

