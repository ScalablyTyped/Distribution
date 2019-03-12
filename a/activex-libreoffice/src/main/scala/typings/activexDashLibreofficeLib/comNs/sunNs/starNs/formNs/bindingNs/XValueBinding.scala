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
  val SupportedValueTypes: stdLib.SafeArray[activexDashLibreofficeLib.`type`]
  /**
    * determines the types which are supported by this binding for value exchange
    * @see supportsType
    */
  def getSupportedValueTypes(): stdLib.SafeArray[activexDashLibreofficeLib.`type`]
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
    SupportedValueTypes: stdLib.SafeArray[activexDashLibreofficeLib.`type`],
    acquire: () => scala.Unit,
    getSupportedValueTypes: () => stdLib.SafeArray[activexDashLibreofficeLib.`type`],
    getValue: activexDashLibreofficeLib.`type` => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setValue: js.Any => scala.Unit,
    supportsType: activexDashLibreofficeLib.`type` => scala.Boolean
  ): XValueBinding = {
    val __obj = js.Dynamic.literal(SupportedValueTypes = SupportedValueTypes, acquire = js.Any.fromFunction0(acquire), getSupportedValueTypes = js.Any.fromFunction0(getSupportedValueTypes), getValue = js.Any.fromFunction1(getValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setValue = js.Any.fromFunction1(setValue), supportsType = js.Any.fromFunction1(supportsType))
  
    __obj.asInstanceOf[XValueBinding]
  }
}

