package typings
package atAngularFormsLib.srcFormUnderscoreBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms/src/form_builder", "FormBuilder")
@js.native
class FormBuilder () extends js.Object {
  /**
    * Constructs a new `FormArray` from the given array of configurations,
    * validators and options.
    *
    * @param controlsConfig An array of child controls or control configs. Each
    * child control is given an index when it is registered.
    *
    * @param validatorOrOpts A synchronous validator function, or an array of
    * such functions, or an `AbstractControlOptions` object that contains
    * validation functions and a validation trigger.
    *
    * @param asyncValidator A single async validator or array of async validator
    * functions.
    */
  def array(controlsConfig: js.Array[_]): atAngularFormsLib.srcModelMod.FormArray = js.native
  def array(
    controlsConfig: js.Array[_],
    validatorOrOpts: atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn
  ): atAngularFormsLib.srcModelMod.FormArray = js.native
  def array(
    controlsConfig: js.Array[_],
    validatorOrOpts: atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn,
    asyncValidator: atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn
  ): atAngularFormsLib.srcModelMod.FormArray = js.native
  def array(
    controlsConfig: js.Array[_],
    validatorOrOpts: atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn,
    asyncValidator: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn]
  ): atAngularFormsLib.srcModelMod.FormArray = js.native
  def array(controlsConfig: js.Array[_], validatorOrOpts: atAngularFormsLib.srcModelMod.AbstractControlOptions): atAngularFormsLib.srcModelMod.FormArray = js.native
  def array(
    controlsConfig: js.Array[_],
    validatorOrOpts: atAngularFormsLib.srcModelMod.AbstractControlOptions,
    asyncValidator: atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn
  ): atAngularFormsLib.srcModelMod.FormArray = js.native
  def array(
    controlsConfig: js.Array[_],
    validatorOrOpts: atAngularFormsLib.srcModelMod.AbstractControlOptions,
    asyncValidator: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn]
  ): atAngularFormsLib.srcModelMod.FormArray = js.native
  def array(
    controlsConfig: js.Array[_],
    validatorOrOpts: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn]
  ): atAngularFormsLib.srcModelMod.FormArray = js.native
  def array(
    controlsConfig: js.Array[_],
    validatorOrOpts: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn],
    asyncValidator: atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn
  ): atAngularFormsLib.srcModelMod.FormArray = js.native
  def array(
    controlsConfig: js.Array[_],
    validatorOrOpts: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn],
    asyncValidator: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn]
  ): atAngularFormsLib.srcModelMod.FormArray = js.native
  def array(
    controlsConfig: js.Array[_],
    validatorOrOpts: scala.Null,
    asyncValidator: atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn
  ): atAngularFormsLib.srcModelMod.FormArray = js.native
  def array(
    controlsConfig: js.Array[_],
    validatorOrOpts: scala.Null,
    asyncValidator: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn]
  ): atAngularFormsLib.srcModelMod.FormArray = js.native
  /**
    * @description
    * Construct a new `FormControl` with the given state, validators and options.
    *
    * @param formState Initializes the control with an initial state value, or
    * with an object that contains both a value and a disabled status.
    *
    * @param validatorOrOpts A synchronous validator function, or an array of
    * such functions, or an `AbstractControlOptions` object that contains
    * validation functions and a validation trigger.
    *
    * @param asyncValidator A single async validator or array of async validator
    * functions.
    *
    * @usageNotes
    *
    * ### Initialize a control as disabled
    *
    * The following example returns a control with an initial value in a disabled state.
    *
    * <code-example path="forms/ts/formBuilder/form_builder_example.ts"
    *   linenums="false" region="disabled-control">
    * </code-example>
    */
  def control(formState: js.Any): atAngularFormsLib.srcModelMod.FormControl = js.native
  def control(formState: js.Any, validatorOrOpts: atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn): atAngularFormsLib.srcModelMod.FormControl = js.native
  def control(
    formState: js.Any,
    validatorOrOpts: atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn,
    asyncValidator: atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn
  ): atAngularFormsLib.srcModelMod.FormControl = js.native
  def control(
    formState: js.Any,
    validatorOrOpts: atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn,
    asyncValidator: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn]
  ): atAngularFormsLib.srcModelMod.FormControl = js.native
  def control(formState: js.Any, validatorOrOpts: atAngularFormsLib.srcModelMod.AbstractControlOptions): atAngularFormsLib.srcModelMod.FormControl = js.native
  def control(
    formState: js.Any,
    validatorOrOpts: atAngularFormsLib.srcModelMod.AbstractControlOptions,
    asyncValidator: atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn
  ): atAngularFormsLib.srcModelMod.FormControl = js.native
  def control(
    formState: js.Any,
    validatorOrOpts: atAngularFormsLib.srcModelMod.AbstractControlOptions,
    asyncValidator: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn]
  ): atAngularFormsLib.srcModelMod.FormControl = js.native
  def control(
    formState: js.Any,
    validatorOrOpts: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn]
  ): atAngularFormsLib.srcModelMod.FormControl = js.native
  def control(
    formState: js.Any,
    validatorOrOpts: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn],
    asyncValidator: atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn
  ): atAngularFormsLib.srcModelMod.FormControl = js.native
  def control(
    formState: js.Any,
    validatorOrOpts: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn],
    asyncValidator: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn]
  ): atAngularFormsLib.srcModelMod.FormControl = js.native
  def control(
    formState: js.Any,
    validatorOrOpts: scala.Null,
    asyncValidator: atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn
  ): atAngularFormsLib.srcModelMod.FormControl = js.native
  def control(
    formState: js.Any,
    validatorOrOpts: scala.Null,
    asyncValidator: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn]
  ): atAngularFormsLib.srcModelMod.FormControl = js.native
  /**
    * @description
    * Construct a new `FormGroup` instance.
    *
    * @param controlsConfig A collection of child controls. The key for each child is the name
    * under which it is registered.
    *
    * @param legacyOrOpts Configuration options object for the `FormGroup`. The object can
    * have two shapes:
    *
    * 1) `AbstractControlOptions` object (preferred), which consists of:
    * * `validators`: A synchronous validator function, or an array of validator functions
    * * `asyncValidators`: A single async validator or array of async validator functions
    * * `updateOn`: The event upon which the control should be updated (options: 'change' | 'blur' |
    * submit')
    *
    * 2) Legacy configuration object, which consists of:
    * * `validator`: A synchronous validator function, or an array of validator functions
    * * `asyncValidator`: A single async validator or array of async validator functions
    *
    */
  def group(controlsConfig: org.scalablytyped.runtime.StringDictionary[js.Any]): atAngularFormsLib.srcModelMod.FormGroup = js.native
  def group(
    controlsConfig: org.scalablytyped.runtime.StringDictionary[js.Any],
    legacyOrOpts: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): atAngularFormsLib.srcModelMod.FormGroup = js.native
}

