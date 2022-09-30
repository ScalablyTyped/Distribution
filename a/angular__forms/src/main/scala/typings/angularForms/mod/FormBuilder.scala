package typings.angularForms.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import typings.angularForms.anon.FormControlOptionsinitial
import typings.angularForms.anon.FormControlOptionsnonNull
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "FormBuilder")
@js.native
open class FormBuilder () extends StObject {
  
  /**
    * Constructs a new `FormArray` from the given array of configurations,
    * validators and options. Accepts a single generic argument, which is the type of each control
    * inside the array.
    *
    * @param controls An array of child controls or control configs. Each child control is given an
    *     index when it is registered.
    *
    * @param validatorOrOpts A synchronous validator function, or an array of such functions, or an
    *     `AbstractControlOptions` object that contains
    * validation functions and a validation trigger.
    *
    * @param asyncValidator A single async validator or array of async validator functions.
    */
  def array[T](controls: js.Array[T]): FormArray[ɵElement[T, Null]] = js.native
  def array[T](controls: js.Array[T], validatorOrOpts: js.Array[ValidatorFn]): FormArray[ɵElement[T, Null]] = js.native
  def array[T](
    controls: js.Array[T],
    validatorOrOpts: js.Array[ValidatorFn],
    asyncValidator: js.Array[AsyncValidatorFn]
  ): FormArray[ɵElement[T, Null]] = js.native
  def array[T](controls: js.Array[T], validatorOrOpts: js.Array[ValidatorFn], asyncValidator: AsyncValidatorFn): FormArray[ɵElement[T, Null]] = js.native
  def array[T](controls: js.Array[T], validatorOrOpts: Null, asyncValidator: js.Array[AsyncValidatorFn]): FormArray[ɵElement[T, Null]] = js.native
  def array[T](controls: js.Array[T], validatorOrOpts: Null, asyncValidator: AsyncValidatorFn): FormArray[ɵElement[T, Null]] = js.native
  def array[T](controls: js.Array[T], validatorOrOpts: Unit, asyncValidator: js.Array[AsyncValidatorFn]): FormArray[ɵElement[T, Null]] = js.native
  def array[T](controls: js.Array[T], validatorOrOpts: Unit, asyncValidator: AsyncValidatorFn): FormArray[ɵElement[T, Null]] = js.native
  def array[T](controls: js.Array[T], validatorOrOpts: AbstractControlOptions): FormArray[ɵElement[T, Null]] = js.native
  def array[T](
    controls: js.Array[T],
    validatorOrOpts: AbstractControlOptions,
    asyncValidator: js.Array[AsyncValidatorFn]
  ): FormArray[ɵElement[T, Null]] = js.native
  def array[T](controls: js.Array[T], validatorOrOpts: AbstractControlOptions, asyncValidator: AsyncValidatorFn): FormArray[ɵElement[T, Null]] = js.native
  def array[T](controls: js.Array[T], validatorOrOpts: ValidatorFn): FormArray[ɵElement[T, Null]] = js.native
  def array[T](controls: js.Array[T], validatorOrOpts: ValidatorFn, asyncValidator: js.Array[AsyncValidatorFn]): FormArray[ɵElement[T, Null]] = js.native
  def array[T](controls: js.Array[T], validatorOrOpts: ValidatorFn, asyncValidator: AsyncValidatorFn): FormArray[ɵElement[T, Null]] = js.native
  
