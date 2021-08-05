package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDOMParser extends StObject {
  
  /* private */ @JSName("MSHTML.IDOMParser_typekey")
  var MSHTMLDotIDOMParser_typekey: IDOMParser
  
  def parseFromString(xmlSource: String, mimeType: String): IHTMLDocument2
}
object IDOMParser {
  
  inline def apply(MSHTMLDotIDOMParser_typekey: IDOMParser, parseFromString: (String, String) => IHTMLDocument2): IDOMParser = {
    val __obj = js.Dynamic.literal(parseFromString = js.Any.fromFunction2(parseFromString))
    __obj.updateDynamic("MSHTML.IDOMParser_typekey")(MSHTMLDotIDOMParser_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDOMParser]
  }
  
  extension [Self <: IDOMParser](x: Self) {
    
    inline def setMSHTMLDotIDOMParser_typekey(value: IDOMParser): Self = StObject.set(x, "MSHTML.IDOMParser_typekey", value.asInstanceOf[js.Any])
    
    inline def setParseFromString(value: (String, String) => IHTMLDocument2): Self = StObject.set(x, "parseFromString", js.Any.fromFunction2(value))
  }
}
