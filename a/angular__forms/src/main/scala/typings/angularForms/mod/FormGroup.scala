package typings.angularForms.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularForms.anon.EmitEvent
import typings.angularForms.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "FormGroup")
@js.native
open class FormGroup[TControl /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof TControl ]: @angular/forms.@angular/forms.AbstractControl<any, any>} */ js.Any */] protected () extends AbstractControl[
      ɵTypedOrUntyped[TControl, ɵFormGroupValue[TControl], Any], 
      ɵTypedOrUntyped[TControl, ɵFormGroupRawValue[TControl], Any]
    ] {
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
  def this(controls: TControl) = this()
  def this(controls: TControl, validatorOrOpts: js.Array[ValidatorFn]) = this()
  def this(controls: TControl, validatorOrOpts: AbstractControlOptions) = this()
  def this(controls: TControl, validatorOrOpts: ValidatorFn) = this()
  def this(
    controls: TControl,
    validatorOrOpts: js.Array[ValidatorFn],
    asyncValidator: js.Array[AsyncValidatorFn]
  ) = this()
  def this(controls: TControl, validatorOrOpts: js.Array[ValidatorFn], asyncValidator: AsyncValidatorFn) = this()
  def this(controls: TControl, validatorOrOpts: Null, asyncValidator: js.Array[AsyncValidatorFn]) = this()
  def this(controls: TControl, validatorOrOpts: Null, asyncValidator: AsyncValidatorFn) = this()
  def this(controls: TControl, validatorOrOpts: Unit, asyncValidator: js.Array[AsyncValidatorFn]) = this()
  def this(controls: TControl, validatorOrOpts: Unit, asyncValidator: AsyncValidatorFn) = this()
  def this(
    controls: TControl,
    validatorOrOpts: AbstractControlOptions,
    asyncValidator: js.Array[AsyncValidatorFn]
  ) = this()
  def this(controls: TControl, validatorOrOpts: AbstractControlOptions, asyncValidator: AsyncValidatorFn) = this()
  def this(controls: TControl, validatorOrOpts: ValidatorFn, asyncValidator: js.Array[AsyncValidatorFn]) = this()
  def this(controls: TControl, validatorOrOpts: ValidatorFn, asyncValidator: AsyncValidatorFn) = this()
  
  /**
    * Add a control to this group. In a strongly-typed group, the control must be in the group's type
    * (possibly as an optional key).
    *
    * If a control with a given name already exists, it would *not* be replaced with a new one.
    * If you want to replace an existing control, use the {@link FormGroup#setControl setControl}
    * method instead. This method also updates the value and validity of the control.
    *
    * @param name The control name to add to the collection
    * @param control Provides the control for the given name
    * @param options Specifies whether this FormGroup instance should emit events after a new
    *     control is added.
    * * `emitEvent`: When true or not supplied (the default), both the `statusChanges` and
    * `valueChanges` observables emit events with the latest status and value when the control is
    * added. When false, no events are emitted.
    */
  def addControl(name: String, control: AbstractControl[Any, Any]): Unit = js.native
  def addControl(name: String, control: AbstractControl[Any, Any], options: `0`): Unit = js.native
  def addControl[K /* <: String */](
    name: K,
    control: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<TControl>[K] */ js.Any
  ): Unit = js.native
  def addControl[K /* <: String */](
    name: K,
    control: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<TControl>[K] */ js.Any,
    options: `0`
  ): Unit = js.native
  
  def contains(controlName: String): Boolean = js.native
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
  def contains[K /* <: String */](controlName: K): Boolean = js.native
  
  var controls: ɵTypedOrUntyped[TControl, TControl, StringDictionary[AbstractControl[Any, Any]]] = js.native
  
  def patchValue(value: ɵFormGroupValue[TControl], options: EmitEvent): Unit = js.native
  
  def registerControl(name: String, control: AbstractControl[Any, Any]): AbstractControl[Any, Any] = js.native
  /**
    * Registers a control with the group's list of controls. In a strongly-typed group, the control
    * must be in the group's type (possibly as an optional key).
    *
    * This method does not update the value or validity of the control.
    * Use {@link FormGroup#addControl addControl} instead.
    *
    * @param name The control name to register in the collection
    * @param control Provides the control for the given name
    */
  def registerControl[K /* <: String */](
    name: K,
    control: /* import warning: importer.ImportType#apply Failed type conversion: TControl[K] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: TControl[K] */ js.Any = js.native
  
  def removeControl(name: String): Unit = js.native
  def removeControl(name: String, options: `0`): Unit = js.native
  def removeControl[S /* <: String */](name: ɵOptionalKeys[TControl] & S): Unit = js.native
  def removeControl[S /* <: String */](name: ɵOptionalKeys[TControl] & S, options: `0`): Unit = js.native
  
  def reset(value: Unit, options: EmitEvent): Unit = js.native
  def reset(value: ɵTypedOrUntyped[TControl, ɵFormGroupValue[TControl], Any], options: EmitEvent): Unit = js.native
  
  def setControl(name: String, control: AbstractControl[Any, Any]): Unit = js.native
  def setControl(name: String, control: AbstractControl[Any, Any], options: `0`): Unit = js.native
  /**
    * Replace an existing control. In a strongly-typed group, the control must be in the group's type
    * (possibly as an optional key).
    *
    * If a control with a given name does not exist in this `FormGroup`, it will be added.
    *
    * @param name The control name to replace in the collection
    * @param control Provides the control for the given name
    * @param options Specifies whether this FormGroup instance should emit events after an
    *     existing control is replaced.
    * * `emitEvent`: When true or not supplied (the default), both the `statusChanges` and
    * `valueChanges` observables emit events with the latest status and value when the control is
    * replaced with a new one. When false, no events are emitted.
    */
  def setControl[K /* <: String */](
    name: K,
    control: /* import warning: importer.ImportType#apply Failed type conversion: TControl[K] */ js.Any
  ): Unit = js.native
  def setControl[K /* <: String */](
    name: K,
    control: /* import warning: importer.ImportType#apply Failed type conversion: TControl[K] */ js.Any,
    options: `0`
  ): Unit = js.native
  
  def setValue(value: ɵFormGroupRawValue[TControl], options: EmitEvent): Unit = js.native
}
