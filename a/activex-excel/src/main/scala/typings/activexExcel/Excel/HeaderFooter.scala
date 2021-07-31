package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderFooter extends StObject {
  
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
  
  @scala.inline
  implicit class HeaderFooterMutableBuilder[Self <: HeaderFooter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcelDotHeaderFooter_typekey(value: HeaderFooter): Self = StObject.set(x, "Excel.HeaderFooter_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicture(value: Graphic): Self = StObject.set(x, "Picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
