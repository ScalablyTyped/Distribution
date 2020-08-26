package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
import typings.activexLibreoffice.com_.sun.star.uno.Uik
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
@js.native
trait XInterfaceTypeDescription extends XTypeDescription {
  /**
    * Returns the base interface or null, if the reflected interface is not inherited from another.
    *
    * This method is deprecated, as it only supports single inheritance. See {@link XInterfaceTypeDescription2} for a replacement that supports multiple
    * inheritance.
    * @deprecated Deprecated
    * @returns base interface or null
    */
  val BaseType: XTypeDescription = js.native
  /**
    * Returns the members of the interfaces, i.e. attributes and methods.
    * @returns interface members
    */
  val Members: SafeArray[XInterfaceMemberTypeDescription] = js.native
  /**
    * Deprecated. UIK are not used anymore, a type is uniquely identified by its name. ;  Returns the UIK, i.e. the unique identifier of the interface.
    * @deprecated Deprecated
    * @returns uik of the interface
    */
  val Uik: typings.activexLibreoffice.com_.sun.star.uno.Uik = js.native
  /**
    * Returns the base interface or null, if the reflected interface is not inherited from another.
    *
    * This method is deprecated, as it only supports single inheritance. See {@link XInterfaceTypeDescription2} for a replacement that supports multiple
    * inheritance.
    * @deprecated Deprecated
    * @returns base interface or null
    */
  def getBaseType(): XTypeDescription = js.native
  /**
    * Returns the members of the interfaces, i.e. attributes and methods.
    * @returns interface members
    */
  def getMembers(): SafeArray[XInterfaceMemberTypeDescription] = js.native
  /**
    * Deprecated. UIK are not used anymore, a type is uniquely identified by its name. ;  Returns the UIK, i.e. the unique identifier of the interface.
    * @deprecated Deprecated
    * @returns uik of the interface
    */
  def getUik(): typings.activexLibreoffice.com_.sun.star.uno.Uik = js.native
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
    val __obj = js.Dynamic.literal(BaseType = BaseType.asInstanceOf[js.Any], Members = Members.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], Uik = Uik.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getBaseType = js.Any.fromFunction0(getBaseType), getMembers = js.Any.fromFunction0(getMembers), getName = js.Any.fromFunction0(getName), getTypeClass = js.Any.fromFunction0(getTypeClass), getUik = js.Any.fromFunction0(getUik), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XInterfaceTypeDescription]
  }
  @scala.inline
  implicit class XInterfaceTypeDescriptionOps[Self <: XInterfaceTypeDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBaseType(value: XTypeDescription): Self = this.set("BaseType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMembers(value: SafeArray[XInterfaceMemberTypeDescription]): Self = this.set("Members", value.asInstanceOf[js.Any])
    @scala.inline
    def setUik(value: Uik): Self = this.set("Uik", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetBaseType(value: () => XTypeDescription): Self = this.set("getBaseType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMembers(value: () => SafeArray[XInterfaceMemberTypeDescription]): Self = this.set("getMembers", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUik(value: () => Uik): Self = this.set("getUik", js.Any.fromFunction0(value))
  }
  
}

