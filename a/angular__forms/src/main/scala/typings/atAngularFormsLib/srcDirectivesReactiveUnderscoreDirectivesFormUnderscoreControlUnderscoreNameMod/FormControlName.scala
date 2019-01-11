package typings
package atAngularFormsLib.srcDirectivesReactiveUnderscoreDirectivesFormUnderscoreControlUnderscoreNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms/src/directives/reactive_directives/form_control_name", "FormControlName")
@js.native
class FormControlName protected ()
  extends atAngularFormsLib.srcDirectivesNgUnderscoreControlMod.NgControl
     with atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod.OnChanges
     with atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod.OnDestroy {
  def this(parent: atAngularFormsLib.srcDirectivesControlUnderscoreContainerMod.ControlContainer, validators: js.Array[
      atAngularFormsLib.srcDirectivesValidatorsMod.Validator | atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn
    ], asyncValidators: js.Array[
      atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidator | atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn
    ], valueAccessors: js.Array[
      atAngularFormsLib.srcDirectivesControlUnderscoreValueUnderscoreAccessorMod.ControlValueAccessor
    ]) = this()
  def this(parent: atAngularFormsLib.srcDirectivesControlUnderscoreContainerMod.ControlContainer, validators: js.Array[
      atAngularFormsLib.srcDirectivesValidatorsMod.Validator | atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn
    ], asyncValidators: js.Array[
      atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidator | atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn
    ], valueAccessors: js.Array[
      atAngularFormsLib.srcDirectivesControlUnderscoreValueUnderscoreAccessorMod.ControlValueAccessor
    ], _ngModelWarningConfig: java.lang.String) = this()
  var _added: js.Any = js.native
  var _checkParentType: js.Any = js.native
  var _ngModelWarningConfig: js.Any = js.native
  var _setUpControl: js.Any = js.native
  /**
    * @description
    * Tracks the `FormControl` instance bound to the directive.
    */
  @JSName("control")
  val control_FormControlName: atAngularFormsLib.srcModelMod.FormControl = js.native
  /**
    * @description
    * The top-level directive for this group if present, otherwise null.
    */
  val formDirective: js.Any = js.native
  /**
    * @description
    * Triggers a warning that this input should not be used with reactive forms.
    */
  var isDisabled: scala.Boolean = js.native
  /** @deprecated as of v6 */
  var model: js.Any = js.native
  /**
    * @description
    * Tracks the name of the `FormControl` bound to the directive. The name corresponds
    * to a key in the parent `FormGroup` or `FormArray`.
    */
  @JSName("name")
  var name_FormControlName: java.lang.String = js.native
  /**
    * @description
    * Returns an array that represents the path from the top-level form to this control.
    * Each index is the string name of the control on that level.
    */
  @JSName("path")
  val path_FormControlName: js.Array[java.lang.String] = js.native
  /** @deprecated as of v6 */
  var update: atAngularCoreLib.atAngularCoreMod.EventEmitter[js.Object] = js.native
  /**
    * @description
    * Async validator function composed of all the async validators registered with this
    * directive.
    */
  @JSName("asyncValidator")
  def asyncValidator_MFormControlName(control: atAngularFormsLib.srcModelMod.AbstractControl): (js.Promise[atAngularFormsLib.srcDirectivesValidatorsMod.ValidationErrors | scala.Null]) | (rxjsLib.rxjsMod.Observable[atAngularFormsLib.srcDirectivesValidatorsMod.ValidationErrors | scala.Null]) = js.native
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked data-bound properties
    * if at least one has changed, and before the view and content
    * children are checked.
    * @param changes The changed properties.
    */
  /* CompleteClass */
  override def ngOnChanges(changes: atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod.SimpleChanges): scala.Unit = js.native
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * after a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): scala.Unit = js.native
}

