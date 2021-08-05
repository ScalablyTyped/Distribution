package typings.activexLibreoffice.com_.sun.star.xml

import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A component that supports this service preserves XML attributes, unknown by its parser, that belong to the XML element representing it (the
  * component).
  * @since OOo 2.0.4
  */
trait TextUserDefinedAttributesSupplier extends StObject {
  
  /**
    * This container holds the {@link AttributeData} elements that represent uninterpreted XML attributes of a text.
    *
    * The idea behind this property is that a parser can stow away all attributes that it cannot handle by itself on reading an XML file. When the file is
    * stored again, the unknown attributes can be written back without loss.
    *
    * The {@link com.sun.star.container.XNameContainer} supports the service {@link AttributeContainer} .
    */
  var TextUserDefinedAttributes: XNameContainer
}
object TextUserDefinedAttributesSupplier {
  
  inline def apply(TextUserDefinedAttributes: XNameContainer): TextUserDefinedAttributesSupplier = {
    val __obj = js.Dynamic.literal(TextUserDefinedAttributes = TextUserDefinedAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextUserDefinedAttributesSupplier]
  }
  
  extension [Self <: TextUserDefinedAttributesSupplier](x: Self) {
    
    inline def setTextUserDefinedAttributes(value: XNameContainer): Self = StObject.set(x, "TextUserDefinedAttributes", value.asInstanceOf[js.Any])
  }
}
