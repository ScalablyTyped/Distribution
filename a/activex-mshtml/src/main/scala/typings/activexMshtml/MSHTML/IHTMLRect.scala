package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLRect extends StObject {
  
  /* private */ @JSName("MSHTML.IHTMLRect_typekey")
  var MSHTMLDotIHTMLRect_typekey: IHTMLRect
  
  var bottom: Double
  
  var left: Double
  
  var right: Double
  
  var top: Double
}
object IHTMLRect {
  
  inline def apply(MSHTMLDotIHTMLRect_typekey: IHTMLRect, bottom: Double, left: Double, right: Double, top: Double): IHTMLRect = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLRect_typekey")(MSHTMLDotIHTMLRect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLRect]
  }
  
  extension [Self <: IHTMLRect](x: Self) {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotIHTMLRect_typekey(value: IHTMLRect): Self = StObject.set(x, "MSHTML.IHTMLRect_typekey", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
