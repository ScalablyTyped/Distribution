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
  val formDirective: js.Any = js.native
  var isDisabled: scala.Boolean = js.native
  var model: js.Any = js.native
  @JSName("name")
  var name_NgModel: java.lang.String = js.native
  /**
       * Options object for this `ngModel` instance. You can configure the following properties:
       *
       * **name**: An alternative to setting the name attribute on the form control element.
       * Sometimes, especially with custom form components, the name attribute might be used
       * as an `@Input` property for a different purpose. In cases like these, you can configure
       * the `ngModel` name through this option.
       *
       * ```html
       * <form>
       *   <my-person-control name="Nancy" ngModel [ngModelOptions]="{name: 'user'}">
       *   </my-person-control>
       * </form>
       * <!-- form value: {user: ''} -->
       * ```
       *
       * **standalone**: Defaults to false. If this is set to true, the `ngModel` will not
       * register itself with its parent form, and will act as if it's not in the form. This
       * can be handy if you have form meta-controls, a.k.a. form elements nested in
       * the `<form>` tag that control the display of the form, but don't contain form data.
       *
       * ```html
       * <form>
       *   <input name="login" ngModel placeholder="Login">
       *   <input type="checkbox" ngModel [ngModelOptions]="{standalone: true}"> Show more options?
       * </form>
       * <!-- form value: {login: ''} -->
       * ```
       *
       * **updateOn**: Defaults to `'change'`. Defines the event upon which the form control
       * value and validity will update. Also accepts `'blur'` and `'submit'`.
       *
       * ```html
       * <input [(ngModel)]="firstName" [ngModelOptions]="{updateOn: 'blur'}">
       * ```
       *
       */
  var options: atAngularFormsLib.Anon_Standalone = js.native
  @JSName("path")
  val path_NgModel: js.Array[java.lang.String] = js.native
  var update: atAngularCoreLib.coreMod.EventEmitter[js.Object] = js.native
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

