package typings.angularForms.mod

import typings.angularForms.anon.EmitEvent
import typings.angularForms.anon.OnlySelf
import typings.angularForms.anon.`0`
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@angular/forms", "AbstractControl")
@js.native
/**
  * Initialize the AbstractControl instance.
  *
  * @param validators The function or array of functions that is used to determine the validity of
  *     this control synchronously.
  * @param asyncValidators The function or array of functions that is used to determine validity of
  *     this control asynchronously.
  */
open class AbstractControl[TValue, TRawValue /* <: TValue */] () extends StObject {
  def this(validators: js.Array[ValidatorFn]) = this()
  def this(validators: ValidatorFn) = this()
  def this(validators: js.Array[ValidatorFn], asyncValidators: js.Array[AsyncValidatorFn]) = this()
  def this(validators: js.Array[ValidatorFn], asyncValidators: AsyncValidatorFn) = this()
  def this(validators: Null, asyncValidators: js.Array[AsyncValidatorFn]) = this()
  def this(validators: Null, asyncValidators: AsyncValidatorFn) = this()
  def this(validators: ValidatorFn, asyncValidators: js.Array[AsyncValidatorFn]) = this()
  def this(validators: ValidatorFn, asyncValidators: AsyncValidatorFn) = this()
  
  /* private */ var _asyncValidationSubscription: Any = js.native
  
  /* private */ var _calculateStatus: Any = js.native
  
  /* private */ var _cancelExistingSubscription: Any = js.native
  
  /* private */ var _parent: Any = js.native
  
  /* private */ var _runAsyncValidator: Any = js.native
  
  /* private */ var _runValidator: Any = js.native
  
  /* private */ var _setInitialStatus: Any = js.native
  
  /* private */ var _updateAncestors: Any = js.native
  
  def addAsyncValidators(validators: js.Array[AsyncValidatorFn]): Unit = js.native
  /**
    * Add an asynchronous validator or validators to this control, without affecting other
    * validators.
    *
    * When you add or remove a validator at run time, you must call
    * `updateValueAndValidity()` for the new validation to take effect.
    *
    * Adding a validator that already exists will have no effect.
    *
    * @param validators The new asynchronous validator function or functions to add to this control.
    */
  def addAsyncValidators(validators: AsyncValidatorFn): Unit = js.native
  
  def addValidators(validators: js.Array[ValidatorFn]): Unit = js.native
  /**
    * Add a synchronous validator or validators to this control, without affecting other validators.
    *
    * When you add or remove a validator at run time, you must call
    * `updateValueAndValidity()` for the new validation to take effect.
    *
    * Adding a validator that already exists will have no effect. If duplicate validator functions
    * are present in the `validators` array, only the first instance would be added to a form
    * control.
    *
    * @param validators The new validator function or functions to add to this control.
    */
  def addValidators(validators: ValidatorFn): Unit = js.native
  
  /**
    * Returns the function that is used to determine the validity of this control asynchronously.
    * If multiple validators have been added, this will be a single composed function.
    * See `Validators.compose()` for additional information.
    */
  def asyncValidator: AsyncValidatorFn | Null = js.native
  def asyncValidator_=(asyncValidatorFn: AsyncValidatorFn | Null): Unit = js.native
  
  /**
    * Empties out the async validator list.
    *
    * When you add or remove a validator at run time, you must call
    * `updateValueAndValidity()` for the new validation to take effect.
    *
    */
  def clearAsyncValidators(): Unit = js.native
  
  /**
    * Empties out the synchronous validator list.
    *
    * When you add or remove a validator at run time, you must call
    * `updateValueAndValidity()` for the new validation to take effect.
    *
    */
  def clearValidators(): Unit = js.native
  
  /**
    * A control is `dirty` if the user has changed the value
    * in the UI.
    *
    * @returns True if the user has changed the value of this control in the UI; compare `pristine`.
    * Programmatic changes to a control's value do not mark it dirty.
    */
  def dirty: Boolean = js.native
  
