package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects a module.
  *
  * The type class of this type is com::sun::star::uno::TypeClass::MODULE.
  * @since OOo 1.1.2
  */
@js.native
trait XModuleTypeDescription extends XTypeDescription {
  /**
    * Returns the type descriptions for the members of this module.
    * @returns a sequence containing type descriptions.
    */
  val Members: SafeArray[XTypeDescription] = js.native
  /**
    * Returns the type descriptions for the members of this module.
    * @returns a sequence containing type descriptions.
    */
  def getMembers(): SafeArray[XTypeDescription] = js.native
}

object XModuleTypeDescription {
  @scala.inline
  def apply(
    Members: SafeArray[XTypeDescription],
    Name: String,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getMembers: () => SafeArray[XTypeDescription],
    getName: () => String,
    getTypeClass: () => TypeClass,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XModuleTypeDescription = {
    val __obj = js.Dynamic.literal(Members = Members.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMembers = js.Any.fromFunction0(getMembers), getName = js.Any.fromFunction0(getName), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XModuleTypeDescription]
  }
  @scala.inline
  implicit class XModuleTypeDescriptionOps[Self <: XModuleTypeDescription] (val x: Self) extends AnyVal {
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
    def setMembers(value: SafeArray[XTypeDescription]): Self = this.set("Members", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetMembers(value: () => SafeArray[XTypeDescription]): Self = this.set("getMembers", js.Any.fromFunction0(value))
  }
  
}

