package typings.angularForms.mod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.OnChanges
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.SimpleChanges
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularForms.angularFormsBooleans.`false`
import typings.angularForms.angularFormsStrings.ngModel
import typings.angularForms.anon.HostOptional
import typings.angularForms.anon.Model
import typings.angularForms.anon.Optional
import typings.angularForms.anon.Self
import typings.angularForms.anon.Standalone
import typings.angularForms.anon.Update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "NgModel")
@js.native
open class NgModel protected ()
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
    _changeDetectorRef: ChangeDetectorRef
  ) = this()
  
  /* private */ var _changeDetectorRef: Any = js.native
  
  /* private */ var _checkForErrors: Any = js.native
  
  /* private */ var _checkName: Any = js.native
  
  /* private */ var _checkParentType: Any = js.native
  
  /* private */ var _getPath: Any = js.native
  
  /* private */ var _isStandalone: Any = js.native
  
  /* private */ var _setUpControl: Any = js.native
  
  /* private */ var _setUpStandalone: Any = js.native
  
  /* private */ var _setUpdateStrategy: Any = js.native
  
  /* private */ var _updateDisabled: Any = js.native
  
  /* private */ var _updateValue: Any = js.native
  
  @JSName("control")
  val control_FNgModel: FormControl[Any] = js.native
  
  /**
    * @description
    * The top-level directive for this control if present, otherwise null.
    */
  def formDirective: Any = js.native
  
  /**
    * @description
    * Tracks whether the control is disabled.
    */
  var isDisabled: Boolean = js.native
  
  /**
    * @description
    * Tracks the value bound to this directive.
    */
  var model: Any = js.native
  
  /**
    * @description
    * Tracks the name bound to the directive. If a parent form exists, it
    * uses this name as a key to retrieve this control's value.
    */
  @JSName("name")
  var name_NgModel: String = js.native
  
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
    * Tracks the configuration options for this `ngModel` instance.
    *
    * **name**: An alternative to setting the name attribute on the form control element. See
    * the [example](api/forms/NgModel#using-ngmodel-on-a-standalone-control) for using `NgModel`
    * as a standalone control.
    *
    * **standalone**: When set to true, the `ngModel` will not register itself with its parent form,
    * and acts as if it's not in the form. Defaults to false. If no parent form exists, this option
    * has no effect.
    *
    * **updateOn**: Defines the event upon which the form control value and validity update.
    * Defaults to 'change'. Possible values: `'change'` | `'blur'` | `'submit'`.
    *
    */
  var options: Standalone = js.native
  
  /**
    * @description
    * Event emitter for producing the `ngModelChange` event after
    * the view model updates.
    */
  var update: EventEmitter[Any] = js.native
  
  /**
    * Internal reference to the view model value.
    * @nodoc
    */
  var viewModel: Any = js.native
}
/* static members */
object NgModel {
  
  @JSImport("@angular/forms", "NgModel")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nodoc */
  @JSImport("@angular/forms", "NgModel.ngAcceptInputType_isDisabled")
  @js.native
  def ngAcceptInputType_isDisabled: Boolean | String = js.native
  inline def ngAcceptInputType_isDisabled_=(x: Boolean | String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngAcceptInputType_isDisabled")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/forms", "NgModel.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[NgModel, String, js.Array[ngModel], Model, Update, scala.Nothing, scala.Nothing, `false`] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[NgModel, String, js.Array[ngModel], Model, Update, scala.Nothing, scala.Nothing, `false`]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/forms", "NgModel.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[NgModel, js.Tuple5[HostOptional, Self, Self, Self, Optional]] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[NgModel, js.Tuple5[HostOptional, Self, Self, Self, Optional]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
