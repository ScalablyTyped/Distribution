package typings.angularForms.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularForms.anon.EmitEvent
import typings.angularForms.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "FormRecord")
@js.native
open class FormRecord[TControl /* <: AbstractControl[Any, Any] */] protected () extends FormGroup[StringDictionary[TControl]] {
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
  def this(controls: StringDictionary[TControl]) = this()
  def this(controls: StringDictionary[TControl], validatorOrOpts: js.Array[ValidatorFn]) = this()
  def this(controls: StringDictionary[TControl], validatorOrOpts: AbstractControlOptions) = this()
  def this(controls: StringDictionary[TControl], validatorOrOpts: ValidatorFn) = this()
  def this(
    controls: StringDictionary[TControl],
    validatorOrOpts: js.Array[ValidatorFn],
    asyncValidator: js.Array[AsyncValidatorFn]
  ) = this()
  def this(
    controls: StringDictionary[TControl],
    validatorOrOpts: js.Array[ValidatorFn],
    asyncValidator: AsyncValidatorFn
  ) = this()
  def this(
    controls: StringDictionary[TControl],
    validatorOrOpts: Null,
    asyncValidator: js.Array[AsyncValidatorFn]
  ) = this()
  def this(controls: StringDictionary[TControl], validatorOrOpts: Null, asyncValidator: AsyncValidatorFn) = this()
  def this(
    controls: StringDictionary[TControl],
    validatorOrOpts: Unit,
    asyncValidator: js.Array[AsyncValidatorFn]
  ) = this()
  def this(controls: StringDictionary[TControl], validatorOrOpts: Unit, asyncValidator: AsyncValidatorFn) = this()
  def this(
    controls: StringDictionary[TControl],
    validatorOrOpts: AbstractControlOptions,
    asyncValidator: js.Array[AsyncValidatorFn]
  ) = this()
  def this(
    controls: StringDictionary[TControl],
    validatorOrOpts: AbstractControlOptions,
    asyncValidator: AsyncValidatorFn
  ) = this()
  def this(
    controls: StringDictionary[TControl],
    validatorOrOpts: ValidatorFn,
    asyncValidator: js.Array[AsyncValidatorFn]
  ) = this()
  def this(
    controls: StringDictionary[TControl],
    validatorOrOpts: ValidatorFn,
    asyncValidator: AsyncValidatorFn
  ) = this()
  
  /**
    * Add a control to this group.
    *
    * See `FormGroup#addControl` for additional information.
    */
  def addControl(name: String, control: TControl): Unit = js.native
  def addControl(name: String, control: TControl, options: `0`): Unit = js.native
  
  /**
    * Registers a control with the records's list of controls.
    *
    * See `FormGroup#registerControl` for additional information.
    */
  def registerControl(name: String, control: TControl): TControl = js.native
  
  def reset(value: StringDictionary[ɵValue[TControl]]): Unit = js.native
  def reset(value: StringDictionary[ɵValue[TControl]], options: EmitEvent): Unit = js.native
  
  /**
    * Replace an existing control.
    *
    * See `FormGroup#setControl` for additional information.
    */
  def setControl(name: String, control: TControl): Unit = js.native
  def setControl(name: String, control: TControl, options: `0`): Unit = js.native
}