  /**
    * Disables the control. This means the control is exempt from validation checks and
    * excluded from the aggregate value of any parent. Its status is `DISABLED`.
    *
    * If the control has children, all children are also disabled.
    *
    * @see {@link AbstractControl.status}
    *
    * @param opts Configuration options that determine how the control propagates
    * changes and emits events after the control is disabled.
    * * `onlySelf`: When true, mark only this control. When false or not supplied,
    * marks all direct ancestors. Default is false.
    * * `emitEvent`: When true or not supplied (the default), both the `statusChanges` and
    * `valueChanges`
    * observables emit events with the latest status and value when the control is disabled.
    * When false, no events are emitted.
    */
  def disable(): Unit = js.native
  def disable(opts: EmitEvent): Unit = js.native
  
  /**
    * A control is `disabled` when its `status` is `DISABLED`.
    *
    * Disabled controls are exempt from validation checks and
    * are not included in the aggregate value of their ancestor
    * controls.
    *
    * @see {@link AbstractControl.status}
    *
    * @returns True if the control is disabled, false otherwise.
    */
  def disabled: Boolean = js.native
  
  /**
    * Enables the control. This means the control is included in validation checks and
    * the aggregate value of its parent. Its status recalculates based on its value and
    * its validators.
    *
    * By default, if the control has children, all children are enabled.
    *
    * @see {@link AbstractControl.status}
    *
    * @param opts Configure options that control how the control propagates changes and
    * emits events when marked as untouched
    * * `onlySelf`: When true, mark only this control. When false or not supplied,
    * marks all direct ancestors. Default is false.
    * * `emitEvent`: When true or not supplied (the default), both the `statusChanges` and
    * `valueChanges`
    * observables emit events with the latest status and value when the control is enabled.
    * When false, no events are emitted.
    */
  def enable(): Unit = js.native
  def enable(opts: EmitEvent): Unit = js.native
  
  /**
    * A control is `enabled` as long as its `status` is not `DISABLED`.
    *
    * @returns True if the control has any status other than 'DISABLED',
    * false if the status is 'DISABLED'.
    *
    * @see {@link AbstractControl.status}
    *
    */
  def enabled: Boolean = js.native
  
  /**
    * An object containing any errors generated by failing validation,
    * or null if there are no errors.
    */
  val errors: ValidationErrors | Null = js.native
  
  /**
    * Retrieves a child control given the control's name or path.
    *
    * This signature for get supports strings and `const` arrays (`.get(['foo', 'bar'] as const)`).
    */
  def get(path: String): (AbstractControl[ɵGetProperty[TRawValue, String], ɵGetProperty[TRawValue, String]]) | Null = js.native
  def get(path: js.Array[String | Double]): (AbstractControl[
    ɵGetProperty[TRawValue, js.Array[String | Double]], 
    ɵGetProperty[TRawValue, js.Array[String | Double]]
  ]) | Null = js.native
  
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
  def getError(errorCode: String): Any = js.native
  def getError(errorCode: String, path: String): Any = js.native
  def getError(errorCode: String, path: js.Array[String | Double]): Any = js.native
  
  /**
    * The raw value of this control. For most control implementations, the raw value will include
    * disabled children.
    */
  def getRawValue(): Any = js.native
  
  /**
    * Check whether an asynchronous validator function is present on this control. The provided
    * validator must be a reference to the exact same function that was provided.
    *
    * @param validator The asynchronous validator to check for presence. Compared by function
    *     reference.
    * @returns Whether the provided asynchronous validator was found on this control.
    */
  def hasAsyncValidator(validator: AsyncValidatorFn): Boolean = js.native
  
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
    * Check whether a synchronous validator function is present on this control. The provided
    * validator must be a reference to the exact same function that was provided.
    *
    * @usageNotes
    *
    * ### Reference to a ValidatorFn
    *
    * ```
    * // Reference to the RequiredValidator
    * const ctrl = new FormControl<number | null>(0, Validators.required);
    * expect(ctrl.hasValidator(Validators.required)).toEqual(true)
    *
    * // Reference to anonymous function inside MinValidator
    * const minValidator = Validators.min(3);
    * const ctrl = new FormControl<number | null>(0, minValidator);
    * expect(ctrl.hasValidator(minValidator)).toEqual(true)
    * expect(ctrl.hasValidator(Validators.min(3)).toEqual(false)
    * ```
    *
    * @param validator The validator to check for presence. Compared by function reference.
    * @returns Whether the provided validator was found on this control.
    */
  def hasValidator(validator: ValidatorFn): Boolean = js.native
  
