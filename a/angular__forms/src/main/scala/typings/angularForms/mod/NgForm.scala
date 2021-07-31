package typings.angularForms.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.AfterViewInit
import typings.angularCore.mod.EventEmitter
import typings.angularForms.anon.UpdateOn
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "NgForm")
@js.native
class NgForm protected ()
  extends ControlContainer
     with Form
     with AfterViewInit {
  def this(
    validators: js.Array[Validator | ValidatorFn],
    asyncValidators: js.Array[AsyncValidator | AsyncValidatorFn]
  ) = this()
  
  var _directives: js.Any = js.native
  
  var _setUpdateStrategy: js.Any = js.native
  
  /**
    * @description
    * Add a control to this form.
    *
    * @param dir The control directive to add to the form.
    */
  /* CompleteClass */
  override def addControl(dir: NgControl): Unit = js.native
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
    * Add a group of controls to this form.
    *
    * @param dir: The control group directive to add.
    */
  /* CompleteClass */
  override def addFormGroup(dir: AbstractFormGroupDirective): Unit = js.native
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
    * The `FormGroup` instance created for this form.
    */
  var form: FormGroup = js.native
  
  /**
    * @description
    * The control directive from which to get the `FormControl`.
    *
    * @param dir: The control directive.
    */
  /* CompleteClass */
  override def getControl(dir: NgControl): FormControl = js.native
  /**
    * @description
    * Retrieves the `FormControl` instance from the provided `NgModel` directive.
    *
    * @param dir The `NgModel` directive instance.
    */
  def getControl(dir: NgModel): FormControl = js.native
  
  /**
    * @description
    * The `FormGroup` associated with a particular `AbstractFormGroupDirective`.
    *
    * @param dir: The form group directive from which to get the `FormGroup`.
    */
  /* CompleteClass */
  override def getFormGroup(dir: AbstractFormGroupDirective): FormGroup = js.native
  /**
    * @description
    * Retrieves the `FormGroup` for a provided `NgModelGroup` directive instance
    *
    * @param dir The `NgModelGroup` directive instance.
    */
  def getFormGroup(dir: NgModelGroup): FormGroup = js.native
  
  /**
    * A callback method that is invoked immediately after
    * Angular has completed initialization of a component's view.
    * It is invoked only once when the view is instantiated.
    *
    */
  /* CompleteClass */
  override def ngAfterViewInit(): Unit = js.native
  
  /**
    * @description
    * Event emitter for the "ngSubmit" event
    */
  var ngSubmit: EventEmitter[js.Any] = js.native
  
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
    * Remove a control from this form.
    *
    * @param dir: The control directive to remove from the form.
    */
  /* CompleteClass */
  override def removeControl(dir: NgControl): Unit = js.native
  /**
    * @description
    * Removes the `NgModel` instance from the internal list of directives
    *
    * @param dir The `NgModel` directive instance.
    */
  def removeControl(dir: NgModel): Unit = js.native
  
  /**
    * @description
    * Remove a group of controls to this form.
    *
    * @param dir: The control group directive to remove.
    */
  /* CompleteClass */
  override def removeFormGroup(dir: AbstractFormGroupDirective): Unit = js.native
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
  
  /**
    * @description
    * Returns whether the form submission has been triggered.
    */
  val submitted: Boolean = js.native
  
  /**
    * @description
    * Update the model for a particular control with a new value.
    *
    * @param dir: The control directive to update.
    * @param value: The new value for the control.
    */
  /* CompleteClass */
  override def updateModel(dir: NgControl, value: js.Any): Unit = js.native
}
