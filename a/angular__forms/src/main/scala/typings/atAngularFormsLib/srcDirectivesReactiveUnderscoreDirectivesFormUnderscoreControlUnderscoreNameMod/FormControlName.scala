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
  @JSName("control")
  val control_FormControlName: atAngularFormsLib.srcModelMod.FormControl = js.native
  val formDirective: js.Any = js.native
  var isDisabled: scala.Boolean = js.native
  /** @deprecated as of v6 */
  var model: js.Any = js.native
  @JSName("name")
  var name_FormControlName: java.lang.String = js.native
  @JSName("path")
  val path_FormControlName: js.Array[java.lang.String] = js.native
  /** @deprecated as of v6 */
  var update: atAngularCoreLib.coreMod.EventEmitter[js.Object] = js.native
  @JSName("asyncValidator")
  def asyncValidator_MFormControlName(control: atAngularFormsLib.srcModelMod.AbstractControl): (stdLib.Promise[atAngularFormsLib.srcDirectivesValidatorsMod.ValidationErrors | scala.Null]) | (rxjsLib.rxjsMod.Observable[atAngularFormsLib.srcDirectivesValidatorsMod.ValidationErrors | scala.Null]) = js.native
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