  /**
    * A control is `invalid` when its `status` is `INVALID`.
    *
    * @see {@link AbstractControl.status}
    *
    * @returns True if this control has failed one or more of its validation checks,
    * false otherwise.
    */
  def invalid: Boolean = js.native
  
  /**
    * Marks the control and all its descendant controls as `touched`.
    * @see `markAsTouched()`
    */
  def markAllAsTouched(): Unit = js.native
  
  /**
    * Marks the control as `dirty`. A control becomes dirty when
    * the control's value is changed through the UI; compare `markAsTouched`.
    *
    * @see `markAsTouched()`
    * @see `markAsUntouched()`
    * @see `markAsPristine()`
    *
    * @param opts Configuration options that determine how the control propagates changes
    * and emits events after marking is applied.
    * * `onlySelf`: When true, mark only this control. When false or not supplied,
    * marks all direct ancestors. Default is false.
    */
  def markAsDirty(): Unit = js.native
  def markAsDirty(opts: OnlySelf): Unit = js.native
  
  /**
    * Marks the control as `pending`.
    *
    * A control is pending while the control performs async validation.
    *
    * @see {@link AbstractControl.status}
    *
    * @param opts Configuration options that determine how the control propagates changes and
    * emits events after marking is applied.
    * * `onlySelf`: When true, mark only this control. When false or not supplied,
    * marks all direct ancestors. Default is false.
    * * `emitEvent`: When true or not supplied (the default), the `statusChanges`
    * observable emits an event with the latest status the control is marked pending.
    * When false, no events are emitted.
    *
    */
  def markAsPending(): Unit = js.native
  def markAsPending(opts: EmitEvent): Unit = js.native
  
  /**
    * Marks the control as `pristine`.
    *
    * If the control has any children, marks all children as `pristine`,
    * and recalculates the `pristine` status of all parent
    * controls.
    *
    * @see `markAsTouched()`
    * @see `markAsUntouched()`
    * @see `markAsDirty()`
    *
    * @param opts Configuration options that determine how the control emits events after
    * marking is applied.
    * * `onlySelf`: When true, mark only this control. When false or not supplied,
    * marks all direct ancestors. Default is false.
    */
  def markAsPristine(): Unit = js.native
  def markAsPristine(opts: OnlySelf): Unit = js.native
  
  /**
    * Marks the control as `touched`. A control is touched by focus and
    * blur events that do not change the value.
    *
    * @see `markAsUntouched()`
    * @see `markAsDirty()`
    * @see `markAsPristine()`
    *
    * @param opts Configuration options that determine how the control propagates changes
    * and emits events after marking is applied.
    * * `onlySelf`: When true, mark only this control. When false or not supplied,
    * marks all direct ancestors. Default is false.
    */
  def markAsTouched(): Unit = js.native
  def markAsTouched(opts: OnlySelf): Unit = js.native
  
  /**
    * Marks the control as `untouched`.
    *
    * If the control has any children, also marks all children as `untouched`
    * and recalculates the `touched` status of all parent controls.
    *
    * @see `markAsTouched()`
    * @see `markAsDirty()`
    * @see `markAsPristine()`
    *
    * @param opts Configuration options that determine how the control propagates changes
    * and emits events after the marking is applied.
    * * `onlySelf`: When true, mark only this control. When false or not supplied,
    * marks all direct ancestors. Default is false.
    */
  def markAsUntouched(): Unit = js.native
  def markAsUntouched(opts: OnlySelf): Unit = js.native
  
  /**
    * The parent control.
    */
  def parent: FormGroup[Any] | FormArray[Any] | Null = js.native
  
  /**
    * Patches the value of the control. Abstract method (implemented in sub-classes).
    */
  def patchValue(value: TValue): Unit = js.native
  def patchValue(value: TValue, options: js.Object): Unit = js.native
  
  /**
    * A control is `pending` when its `status` is `PENDING`.
    *
    * @see {@link AbstractControl.status}
    *
    * @returns True if this control is in the process of conducting a validation check,
    * false otherwise.
    */
  def pending: Boolean = js.native
  
