package typings.angularForms.mod

import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.OnChanges
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.SimpleChanges
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularForms.anon.NgSubmit
import typings.angularForms.anon.Optional
import typings.angularForms.anon.Self
import typings.angularForms.anon.`1`
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "FormGroupDirective")
@js.native
open class FormGroupDirective protected ()
  extends ControlContainer
     with Form
     with OnChanges
     with OnDestroy {
  def this(
    validators: js.Array[Validator | ValidatorFn],
    asyncValidators: js.Array[AsyncValidator | AsyncValidatorFn]
  ) = this()
  def this(
    validators: js.Array[Validator | ValidatorFn],
    asyncValidators: js.Array[AsyncValidator | AsyncValidatorFn],
    callSetDisabledState: SetDisabledStateOption
  ) = this()
  
  /* private */ var _checkFormPresent: Any = js.native
  
  /* private */ var _cleanUpFormContainer: Any = js.native
  
  /**
    * Reference to an old form group input value, which is needed to cleanup old instance in case it
    * was replaced with a new one.
    */
  /* private */ var _oldForm: Any = js.native
  
  /**
    * Callback that should be invoked when controls in FormGroup or FormArray collection change
    * (added or removed). This callback triggers corresponding DOM updates.
    */
  /* private */ val _onCollectionChange: Any = js.native
  
  /* private */ var _setUpFormContainer: Any = js.native
  
  /* private */ var _updateRegistrations: Any = js.native
  
  /* private */ var _updateValidators: Any = js.native
  
  /**
    * @description
    * Method that sets up the control directive in this group, re-calculates its value
    * and validity, and adds the instance to the internal list of directives.
    *
    * @param dir The `FormControlName` directive instance.
    */
  def addControl(dir: FormControlName): FormControl[Any] = js.native
  /**
    * @description
    * Add a control to this form.
    *
    * @param dir The control directive to add to the form.
    */
  /* CompleteClass */
  override def addControl(dir: NgControl): Unit = js.native
  
  /**
    * Performs the necessary setup when a `FormArrayName` directive instance is added to the view.
    *
    * @param dir The `FormArrayName` directive instance.
    */
  def addFormArray(dir: FormArrayName): Unit = js.native
  
  /**
    * @description
    * Add a group of controls to this form.
    *
    * @param dir: The control group directive to add.
    */
  /* CompleteClass */
  override def addFormGroup(dir: AbstractFormGroupDirective): Unit = js.native
  /**
    * Adds a new `FormGroupName` directive instance to the form.
    *
    * @param dir The `FormGroupName` directive instance.
    */
  def addFormGroup(dir: FormGroupName): Unit = js.native
  
  /* private */ var callSetDisabledState: Any = js.native
  
  /**
    * @description
    * Tracks the list of added `FormControlName` instances
    */
  var directives: js.Array[FormControlName] = js.native
  
  /**
    * @description
    * Tracks the `FormGroup` bound to this directive.
    */
  var form: FormGroup[Any] = js.native
  
  /**
    * @description
    * Retrieves the `FormControl` instance from the provided `FormControlName` directive
    *
    * @param dir The `FormControlName` directive instance.
    */
  def getControl(dir: FormControlName): FormControl[Any] = js.native
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
    * Retrieves the `FormArray` for a provided `FormArrayName` directive instance.
    *
    * @param dir The `FormArrayName` directive instance.
    */
  def getFormArray(dir: FormArrayName): FormArray[Any] = js.native
  
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
    * Retrieves the `FormGroup` for a provided `FormGroupName` directive instance
    *
    * @param dir The `FormGroupName` directive instance.
    */
  def getFormGroup(dir: FormGroupName): FormGroup[Any] = js.native
  
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked data-bound properties
    * if at least one has changed, and before the view and content
    * children are checked.
    * @param changes The changed properties.
    */
  /* CompleteClass */
  override def ngOnChanges(changes: SimpleChanges): Unit = js.native
  
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
  
  /**
    * @description
    * Emits an event when the form submission has been triggered.
    */
  var ngSubmit: EventEmitter[Any] = js.native
  
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
    * @description
    * Remove a control from this form.
    *
    * @param dir: The control directive to remove from the form.
    */
  /* CompleteClass */
  override def removeControl(dir: NgControl): Unit = js.native
  
  /**
    * Performs the necessary cleanup when a `FormArrayName` directive instance is removed from the
    * view.
    *
    * @param dir The `FormArrayName` directive instance.
    */
  def removeFormArray(dir: FormArrayName): Unit = js.native
  
  /**
    * @description
    * Remove a group of controls to this form.
    *
    * @param dir: The control group directive to remove.
    */
  /* CompleteClass */
  override def removeFormGroup(dir: AbstractFormGroupDirective): Unit = js.native
  /**
    * Performs the necessary cleanup when a `FormGroupName` directive instance is removed from the
    * view.
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
  def resetForm(value: Any): Unit = js.native
  
  /**
    * @description
    * Reports whether the form submission has been triggered.
    */
  val submitted: Boolean = js.native
  
  /**
    * Sets the new value for the provided `FormControlName` directive.
    *
    * @param dir The `FormControlName` directive instance.
    * @param value The new value for the directive's control.
    */
  def updateModel(dir: FormControlName, value: Any): Unit = js.native
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
object FormGroupDirective {
  
  @JSImport("@angular/forms", "FormGroupDirective")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/forms", "FormGroupDirective.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    FormGroupDirective, 
    "[formGroup]", 
    js.Array["ngForm"], 
    `1`, 
    NgSubmit, 
    scala.Nothing, 
    scala.Nothing, 
    false, 
    scala.Nothing
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      FormGroupDirective, 
      "[formGroup]", 
      js.Array["ngForm"], 
      `1`, 
      NgSubmit, 
      scala.Nothing, 
      scala.Nothing, 
      false, 
      scala.Nothing
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/forms", "FormGroupDirective.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[FormGroupDirective, js.Tuple3[Self, Self, Optional]] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[FormGroupDirective, js.Tuple3[Self, Self, Optional]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
