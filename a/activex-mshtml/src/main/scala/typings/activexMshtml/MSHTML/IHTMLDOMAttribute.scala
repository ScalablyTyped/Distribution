package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLDOMAttribute extends StObject {
  
  /* private */ @JSName("MSHTML.IHTMLDOMAttribute_typekey")
  var MSHTMLDotIHTMLDOMAttribute_typekey: IHTMLDOMAttribute
  
  val nodeName: String
  
  var nodeValue: Any
  
  val specified: Boolean
}
object IHTMLDOMAttribute {
  
  inline def apply(
    MSHTMLDotIHTMLDOMAttribute_typekey: IHTMLDOMAttribute,
    nodeName: String,
    nodeValue: Any,
    specified: Boolean
  ): IHTMLDOMAttribute = {
    val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], specified = specified.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLDOMAttribute_typekey")(MSHTMLDotIHTMLDOMAttribute_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLDOMAttribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IHTMLDOMAttribute] (val x: Self) extends AnyVal {
    
    inline def setMSHTMLDotIHTMLDOMAttribute_typekey(value: IHTMLDOMAttribute): Self = StObject.set(x, "MSHTML.IHTMLDOMAttribute_typekey", value.asInstanceOf[js.Any])
    
    inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    inline def setNodeValue(value: Any): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
    
    inline def setSpecified(value: Boolean): Self = StObject.set(x, "specified", value.asInstanceOf[js.Any])
  }
}
