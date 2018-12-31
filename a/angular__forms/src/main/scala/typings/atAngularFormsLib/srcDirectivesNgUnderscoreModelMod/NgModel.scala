package typings
package atAngularFormsLib.srcDirectivesNgUnderscoreModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms/src/directives/ng_model", "NgModel")
@js.native
class NgModel protected ()
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
  var _checkForErrors: js.Any = js.native
  var _checkName: js.Any = js.native
  var _checkParentType: js.Any = js.native
  var _isStandalone: js.Any = js.native
  var _setUpControl: js.Any = js.native
  var _setUpStandalone: js.Any = js.native
  var _setUpdateStrategy: js.Any = js.native
  var _updateDisabled: js.Any = js.native
  var _updateValue: js.Any = js.native
  @JSName("control")
  val control_NgModel: atAngularFormsLib.srcModelMod.FormControl = js.native
  /**
    * @description
    * The top-level directive for this control if present, otherwise null.
    */
  val formDirective: js.Any = js.native
  /**
    * @description
    * Tracks whether the control is disabled.
    */
  var isDisabled: scala.Boolean = js.native
  /**
    * @description
    * Tracks the value bound to this directive.
    */
  var model: js.Any = js.native
  /**
    * @description
    * Tracks the name bound to the directive. The parent form
    * uses this name as a key to retrieve this control's value.
    */
  @JSName("name")
  var name_NgModel: java.lang.String = js.native
  /**
    * @description
    * Tracks the configuration options for this `ngModel` instance.
    *
    * **name**: An alternative to setting the name attribute on the form control element. See
    * the [example](api/forms/NgModel#using-ngmodel-on-a-standalone-control) for using `NgModel`
    * as a standalone control.
    *
    * **standalone**: When set to true, the `ngModel` will not register itself with its parent form,
    * and acts as if it's not in the form. Defaults to false.
    *
    * **updateOn**: Defines the event upon which the form control value and validity update.
    * Defaults to 'change'. Possible values: `'change'` | `'blur'` | `'submit'`.
    *
    */
  var options: atAngularFormsLib.Anon_Standalone = js.native
  /**
    * @description
    * Returns an array that represents the path from the top-level form to this control.
    * Each index is the string name of the control on that level.
    */
  @JSName("path")
  val path_NgModel: js.Array[java.lang.String] = js.native
  /**
    * @description
    * Event emitter for producing the `ngModelChange` event after
    * the view model updates.
    */
  var update: atAngularCoreLib.coreMod.EventEmitter[js.Object] = js.native
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
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * after a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): scala.Unit = js.native
}

