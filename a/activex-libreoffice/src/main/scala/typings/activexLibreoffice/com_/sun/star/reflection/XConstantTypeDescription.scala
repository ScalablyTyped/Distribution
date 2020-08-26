package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects a constant.
  *
  * The type class of this type is com::sun::star::uno::TypeClass::CONSTANT.
  *
  * Constants may be contained in constants groups and modules.
  * @see XModuleTypeDescription
  * @see XConstantsTypeDescription
  * @since OOo 1.1.2
  */
@js.native
trait XConstantTypeDescription extends XTypeDescription {
  /** @returns the value of the constant.  Following types are allowed for constants: booleanbyteshortunsigned shortlongunsigned longhyperunsigned hyperfloatdouble */
  val ConstantValue: js.Any = js.native
  /** @returns the value of the constant.  Following types are allowed for constants: booleanbyteshortunsigned shortlongunsigned longhyperunsigned hyperfloatdouble */
  def getConstantValue(): js.Any = js.native
}

object XConstantTypeDescription {
  @scala.inline
  def apply(
    ConstantValue: js.Any,
    Name: String,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getConstantValue: () => js.Any,
    getName: () => String,
    getTypeClass: () => TypeClass,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XConstantTypeDescription = {
    val __obj = js.Dynamic.literal(ConstantValue = ConstantValue.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getConstantValue = js.Any.fromFunction0(getConstantValue), getName = js.Any.fromFunction0(getName), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XConstantTypeDescription]
  }
  @scala.inline
  implicit class XConstantTypeDescriptionOps[Self <: XConstantTypeDescription] (val x: Self) extends AnyVal {
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
    def setConstantValue(value: js.Any): Self = this.set("ConstantValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetConstantValue(value: () => js.Any): Self = this.set("getConstantValue", js.Any.fromFunction0(value))
  }
  
}

