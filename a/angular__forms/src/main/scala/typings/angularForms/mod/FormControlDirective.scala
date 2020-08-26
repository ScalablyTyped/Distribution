package typings.angularForms.mod

import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.OnChanges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms", "FormControlDirective")
@js.native
class FormControlDirective protected ()
  extends NgControl
     with OnChanges {
  def this(
    validators: js.Array[Validator | ValidatorFn],
    asyncValidators: js.Array[AsyncValidator | AsyncValidatorFn],
    valueAccessors: js.Array[ControlValueAccessor]
  ) = this()
  def this(
    validators: js.Array[Validator | ValidatorFn],
    asyncValidators: js.Array[AsyncValidator | AsyncValidatorFn],
    valueAccessors: js.Array[ControlValueAccessor],
    _ngModelWarningConfig: String
  ) = this()
  var _isControlChanged: js.Any = js.native
  var _ngModelWarningConfig: js.Any = js.native
  /**
    * @description
    * Tracks the `FormControl` instance bound to the directive.
    */
  var form: FormControl = js.native
  /** @deprecated as of v6 */
  var model: js.Any = js.native
  /** @deprecated as of v6 */
  var update: EventEmitter[_] = js.native
  /**
    * @description
    * Internal reference to the view model value.
    */
  var viewModel: js.Any = js.native
  /**
    * @description
    * Triggers a warning that this input should not be used with reactive forms.
    */
  def isDisabled_=(isDisabled: Boolean): Unit = js.native
}

