package typings.angularForms.mod

import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.OnChanges
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.SimpleChanges
import typings.angularForms.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "NgModel")
@js.native
class NgModel protected ()
  extends NgControl
     with OnChanges
     with OnDestroy {
  def this(
    parent: ControlContainer,
    validators: js.Array[Validator | ValidatorFn],
    asyncValidators: js.Array[AsyncValidator | AsyncValidatorFn],
    valueAccessors: js.Array[ControlValueAccessor]
  ) = this()
  
  /* private */ var _checkForErrors: js.Any = js.native
  
  /* private */ var _checkName: js.Any = js.native
  
  /* private */ var _checkParentType: js.Any = js.native
  
  /* private */ var _isStandalone: js.Any = js.native
  
  /* private */ var _setUpControl: js.Any = js.native
  
  /* private */ var _setUpStandalone: js.Any = js.native
  
  /* private */ var _setUpdateStrategy: js.Any = js.native
  
  /* private */ var _updateDisabled: js.Any = js.native
  
  /* private */ var _updateValue: js.Any = js.native
  
  @JSName("control")
  val control_FNgModel: FormControl = js.native
  
  /**
    * @description
    * The top-level directive for this control if present, otherwise null.
    */
  def formDirective: js.Any = js.native
  
  /**
    * @description
    * Tracks whether the control is disabled.
    */
  var isDisabled: Boolean = js.native
  
  /**
    * @description
    * Tracks the value bound to this directive.
    */
  var model: js.Any = js.native
  
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
  var options: Name = js.native
  
  /**
    * @description
    * Event emitter for producing the `ngModelChange` event after
    * the view model updates.
    */
  var update: EventEmitter[js.Any] = js.native
  
  /**
    * Internal reference to the view model value.
    * @nodoc
    */
  var viewModel: js.Any = js.native
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
}
