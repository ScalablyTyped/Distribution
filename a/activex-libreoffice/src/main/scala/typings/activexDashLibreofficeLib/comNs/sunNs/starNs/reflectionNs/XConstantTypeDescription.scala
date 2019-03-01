package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

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
trait XConstantTypeDescription extends XTypeDescription {
  /** @returns the value of the constant.  Following types are allowed for constants: booleanbyteshortunsigned shortlongunsigned longhyperunsigned hyperfloatdouble */
  val ConstantValue: js.Any
  /** @returns the value of the constant.  Following types are allowed for constants: booleanbyteshortunsigned shortlongunsigned longhyperunsigned hyperfloatdouble */
  def getConstantValue(): js.Any
}

object XConstantTypeDescription {
  @scala.inline
  def apply(
    ConstantValue: js.Any,
    Name: java.lang.String,
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    acquire: js.Function0[scala.Unit],
    getConstantValue: js.Function0[js.Any],
    getName: js.Function0[java.lang.String],
    getTypeClass: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XConstantTypeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ConstantValue")(ConstantValue)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("TypeClass")(TypeClass)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getConstantValue")(getConstantValue)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getTypeClass")(getTypeClass)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XConstantTypeDescription]
  }
}

