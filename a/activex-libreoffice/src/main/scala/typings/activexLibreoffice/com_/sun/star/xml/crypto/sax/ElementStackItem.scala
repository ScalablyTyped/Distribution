package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.com_.sun.star.xml.sax.XAttributeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A struct to keep a startElement/endElement SAX event. */
trait ElementStackItem extends StObject {
  
  /** the name of the element */
  var elementName: String
  
  /** whether it is a startElement event */
  var isStartElementEvent: Boolean
  
  /** attribute list for a startElement event */
  var xAttributes: XAttributeList
}
object ElementStackItem {
  
  inline def apply(elementName: String, isStartElementEvent: Boolean, xAttributes: XAttributeList): ElementStackItem = {
    val __obj = js.Dynamic.literal(elementName = elementName.asInstanceOf[js.Any], isStartElementEvent = isStartElementEvent.asInstanceOf[js.Any], xAttributes = xAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementStackItem]
  }
  
  extension [Self <: ElementStackItem](x: Self) {
    
    inline def setElementName(value: String): Self = StObject.set(x, "elementName", value.asInstanceOf[js.Any])
    
    inline def setIsStartElementEvent(value: Boolean): Self = StObject.set(x, "isStartElementEvent", value.asInstanceOf[js.Any])
    
    inline def setXAttributes(value: XAttributeList): Self = StObject.set(x, "xAttributes", value.asInstanceOf[js.Any])
  }
}
