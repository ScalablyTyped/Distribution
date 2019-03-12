package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects an interface type, supporting multiple inheritance.
  *
  * This type supersedes {@link XInterfaceTypeDescription} , which only supported single inheritance.
  * @since OOo 2.0
  */
trait XInterfaceTypeDescription2 extends XInterfaceTypeDescription {
  /**
    * Returns a sequence of all directly inherited (mandatory) base interface types.
    * @returns a sequence of all directly inherited (mandatory) base interface types, in the correct order; each element of the returned sequence will be the re
    */
  val BaseTypes: stdLib.SafeArray[XTypeDescription]
  /**
    * Returns a sequence of all directly inherited optional base interface types.
    * @returns a sequence of all directly inherited optional base interface types, in the correct order; each element of the returned sequence will be the refle
    */
  val OptionalBaseTypes: stdLib.SafeArray[XTypeDescription]
  /**
    * Returns a sequence of all directly inherited (mandatory) base interface types.
    * @returns a sequence of all directly inherited (mandatory) base interface types, in the correct order; each element of the returned sequence will be the re
    */
  def getBaseTypes(): stdLib.SafeArray[XTypeDescription]
  /**
    * Returns a sequence of all directly inherited optional base interface types.
    * @returns a sequence of all directly inherited optional base interface types, in the correct order; each element of the returned sequence will be the refle
    */
  def getOptionalBaseTypes(): stdLib.SafeArray[XTypeDescription]
}

object XInterfaceTypeDescription2 {
  @scala.inline
  def apply(
    BaseType: XTypeDescription,
    BaseTypes: stdLib.SafeArray[XTypeDescription],
    Members: stdLib.SafeArray[XInterfaceMemberTypeDescription],
    Name: java.lang.String,
    OptionalBaseTypes: stdLib.SafeArray[XTypeDescription],
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    Uik: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Uik,
    acquire: () => scala.Unit,
    getBaseType: () => XTypeDescription,
    getBaseTypes: () => stdLib.SafeArray[XTypeDescription],
    getMembers: () => stdLib.SafeArray[XInterfaceMemberTypeDescription],
    getName: () => java.lang.String,
    getOptionalBaseTypes: () => stdLib.SafeArray[XTypeDescription],
    getTypeClass: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    getUik: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Uik,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XInterfaceTypeDescription2 = {
    val __obj = js.Dynamic.literal(BaseType = BaseType, BaseTypes = BaseTypes, Members = Members, Name = Name, OptionalBaseTypes = OptionalBaseTypes, TypeClass = TypeClass, Uik = Uik, acquire = js.Any.fromFunction0(acquire), getBaseType = js.Any.fromFunction0(getBaseType), getBaseTypes = js.Any.fromFunction0(getBaseTypes), getMembers = js.Any.fromFunction0(getMembers), getName = js.Any.fromFunction0(getName), getOptionalBaseTypes = js.Any.fromFunction0(getOptionalBaseTypes), getTypeClass = js.Any.fromFunction0(getTypeClass), getUik = js.Any.fromFunction0(getUik), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XInterfaceTypeDescription2]
  }
}

