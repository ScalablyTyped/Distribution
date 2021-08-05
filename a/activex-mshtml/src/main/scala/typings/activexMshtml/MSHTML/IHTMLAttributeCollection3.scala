package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLAttributeCollection3 extends StObject {
  
  /* private */ @JSName("MSHTML.IHTMLAttributeCollection3_typekey")
  var MSHTMLDotIHTMLAttributeCollection3_typekey: IHTMLAttributeCollection3
  
  def getNamedItem(bstrName: String): IHTMLDOMAttribute
  
  def item(index: Double): IHTMLDOMAttribute
  
  val length: Double
  
  def removeNamedItem(bstrName: String): IHTMLDOMAttribute
  
  def setNamedItem(pNodeIn: IHTMLDOMAttribute): IHTMLDOMAttribute
}
object IHTMLAttributeCollection3 {
  
  inline def apply(
    MSHTMLDotIHTMLAttributeCollection3_typekey: IHTMLAttributeCollection3,
    getNamedItem: String => IHTMLDOMAttribute,
    item: Double => IHTMLDOMAttribute,
    length: Double,
    removeNamedItem: String => IHTMLDOMAttribute,
    setNamedItem: IHTMLDOMAttribute => IHTMLDOMAttribute
  ): IHTMLAttributeCollection3 = {
    val __obj = js.Dynamic.literal(getNamedItem = js.Any.fromFunction1(getNamedItem), item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any], removeNamedItem = js.Any.fromFunction1(removeNamedItem), setNamedItem = js.Any.fromFunction1(setNamedItem))
    __obj.updateDynamic("MSHTML.IHTMLAttributeCollection3_typekey")(MSHTMLDotIHTMLAttributeCollection3_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLAttributeCollection3]
  }
  
  extension [Self <: IHTMLAttributeCollection3](x: Self) {
    
    inline def setGetNamedItem(value: String => IHTMLDOMAttribute): Self = StObject.set(x, "getNamedItem", js.Any.fromFunction1(value))
    
    inline def setItem(value: Double => IHTMLDOMAttribute): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotIHTMLAttributeCollection3_typekey(value: IHTMLAttributeCollection3): Self = StObject.set(x, "MSHTML.IHTMLAttributeCollection3_typekey", value.asInstanceOf[js.Any])
    
    inline def setRemoveNamedItem(value: String => IHTMLDOMAttribute): Self = StObject.set(x, "removeNamedItem", js.Any.fromFunction1(value))
    
    inline def setSetNamedItem(value: IHTMLDOMAttribute => IHTMLDOMAttribute): Self = StObject.set(x, "setNamedItem", js.Any.fromFunction1(value))
  }
}