  /**
    * A control is `pristine` if the user has not yet changed
    * the value in the UI.
    *
    * @returns True if the user has not yet changed the value in the UI; compare `dirty`.
    * Programmatic changes to a control's value do not mark it dirty.
    */
  val pristine: Boolean = js.native
  
  def removeAsyncValidators(validators: js.Array[AsyncValidatorFn]): Unit = js.native
  /**
    * Remove an asynchronous validator from this control, without affecting other validators.
    * Validators are compared by function reference; you must pass a reference to the exact same
    * validator function as the one that was originally set. If a provided validator is not found, it
    * is ignored.
    *
    * When you add or remove a validator at run time, you must call
    * `updateValueAndValidity()` for the new validation to take effect.
    *
    * @param validators The asynchronous validator or validators to remove.
    */
  def removeAsyncValidators(validators: AsyncValidatorFn): Unit = js.native
  
  def removeValidators(validators: js.Array[ValidatorFn]): Unit = js.native
  /**
    * Remove a synchronous validator from this control, without affecting other validators.
    * Validators are compared by function reference; you must pass a reference to the exact same
    * validator function as the one that was originally set. If a provided validator is not found,
    * it is ignored.
    *
    * @usageNotes
    *
    * ### Reference to a ValidatorFn
    *
    * ```
    * // Reference to the RequiredValidator
    * const ctrl = new FormControl<string | null>('', Validators.required);
    * ctrl.removeValidators(Validators.required);
    *
    * // Reference to anonymous function inside MinValidator
    * const minValidator = Validators.min(3);
    * const ctrl = new FormControl<string | null>('', minValidator);
    * expect(ctrl.hasValidator(minValidator)).toEqual(true)
    * expect(ctrl.hasValidator(Validators.min(3)).toEqual(false)
    *
    * ctrl.removeValidators(minValidator);
    * ```
    *
    * When you add or remove a validator at run time, you must call
    * `updateValueAndValidity()` for the new validation to take effect.
    *
    * @param validators The validator or validators to remove.
    */
  def removeValidators(validators: ValidatorFn): Unit = js.native
  
  /**
    * Resets the control. Abstract method (implemented in sub-classes).
    */
  def reset(): Unit = js.native
  def reset(value: TValue): Unit = js.native
  def reset(value: TValue, options: js.Object): Unit = js.native
  def reset(value: Unit, options: js.Object): Unit = js.native
  
  /**
    * Retrieves the top-level ancestor of this control.
    */
  def root: AbstractControl[Any, Any] = js.native
  
  /**
    * Sets the asynchronous validators that are active on this control. Calling this
    * overwrites any existing asynchronous validators.
    *
    * When you add or remove a validator at run time, you must call
    * `updateValueAndValidity()` for the new validation to take effect.
    *
    * If you want to add a new validator without affecting existing ones, consider
    * using `addAsyncValidators()` method instead.
    */
  def setAsyncValidators(): Unit = js.native
  def setAsyncValidators(validators: js.Array[AsyncValidatorFn]): Unit = js.native
  def setAsyncValidators(validators: AsyncValidatorFn): Unit = js.native
  
  /**
    * Sets errors on a form control when running validations manually, rather than automatically.
    *
    * Calling `setErrors` also updates the validity of the parent control.
    *
    * @param opts Configuration options that determine how the control propagates
    * changes and emits events after the control errors are set.
    * * `emitEvent`: When true or not supplied (the default), the `statusChanges`
    * observable emits an event after the errors are set.
    *
    * @usageNotes
    *
    * ### Manually set the errors for a control
    *
    * ```
    * const login = new FormControl('someLogin');
    * login.setErrors({
    *   notUnique: true
    * });
    *
    * expect(login.valid).toEqual(false);
    * expect(login.errors).toEqual({ notUnique: true });
    *
    * login.setValue('someOtherLogin');
    *
    * expect(login.valid).toEqual(true);
    * ```
    */
  def setErrors(): Unit = js.native
  def setErrors(errors: Null, opts: `0`): Unit = js.native
  def setErrors(errors: ValidationErrors): Unit = js.native
  def setErrors(errors: ValidationErrors, opts: `0`): Unit = js.native
  
