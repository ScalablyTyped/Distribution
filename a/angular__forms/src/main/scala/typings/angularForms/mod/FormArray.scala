package typings.angularForms.mod

import typings.angularForms.anon.EmitEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "FormArray")
@js.native
class FormArray protected () extends AbstractControl {
  /**
    * Creates a new `FormArray` instance.
    *
    * @param controls An array of child controls. Each child control is given an index
    * where it is registered.
    *
    * @param validatorOrOpts A synchronous validator function, or an array of
    * such functions, or an `AbstractControlOptions` object that contains validation functions
    * and a validation trigger.
    *
    * @param asyncValidator A single async validator or array of async validator functions
    *
    */
  def this(controls: js.Array[AbstractControl]) = this()
  def this(controls: js.Array[AbstractControl], validatorOrOpts: js.Array[ValidatorFn]) = this()
  def this(controls: js.Array[AbstractControl], validatorOrOpts: AbstractControlOptions) = this()
  def this(controls: js.Array[AbstractControl], validatorOrOpts: ValidatorFn) = this()
  def this(
    controls: js.Array[AbstractControl],
    validatorOrOpts: js.Array[ValidatorFn],
    asyncValidator: js.Array[AsyncValidatorFn]
  ) = this()
  def this(
    controls: js.Array[AbstractControl],
    validatorOrOpts: js.Array[ValidatorFn],
    asyncValidator: AsyncValidatorFn
  ) = this()
  def this(
    controls: js.Array[AbstractControl],
    validatorOrOpts: Null,
    asyncValidator: js.Array[AsyncValidatorFn]
  ) = this()
  def this(controls: js.Array[AbstractControl], validatorOrOpts: Null, asyncValidator: AsyncValidatorFn) = this()
  def this(
    controls: js.Array[AbstractControl],
    validatorOrOpts: Unit,
    asyncValidator: js.Array[AsyncValidatorFn]
  ) = this()
  def this(controls: js.Array[AbstractControl], validatorOrOpts: Unit, asyncValidator: AsyncValidatorFn) = this()
  def this(
    controls: js.Array[AbstractControl],
    validatorOrOpts: AbstractControlOptions,
    asyncValidator: js.Array[AsyncValidatorFn]
  ) = this()
  def this(
    controls: js.Array[AbstractControl],
    validatorOrOpts: AbstractControlOptions,
    asyncValidator: AsyncValidatorFn
  ) = this()
  def this(
    controls: js.Array[AbstractControl],
    validatorOrOpts: ValidatorFn,
    asyncValidator: js.Array[AsyncValidatorFn]
  ) = this()
  def this(
    controls: js.Array[AbstractControl],
    validatorOrOpts: ValidatorFn,
    asyncValidator: AsyncValidatorFn
  ) = this()
  
  var _registerControl: js.Any = js.native
  
  /**
    * Get the `AbstractControl` at the given `index` in the array.
    *
    * @param index Index in the array to retrieve the control
    */
  def at(index: Double): AbstractControl = js.native
  
  /**
    * Remove all controls in the `FormArray`.
    *
    * @usageNotes
    * ### Remove all elements from a FormArray
    *
    * ```ts
    * const arr = new FormArray([
    *    new FormControl(),
    *    new FormControl()
    * ]);
    * console.log(arr.length);  // 2
    *
    * arr.clear();
    * console.log(arr.length);  // 0
    * ```
    *
    * It's a simpler and more efficient alternative to removing all elements one by one:
    *
    * ```ts
    * const arr = new FormArray([
    *    new FormControl(),
    *    new FormControl()
    * ]);
    *
    * while (arr.length) {
    *    arr.removeAt(0);
    * }
    * ```
    */
  def clear(): Unit = js.native
  
  var controls: js.Array[AbstractControl] = js.native
  
  /**
    * The aggregate value of the array, including any disabled controls.
    *
    * Reports all values regardless of disabled status.
    * For enabled controls only, the `value` property is the best way to get the value of the array.
    */
  def getRawValue(): js.Array[js.Any] = js.native
  
  /**
    * Insert a new `AbstractControl` at the given `index` in the array.
    *
    * @param index Index in the array to insert the control
    * @param control Form control to be inserted
    */
  def insert(index: Double, control: AbstractControl): Unit = js.native
  
  /**
    * Length of the control array.
    */
  def length: Double = js.native
  
  /**
    * Patches the value of the `FormArray`. It accepts an array that matches the
    * structure of the control, and does its best to match the values to the correct
    * controls in the group.
    *
    * It accepts both super-sets and sub-sets of the array without throwing an error.
    *
    * @usageNotes
    * ### Patch the values for controls in a form array
    *
    * ```
    * const arr = new FormArray([
    *    new FormControl(),
    *    new FormControl()
    * ]);
    * console.log(arr.value);   // [null, null]
    *
    * arr.patchValue(['Nancy']);
    * console.log(arr.value);   // ['Nancy', null]
    * ```
    *
    * @param value Array of latest values for the controls
    * @param options Configure options that determine how the control propagates changes and
    * emits events after the value changes
    *
    * * `onlySelf`: When true, each change only affects this control, and not its parent. Default
    * is false.
    * * `emitEvent`: When true or not supplied (the default), both the `statusChanges` and
    * `valueChanges`
    * observables emit events with the latest status and value when the control value is updated.
    * When false, no events are emitted.
    * The configuration options are passed to the {@link AbstractControl#updateValueAndValidity
    * updateValueAndValidity} method.
    */
  def patchValue(value: js.Array[js.Any]): Unit = js.native
  def patchValue(value: js.Array[js.Any], options: EmitEvent): Unit = js.native
  
  /**
    * Insert a new `AbstractControl` at the end of the array.
    *
    * @param control Form control to be inserted
    */
  def push(control: AbstractControl): Unit = js.native
  
  /**
    * Remove the control at the given `index` in the array.
    *
    * @param index Index in the array to remove the control
    */
  def removeAt(index: Double): Unit = js.native
  
  def reset(value: js.Any, options: EmitEvent): Unit = js.native
  def reset(value: Unit, options: EmitEvent): Unit = js.native
  
  /**
    * Replace an existing control.
    *
    * @param index Index in the array to replace the control
    * @param control The `AbstractControl` control to replace the existing control
    */
  def setControl(index: Double, control: AbstractControl): Unit = js.native
  
  /**
    * Sets the value of the `FormArray`. It accepts an array that matches
    * the structure of the control.
    *
    * This method performs strict checks, and throws an error if you try
    * to set the value of a control that doesn't exist or if you exclude the
    * value of a control.
    *
    * @usageNotes
    * ### Set the values for the controls in the form array
    *
    * ```
    * const arr = new FormArray([
    *   new FormControl(),
    *   new FormControl()
    * ]);
    * console.log(arr.value);   // [null, null]
    *
    * arr.setValue(['Nancy', 'Drew']);
    * console.log(arr.value);   // ['Nancy', 'Drew']
    * ```
    *
    * @param value Array of values for the controls
    * @param options Configure options that determine how the control propagates changes and
    * emits events after the value changes
    *
    * * `onlySelf`: When true, each change only affects this control, and not its parent. Default
    * is false.
    * * `emitEvent`: When true or not supplied (the default), both the `statusChanges` and
    * `valueChanges`
    * observables emit events with the latest status and value when the control value is updated.
    * When false, no events are emitted.
    * The configuration options are passed to the {@link AbstractControl#updateValueAndValidity
    * updateValueAndValidity} method.
    */
  def setValue(value: js.Array[js.Any]): Unit = js.native
  def setValue(value: js.Array[js.Any], options: EmitEvent): Unit = js.native
}
