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
trait ParaUserDefinedAttributesSupplier extends StObject {
  
  /**
    * This container holds the {@link AttributeData} elements that represent uninterpreted XML attributes of a paragraph.
    *
    * The idea behind this property is that a parser can stow away all attributes that it cannot handle by itself on reading an XML file. When the file is
    * stored again, the unknown attributes can be written back without loss.
    *
    * The {@link com.sun.star.container.XNameContainer} supports the service {@link AttributeContainer} .
    */
  var ParaUserDefinedAttributes: XNameContainer
}
object ParaUserDefinedAttributesSupplier {
  
  @scala.inline
  def apply(ParaUserDefinedAttributes: XNameContainer): ParaUserDefinedAttributesSupplier = {
    val __obj = js.Dynamic.literal(ParaUserDefinedAttributes = ParaUserDefinedAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParaUserDefinedAttributesSupplier]
  }
  
  @scala.inline
  implicit class ParaUserDefinedAttributesSupplierMutableBuilder[Self <: ParaUserDefinedAttributesSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParaUserDefinedAttributes(value: XNameContainer): Self = StObject.set(x, "ParaUserDefinedAttributes", value.asInstanceOf[js.Any])
  }
}
