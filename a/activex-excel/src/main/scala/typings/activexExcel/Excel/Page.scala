package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Page extends StObject {
  
  val CenterFooter: HeaderFooter
  
  val CenterHeader: HeaderFooter
  
  /* private */ @JSName("Excel.Page_typekey")
  var ExcelDotPage_typekey: Page
  
  val LeftFooter: HeaderFooter
  
  val LeftHeader: HeaderFooter
  
  val RightFooter: HeaderFooter
  
  val RightHeader: HeaderFooter
}
object Page {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Page] (val x: Self) extends AnyVal {
    
    inline def setCenterFooter(value: HeaderFooter): Self = StObject.set(x, "CenterFooter", value.asInstanceOf[js.Any])
    
    inline def setCenterHeader(value: HeaderFooter): Self = StObject.set(x, "CenterHeader", value.asInstanceOf[js.Any])
    
    inline def setExcelDotPage_typekey(value: Page): Self = StObject.set(x, "Excel.Page_typekey", value.asInstanceOf[js.Any])
    
    inline def setLeftFooter(value: HeaderFooter): Self = StObject.set(x, "LeftFooter", value.asInstanceOf[js.Any])
    
    inline def setLeftHeader(value: HeaderFooter): Self = StObject.set(x, "LeftHeader", value.asInstanceOf[js.Any])
    
    inline def setRightFooter(value: HeaderFooter): Self = StObject.set(x, "RightFooter", value.asInstanceOf[js.Any])
    
    inline def setRightHeader(value: HeaderFooter): Self = StObject.set(x, "RightHeader", value.asInstanceOf[js.Any])
  }
}