  def control[T](formState: T): FormControl[T | Null] = js.native
  /** @deprecated Use `nonNullable` instead. */
  def control[T](formState: T, opts: FormControlOptionsinitial): FormControl[T] = js.native
  def control[T](formState: T, opts: FormControlOptionsnonNull): FormControl[T] = js.native
  def control[T](formState: T, opts: FormControlOptions, asyncValidator: js.Array[AsyncValidatorFn]): FormControl[T | Null] = js.native
  /**
    * @deprecated When passing an `options` argument, the `asyncValidator` argument has no effect.
    */
  def control[T](formState: T, opts: FormControlOptions, asyncValidator: AsyncValidatorFn): FormControl[T | Null] = js.native
  def control[T](formState: T, validatorOrOpts: js.Array[ValidatorFn]): FormControl[T | Null] = js.native
  def control[T](formState: T, validatorOrOpts: js.Array[ValidatorFn], asyncValidator: js.Array[AsyncValidatorFn]): FormControl[T | Null] = js.native
  def control[T](formState: T, validatorOrOpts: js.Array[ValidatorFn], asyncValidator: AsyncValidatorFn): FormControl[T | Null] = js.native
  def control[T](formState: T, validatorOrOpts: Null, asyncValidator: js.Array[AsyncValidatorFn]): FormControl[T | Null] = js.native
  def control[T](formState: T, validatorOrOpts: Null, asyncValidator: AsyncValidatorFn): FormControl[T | Null] = js.native
  def control[T](formState: T, validatorOrOpts: Unit, asyncValidator: js.Array[AsyncValidatorFn]): FormControl[T | Null] = js.native
  def control[T](formState: T, validatorOrOpts: Unit, asyncValidator: AsyncValidatorFn): FormControl[T | Null] = js.native
  def control[T](formState: T, validatorOrOpts: FormControlOptions): FormControl[T | Null] = js.native
  def control[T](formState: T, validatorOrOpts: ValidatorFn): FormControl[T | Null] = js.native
  def control[T](formState: T, validatorOrOpts: ValidatorFn, asyncValidator: js.Array[AsyncValidatorFn]): FormControl[T | Null] = js.native
  def control[T](formState: T, validatorOrOpts: ValidatorFn, asyncValidator: AsyncValidatorFn): FormControl[T | Null] = js.native
  def control[T](formState: FormControlState[T]): FormControl[T | Null] = js.native
  def control[T](formState: FormControlState[T], opts: FormControlOptionsinitial): FormControl[T] = js.native
  def control[T](formState: FormControlState[T], opts: FormControlOptionsnonNull): FormControl[T] = js.native
  def control[T](
    formState: FormControlState[T],
    opts: FormControlOptions,
    asyncValidator: js.Array[AsyncValidatorFn]
  ): FormControl[T | Null] = js.native
  def control[T](formState: FormControlState[T], opts: FormControlOptions, asyncValidator: AsyncValidatorFn): FormControl[T | Null] = js.native
  def control[T](formState: FormControlState[T], validatorOrOpts: js.Array[ValidatorFn]): FormControl[T | Null] = js.native
  def control[T](
    formState: FormControlState[T],
    validatorOrOpts: js.Array[ValidatorFn],
    asyncValidator: js.Array[AsyncValidatorFn]
  ): FormControl[T | Null] = js.native
  def control[T](
    formState: FormControlState[T],
    validatorOrOpts: js.Array[ValidatorFn],
    asyncValidator: AsyncValidatorFn
  ): FormControl[T | Null] = js.native
  def control[T](formState: FormControlState[T], validatorOrOpts: Null, asyncValidator: js.Array[AsyncValidatorFn]): FormControl[T | Null] = js.native
  def control[T](formState: FormControlState[T], validatorOrOpts: Null, asyncValidator: AsyncValidatorFn): FormControl[T | Null] = js.native
  def control[T](formState: FormControlState[T], validatorOrOpts: Unit, asyncValidator: js.Array[AsyncValidatorFn]): FormControl[T | Null] = js.native
  def control[T](formState: FormControlState[T], validatorOrOpts: Unit, asyncValidator: AsyncValidatorFn): FormControl[T | Null] = js.native
  def control[T](formState: FormControlState[T], validatorOrOpts: FormControlOptions): FormControl[T | Null] = js.native
  def control[T](formState: FormControlState[T], validatorOrOpts: ValidatorFn): FormControl[T | Null] = js.native
  def control[T](
    formState: FormControlState[T],
    validatorOrOpts: ValidatorFn,
    asyncValidator: js.Array[AsyncValidatorFn]
  ): FormControl[T | Null] = js.native
  def control[T](formState: FormControlState[T], validatorOrOpts: ValidatorFn, asyncValidator: AsyncValidatorFn): FormControl[T | Null] = js.native
  
