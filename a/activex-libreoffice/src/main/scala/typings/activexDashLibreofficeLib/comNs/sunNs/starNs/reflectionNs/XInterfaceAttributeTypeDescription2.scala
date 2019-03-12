package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

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
  val GetExceptions: stdLib.SafeArray[XCompoundTypeDescription]
  /**
    * Returns the exceptions that can be raised by the attribute's setter.
    * @returns the reflections of all the exceptions that are listed in the `raises` specification of the attribute's setter (if any), in no particular order; a
    */
  val SetExceptions: stdLib.SafeArray[XCompoundTypeDescription]
  /**
    * Returns the exceptions that can be raised by the attribute's getter.
    * @returns the reflections of all the exceptions that are listed in the `raises` specification of the attribute's getter (if any), in no particular order; a
    */
  def getGetExceptions(): stdLib.SafeArray[XCompoundTypeDescription]
  /**
    * Returns the exceptions that can be raised by the attribute's setter.
    * @returns the reflections of all the exceptions that are listed in the `raises` specification of the attribute's setter (if any), in no particular order; a
    */
  def getSetExceptions(): stdLib.SafeArray[XCompoundTypeDescription]
  /**
    * Returns whether this object reflects a bound attribute.
    * @returns `TRUE` iff this object reflects a bound attribute
    */
  def isBound(): scala.Boolean
}

object XInterfaceAttributeTypeDescription2 {
  @scala.inline
  def apply(
    GetExceptions: stdLib.SafeArray[XCompoundTypeDescription],
    MemberName: java.lang.String,
    Name: java.lang.String,
    Position: scala.Double,
    SetExceptions: stdLib.SafeArray[XCompoundTypeDescription],
    Type: XTypeDescription,
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    acquire: () => scala.Unit,
    getGetExceptions: () => stdLib.SafeArray[XCompoundTypeDescription],
    getMemberName: () => java.lang.String,
    getName: () => java.lang.String,
    getPosition: () => scala.Double,
    getSetExceptions: () => stdLib.SafeArray[XCompoundTypeDescription],
    getType: () => XTypeDescription,
    getTypeClass: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    isBound: () => scala.Boolean,
    isReadOnly: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XInterfaceAttributeTypeDescription2 = {
    val __obj = js.Dynamic.literal(GetExceptions = GetExceptions, MemberName = MemberName, Name = Name, Position = Position, SetExceptions = SetExceptions, Type = Type, TypeClass = TypeClass, acquire = js.Any.fromFunction0(acquire), getGetExceptions = js.Any.fromFunction0(getGetExceptions), getMemberName = js.Any.fromFunction0(getMemberName), getName = js.Any.fromFunction0(getName), getPosition = js.Any.fromFunction0(getPosition), getSetExceptions = js.Any.fromFunction0(getSetExceptions), getType = js.Any.fromFunction0(getType), getTypeClass = js.Any.fromFunction0(getTypeClass), isBound = js.Any.fromFunction0(isBound), isReadOnly = js.Any.fromFunction0(isReadOnly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XInterfaceAttributeTypeDescription2]
  }
}

