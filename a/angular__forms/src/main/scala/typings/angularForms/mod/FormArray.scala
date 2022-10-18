package typings.angularForms.mod

import typings.angularForms.anon.EmitEvent
import typings.angularForms.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "FormArray")
@js.native
open class FormArray[TControl /* <: AbstractControl[Any, Any] */] protected () extends AbstractControl[
      ɵTypedOrUntyped[TControl, ɵFormArrayValue[TControl], Any], 
      ɵTypedOrUntyped[TControl, ɵFormArrayRawValue[TControl], Any]
    ] {
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
  def this(controls: js.Array[TControl]) = this()
  def this(controls: js.Array[TControl], validatorOrOpts: js.Array[ValidatorFn]) = this()
  def this(controls: js.Array[TControl], validatorOrOpts: AbstractControlOptions) = this()
  def this(controls: js.Array[TControl], validatorOrOpts: ValidatorFn) = this()
  def this(
    controls: js.Array[TControl],
    validatorOrOpts: js.Array[ValidatorFn],
    asyncValidator: js.Array[AsyncValidatorFn]
  ) = this()
  def this(
    controls: js.Array[TControl],
    validatorOrOpts: js.Array[ValidatorFn],
    asyncValidator: AsyncValidatorFn
  ) = this()
  def this(controls: js.Array[TControl], validatorOrOpts: Null, asyncValidator: js.Array[AsyncValidatorFn]) = this()
  def this(controls: js.Array[TControl], validatorOrOpts: Null, asyncValidator: AsyncValidatorFn) = this()
  def this(controls: js.Array[TControl], validatorOrOpts: Unit, asyncValidator: js.Array[AsyncValidatorFn]) = this()
  def this(controls: js.Array[TControl], validatorOrOpts: Unit, asyncValidator: AsyncValidatorFn) = this()
  def this(
    controls: js.Array[TControl],
    validatorOrOpts: AbstractControlOptions,
    asyncValidator: js.Array[AsyncValidatorFn]
  ) = this()
  def this(
    controls: js.Array[TControl],
    validatorOrOpts: AbstractControlOptions,
    asyncValidator: AsyncValidatorFn
  ) = this()
  def this(
    controls: js.Array[TControl],
    validatorOrOpts: ValidatorFn,
    asyncValidator: js.Array[AsyncValidatorFn]
  ) = this()
  def this(controls: js.Array[TControl], validatorOrOpts: ValidatorFn, asyncValidator: AsyncValidatorFn) = this()
  
  /* private */ var _registerControl: Any = js.native
  
  /**
    * Get the `AbstractControl` at the given `index` in the array.
    *
    * @param index Index in the array to retrieve the control. If `index` is negative, it will wrap
    *     around from the back, and if index is greatly negative (less than `-length`), the result is
    * undefined. This behavior is the same as `Array.at(index)`.
    */
  def at(index: Double): ɵTypedOrUntyped[TControl, TControl, AbstractControl[Any, Any]] = js.native
  
  /**
    * Remove all controls in the `FormArray`.
    *
    * @param options Specifies whether this FormArray instance should emit events after all
    *     controls are removed.
    * * `emitEvent`: When true or not supplied (the default), both the `statusChanges` and
    * `valueChanges` observables emit events with the latest status and value when all controls
    * in this FormArray instance are removed. When false, no events are emitted.
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
  def clear(options: `0`): Unit = js.native
  
  var controls: ɵTypedOrUntyped[TControl, js.Array[TControl], js.Array[AbstractControl[Any, Any]]] = js.native
  
  /**
    * Insert a new `AbstractControl` at the given `index` in the array.
    *
    * @param index Index in the array to insert the control. If `index` is negative, wraps around
    *     from the back. If `index` is greatly negative (less than `-length`), prepends to the array.
    * This behavior is the same as `Array.splice(index, 0, control)`.
    * @param control Form control to be inserted
    * @param options Specifies whether this FormArray instance should emit events after a new
    *     control is inserted.
    * * `emitEvent`: When true or not supplied (the default), both the `statusChanges` and
    * `valueChanges` observables emit events with the latest status and value when the control is
    * inserted. When false, no events are emitted.
    */
  def insert(index: Double, control: TControl): Unit = js.native
  def insert(index: Double, control: TControl, options: `0`): Unit = js.native
  
  /**
    * Length of the control array.
    */
  def length: Double = js.native
  
  def patchValue(value: ɵFormArrayValue[TControl], options: EmitEvent): Unit = js.native
  
  /**
    * Insert a new `AbstractControl` at the end of the array.
    *
    * @param control Form control to be inserted
    * @param options Specifies whether this FormArray instance should emit events after a new
    *     control is added.
    * * `emitEvent`: When true or not supplied (the default), both the `statusChanges` and
    * `valueChanges` observables emit events with the latest status and value when the control is
    * inserted. When false, no events are emitted.
    */
  def push(control: TControl): Unit = js.native
  def push(control: TControl, options: `0`): Unit = js.native
  
  /**
    * Remove the control at the given `index` in the array.
    *
    * @param index Index in the array to remove the control.  If `index` is negative, wraps around
    *     from the back. If `index` is greatly negative (less than `-length`), removes the first
    *     element. This behavior is the same as `Array.splice(index, 1)`.
    * @param options Specifies whether this FormArray instance should emit events after a
    *     control is removed.
    * * `emitEvent`: When true or not supplied (the default), both the `statusChanges` and
    * `valueChanges` observables emit events with the latest status and value when the control is
    * removed. When false, no events are emitted.
    */
  def removeAt(index: Double): Unit = js.native
  def removeAt(index: Double, options: `0`): Unit = js.native
  
  def reset(value: Unit, options: EmitEvent): Unit = js.native
  def reset(value: ɵTypedOrUntyped[TControl, ɵFormArrayValue[TControl], Any], options: EmitEvent): Unit = js.native
  
  /**
    * Replace an existing control.
    *
    * @param index Index in the array to replace the control. If `index` is negative, wraps around
    *     from the back. If `index` is greatly negative (less than `-length`), replaces the first
    *     element. This behavior is the same as `Array.splice(index, 1, control)`.
    * @param control The `AbstractControl` control to replace the existing control
    * @param options Specifies whether this FormArray instance should emit events after an
    *     existing control is replaced with a new one.
    * * `emitEvent`: When true or not supplied (the default), both the `statusChanges` and
    * `valueChanges` observables emit events with the latest status and value when the control is
    * replaced with a new one. When false, no events are emitted.
    */
  def setControl(index: Double, control: TControl): Unit = js.native
  def setControl(index: Double, control: TControl, options: `0`): Unit = js.native
  
  def setValue(value: ɵFormArrayRawValue[TControl], options: EmitEvent): Unit = js.native
}
