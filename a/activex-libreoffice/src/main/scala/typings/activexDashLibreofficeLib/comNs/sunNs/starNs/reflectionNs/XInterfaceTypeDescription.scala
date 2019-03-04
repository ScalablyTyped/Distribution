package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects an interface type.
  *
  * This type is superseded by {@link XInterfaceTypeDescription2} , which supports multiple inheritance.
  * @see XInterfaceMemberTypeDescription
  */
trait XInterfaceTypeDescription extends XTypeDescription {
  /**
    * Returns the base interface or null, if the reflected interface is not inherited from another.
    *
    * This method is deprecated, as it only supports single inheritance. See {@link XInterfaceTypeDescription2} for a replacement that supports multiple
    * inheritance.
    * @deprecated Deprecated
    * @returns base interface or null
    */
  val BaseType: XTypeDescription
  /**
    * Returns the members of the interfaces, i.e. attributes and methods.
    * @returns interface members
    */
  val Members: activexDashInteropLib.SafeArray[XInterfaceMemberTypeDescription]
  /**
    * Deprecated. UIK are not used anymore, a type is uniquely identified by its name. ;  Returns the UIK, i.e. the unique identifier of the interface.
    * @deprecated Deprecated
    * @returns uik of the interface
    */
  val Uik: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Uik
  /**
    * Returns the base interface or null, if the reflected interface is not inherited from another.
    *
    * This method is deprecated, as it only supports single inheritance. See {@link XInterfaceTypeDescription2} for a replacement that supports multiple
    * inheritance.
    * @deprecated Deprecated
    * @returns base interface or null
    */
  def getBaseType(): XTypeDescription
  /**
    * Returns the members of the interfaces, i.e. attributes and methods.
    * @returns interface members
    */
  def getMembers(): activexDashInteropLib.SafeArray[XInterfaceMemberTypeDescription]
  /**
    * Deprecated. UIK are not used anymore, a type is uniquely identified by its name. ;  Returns the UIK, i.e. the unique identifier of the interface.
    * @deprecated Deprecated
    * @returns uik of the interface
    */
  def getUik(): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Uik
}

object XInterfaceTypeDescription {
  @scala.inline
  def apply(
    BaseType: XTypeDescription,
    Members: activexDashInteropLib.SafeArray[XInterfaceMemberTypeDescription],
    Name: java.lang.String,
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    Uik: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Uik,
    acquire: js.Function0[scala.Unit],
    getBaseType: js.Function0[XTypeDescription],
    getMembers: js.Function0[activexDashInteropLib.SafeArray[XInterfaceMemberTypeDescription]],
    getName: js.Function0[java.lang.String],
    getTypeClass: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass],
    getUik: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Uik],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XInterfaceTypeDescription = {
    val __obj = js.Dynamic.literal(BaseType = BaseType, Members = Members, Name = Name, TypeClass = TypeClass, Uik = Uik, acquire = acquire, getBaseType = getBaseType, getMembers = getMembers, getName = getName, getTypeClass = getTypeClass, getUik = getUik, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XInterfaceTypeDescription]
  }
}

