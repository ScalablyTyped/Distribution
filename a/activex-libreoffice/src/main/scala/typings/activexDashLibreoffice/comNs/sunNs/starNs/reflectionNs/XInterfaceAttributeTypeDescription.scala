package typings.activexDashLibreoffice.comNs.sunNs.starNs.reflectionNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.TypeClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects an interface attribute type.
  *
  * This type is superseded by {@link XInterfaceAttributeTypeDescription2} , which supports extended attributes.
  *
  * The type class of this type is TypeClass_INTERFACE_ATTRIBUTE.
  */
trait XInterfaceAttributeTypeDescription extends XInterfaceMemberTypeDescription {
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
    val __obj = js.Dynamic.literal(MemberName = MemberName, Name = Name, Position = Position, Type = Type, TypeClass = TypeClass, acquire = js.Any.fromFunction0(acquire), getMemberName = js.Any.fromFunction0(getMemberName), getName = js.Any.fromFunction0(getName), getPosition = js.Any.fromFunction0(getPosition), getType = js.Any.fromFunction0(getType), getTypeClass = js.Any.fromFunction0(getTypeClass), isReadOnly = js.Any.fromFunction0(isReadOnly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XInterfaceAttributeTypeDescription]
  }
}

