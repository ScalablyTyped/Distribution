package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a binding to a value which can be read and written. */
trait XValueBinding
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * determines the types which are supported by this binding for value exchange
    * @see supportsType
    */
  val SupportedValueTypes: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.`type`]
  /**
    * determines the types which are supported by this binding for value exchange
    * @see supportsType
    */
  def getSupportedValueTypes(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.`type`]
  /**
    * retrieves the current value
    * @see getSupportedValueTypes
    * @see supportsType
    * @throws IncompatibleTypesException if the requested value type is not supported by the binding
    */
  def getValue(aType: activexDashLibreofficeLib.`type`): js.Any
  /**
    * sets the current value
    * @see getSupportedValueTypes
    * @see supportsType
    * @see ValueBinding
    * @throws IncompatibleTypesException if the given value type is not supported by the binding
    * @throws InvalidBindingStateException if the value currently cannot be changed, since the binding is not fully operational. Possible reasons for this incl
    * @throws com::sun::star::lang::NoSupportException if the binding in general does not support write access to its binding
    */
  def setValue(aValue: js.Any): scala.Unit
  /**
    * determines whether a given type is supported by this binding for value exchange
    *
    * Calling this method is equal to calling {@link getSupportedValueTypes()} , and looking up the given type in the resulting type sequence.
    * @see getSupportedValueTypes
    */
  def supportsType(aType: activexDashLibreofficeLib.`type`): scala.Boolean
}

object XValueBinding {
  @scala.inline
  def apply(
    SupportedValueTypes: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.`type`],
    acquire: js.Function0[scala.Unit],
    getSupportedValueTypes: js.Function0[activexDashInteropLib.SafeArray[activexDashLibreofficeLib.`type`]],
    getValue: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setValue: js.Function1[js.Any, scala.Unit],
    supportsType: js.Function1[activexDashLibreofficeLib.`type`, scala.Boolean]
  ): XValueBinding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("SupportedValueTypes")(SupportedValueTypes)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getSupportedValueTypes")(getSupportedValueTypes)
    __obj.updateDynamic("getValue")(getValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setValue")(setValue)
    __obj.updateDynamic("supportsType")(supportsType)
    __obj.asInstanceOf[XValueBinding]
  }
}

