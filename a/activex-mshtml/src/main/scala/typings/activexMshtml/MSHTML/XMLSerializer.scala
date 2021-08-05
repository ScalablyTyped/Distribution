package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMLSerializer extends StObject {
  
  /* private */ @JSName("MSHTML.XMLSerializer_typekey")
  var MSHTMLDotXMLSerializer_typekey: XMLSerializer
  
  def serializeToString(pNode: IHTMLDOMNode): String
}
object XMLSerializer {
  
  inline def apply(MSHTMLDotXMLSerializer_typekey: XMLSerializer, serializeToString: IHTMLDOMNode => String): XMLSerializer = {
    val __obj = js.Dynamic.literal(serializeToString = js.Any.fromFunction1(serializeToString))
    __obj.updateDynamic("MSHTML.XMLSerializer_typekey")(MSHTMLDotXMLSerializer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLSerializer]
  }
  
  extension [Self <: XMLSerializer](x: Self) {
    
    inline def setMSHTMLDotXMLSerializer_typekey(value: XMLSerializer): Self = StObject.set(x, "MSHTML.XMLSerializer_typekey", value.asInstanceOf[js.Any])
    
    inline def setSerializeToString(value: IHTMLDOMNode => String): Self = StObject.set(x, "serializeToString", js.Any.fromFunction1(value))
  }
}
