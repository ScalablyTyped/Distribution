package typings.activexDashLibreoffice.comNs.sunNs.starNs.reflectionNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.TypeClass
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects an interface attribute, supporting extended attributes that are bound or raise exceptions.
  *
  * This type supersedes {@link XInterfaceAttributeTypeDescription} , which does not support extended attributes.
  * @since OOo 2.0
  */
trait XInterfaceAttributeTypeDescription2 extends XInterfaceAttributeTypeDescription {
  /**
    * Returns the exceptions that can be raised by the attribute's getter.
    * @returns the reflections of all the exceptions that are listed in the `raises` specification of the attribute's getter (if any), in no particular order; a
    */
  val GetExceptions: SafeArray[XCompoundTypeDescription]
  /**
    * Returns the exceptions that can be raised by the attribute's setter.
    * @returns the reflections of all the exceptions that are listed in the `raises` specification of the attribute's setter (if any), in no particular order; a
    */
  val SetExceptions: SafeArray[XCompoundTypeDescription]
  /**
    * Returns the exceptions that can be raised by the attribute's getter.
    * @returns the reflections of all the exceptions that are listed in the `raises` specification of the attribute's getter (if any), in no particular order; a
    */
  def getGetExceptions(): SafeArray[XCompoundTypeDescription]
  /**
    * Returns the exceptions that can be raised by the attribute's setter.
    * @returns the reflections of all the exceptions that are listed in the `raises` specification of the attribute's setter (if any), in no particular order; a
    */
  def getSetExceptions(): SafeArray[XCompoundTypeDescription]
  /**
    * Returns whether this object reflects a bound attribute.
    * @returns `TRUE` iff this object reflects a bound attribute
    */
  def isBound(): Boolean
}

object XInterfaceAttributeTypeDescription2 {
  @scala.inline
  def apply(
    GetExceptions: SafeArray[XCompoundTypeDescription],
    MemberName: String,
    Name: String,
    Position: Double,
    SetExceptions: SafeArray[XCompoundTypeDescription],
    Type: XTypeDescription,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getGetExceptions: () => SafeArray[XCompoundTypeDescription],
    getMemberName: () => String,
    getName: () => String,
    getPosition: () => Double,
    getSetExceptions: () => SafeArray[XCompoundTypeDescription],
    getType: () => XTypeDescription,
    getTypeClass: () => TypeClass,
    isBound: () => Boolean,
    isReadOnly: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XInterfaceAttributeTypeDescription2 = {
    val __obj = js.Dynamic.literal(GetExceptions = GetExceptions, MemberName = MemberName, Name = Name, Position = Position, SetExceptions = SetExceptions, Type = Type, TypeClass = TypeClass, acquire = js.Any.fromFunction0(acquire), getGetExceptions = js.Any.fromFunction0(getGetExceptions), getMemberName = js.Any.fromFunction0(getMemberName), getName = js.Any.fromFunction0(getName), getPosition = js.Any.fromFunction0(getPosition), getSetExceptions = js.Any.fromFunction0(getSetExceptions), getType = js.Any.fromFunction0(getType), getTypeClass = js.Any.fromFunction0(getTypeClass), isBound = js.Any.fromFunction0(isBound), isReadOnly = js.Any.fromFunction0(isReadOnly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XInterfaceAttributeTypeDescription2]
  }
}

