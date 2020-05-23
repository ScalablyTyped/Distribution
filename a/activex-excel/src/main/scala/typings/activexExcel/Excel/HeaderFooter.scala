package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderFooter extends js.Object {
  @JSName("Excel.HeaderFooter_typekey")
  var ExcelDotHeaderFooter_typekey: HeaderFooter
  val Picture: Graphic
  var Text: String
}

object HeaderFooter {
  @scala.inline
  def apply(ExcelDotHeaderFooter_typekey: HeaderFooter, Picture: Graphic, Text: String): HeaderFooter = {
    val __obj = js.Dynamic.literal(Picture = Picture.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.HeaderFooter_typekey")(ExcelDotHeaderFooter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderFooter]
  }
}

