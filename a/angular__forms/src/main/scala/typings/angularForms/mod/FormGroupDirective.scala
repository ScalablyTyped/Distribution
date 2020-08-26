package typings.angularForms.mod

import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.OnChanges
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms", "FormGroupDirective")
@js.native
class FormGroupDirective protected ()
  extends ControlContainer
     with Form
     with OnChanges {
  def this(_validators: js.Array[_], _asyncValidators: js.Array[_]) = this()
  var _asyncValidators: js.Any = js.native
  var _checkFormPresent: js.Any = js.native
  var _oldForm: js.Any = js.native
  var _updateRegistrations: js.Any = js.native
  var _updateValidators: js.Any = js.native
  var _validators: js.Any = js.native
  /**
    * @description
    * Tracks the list of added `FormControlName` instances
    */
  var directives: js.Array[FormControlName] = js.native
  /**
    * @description
    * Tracks the `FormGroup` bound to this directive.
    */
  var form: FormGroup = js.native
  /**
    * @description
    * Emits an event when the form submission has been triggered.
    */
  var ngSubmit: EventEmitter[_] = js.native
  /**
    * @description
    * Reports whether the form submission has been triggered.
    */
  val submitted: Boolean = js.native
  /**
    * @description
    * Method that sets up the control directive in this group, re-calculates its value
    * and validity, and adds the instance to the internal list of directives.
    *
    * @param dir The `FormControlName` directive instance.
    */
  def addControl(dir: FormControlName): FormControl = js.native
  /**
    * Adds a new `FormArrayName` directive instance to the form.
    *
    * @param dir The `FormArrayName` directive instance.
    */
  def addFormArray(dir: FormArrayName): Unit = js.native
  /**
    * Adds a new `FormGroupName` directive instance to the form.
    *
    * @param dir The `FormGroupName` directive instance.
    */
  def addFormGroup(dir: FormGroupName): Unit = js.native
  /**
    * @description
    * Retrieves the `FormControl` instance from the provided `FormControlName` directive
    *
    * @param dir The `FormControlName` directive instance.
    */
  def getControl(dir: FormControlName): FormControl = js.native
  /**
    * @description
    * Retrieves the `FormArray` for a provided `FormArrayName` directive instance.
    *
    * @param dir The `FormArrayName` directive instance.
    */
  def getFormArray(dir: FormArrayName): FormArray = js.native
  /**
    * @description
    * Retrieves the `FormGroup` for a provided `FormGroupName` directive instance
    *
    * @param dir The `FormGroupName` directive instance.
    */
  def getFormGroup(dir: FormGroupName): FormGroup = js.native
  /**
    * @description
    * Method called when the "reset" event is triggered on the form.
    */
  def onReset(): Unit = js.native
  /**
    * @description
    * Method called with the "submit" event is triggered on the form.
    * Triggers the `ngSubmit` emitter to emit the "submit" event as its payload.
    *
    * @param $event The "submit" event object
    */
  def onSubmit($event: Event): Boolean = js.native
  /**
    * @description
    * Removes the `FormControlName` instance from the internal list of directives
    *
    * @param dir The `FormControlName` directive instance.
    */
  def removeControl(dir: FormControlName): Unit = js.native
  /**
    * No-op method to remove the form array.
    *
    * @param dir The `FormArrayName` directive instance.
    */
  def removeFormArray(dir: FormArrayName): Unit = js.native
  /**
    * No-op method to remove the form group.
    *
    * @param dir The `FormGroupName` directive instance.
    */
  def removeFormGroup(dir: FormGroupName): Unit = js.native
  /**
    * @description
    * Resets the form to an initial value and resets its submitted status.
    *
    * @param value The new value for the form.
    */
  def resetForm(): Unit = js.native
  def resetForm(value: js.Any): Unit = js.native
  /**
    * Sets the new value for the provided `FormControlName` directive.
    *
    * @param dir The `FormControlName` directive instance.
    * @param value The new value for the directive's control.
    */
  def updateModel(dir: FormControlName, value: js.Any): Unit = js.native
}

