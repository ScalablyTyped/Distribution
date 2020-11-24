package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderFooter extends js.Object {
  
  @JSName("Excel.HeaderFooter_typekey")
  var ExcelDotHeaderFooter_typekey: HeaderFooter = js.native
  
  val Picture: Graphic = js.native
  
  var Text: String = js.native
}
object HeaderFooter {
  
  @scala.inline
  def apply(ExcelDotHeaderFooter_typekey: HeaderFooter, Picture: Graphic, Text: String): HeaderFooter = {
    val __obj = js.Dynamic.literal(Picture = Picture.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.HeaderFooter_typekey")(ExcelDotHeaderFooter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderFooter]
  }
  
  @scala.inline
  implicit class HeaderFooterOps[Self <: HeaderFooter] (val x: Self) extends AnyVal {
    
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
    def setExcelDotHeaderFooter_typekey(value: HeaderFooter): Self = this.set("Excel.HeaderFooter_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicture(value: Graphic): Self = this.set("Picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
  }
}
