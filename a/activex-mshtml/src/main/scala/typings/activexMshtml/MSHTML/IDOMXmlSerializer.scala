package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDOMXmlSerializer extends StObject {
  
  /* private */ @JSName("MSHTML.IDOMXmlSerializer_typekey")
  var MSHTMLDotIDOMXmlSerializer_typekey: IDOMXmlSerializer
  
  def serializeToString(pNode: IHTMLDOMNode): String
}
object IDOMXmlSerializer {
  
  inline def apply(MSHTMLDotIDOMXmlSerializer_typekey: IDOMXmlSerializer, serializeToString: IHTMLDOMNode => String): IDOMXmlSerializer = {
    val __obj = js.Dynamic.literal(serializeToString = js.Any.fromFunction1(serializeToString))
    __obj.updateDynamic("MSHTML.IDOMXmlSerializer_typekey")(MSHTMLDotIDOMXmlSerializer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDOMXmlSerializer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDOMXmlSerializer] (val x: Self) extends AnyVal {
    
    inline def setMSHTMLDotIDOMXmlSerializer_typekey(value: IDOMXmlSerializer): Self = StObject.set(x, "MSHTML.IDOMXmlSerializer_typekey", value.asInstanceOf[js.Any])
    
    inline def setSerializeToString(value: IHTMLDOMNode => String): Self = StObject.set(x, "serializeToString", js.Any.fromFunction1(value))
  }
}
