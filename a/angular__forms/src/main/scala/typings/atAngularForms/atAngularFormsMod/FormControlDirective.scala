package typings.atAngularForms.atAngularFormsMod

import typings.atAngularCore.atAngularCoreMod.EventEmitter
import typings.atAngularCore.atAngularCoreMod.OnChanges
import typings.atAngularCore.atAngularCoreMod.SimpleChanges
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
    * The `FormControl` bound to this directive.
    */
  @JSName("control")
  val control_FormControlDirective: FormControl = js.native
  /**
    * @description
    * Tracks the `FormControl` instance bound to the directive.
    */
  var form: FormControl = js.native
  /**
    * @description
    * Triggers a warning that this input should not be used with reactive forms.
    */
  var isDisabled: Boolean = js.native
  /** @deprecated as of v6 */
  var model: js.Any = js.native
  /**
    * @description
    * Returns an array that represents the path from the top-level form to this control.
    * Each index is the string name of the control on that level.
    */
  @JSName("path")
  val path_FormControlDirective: js.Array[String] = js.native
  /** @deprecated as of v6 */
  var update: EventEmitter[_] = js.native
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
  override def ngOnChanges(changes: SimpleChanges): Unit = js.native
}

