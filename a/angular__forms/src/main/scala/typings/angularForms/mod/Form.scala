package typings.angularForms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Form extends js.Object {
  /**
    * @description
    * Add a control to this form.
    *
    * @param dir The control directive to add to the form.
    */
  def addControl(dir: NgControl): Unit = js.native
  /**
    * @description
    * Add a group of controls to this form.
    *
    * @param dir: The control group directive to add.
    */
  def addFormGroup(dir: AbstractFormGroupDirective): Unit = js.native
  /**
    * @description
    * The control directive from which to get the `FormControl`.
    *
    * @param dir: The control directive.
    */
  def getControl(dir: NgControl): FormControl = js.native
  /**
    * @description
    * The `FormGroup` associated with a particular `AbstractFormGroupDirective`.
    *
    * @param dir: The form group directive from which to get the `FormGroup`.
    */
  def getFormGroup(dir: AbstractFormGroupDirective): FormGroup = js.native
  /**
    * @description
    * Remove a control from this form.
    *
    * @param dir: The control directive to remove from the form.
    */
  def removeControl(dir: NgControl): Unit = js.native
  /**
    * @description
    * Remove a group of controls to this form.
    *
    * @param dir: The control group directive to remove.
    */
  def removeFormGroup(dir: AbstractFormGroupDirective): Unit = js.native
  /**
    * @description
    * Update the model for a particular control with a new value.
    *
    * @param dir: The control directive to update.
    * @param value: The new value for the control.
    */
  def updateModel(dir: NgControl, value: js.Any): Unit = js.native
}

object Form {
  @scala.inline
  def apply(
    addControl: NgControl => Unit,
    addFormGroup: AbstractFormGroupDirective => Unit,
    getControl: NgControl => FormControl,
    getFormGroup: AbstractFormGroupDirective => FormGroup,
    removeControl: NgControl => Unit,
    removeFormGroup: AbstractFormGroupDirective => Unit,
    updateModel: (NgControl, js.Any) => Unit
  ): Form = {
    val __obj = js.Dynamic.literal(addControl = js.Any.fromFunction1(addControl), addFormGroup = js.Any.fromFunction1(addFormGroup), getControl = js.Any.fromFunction1(getControl), getFormGroup = js.Any.fromFunction1(getFormGroup), removeControl = js.Any.fromFunction1(removeControl), removeFormGroup = js.Any.fromFunction1(removeFormGroup), updateModel = js.Any.fromFunction2(updateModel))
    __obj.asInstanceOf[Form]
  }
  @scala.inline
  implicit class FormOps[Self <: Form] (val x: Self) extends AnyVal {
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
    def setAddControl(value: NgControl => Unit): Self = this.set("addControl", js.Any.fromFunction1(value))
    @scala.inline
    def setAddFormGroup(value: AbstractFormGroupDirective => Unit): Self = this.set("addFormGroup", js.Any.fromFunction1(value))
    @scala.inline
    def setGetControl(value: NgControl => FormControl): Self = this.set("getControl", js.Any.fromFunction1(value))
    @scala.inline
    def setGetFormGroup(value: AbstractFormGroupDirective => FormGroup): Self = this.set("getFormGroup", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveControl(value: NgControl => Unit): Self = this.set("removeControl", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveFormGroup(value: AbstractFormGroupDirective => Unit): Self = this.set("removeFormGroup", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateModel(value: (NgControl, js.Any) => Unit): Self = this.set("updateModel", js.Any.fromFunction2(value))
  }
  
}

