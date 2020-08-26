package typings.angularForms.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.AfterViewInit
import typings.angularCore.mod.EventEmitter
import typings.angularForms.anon.UpdateOn
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms", "NgForm")
@js.native
class NgForm protected ()
  extends ControlContainer
     with Form
     with AfterViewInit {
  def this(validators: js.Array[_], asyncValidators: js.Array[_]) = this()
  var _directives: js.Any = js.native
  var _setUpdateStrategy: js.Any = js.native
  /**
    * @description
    * The `FormGroup` instance created for this form.
    */
  var form: FormGroup = js.native
  /**
    * @description
    * Event emitter for the "ngSubmit" event
    */
  var ngSubmit: EventEmitter[_] = js.native
  /**
    * @description
    * Tracks options for the `NgForm` instance.
    *
    * **updateOn**: Sets the default `updateOn` value for all child `NgModels` below it
    * unless explicitly set by a child `NgModel` using `ngModelOptions`). Defaults to 'change'.
    * Possible values: `'change'` | `'blur'` | `'submit'`.
    *
    */
  var options: UpdateOn = js.native
  /**
    * @description
    * Returns whether the form submission has been triggered.
    */
  val submitted: Boolean = js.native
  /**
    * @description
    * Method that sets up the control directive in this group, re-calculates its value
    * and validity, and adds the instance to the internal list of directives.
    *
    * @param dir The `NgModel` directive instance.
    */
  def addControl(dir: NgModel): Unit = js.native
  /**
    * @description
    * Adds a new `NgModelGroup` directive instance to the form.
    *
    * @param dir The `NgModelGroup` directive instance.
    */
  def addFormGroup(dir: NgModelGroup): Unit = js.native
  /**
    * @description
    * Returns a map of the controls in this group.
    */
  def controls: StringDictionary[AbstractControl] = js.native
  /**
    * @description
    * Retrieves the `FormControl` instance from the provided `NgModel` directive.
    *
    * @param dir The `NgModel` directive instance.
    */
  def getControl(dir: NgModel): FormControl = js.native
  /**
    * @description
    * Retrieves the `FormGroup` for a provided `NgModelGroup` directive instance
    *
    * @param dir The `NgModelGroup` directive instance.
    */
  def getFormGroup(dir: NgModelGroup): FormGroup = js.native
  /**
    * @description
    * Method called when the "reset" event is triggered on the form.
    */
  def onReset(): Unit = js.native
  /**
    * @description
    * Method called when the "submit" event is triggered on the form.
    * Triggers the `ngSubmit` emitter to emit the "submit" event as its payload.
    *
    * @param $event The "submit" event object
    */
  def onSubmit($event: Event): Boolean = js.native
  /**
    * @description
    * Removes the `NgModel` instance from the internal list of directives
    *
    * @param dir The `NgModel` directive instance.
    */
  def removeControl(dir: NgModel): Unit = js.native
  /**
    * @description
    * Removes the `NgModelGroup` directive instance from the form.
    *
    * @param dir The `NgModelGroup` directive instance.
    */
  def removeFormGroup(dir: NgModelGroup): Unit = js.native
  /**
    * @description
    * Resets the form to an initial value and resets its submitted status.
    *
    * @param value The new value for the form.
    */
  def resetForm(): Unit = js.native
  def resetForm(value: js.Any): Unit = js.native
  /**
    * @description
    * Sets the value for this `FormGroup`.
    *
    * @param value The new value
    */
  def setValue(value: StringDictionary[js.Any]): Unit = js.native
}

