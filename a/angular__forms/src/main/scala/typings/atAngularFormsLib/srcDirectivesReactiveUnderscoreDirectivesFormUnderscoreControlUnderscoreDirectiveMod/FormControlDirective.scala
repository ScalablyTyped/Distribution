package typings
package atAngularFormsLib.srcDirectivesReactiveUnderscoreDirectivesFormUnderscoreControlUnderscoreDirectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms/src/directives/reactive_directives/form_control_directive", "FormControlDirective")
@js.native
class FormControlDirective protected ()
  extends atAngularFormsLib.srcDirectivesNgUnderscoreControlMod.NgControl
     with atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod.OnChanges {
  def this(validators: js.Array[
      atAngularFormsLib.srcDirectivesValidatorsMod.Validator | atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn
    ], asyncValidators: js.Array[
      atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidator | atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn
    ], valueAccessors: js.Array[
      atAngularFormsLib.srcDirectivesControlUnderscoreValueUnderscoreAccessorMod.ControlValueAccessor
    ]) = this()
  def this(validators: js.Array[
      atAngularFormsLib.srcDirectivesValidatorsMod.Validator | atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn
    ], asyncValidators: js.Array[
      atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidator | atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn
    ], valueAccessors: js.Array[
      atAngularFormsLib.srcDirectivesControlUnderscoreValueUnderscoreAccessorMod.ControlValueAccessor
    ], _ngModelWarningConfig: java.lang.String) = this()
  var _isControlChanged: js.Any = js.native
  var _ngModelWarningConfig: js.Any = js.native
  /**
    * @description
    * The `FormControl` bound to this directive.
    */
  @JSName("control")
  val control_FormControlDirective: atAngularFormsLib.srcModelMod.FormControl = js.native
  /**
    * @description
    * Tracks the `FormControl` instance bound to the directive.
    */
  var form: atAngularFormsLib.srcModelMod.FormControl = js.native
  /**
    * @description
    * Triggers a warning that this input should not be used with reactive forms.
    */
  var isDisabled: scala.Boolean = js.native
  /** @deprecated as of v6 */
  var model: js.Any = js.native
  /**
    * @description
    * Returns an array that represents the path from the top-level form to this control.
    * Each index is the string name of the control on that level.
    */
  @JSName("path")
  val path_FormControlDirective: js.Array[java.lang.String] = js.native
  /** @deprecated as of v6 */
  var update: atAngularCoreLib.atAngularCoreMod.EventEmitter[js.Object] = js.native
  /**
    * @description
    * Internal reference to the view model value.
    */
  var viewModel: js.Any = js.native
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked data-bound properties
    * if at least one has changed, and before the view and content
    * children are checked.
    * @param changes The changed properties.
    */
  /* CompleteClass */
  override def ngOnChanges(changes: atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod.SimpleChanges): scala.Unit = js.native
}

