package typings.angularForms.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Form extends StObject {
  
  /**
    * @description
    * Add a control to this form.
    *
    * @param dir The control directive to add to the form.
    */
  def addControl(dir: NgControl): Unit
  
  /**
    * @description
    * Add a group of controls to this form.
    *
    * @param dir: The control group directive to add.
    */
  def addFormGroup(dir: AbstractFormGroupDirective): Unit
  
  /**
    * @description
    * The control directive from which to get the `FormControl`.
    *
    * @param dir: The control directive.
    */
  def getControl(dir: NgControl): FormControl[Any]
  
  /**
    * @description
    * The `FormGroup` associated with a particular `AbstractFormGroupDirective`.
    *
    * @param dir: The form group directive from which to get the `FormGroup`.
    */
  def getFormGroup(dir: AbstractFormGroupDirective): FormGroup[Any]
  
  /**
    * @description
    * Remove a control from this form.
    *
    * @param dir: The control directive to remove from the form.
    */
  def removeControl(dir: NgControl): Unit
  
  /**
    * @description
    * Remove a group of controls to this form.
    *
    * @param dir: The control group directive to remove.
    */
  def removeFormGroup(dir: AbstractFormGroupDirective): Unit
  
  /**
    * @description
    * Update the model for a particular control with a new value.
    *
    * @param dir: The control directive to update.
    * @param value: The new value for the control.
    */
  def updateModel(dir: NgControl, value: Any): Unit
}
object Form {
  
  inline def apply(
    addControl: NgControl => Unit,
    addFormGroup: AbstractFormGroupDirective => Unit,
    getControl: NgControl => FormControl[Any],
    getFormGroup: AbstractFormGroupDirective => FormGroup[Any],
    removeControl: NgControl => Unit,
    removeFormGroup: AbstractFormGroupDirective => Unit,
    updateModel: (NgControl, Any) => Unit
  ): Form = {
    val __obj = js.Dynamic.literal(addControl = js.Any.fromFunction1(addControl), addFormGroup = js.Any.fromFunction1(addFormGroup), getControl = js.Any.fromFunction1(getControl), getFormGroup = js.Any.fromFunction1(getFormGroup), removeControl = js.Any.fromFunction1(removeControl), removeFormGroup = js.Any.fromFunction1(removeFormGroup), updateModel = js.Any.fromFunction2(updateModel))
    __obj.asInstanceOf[Form]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Form] (val x: Self) extends AnyVal {
    
    inline def setAddControl(value: NgControl => Unit): Self = StObject.set(x, "addControl", js.Any.fromFunction1(value))
    
    inline def setAddFormGroup(value: AbstractFormGroupDirective => Unit): Self = StObject.set(x, "addFormGroup", js.Any.fromFunction1(value))
    
    inline def setGetControl(value: NgControl => FormControl[Any]): Self = StObject.set(x, "getControl", js.Any.fromFunction1(value))
    
    inline def setGetFormGroup(value: AbstractFormGroupDirective => FormGroup[Any]): Self = StObject.set(x, "getFormGroup", js.Any.fromFunction1(value))
    
    inline def setRemoveControl(value: NgControl => Unit): Self = StObject.set(x, "removeControl", js.Any.fromFunction1(value))
    
    inline def setRemoveFormGroup(value: AbstractFormGroupDirective => Unit): Self = StObject.set(x, "removeFormGroup", js.Any.fromFunction1(value))
    
    inline def setUpdateModel(value: (NgControl, Any) => Unit): Self = StObject.set(x, "updateModel", js.Any.fromFunction2(value))
  }
}
