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

