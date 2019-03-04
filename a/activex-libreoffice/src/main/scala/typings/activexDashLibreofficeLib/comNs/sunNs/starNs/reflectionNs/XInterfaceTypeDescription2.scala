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
  val BaseTypes: activexDashInteropLib.SafeArray[XTypeDescription]
  /**
    * Returns a sequence of all directly inherited optional base interface types.
    * @returns a sequence of all directly inherited optional base interface types, in the correct order; each element of the returned sequence will be the refle
    */
  val OptionalBaseTypes: activexDashInteropLib.SafeArray[XTypeDescription]
  /**
    * Returns a sequence of all directly inherited (mandatory) base interface types.
    * @returns a sequence of all directly inherited (mandatory) base interface types, in the correct order; each element of the returned sequence will be the re
    */
  def getBaseTypes(): activexDashInteropLib.SafeArray[XTypeDescription]
  /**
    * Returns a sequence of all directly inherited optional base interface types.
    * @returns a sequence of all directly inherited optional base interface types, in the correct order; each element of the returned sequence will be the refle
    */
  def getOptionalBaseTypes(): activexDashInteropLib.SafeArray[XTypeDescription]
}

object XInterfaceTypeDescription2 {
  @scala.inline
  def apply(
    BaseType: XTypeDescription,
    BaseTypes: activexDashInteropLib.SafeArray[XTypeDescription],
    Members: activexDashInteropLib.SafeArray[XInterfaceMemberTypeDescription],
    Name: java.lang.String,
    OptionalBaseTypes: activexDashInteropLib.SafeArray[XTypeDescription],
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    Uik: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Uik,
    acquire: js.Function0[scala.Unit],
    getBaseType: js.Function0[XTypeDescription],
    getBaseTypes: js.Function0[activexDashInteropLib.SafeArray[XTypeDescription]],
    getMembers: js.Function0[activexDashInteropLib.SafeArray[XInterfaceMemberTypeDescription]],
    getName: js.Function0[java.lang.String],
    getOptionalBaseTypes: js.Function0[activexDashInteropLib.SafeArray[XTypeDescription]],
    getTypeClass: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass],
    getUik: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Uik],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XInterfaceTypeDescription2 = {
    val __obj = js.Dynamic.literal(BaseType = BaseType, BaseTypes = BaseTypes, Members = Members, Name = Name, OptionalBaseTypes = OptionalBaseTypes, TypeClass = TypeClass, Uik = Uik, acquire = acquire, getBaseType = getBaseType, getBaseTypes = getBaseTypes, getMembers = getMembers, getName = getName, getOptionalBaseTypes = getOptionalBaseTypes, getTypeClass = getTypeClass, getUik = getUik, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XInterfaceTypeDescription2]
  }
}

