package typings.atAngularForms.atAngularFormsMod

import typings.atAngularCore.atAngularCoreMod.EventEmitter
import typings.atAngularCore.atAngularCoreMod.OnChanges
import typings.atAngularCore.atAngularCoreMod.OnDestroy
import typings.atAngularCore.atAngularCoreMod.SimpleChanges
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms", "FormControlName")
@js.native
class FormControlName protected ()
  extends NgControl
     with OnChanges
     with OnDestroy {
  def this(
    parent: ControlContainer,
    validators: js.Array[Validator | ValidatorFn],
    asyncValidators: js.Array[AsyncValidator | AsyncValidatorFn],
    valueAccessors: js.Array[ControlValueAccessor]
  ) = this()
  def this(
    parent: ControlContainer,
    validators: js.Array[Validator | ValidatorFn],
    asyncValidators: js.Array[AsyncValidator | AsyncValidatorFn],
    valueAccessors: js.Array[ControlValueAccessor],
    _ngModelWarningConfig: String
  ) = this()
  var _added: js.Any = js.native
  var _checkParentType: js.Any = js.native
  var _ngModelWarningConfig: js.Any = js.native
  var _setUpControl: js.Any = js.native
  /**
    * @description
    * Tracks the `FormControl` instance bound to the directive.
    */
  @JSName("control")
  val control_FormControlName: FormControl = js.native
  /**
    * @description
    * The top-level directive for this group if present, otherwise null.
    */
  val formDirective: js.Any = js.native
  /**
    * @description
    * Triggers a warning that this input should not be used with reactive forms.
    */
  var isDisabled: Boolean = js.native
  /** @deprecated as of v6 */
  var model: js.Any = js.native
  /**
    * @description
    * Tracks the name of the `FormControl` bound to the directive. The name corresponds
    * to a key in the parent `FormGroup` or `FormArray`.
    */
  @JSName("name")
  var name_FormControlName: String = js.native
  /**
    * @description
    * Returns an array that represents the path from the top-level form to this control.
    * Each index is the string name of the control on that level.
    */
  @JSName("path")
  val path_FormControlName: js.Array[String] = js.native
  /** @deprecated as of v6 */
  var update: EventEmitter[_] = js.native
  /**
    * @description
    * Async validator function composed of all the async validators registered with this
    * directive.
    */
  @JSName("asyncValidator")
  def asyncValidator_MFormControlName(control: AbstractControl): (js.Promise[ValidationErrors | Null]) | (Observable[ValidationErrors | Null]) = js.native
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
    * after a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
}

