package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.com_.sun.star.xml.sax.XAttributeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A struct to keep a startElement/endElement SAX event. */
@js.native
trait ElementStackItem extends StObject {
  
  /** the name of the element */
  var elementName: String = js.native
  
  /** whether it is a startElement event */
  var isStartElementEvent: Boolean = js.native
  
  /** attribute list for a startElement event */
  var xAttributes: XAttributeList = js.native
}
object ElementStackItem {
  
  @scala.inline
  def apply(elementName: String, isStartElementEvent: Boolean, xAttributes: XAttributeList): ElementStackItem = {
    val __obj = js.Dynamic.literal(elementName = elementName.asInstanceOf[js.Any], isStartElementEvent = isStartElementEvent.asInstanceOf[js.Any], xAttributes = xAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementStackItem]
  }
  
  @scala.inline
  implicit class ElementStackItemMutableBuilder[Self <: ElementStackItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementName(value: String): Self = StObject.set(x, "elementName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStartElementEvent(value: Boolean): Self = StObject.set(x, "isStartElementEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAttributes(value: XAttributeList): Self = StObject.set(x, "xAttributes", value.asInstanceOf[js.Any])
  }
}
