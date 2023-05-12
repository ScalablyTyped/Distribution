package typings.angularForms.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.AfterViewInit
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularForms.angularFormsBooleans.`false`
import typings.angularForms.angularFormsStrings.ngForm
import typings.angularForms.anon.NgSubmit
import typings.angularForms.anon.Optional
import typings.angularForms.anon.Options
import typings.angularForms.anon.Self
import typings.angularForms.anon.UpdateOn
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "NgForm")
@js.native
open class NgForm protected ()
  extends ControlContainer
     with Form
     with AfterViewInit {
  def this(
    validators: js.Array[Validator | ValidatorFn],
    asyncValidators: js.Array[AsyncValidator | AsyncValidatorFn]
  ) = this()
  def this(
    validators: js.Array[Validator | ValidatorFn],
    asyncValidators: js.Array[AsyncValidator | AsyncValidatorFn],
    callSetDisabledState: SetDisabledStateOption
  ) = this()
  
  /* private */ var _directives: Any = js.native
  
  /* private */ var _findContainer: Any = js.native
  
  /* private */ var _setUpdateStrategy: Any = js.native
  
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
  
  /* private */ var callSetDisabledState: Any = js.native
  
  /**
    * @description
    * Returns a map of the controls in this group.
    */
  def controls: StringDictionary[AbstractControl[Any, Any]] = js.native
  
  /**
    * @description
    * The `FormGroup` instance created for this form.
    */
  var form: FormGroup[Any] = js.native
  
  /**
    * @description
    * The control directive from which to get the `FormControl`.
    *
    * @param dir: The control directive.
    */
  /* CompleteClass */
  override def getControl(dir: NgControl): FormControl[Any] = js.native
  /**
    * @description
    * Retrieves the `FormControl` instance from the provided `NgModel` directive.
    *
    * @param dir The `NgModel` directive instance.
    */
  def getControl(dir: NgModel): FormControl[Any] = js.native
  
  /**
    * @description
    * The `FormGroup` associated with a particular `AbstractFormGroupDirective`.
    *
    * @param dir: The form group directive from which to get the `FormGroup`.
    */
  /* CompleteClass */
  override def getFormGroup(dir: AbstractFormGroupDirective): FormGroup[Any] = js.native
  /**
    * @description
    * Retrieves the `FormGroup` for a provided `NgModelGroup` directive instance
    *
    * @param dir The `NgModelGroup` directive instance.
    */
  def getFormGroup(dir: NgModelGroup): FormGroup[Any] = js.native
  
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
  var ngSubmit: EventEmitter[Any] = js.native
  
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
  def resetForm(value: Any): Unit = js.native
  
  /**
    * @description
    * Sets the value for this `FormGroup`.
    *
    * @param value The new value
    */
  def setValue(value: StringDictionary[Any]): Unit = js.native
  
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
  override def updateModel(dir: NgControl, value: Any): Unit = js.native
}
/* static members */
object NgForm {
  
  @JSImport("@angular/forms", "NgForm")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/forms", "NgForm.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    NgForm, 
    /* form:not([ngNoForm]):not([formGroup]),ng-form,[ngForm] */ String, 
    js.Array[ngForm], 
    Options, 
    NgSubmit, 
    scala.Nothing, 
    scala.Nothing, 
    `false`, 
    scala.Nothing
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      NgForm, 
      /* form:not([ngNoForm]):not([formGroup]),ng-form,[ngForm] */ String, 
      js.Array[ngForm], 
      Options, 
      NgSubmit, 
      scala.Nothing, 
      scala.Nothing, 
      `false`, 
      scala.Nothing
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/forms", "NgForm.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[NgForm, js.Tuple3[Self, Self, Optional]] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[NgForm, js.Tuple3[Self, Self, Optional]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
