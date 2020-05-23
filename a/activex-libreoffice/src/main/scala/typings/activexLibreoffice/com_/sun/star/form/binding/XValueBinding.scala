package typings.activexLibreoffice.com_.sun.star.form.binding

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a binding to a value which can be read and written. */
trait XValueBinding extends XInterface {
  /**
    * determines the types which are supported by this binding for value exchange
    * @see supportsType
    */
  val SupportedValueTypes: SafeArray[`type`]
  /**
    * determines the types which are supported by this binding for value exchange
    * @see supportsType
    */
  def getSupportedValueTypes(): SafeArray[`type`]
  /**
    * retrieves the current value
    * @see getSupportedValueTypes
    * @see supportsType
    * @throws IncompatibleTypesException if the requested value type is not supported by the binding
    */
  def getValue(aType: `type`): js.Any
  /**
    * sets the current value
    * @see getSupportedValueTypes
    * @see supportsType
    * @see ValueBinding
    * @throws IncompatibleTypesException if the given value type is not supported by the binding
    * @throws InvalidBindingStateException if the value currently cannot be changed, since the binding is not fully operational. Possible reasons for this incl
    * @throws com::sun::star::lang::NoSupportException if the binding in general does not support write access to its binding
    */
  def setValue(aValue: js.Any): Unit
  /**
    * determines whether a given type is supported by this binding for value exchange
    *
    * Calling this method is equal to calling {@link getSupportedValueTypes()} , and looking up the given type in the resulting type sequence.
    * @see getSupportedValueTypes
    */
  def supportsType(aType: `type`): Boolean
}

object XValueBinding {
  @scala.inline
  def apply(
    SupportedValueTypes: SafeArray[`type`],
    acquire: () => Unit,
    getSupportedValueTypes: () => SafeArray[`type`],
    getValue: `type` => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setValue: js.Any => Unit,
    supportsType: `type` => Boolean
  ): XValueBinding = {
    val __obj = js.Dynamic.literal(SupportedValueTypes = SupportedValueTypes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getSupportedValueTypes = js.Any.fromFunction0(getSupportedValueTypes), getValue = js.Any.fromFunction1(getValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setValue = js.Any.fromFunction1(setValue), supportsType = js.Any.fromFunction1(supportsType))
    __obj.asInstanceOf[XValueBinding]
  }
}

