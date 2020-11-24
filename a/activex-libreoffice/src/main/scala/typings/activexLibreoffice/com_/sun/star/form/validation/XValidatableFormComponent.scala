package typings.activexLibreoffice.com_.sun.star.form.validation

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
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
  val CurrentValue: js.Any = js.native
  
  /**
    * registers the given listener.
    *
    * XFormComponentValidityListeners are called whenever **any** of the aspects of the validatable form component (the validity flag, or the value)
    * changed.
    * @throws com::sun::star::lang::NullPointerException if the given listener is `NULL`
    */
  def addFormComponentValidityListener(Listener: XFormComponentValidityListener): Unit = js.native
  
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
  def getCurrentValue(): js.Any = js.native
  
  /**
    * determines whether the current value of the component passed the validity test at the validator.
    *
    * Calling this is equal to calling {@link XValidator.isValid()} with the current value (see {@link getCurrentValue()} ) of the component, where the
    * validator is obtained via {@link XValidatable.getValidator()} .
    *
    * If no validator has been set ( {@link XValidatable.setValidator()} ), this method returns true.
    */
  def isValid(): Boolean = js.native
  
  /**
    * registers the given listener.
    * @throws com::sun::star::lang::NullPointerException if the given listener is `NULL`
    */
  def removeFormComponentValidityListener(Listener: XFormComponentValidityListener): Unit = js.native
}
object XValidatableFormComponent {
  
  @scala.inline
  def apply(
    CurrentValue: js.Any,
    Validator: XValidator,
    acquire: () => Unit,
    addFormComponentValidityListener: XFormComponentValidityListener => Unit,
    getCurrentValue: () => js.Any,
    getValidator: () => XValidator,
    isValid: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeFormComponentValidityListener: XFormComponentValidityListener => Unit,
    setValidator: XValidator => Unit
  ): XValidatableFormComponent = {
    val __obj = js.Dynamic.literal(CurrentValue = CurrentValue.asInstanceOf[js.Any], Validator = Validator.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addFormComponentValidityListener = js.Any.fromFunction1(addFormComponentValidityListener), getCurrentValue = js.Any.fromFunction0(getCurrentValue), getValidator = js.Any.fromFunction0(getValidator), isValid = js.Any.fromFunction0(isValid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeFormComponentValidityListener = js.Any.fromFunction1(removeFormComponentValidityListener), setValidator = js.Any.fromFunction1(setValidator))
    __obj.asInstanceOf[XValidatableFormComponent]
  }
  
  @scala.inline
  implicit class XValidatableFormComponentOps[Self <: XValidatableFormComponent] (val x: Self) extends AnyVal {
    
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
    def setCurrentValue(value: js.Any): Self = this.set("CurrentValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddFormComponentValidityListener(value: XFormComponentValidityListener => Unit): Self = this.set("addFormComponentValidityListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCurrentValue(value: () => js.Any): Self = this.set("getCurrentValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsValid(value: () => Boolean): Self = this.set("isValid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveFormComponentValidityListener(value: XFormComponentValidityListener => Unit): Self = this.set("removeFormComponentValidityListener", js.Any.fromFunction1(value))
  }
}
