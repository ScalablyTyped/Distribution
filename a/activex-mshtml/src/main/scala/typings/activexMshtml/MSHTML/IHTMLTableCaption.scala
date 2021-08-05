package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLTableCaption extends StObject {
  
  /* private */ @JSName("MSHTML.IHTMLTableCaption_typekey")
  var MSHTMLDotIHTMLTableCaption_typekey: IHTMLTableCaption
  
  var align: String
  
  var vAlign: String
}
object IHTMLTableCaption {
  
  inline def apply(MSHTMLDotIHTMLTableCaption_typekey: IHTMLTableCaption, align: String, vAlign: String): IHTMLTableCaption = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], vAlign = vAlign.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLTableCaption_typekey")(MSHTMLDotIHTMLTableCaption_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLTableCaption]
  }
  
  extension [Self <: IHTMLTableCaption](x: Self) {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotIHTMLTableCaption_typekey(value: IHTMLTableCaption): Self = StObject.set(x, "MSHTML.IHTMLTableCaption_typekey", value.asInstanceOf[js.Any])
    
    inline def setVAlign(value: String): Self = StObject.set(x, "vAlign", value.asInstanceOf[js.Any])
  }
}
