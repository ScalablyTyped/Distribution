package typings.activexDashLibreoffice.comNs.sunNs.starNs.reflectionNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.TypeClass
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Uik
import typings.std.SafeArray
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
  val Members: SafeArray[XInterfaceMemberTypeDescription]
  /**
    * Deprecated. UIK are not used anymore, a type is uniquely identified by its name. ;  Returns the UIK, i.e. the unique identifier of the interface.
    * @deprecated Deprecated
    * @returns uik of the interface
    */
  val Uik: typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Uik
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
  def getMembers(): SafeArray[XInterfaceMemberTypeDescription]
  /**
    * Deprecated. UIK are not used anymore, a type is uniquely identified by its name. ;  Returns the UIK, i.e. the unique identifier of the interface.
    * @deprecated Deprecated
    * @returns uik of the interface
    */
  def getUik(): typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Uik
}

object XInterfaceTypeDescription {
  @scala.inline
  def apply(
    BaseType: XTypeDescription,
    Members: SafeArray[XInterfaceMemberTypeDescription],
    Name: String,
    TypeClass: TypeClass,
    Uik: Uik,
    acquire: () => Unit,
    getBaseType: () => XTypeDescription,
    getMembers: () => SafeArray[XInterfaceMemberTypeDescription],
    getName: () => String,
    getTypeClass: () => TypeClass,
    getUik: () => Uik,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XInterfaceTypeDescription = {
    val __obj = js.Dynamic.literal(BaseType = BaseType, Members = Members, Name = Name, TypeClass = TypeClass, Uik = Uik, acquire = js.Any.fromFunction0(acquire), getBaseType = js.Any.fromFunction0(getBaseType), getMembers = js.Any.fromFunction0(getMembers), getName = js.Any.fromFunction0(getName), getTypeClass = js.Any.fromFunction0(getTypeClass), getUik = js.Any.fromFunction0(getUik), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XInterfaceTypeDescription]
  }
}

