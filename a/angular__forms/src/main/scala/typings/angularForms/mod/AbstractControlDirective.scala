package typings.angularForms.mod

import typings.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms", "AbstractControlDirective")
@js.native
abstract class AbstractControlDirective () extends js.Object {
  /**
    * @description
    * A reference to the underlying control.
    *
    * @returns the control that backs this directive. Most properties fall through to that instance.
    */
  val control: AbstractControl | Null = js.native
  /**
    * @description
    * Reports whether the control is dirty, meaning that the user has changed
    * the value in the UI. If the control is not present, null is returned.
    */
  val dirty: Boolean | Null = js.native
  /**
    * @description
    * Reports whether the control is disabled, meaning that the control is disabled
    * in the UI and is exempt from validation checks and excluded from aggregate
    * values of ancestor controls. If the control is not present, null is returned.
    */
  val disabled: Boolean | Null = js.native
  /**
    * @description
    * Reports whether the control is enabled, meaning that the control is included in ancestor
    * calculations of validity or value. If the control is not present, null is returned.
    */
  val enabled: Boolean | Null = js.native
  /**
    * @description
    * Reports the control's validation errors. If the control is not present, null is returned.
    */
  val errors: ValidationErrors | Null = js.native
  /**
    * @description
    * Reports whether the control is invalid, meaning that an error exists in the input value.
    * If the control is not present, null is returned.
    */
  val invalid: Boolean | Null = js.native
  /**
    * @description
    * Returns an array that represents the path from the top-level form to this control.
    * Each index is the string name of the control on that level.
    */
  val path: js.Array[String] | Null = js.native
  /**
    * @description
    * Reports whether a control is pending, meaning that that async validation is occurring and
    * errors are not yet available for the input value. If the control is not present, null is
    * returned.
    */
  val pending: Boolean | Null = js.native
  /**
    * @description
    * Reports whether the control is pristine, meaning that the user has not yet changed
    * the value in the UI. If the control is not present, null is returned.
    */
  val pristine: Boolean | Null = js.native
  /**
    * @description
    * Reports the validation status of the control. Possible values include:
    * 'VALID', 'INVALID', 'DISABLED', and 'PENDING'.
    * If the control is not present, null is returned.
    */
  val status: String | Null = js.native
  /**
    * @description
    * Returns a multicasting observable that emits a validation status whenever it is
    * calculated for the control. If the control is not present, null is returned.
    */
  val statusChanges: Observable_[_] | Null = js.native
  /**
    * @description
    * Reports whether the control is touched, meaning that the user has triggered
    * a `blur` event on it. If the control is not present, null is returned.
    */
  val touched: Boolean | Null = js.native
  /**
    * @description
    * Reports whether the control is untouched, meaning that the user has not yet triggered
    * a `blur` event on it. If the control is not present, null is returned.
    */
  val untouched: Boolean | Null = js.native
  /**
    * @description
    * Reports whether the control is valid. A control is considered valid if no
    * validation errors exist with the current value.
    * If the control is not present, null is returned.
    */
  val valid: Boolean | Null = js.native
  /**
    * @description
    * Reports the value of the control if it is present, otherwise null.
    */
  val value: js.Any = js.native
  /**
    * @description
    * Returns a multicasting observable of value changes for the control that emits every time the
    * value of the control changes in the UI or programmatically.
    * If the control is not present, null is returned.
    */
  val valueChanges: Observable_[_] | Null = js.native
  /**
    * @description
    * Reports error data for the control with the given path.
    *
    * @param errorCode The code of the error to check
    * @param path A list of control names that designates how to move from the current control
    * to the control that should be queried for errors.
    *
    * @usageNotes
    * For example, for the following `FormGroup`:
    *
    * ```
    * form = new FormGroup({
    *   address: new FormGroup({ street: new FormControl() })
    * });
    * ```
    *
    * The path to the 'street' control from the root form would be 'address' -> 'street'.
    *
    * It can be provided to this method in one of two formats:
    *
    * 1. An array of string control names, e.g. `['address', 'street']`
    * 1. A period-delimited list of control names in one string, e.g. `'address.street'`
    *
    * @returns error data for that particular error. If the control or error is not present,
    * null is returned.
    */
  def getError(errorCode: String): js.Any = js.native
  def getError(errorCode: String, path: String): js.Any = js.native
  def getError(errorCode: String, path: js.Array[String | Double]): js.Any = js.native
  /**
    * @description
    * Reports whether the control with the given path has the error specified.
    *
    * @param errorCode The code of the error to check
    * @param path A list of control names that designates how to move from the current control
    * to the control that should be queried for errors.
    *
    * @usageNotes
    * For example, for the following `FormGroup`:
    *
    * ```
    * form = new FormGroup({
    *   address: new FormGroup({ street: new FormControl() })
    * });
    * ```
    *
    * The path to the 'street' control from the root form would be 'address' -> 'street'.
    *
    * It can be provided to this method in one of two formats:
    *
    * 1. An array of string control names, e.g. `['address', 'street']`
    * 1. A period-delimited list of control names in one string, e.g. `'address.street'`
    *
    * If no path is given, this method checks for the error on the current control.
    *
    * @returns whether the given error is present in the control at the given path.
    *
    * If the control is not present, false is returned.
    */
  def hasError(errorCode: String): Boolean = js.native
  def hasError(errorCode: String, path: String): Boolean = js.native
  def hasError(errorCode: String, path: js.Array[String | Double]): Boolean = js.native
  /**
    * @description
    * Resets the control with the provided value if the control is present.
    */
  def reset(): Unit = js.native
  def reset(value: js.Any): Unit = js.native
}

