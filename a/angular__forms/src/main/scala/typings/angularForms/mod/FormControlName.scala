package typings.angularForms.mod

import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.OnChanges
import typings.angularCore.mod.OnDestroy
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
  val control_FFormControlName: FormControl = js.native
  /** @deprecated as of v6 */
  var model: js.Any = js.native
  /** @deprecated as of v6 */
  var update: EventEmitter[_] = js.native
  /**
    * @description
    * The top-level directive for this group if present, otherwise null.
    */
  def formDirective: js.Any = js.native
  /**
    * @description
    * Triggers a warning that this input should not be used with reactive forms.
    */
  def isDisabled_=(isDisabled: Boolean): Unit = js.native
}