  /**
    * Sets the parent of the control
    *
    * @param parent The new parent.
    */
  def setParent(): Unit = js.native
  def setParent(parent: FormArray[Any]): Unit = js.native
  def setParent(parent: FormGroup[Any]): Unit = js.native
  
  /**
    * Sets the synchronous validators that are active on this control.  Calling
    * this overwrites any existing synchronous validators.
    *
    * When you add or remove a validator at run time, you must call
    * `updateValueAndValidity()` for the new validation to take effect.
    *
    * If you want to add a new validator without affecting existing ones, consider
    * using `addValidators()` method instead.
    */
  def setValidators(): Unit = js.native
  def setValidators(validators: js.Array[ValidatorFn]): Unit = js.native
  def setValidators(validators: ValidatorFn): Unit = js.native
  
  /**
    * Sets the value of the control. Abstract method (implemented in sub-classes).
    */
  def setValue(value: TRawValue): Unit = js.native
  def setValue(value: TRawValue, options: js.Object): Unit = js.native
  
  /**
    * The validation status of the control.
    *
    * @see `FormControlStatus`
    *
    * These status values are mutually exclusive, so a control cannot be
    * both valid AND invalid or invalid AND disabled.
    */
  val status: FormControlStatus = js.native
  
  /**
    * A multicasting observable that emits an event every time the validation `status` of the control
    * recalculates.
    *
    * @see `FormControlStatus`
    * @see {@link AbstractControl.status}
    *
    */
  val statusChanges: Observable_[FormControlStatus] = js.native
  
  /**
    * True if the control is marked as `touched`.
    *
    * A control is marked `touched` once the user has triggered
    * a `blur` event on it.
    */
  val touched: Boolean = js.native
  
  /**
    * True if the control has not been marked as touched
    *
    * A control is `untouched` if the user has not yet triggered
    * a `blur` event on it.
    */
  def untouched: Boolean = js.native
  
  /**
    * Reports the update strategy of the `AbstractControl` (meaning
    * the event on which the control updates itself).
    * Possible values: `'change'` | `'blur'` | `'submit'`
    * Default value: `'change'`
    */
  def updateOn: FormHooks = js.native
  
  /**
    * Recalculates the value and validation status of the control.
    *
    * By default, it also updates the value and validity of its ancestors.
    *
    * @param opts Configuration options determine how the control propagates changes and emits events
    * after updates and validity checks are applied.
    * * `onlySelf`: When true, only update this control. When false or not supplied,
    * update all direct ancestors. Default is false.
    * * `emitEvent`: When true or not supplied (the default), both the `statusChanges` and
    * `valueChanges`
    * observables emit events with the latest status and value when the control is updated.
    * When false, no events are emitted.
    */
  def updateValueAndValidity(): Unit = js.native
  def updateValueAndValidity(opts: EmitEvent): Unit = js.native
  
  /**
    * A control is `valid` when its `status` is `VALID`.
    *
    * @see {@link AbstractControl.status}
    *
    * @returns True if the control has passed all of its validation tests,
    * false otherwise.
    */
  def valid: Boolean = js.native
  
  /**
    * Returns the function that is used to determine the validity of this control synchronously.
    * If multiple validators have been added, this will be a single composed function.
    * See `Validators.compose()` for additional information.
    */
  def validator: ValidatorFn | Null = js.native
  def validator_=(validatorFn: ValidatorFn | Null): Unit = js.native
  
  /**
    * The current value of the control.
    *
    * * For a `FormControl`, the current value.
    * * For an enabled `FormGroup`, the values of enabled controls as an object
    * with a key-value pair for each member of the group.
    * * For a disabled `FormGroup`, the values of all controls as an object
    * with a key-value pair for each member of the group.
    * * For a `FormArray`, the values of enabled controls as an array.
    *
    */
  val value: TValue = js.native
  
  /**
    * A multicasting observable that emits an event every time the value of the control changes, in
    * the UI or programmatically. It also emits an event each time you call enable() or disable()
    * without passing along {emitEvent: false} as a function argument.
    */
  val valueChanges: Observable_[TValue] = js.native
}
