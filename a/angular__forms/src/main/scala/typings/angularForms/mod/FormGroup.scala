package typings.angularForms.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularForms.AnonEmitEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms", "FormGroup")
@js.native
class FormGroup protected () extends AbstractControl {
  /**
    * Creates a new `FormGroup` instance.
    *
    * @param controls A collection of child controls. The key for each child is the name
    * under which it is registered.
    *
    * @param validatorOrOpts A synchronous validator function, or an array of
    * such functions, or an `AbstractControlOptions` object that contains validation functions
    * and a validation trigger.
    *
    * @param asyncValidator A single async validator or array of async validator functions
    *
    */
  def this(controls: StringDictionary[AbstractControl]) = this()
  def this(controls: StringDictionary[AbstractControl], validatorOrOpts: js.Array[ValidatorFn]) = this()
  def this(controls: StringDictionary[AbstractControl], validatorOrOpts: AbstractControlOptions) = this()
  def this(controls: StringDictionary[AbstractControl], validatorOrOpts: ValidatorFn) = this()
  def this(
    controls: StringDictionary[AbstractControl],
    validatorOrOpts: js.Array[ValidatorFn],
    asyncValidator: js.Array[AsyncValidatorFn]
  ) = this()
  def this(
    controls: StringDictionary[AbstractControl],
    validatorOrOpts: js.Array[ValidatorFn],
    asyncValidator: AsyncValidatorFn
  ) = this()
  def this(
    controls: StringDictionary[AbstractControl],
    validatorOrOpts: Null,
    asyncValidator: js.Array[AsyncValidatorFn]
  ) = this()
  def this(
    controls: StringDictionary[AbstractControl],
    validatorOrOpts: Null,
    asyncValidator: AsyncValidatorFn
  ) = this()
  def this(
    controls: StringDictionary[AbstractControl],
    validatorOrOpts: AbstractControlOptions,
    asyncValidator: js.Array[AsyncValidatorFn]
  ) = this()
  def this(
    controls: StringDictionary[AbstractControl],
    validatorOrOpts: AbstractControlOptions,
    asyncValidator: AsyncValidatorFn
  ) = this()
  def this(
    controls: StringDictionary[AbstractControl],
    validatorOrOpts: ValidatorFn,
    asyncValidator: js.Array[AsyncValidatorFn]
  ) = this()
  def this(
    controls: StringDictionary[AbstractControl],
    validatorOrOpts: ValidatorFn,
    asyncValidator: AsyncValidatorFn
  ) = this()
  var controls: StringDictionary[AbstractControl] = js.native
  /**
    * Add a control to this group.
    *
    * This method also updates the value and validity of the control.
    *
    * @param name The control name to add to the collection
    * @param control Provides the control for the given name
    */
  def addControl(name: String, control: AbstractControl): Unit = js.native
  /**
    * Check whether there is an enabled control with the given name in the group.
    *
    * Reports false for disabled controls. If you'd like to check for existence in the group
    * only, use {@link AbstractControl#get get} instead.
    *
    * @param controlName The control name to check for existence in the collection
    *
    * @returns false for disabled controls, true otherwise.
    */
  def contains(controlName: String): Boolean = js.native
  /**
    * The aggregate value of the `FormGroup`, including any disabled controls.
    *
    * Retrieves all values regardless of disabled status.
    * The `value` property is the best way to get the value of the group, because
    * it excludes disabled controls in the `FormGroup`.
    */
  def getRawValue(): js.Any = js.native
  /**
    * Patches the value of the `FormGroup`. It accepts an object with control
    * names as keys, and does its best to match the values to the correct controls
    * in the group.
    *
    * It accepts both super-sets and sub-sets of the group without throwing an error.
    *
    * @usageNotes
    * ### Patch the value for a form group
    *
    * ```
    * const form = new FormGroup({
    *    first: new FormControl(),
    *    last: new FormControl()
    * });
    * console.log(form.value);   // {first: null, last: null}
    *
    * form.patchValue({first: 'Nancy'});
    * console.log(form.value);   // {first: 'Nancy', last: null}
    * ```
    *
    * @param value The object that matches the structure of the group.
    * @param options Configuration options that determine how the control propagates changes and
    * emits events after the value is patched.
    * * `onlySelf`: When true, each change only affects this control and not its parent. Default is
    * true.
    * * `emitEvent`: When true or not supplied (the default), both the `statusChanges` and
    * `valueChanges`
    * observables emit events with the latest status and value when the control value is updated.
    * When false, no events are emitted.
    * The configuration options are passed to the {@link AbstractControl#updateValueAndValidity
    * updateValueAndValidity} method.
    */
  def patchValue(value: StringDictionary[js.Any]): Unit = js.native
  def patchValue(value: StringDictionary[js.Any], options: AnonEmitEvent): Unit = js.native
  /**
    * Registers a control with the group's list of controls.
    *
    * This method does not update the value or validity of the control.
    * Use {@link FormGroup#addControl addControl} instead.
    *
    * @param name The control name to register in the collection
    * @param control Provides the control for the given name
    */
  def registerControl(name: String, control: AbstractControl): AbstractControl = js.native
  /**
    * Remove a control from this group.
    *
    * @param name The control name to remove from the collection
    */
  def removeControl(name: String): Unit = js.native
  def reset(value: js.Any, options: AnonEmitEvent): Unit = js.native
  /**
    * Replace an existing control.
    *
    * @param name The control name to replace in the collection
    * @param control Provides the control for the given name
    */
  def setControl(name: String, control: AbstractControl): Unit = js.native
  /**
    * Sets the value of the `FormGroup`. It accepts an object that matches
    * the structure of the group, with control names as keys.
    *
    * @usageNotes
    * ### Set the complete value for the form group
    *
    * ```
    * const form = new FormGroup({
    *   first: new FormControl(),
    *   last: new FormControl()
    * });
    *
    * console.log(form.value);   // {first: null, last: null}
    *
    * form.setValue({first: 'Nancy', last: 'Drew'});
    * console.log(form.value);   // {first: 'Nancy', last: 'Drew'}
    * ```
    *
    * @throws When strict checks fail, such as setting the value of a control
    * that doesn't exist or if you exclude a value of a control that does exist.
    *
    * @param value The new value for the control that matches the structure of the group.
    * @param options Configuration options that determine how the control propagates changes
    * and emits events after the value changes.
    * The configuration options are passed to the {@link AbstractControl#updateValueAndValidity
    * updateValueAndValidity} method.
    *
    * * `onlySelf`: When true, each change only affects this control, and not its parent. Default is
    * false.
    * * `emitEvent`: When true or not supplied (the default), both the `statusChanges` and
    * `valueChanges`
    * observables emit events with the latest status and value when the control value is updated.
    * When false, no events are emitted.
    */
  def setValue(value: StringDictionary[js.Any]): Unit = js.native
  def setValue(value: StringDictionary[js.Any], options: AnonEmitEvent): Unit = js.native
}