  /**
    * @description
    * Constructs a new `FormGroup` instance.
    *
    * @deprecated This API is not typesafe and can result in issues with Closure Compiler renaming.
    * Use the `FormBuilder#group` overload with `AbstractControlOptions` instead.
    * Note that `AbstractControlOptions` expects `validators` and `asyncValidators` to be valid
    * validators. If you have custom validators, make sure their validation function parameter is
    * `AbstractControl` and not a sub-class, such as `FormGroup`. These functions will be called
    * with an object of type `AbstractControl` and that cannot be automatically downcast to a
    * subclass, so TypeScript sees this as an error. For example, change the `(group: FormGroup) =>
    * ValidationErrors|null` signature to be `(group: AbstractControl) => ValidationErrors|null`.
    *
    * @param controls A record of child controls. The key for each child is the name
    * under which the control is registered.
    *
    * @param options Configuration options object for the `FormGroup`. The legacy configuration
    * object consists of:
    * * `validator`: A synchronous validator function, or an array of validator functions.
    * * `asyncValidator`: A single async validator or array of async validator functions
    * Note: the legacy format is deprecated and might be removed in one of the next major versions
    * of Angular.
    */
  def group(controls: StringDictionary[Any], options: StringDictionary[Any]): FormGroup[Any] = js.native
  /**
    * @description
    * Constructs a new `FormGroup` instance. Accepts a single generic argument, which is an object
    * containing all the keys and corresponding inner control types.
    *
    * @param controls A collection of child controls. The key for each child is the name
    * under which it is registered.
    *
    * @param options Configuration options object for the `FormGroup`. The object should have the
    * `AbstractControlOptions` type and might contain the following fields:
    * * `validators`: A synchronous validator function, or an array of validator functions.
    * * `asyncValidators`: A single async validator or array of async validator functions.
    * * `updateOn`: The event upon which the control should be updated (options: 'change' | 'blur'
    * | submit').
    */
  def group[T /* <: js.Object */](controls: T): FormGroup[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: @angular/forms.@angular/forms.ɵElement<T[K], null>}
    */ typings.angularForms.angularFormsStrings.FormBuilder & TopLevel[T]
  ] = js.native
  def group[T /* <: js.Object */](controls: T, options: AbstractControlOptions): FormGroup[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: @angular/forms.@angular/forms.ɵElement<T[K], null>}
    */ typings.angularForms.angularFormsStrings.FormBuilder & TopLevel[T]
  ] = js.native
  
  /**
    * @description
    * Returns a FormBuilder in which automatically constructed @see FormControl} elements
    * have `{nonNullable: true}` and are non-nullable.
    *
    * **Constructing non-nullable controls**
    *
    * When constructing a control, it will be non-nullable, and will reset to its initial value.
    *
    * ```ts
    * let nnfb = new FormBuilder().nonNullable;
    * let name = nnfb.control('Alex'); // FormControl<string>
    * name.reset();
    * console.log(name); // 'Alex'
    * ```
    *
    * **Constructing non-nullable groups or arrays**
    *
    * When constructing a group or array, all automatically created inner controls will be
    * non-nullable, and will reset to their initial values.
    *
    * ```ts
    * let nnfb = new FormBuilder().nonNullable;
    * let name = nnfb.group({who: 'Alex'}); // FormGroup<{who: FormControl<string>}>
    * name.reset();
    * console.log(name); // {who: 'Alex'}
    * ```
    * **Constructing *nullable* fields on groups or arrays**
    *
    * It is still possible to have a nullable field. In particular, any `FormControl` which is
    * *already* constructed will not be altered. For example:
    *
    * ```ts
    * let nnfb = new FormBuilder().nonNullable;
    * // FormGroup<{who: FormControl<string|null>}>
    * let name = nnfb.group({who: new FormControl('Alex')});
    * name.reset(); console.log(name); // {who: null}
    * ```
    *
    * Because the inner control is constructed explicitly by the caller, the builder has
    * no control over how it is created, and cannot exclude the `null`.
    */
  def nonNullable: NonNullableFormBuilder = js.native
  
  /**
    * @description
    * Constructs a new `FormRecord` instance. Accepts a single generic argument, which is an object
    * containing all the keys and corresponding inner control types.
    *
    * @param controls A collection of child controls. The key for each child is the name
    * under which it is registered.
    *
    * @param options Configuration options object for the `FormRecord`. The object should have the
    * `AbstractControlOptions` type and might contain the following fields:
    * * `validators`: A synchronous validator function, or an array of validator functions.
    * * `asyncValidators`: A single async validator or array of async validator functions.
    * * `updateOn`: The event upon which the control should be updated (options: 'change' | 'blur'
    * | submit').
    */
  def record[T](controls: StringDictionary[T]): FormRecord[ɵElement[T, Null]] = js.native
  def record[T](controls: StringDictionary[T], options: AbstractControlOptions): FormRecord[ɵElement[T, Null]] = js.native
  
  /* private */ var useNonNullable: Any = js.native
}
/* static members */
object FormBuilder {
  
  @JSImport("@angular/forms", "FormBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/forms", "FormBuilder.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[FormBuilder, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[FormBuilder, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/forms", "FormBuilder.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[FormBuilder] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[FormBuilder]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
