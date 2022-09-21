package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLDocument extends StObject {
  
  /* private */ @JSName("MSHTML.IHTMLDocument_typekey")
  var MSHTMLDotIHTMLDocument_typekey: IHTMLDocument
  
  val Script: Any
}
object IHTMLDocument {
  
  inline def apply(MSHTMLDotIHTMLDocument_typekey: IHTMLDocument, Script: Any): IHTMLDocument = {
    val __obj = js.Dynamic.literal(Script = Script.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLDocument_typekey")(MSHTMLDotIHTMLDocument_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLDocument]
  }
  
  extension [Self <: IHTMLDocument](x: Self) {
    
    inline def setMSHTMLDotIHTMLDocument_typekey(value: IHTMLDocument): Self = StObject.set(x, "MSHTML.IHTMLDocument_typekey", value.asInstanceOf[js.Any])
    
    inline def setScript(value: Any): Self = StObject.set(x, "Script", value.asInstanceOf[js.Any])
  }
}
