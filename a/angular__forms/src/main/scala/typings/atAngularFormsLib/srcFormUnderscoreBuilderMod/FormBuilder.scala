package typings
package atAngularFormsLib.srcFormUnderscoreBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms/src/form_builder", "FormBuilder")
@js.native
class FormBuilder () extends js.Object {
  /**
       * @description
       * Construct a new `FormArray` instance.
       *
       * @param controlsConfig An array of child controls. The key for each child control is its index
       * in the array.
       *
       * @param validator A synchronous validator function, or an array of synchronous validator
       * functions.
       *
       * @param asyncValidator A single async validator or array of async validator functions
       */
  def array(controlsConfig: js.Array[_]): atAngularFormsLib.srcModelMod.FormArray = js.native
  /**
       * @description
       * Construct a new `FormArray` instance.
       *
       * @param controlsConfig An array of child controls. The key for each child control is its index
       * in the array.
       *
       * @param validator A synchronous validator function, or an array of synchronous validator
       * functions.
       *
       * @param asyncValidator A single async validator or array of async validator functions
       */
  def array(controlsConfig: js.Array[_], validator: atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn): atAngularFormsLib.srcModelMod.FormArray = js.native
  /**
       * @description
       * Construct a new `FormArray` instance.
       *
       * @param controlsConfig An array of child controls. The key for each child control is its index
       * in the array.
       *
       * @param validator A synchronous validator function, or an array of synchronous validator
       * functions.
       *
       * @param asyncValidator A single async validator or array of async validator functions
       */
  def array(
    controlsConfig: js.Array[_],
    validator: atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn,
    asyncValidator: atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn
  ): atAngularFormsLib.srcModelMod.FormArray = js.native
  /**
       * @description
       * Construct a new `FormArray` instance.
       *
       * @param controlsConfig An array of child controls. The key for each child control is its index
       * in the array.
       *
       * @param validator A synchronous validator function, or an array of synchronous validator
       * functions.
       *
       * @param asyncValidator A single async validator or array of async validator functions
       */
  def array(
    controlsConfig: js.Array[_],
    validator: atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn,
    asyncValidator: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn]
  ): atAngularFormsLib.srcModelMod.FormArray = js.native
  /**
       * @description
       * Construct a new `FormArray` instance.
       *
       * @param controlsConfig An array of child controls. The key for each child control is its index
       * in the array.
       *
       * @param validator A synchronous validator function, or an array of synchronous validator
       * functions.
       *
       * @param asyncValidator A single async validator or array of async validator functions
       */
  def array(
    controlsConfig: js.Array[_],
    validator: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn]
  ): atAngularFormsLib.srcModelMod.FormArray = js.native
  /**
       * @description
       * Construct a new `FormArray` instance.
       *
       * @param controlsConfig An array of child controls. The key for each child control is its index
       * in the array.
       *
       * @param validator A synchronous validator function, or an array of synchronous validator
       * functions.
       *
       * @param asyncValidator A single async validator or array of async validator functions
       */
  def array(
    controlsConfig: js.Array[_],
    validator: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn],
    asyncValidator: atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn
  ): atAngularFormsLib.srcModelMod.FormArray = js.native
  /**
       * @description
       * Construct a new `FormArray` instance.
       *
       * @param controlsConfig An array of child controls. The key for each child control is its index
       * in the array.
       *
       * @param validator A synchronous validator function, or an array of synchronous validator
       * functions.
       *
       * @param asyncValidator A single async validator or array of async validator functions
       */
  def array(
    controlsConfig: js.Array[_],
    validator: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn],
    asyncValidator: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn]
  ): atAngularFormsLib.srcModelMod.FormArray = js.native
  /**
       * @description
       * Construct a new `FormArray` instance.
       *
       * @param controlsConfig An array of child controls. The key for each child control is its index
       * in the array.
       *
       * @param validator A synchronous validator function, or an array of synchronous validator
       * functions.
       *
       * @param asyncValidator A single async validator or array of async validator functions
       */
  def array(
    controlsConfig: js.Array[_],
    validator: scala.Null,
    asyncValidator: atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn
  ): atAngularFormsLib.srcModelMod.FormArray = js.native
  /**
       * @description
       * Construct a new `FormArray` instance.
       *
       * @param controlsConfig An array of child controls. The key for each child control is its index
       * in the array.
       *
       * @param validator A synchronous validator function, or an array of synchronous validator
       * functions.
       *
       * @param asyncValidator A single async validator or array of async validator functions
       */
  def array(
    controlsConfig: js.Array[_],
    validator: scala.Null,
    asyncValidator: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn]
  ): atAngularFormsLib.srcModelMod.FormArray = js.native
  /**
       * @description
       * Construct a new `FormControl` instance.
       *
       * @param formState Initializes the control with an initial value,
       * or an object that defines the initial value and disabled state.
       *
       * @param validator A synchronous validator function, or an array of synchronous validator
       * functions.
       *
       * @param asyncValidator A single async validator or array of async validator functions
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
       *
       */
  def control(formState: js.Any): atAngularFormsLib.srcModelMod.FormControl = js.native
  /**
       * @description
       * Construct a new `FormControl` instance.
       *
       * @param formState Initializes the control with an initial value,
       * or an object that defines the initial value and disabled state.
       *
       * @param validator A synchronous validator function, or an array of synchronous validator
       * functions.
       *
       * @param asyncValidator A single async validator or array of async validator functions
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
       *
       */
  def control(formState: js.Any, validator: atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn): atAngularFormsLib.srcModelMod.FormControl = js.native
  /**
       * @description
       * Construct a new `FormControl` instance.
       *
       * @param formState Initializes the control with an initial value,
       * or an object that defines the initial value and disabled state.
       *
       * @param validator A synchronous validator function, or an array of synchronous validator
       * functions.
       *
       * @param asyncValidator A single async validator or array of async validator functions
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
       *
       */
  def control(
    formState: js.Any,
    validator: atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn,
    asyncValidator: atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn
  ): atAngularFormsLib.srcModelMod.FormControl = js.native
  /**
       * @description
       * Construct a new `FormControl` instance.
       *
       * @param formState Initializes the control with an initial value,
       * or an object that defines the initial value and disabled state.
       *
       * @param validator A synchronous validator function, or an array of synchronous validator
       * functions.
       *
       * @param asyncValidator A single async validator or array of async validator functions
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
       *
       */
  def control(
    formState: js.Any,
    validator: atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn,
    asyncValidator: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn]
  ): atAngularFormsLib.srcModelMod.FormControl = js.native
  /**
       * @description
       * Construct a new `FormControl` instance.
       *
       * @param formState Initializes the control with an initial value,
       * or an object that defines the initial value and disabled state.
       *
       * @param validator A synchronous validator function, or an array of synchronous validator
       * functions.
       *
       * @param asyncValidator A single async validator or array of async validator functions
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
       *
       */
  def control(formState: js.Any, validator: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn]): atAngularFormsLib.srcModelMod.FormControl = js.native
  /**
       * @description
       * Construct a new `FormControl` instance.
       *
       * @param formState Initializes the control with an initial value,
       * or an object that defines the initial value and disabled state.
       *
       * @param validator A synchronous validator function, or an array of synchronous validator
       * functions.
       *
       * @param asyncValidator A single async validator or array of async validator functions
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
       *
       */
  def control(
    formState: js.Any,
    validator: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn],
    asyncValidator: atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn
  ): atAngularFormsLib.srcModelMod.FormControl = js.native
  /**
       * @description
       * Construct a new `FormControl` instance.
       *
       * @param formState Initializes the control with an initial value,
       * or an object that defines the initial value and disabled state.
       *
       * @param validator A synchronous validator function, or an array of synchronous validator
       * functions.
       *
       * @param asyncValidator A single async validator or array of async validator functions
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
       *
       */
  def control(
    formState: js.Any,
    validator: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn],
    asyncValidator: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn]
  ): atAngularFormsLib.srcModelMod.FormControl = js.native
  /**
       * @description
       * Construct a new `FormControl` instance.
       *
       * @param formState Initializes the control with an initial value,
       * or an object that defines the initial value and disabled state.
       *
       * @param validator A synchronous validator function, or an array of synchronous validator
       * functions.
       *
       * @param asyncValidator A single async validator or array of async validator functions
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
       *
       */
  def control(
    formState: js.Any,
    validator: scala.Null,
    asyncValidator: atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn
  ): atAngularFormsLib.srcModelMod.FormControl = js.native
  /**
       * @description
       * Construct a new `FormControl` instance.
       *
       * @param formState Initializes the control with an initial value,
       * or an object that defines the initial value and disabled state.
       *
       * @param validator A synchronous validator function, or an array of synchronous validator
       * functions.
       *
       * @param asyncValidator A single async validator or array of async validator functions
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
       *
       */
  def control(
    formState: js.Any,
    validator: scala.Null,
    asyncValidator: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn]
  ): atAngularFormsLib.srcModelMod.FormControl = js.native
  /**
       * @description
       * Construct a new `FormGroup` instance.
       *
       * @param controlsConfig A collection of child controls. The key for each child is the name
       * under which it is registered.
       *
       * @param extra An object of configuration options for the `FormGroup`.
       * * `validator`: A synchronous validator function, or an array of validator functions
       * * `asyncValidator`: A single async validator or array of async validator functions
       *
       */
  def group(controlsConfig: ScalablyTyped.runtime.StringDictionary[js.Any]): atAngularFormsLib.srcModelMod.FormGroup = js.native
  /**
       * @description
       * Construct a new `FormGroup` instance.
       *
       * @param controlsConfig A collection of child controls. The key for each child is the name
       * under which it is registered.
       *
       * @param extra An object of configuration options for the `FormGroup`.
       * * `validator`: A synchronous validator function, or an array of validator functions
       * * `asyncValidator`: A single async validator or array of async validator functions
       *
       */
  def group(
    controlsConfig: ScalablyTyped.runtime.StringDictionary[js.Any],
    extra: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): atAngularFormsLib.srcModelMod.FormGroup = js.native
}

