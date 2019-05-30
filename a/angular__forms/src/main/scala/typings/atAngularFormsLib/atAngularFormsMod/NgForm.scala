package typings
package atAngularFormsLib.atAngularFormsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms", "NgForm")
@js.native
class NgForm protected ()
  extends ControlContainer
     with Form
     with atAngularCoreLib.atAngularCoreMod.AfterViewInit {
  def this(validators: js.Array[_], asyncValidators: js.Array[_]) = this()
  var _directives: js.Any = js.native
  var _setUpdateStrategy: js.Any = js.native
  /**
    * @description
    * The internal `FormGroup` instance.
    */
  @JSName("control")
  val control_NgForm: FormGroup = js.native
  /**
    * @description
    * Returns a map of the controls in this group.
    */
  val controls: org.scalablytyped.runtime.StringDictionary[AbstractControl] = js.native
  /**
    * @description
    * The `FormGroup` instance created for this form.
    */
  var form: FormGroup = js.native
  /**
    * @description
    * The directive instance.
    */
  @JSName("formDirective")
  val formDirective_NgForm: Form = js.native
  /**
    * @description
    * Event emitter for the "ngSubmit" event
    */
  var ngSubmit: atAngularCoreLib.atAngularCoreMod.EventEmitter[js.Object] = js.native
  /**
    * @description
    * Tracks options for the `NgForm` instance.
    *
    * **updateOn**: Sets the default `updateOn` value for all child `NgModels` below it
    * unless explicitly set by a child `NgModel` using `ngModelOptions`). Defaults to 'change'.
    * Possible values: `'change'` | `'blur'` | `'submit'`.
    *
    */
  var options: atAngularFormsLib.Anon_UpdateOn = js.native
  /**
    * @description
    * Returns an array representing the path to this group. Because this directive
    * always lives at the top level of a form, it is always an empty array.
    */
  @JSName("path")
  val path_NgForm: js.Array[java.lang.String] = js.native
  /**
    * @description
    * Returns whether the form submission has been triggered.
    */
  val submitted: scala.Boolean = js.native
  /**
    * @description
    * Add a control to this form.
    *
    * @param dir The control directive to add to the form.
    */
  /* CompleteClass */
  override def addControl(dir: NgControl): scala.Unit = js.native
  /**
    * @description
    * Method that sets up the control directive in this group, re-calculates its value
    * and validity, and adds the instance to the internal list of directives.
    *
    * @param dir The `NgModel` directive instance.
    */
  def addControl(dir: NgModel): scala.Unit = js.native
  /**
    * @description
    * Add a group of controls to this form.
    *
    * @param dir: The control group directive to add.
    */
  /* CompleteClass */
  override def addFormGroup(dir: AbstractFormGroupDirective): scala.Unit = js.native
  /**
    * @description
    * Adds a new `NgModelGroup` directive instance to the form.
    *
    * @param dir The `NgModelGroup` directive instance.
    */
  def addFormGroup(dir: NgModelGroup): scala.Unit = js.native
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
  override def ngAfterViewInit(): scala.Unit = js.native
  /**
    * @description
    * Method called when the "reset" event is triggered on the form.
    */
  def onReset(): scala.Unit = js.native
  /**
    * @description
    * Method called when the "submit" event is triggered on the form.
    * Triggers the `ngSubmit` emitter to emit the "submit" event as its payload.
    *
    * @param $event The "submit" event object
    */
  def onSubmit($event: stdLib.Event): scala.Boolean = js.native
  /**
    * @description
    * Remove a control from this form.
    *
    * @param dir: The control directive to remove from the form.
    */
  /* CompleteClass */
  override def removeControl(dir: NgControl): scala.Unit = js.native
  /**
    * @description
    * Removes the `NgModel` instance from the internal list of directives
    *
    * @param dir The `NgModel` directive instance.
    */
  def removeControl(dir: NgModel): scala.Unit = js.native
  /**
    * @description
    * Remove a group of controls to this form.
    *
    * @param dir: The control group directive to remove.
    */
  /* CompleteClass */
  override def removeFormGroup(dir: AbstractFormGroupDirective): scala.Unit = js.native
  /**
    * @description
    * Removes the `NgModelGroup` directive instance from the form.
    *
    * @param dir The `NgModelGroup` directive instance.
    */
  def removeFormGroup(dir: NgModelGroup): scala.Unit = js.native
  /**
    * @description
    * Resets the form to an initial value and resets its submitted status.
    *
    * @param value The new value for the form.
    */
  def resetForm(): scala.Unit = js.native
  def resetForm(value: js.Any): scala.Unit = js.native
  /**
    * @description
    * Sets the value for this `FormGroup`.
    *
    * @param value The new value
    */
  def setValue(value: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  /**
    * @description
    * Update the model for a particular control with a new value.
    *
    * @param dir: The control directive to update.
    * @param value: The new value for the control.
    */
  /* CompleteClass */
  override def updateModel(dir: NgControl, value: js.Any): scala.Unit = js.native
}

