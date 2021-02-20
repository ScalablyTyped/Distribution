package typings.activexLibreoffice.com_.sun.star.xml

import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A component that supports this service preserves XML attributes, unknown by its parser, that belong to the XML element representing it (the
  * component).
  * @since OOo 2.0.4
  */
@js.native
trait UserDefinedAttributesSupplier extends StObject {
  
  /**
    * This container holds the {@link AttributeData} elements that represent uninterpreted XML attributes.
    *
    * The idea behind this property is that a parser can stow away all attributes that it cannot handle by itself on reading an XML file. When the file is
    * stored again, the unknown attributes can be written back without loss.
    *
    * The {@link com.sun.star.container.XNameContainer} supports the service {@link AttributeContainer} .
    */
  var UserDefinedAttributes: XNameContainer = js.native
}
object UserDefinedAttributesSupplier {
  
  @scala.inline
  def apply(UserDefinedAttributes: XNameContainer): UserDefinedAttributesSupplier = {
    val __obj = js.Dynamic.literal(UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDefinedAttributesSupplier]
  }
  
  @scala.inline
  implicit class UserDefinedAttributesSupplierMutableBuilder[Self <: UserDefinedAttributesSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserDefinedAttributes(value: XNameContainer): Self = StObject.set(x, "UserDefinedAttributes", value.asInstanceOf[js.Any])
  }
}
