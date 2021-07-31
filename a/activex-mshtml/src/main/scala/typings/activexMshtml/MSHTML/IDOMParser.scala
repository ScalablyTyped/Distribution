package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDOMParser extends StObject {
  
  @JSName("MSHTML.IDOMParser_typekey")
  var MSHTMLDotIDOMParser_typekey: IDOMParser
  
  def parseFromString(xmlSource: String, mimeType: String): IHTMLDocument2
}
object IDOMParser {
  
  @scala.inline
  def apply(MSHTMLDotIDOMParser_typekey: IDOMParser, parseFromString: (String, String) => IHTMLDocument2): IDOMParser = {
    val __obj = js.Dynamic.literal(parseFromString = js.Any.fromFunction2(parseFromString))
    __obj.updateDynamic("MSHTML.IDOMParser_typekey")(MSHTMLDotIDOMParser_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDOMParser]
  }
  
  @scala.inline
  implicit class IDOMParserMutableBuilder[Self <: IDOMParser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotIDOMParser_typekey(value: IDOMParser): Self = StObject.set(x, "MSHTML.IDOMParser_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseFromString(value: (String, String) => IHTMLDocument2): Self = StObject.set(x, "parseFromString", js.Any.fromFunction2(value))
  }
}
