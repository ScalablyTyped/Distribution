package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.validationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a convenience interface for accessing several aspects of a form component which supports validation.
  *
  * A validatable form component has two aspects which other parties might be interested in: The pure validity flag: Whatever the user enters in the
  * component, this is either valid (relative to the active validator), or invalid.The current value: Even if the validity flag does not change with the
  * user input (e.g. because the user replaces one invalid value with another invalid value), observers might be interested in the current value, for
  * example to include it in a feedback message to the user.
  *
  * An {@link XValidatableFormComponent} allows to easily access both of these aspects.
  *
  * Note that all of the information provided at this interface can also obtained by other means, but much more inconveniently.
  * @see XValidatable
  * @see XValidator
  */
trait XValidatableFormComponent extends XValidatable {
  /**
    * retrieves the current value of the component.
    *
    * The type of the current value, as well as it's semantics, depend on the service implementing this interface.
    *
    * Again, this is a convenience method. For example, for a {@link com.sun.star.form.component.FormattedField} , calling this method is equivalent to
    * retrieving the {@link com.sun.star.awt.UnoControlFormattedFieldModel.EffectiveValue} .
    *
    * If no validator has been set ( {@link XValidatable.setValidator()} ), the value returned here is defined by the service implementing this interface.
    */
  val CurrentValue: js.Any
  /**
    * registers the given listener.
    *
    * XFormComponentValidityListeners are called whenever **any** of the aspects of the validatable form component (the validity flag, or the value)
    * changed.
    * @throws com::sun::star::lang::NullPointerException if the given listener is `NULL`
    */
  def addFormComponentValidityListener(Listener: XFormComponentValidityListener): scala.Unit
  /**
    * retrieves the current value of the component.
    *
    * The type of the current value, as well as it's semantics, depend on the service implementing this interface.
    *
    * Again, this is a convenience method. For example, for a {@link com.sun.star.form.component.FormattedField} , calling this method is equivalent to
    * retrieving the {@link com.sun.star.awt.UnoControlFormattedFieldModel.EffectiveValue} .
    *
    * If no validator has been set ( {@link XValidatable.setValidator()} ), the value returned here is defined by the service implementing this interface.
    */
  def getCurrentValue(): js.Any
  /**
    * determines whether the current value of the component passed the validity test at the validator.
    *
    * Calling this is equal to calling {@link XValidator.isValid()} with the current value (see {@link getCurrentValue()} ) of the component, where the
    * validator is obtained via {@link XValidatable.getValidator()} .
    *
    * If no validator has been set ( {@link XValidatable.setValidator()} ), this method returns true.
    */
  def isValid(): scala.Boolean
  /**
    * registers the given listener.
    * @throws com::sun::star::lang::NullPointerException if the given listener is `NULL`
    */
  def removeFormComponentValidityListener(Listener: XFormComponentValidityListener): scala.Unit
}

object XValidatableFormComponent {
  @scala.inline
  def apply(
    CurrentValue: js.Any,
    Validator: XValidator,
    acquire: js.Function0[scala.Unit],
    addFormComponentValidityListener: js.Function1[XFormComponentValidityListener, scala.Unit],
    getCurrentValue: js.Function0[js.Any],
    getValidator: js.Function0[XValidator],
    isValid: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeFormComponentValidityListener: js.Function1[XFormComponentValidityListener, scala.Unit],
    setValidator: js.Function1[XValidator, scala.Unit]
  ): XValidatableFormComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CurrentValue")(CurrentValue)
    __obj.updateDynamic("Validator")(Validator)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addFormComponentValidityListener")(addFormComponentValidityListener)
    __obj.updateDynamic("getCurrentValue")(getCurrentValue)
    __obj.updateDynamic("getValidator")(getValidator)
    __obj.updateDynamic("isValid")(isValid)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeFormComponentValidityListener")(removeFormComponentValidityListener)
    __obj.updateDynamic("setValidator")(setValidator)
    __obj.asInstanceOf[XValidatableFormComponent]
  }
}

