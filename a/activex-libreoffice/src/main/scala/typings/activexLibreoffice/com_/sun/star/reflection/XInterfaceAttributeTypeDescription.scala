package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reflects an interface attribute type.
  *
  * This type is superseded by {@link XInterfaceAttributeTypeDescription2} , which supports extended attributes.
  *
  * The type class of this type is TypeClass_INTERFACE_ATTRIBUTE.
  */
trait XInterfaceAttributeTypeDescription
  extends StObject
     with XInterfaceMemberTypeDescription {
  
  /**
    * Returns the type of the attribute.
    * @returns type of attribute
    */
  val Type: XTypeDescription
  
  /**
    * Returns the type of the attribute.
    * @returns type of attribute
    */
  def getType(): XTypeDescription
  
  /**
    * Returns true, if this attribute is read-only.
    * @returns true, if attribute is read-only
    */
  def isReadOnly(): Boolean
}
object XInterfaceAttributeTypeDescription {
  
  @scala.inline
  def apply(
    MemberName: String,
    Name: String,
    Position: Double,
    Type: XTypeDescription,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getMemberName: () => String,
    getName: () => String,
    getPosition: () => Double,
    getType: () => XTypeDescription,
    getTypeClass: () => TypeClass,
    isReadOnly: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XInterfaceAttributeTypeDescription = {
    val __obj = js.Dynamic.literal(MemberName = MemberName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMemberName = js.Any.fromFunction0(getMemberName), getName = js.Any.fromFunction0(getName), getPosition = js.Any.fromFunction0(getPosition), getType = js.Any.fromFunction0(getType), getTypeClass = js.Any.fromFunction0(getTypeClass), isReadOnly = js.Any.fromFunction0(isReadOnly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XInterfaceAttributeTypeDescription]
  }
  
  @scala.inline
  implicit class XInterfaceAttributeTypeDescriptionMutableBuilder[Self <: XInterfaceAttributeTypeDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetType(value: () => XTypeDescription): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsReadOnly(value: () => Boolean): Self = StObject.set(x, "isReadOnly", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: XTypeDescription): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
