package typings.angularForms.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.Version
import typings.angularForms.mod.^
import typings.rxjs.mod.Observable_
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def COMPOSITION_BUFFER_MODE: InjectionToken[Boolean] = ^.asInstanceOf[js.Dynamic].selectDynamic("COMPOSITION_BUFFER_MODE").asInstanceOf[InjectionToken[Boolean]]

inline def NG_ASYNC_VALIDATORS: InjectionToken[js.Array[js.Function | Validator]] = ^.asInstanceOf[js.Dynamic].selectDynamic("NG_ASYNC_VALIDATORS").asInstanceOf[InjectionToken[js.Array[js.Function | Validator]]]

inline def NG_VALIDATORS: InjectionToken[js.Array[js.Function | Validator]] = ^.asInstanceOf[js.Dynamic].selectDynamic("NG_VALIDATORS").asInstanceOf[InjectionToken[js.Array[js.Function | Validator]]]

inline def NG_VALUE_ACCESSOR: InjectionToken[js.Array[ControlValueAccessor]] = ^.asInstanceOf[js.Dynamic].selectDynamic("NG_VALUE_ACCESSOR").asInstanceOf[InjectionToken[js.Array[ControlValueAccessor]]]

inline def UntypedFormArray: UntypedFormArrayCtor = ^.asInstanceOf[js.Dynamic].selectDynamic("UntypedFormArray").asInstanceOf[UntypedFormArrayCtor]
type UntypedFormArray = FormArray[Any]

inline def UntypedFormControl: UntypedFormControlCtor = ^.asInstanceOf[js.Dynamic].selectDynamic("UntypedFormControl").asInstanceOf[UntypedFormControlCtor]
type UntypedFormControl = FormControl[Any]

inline def UntypedFormGroup: UntypedFormGroupCtor = ^.asInstanceOf[js.Dynamic].selectDynamic("UntypedFormGroup").asInstanceOf[UntypedFormGroupCtor]
type UntypedFormGroup = FormGroup[Any]

inline def VERSION: Version = ^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[Version]

inline def isFormArray(control: Any): /* is @angular/forms.@angular/forms.FormArray<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFormArray")(control.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/forms.@angular/forms.FormArray<any> */ Boolean]

inline def isFormControl(control: Any): /* is @angular/forms.@angular/forms.FormControl<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFormControl")(control.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/forms.@angular/forms.FormControl<any> */ Boolean]

inline def isFormGroup(control: Any): /* is @angular/forms.@angular/forms.FormGroup<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFormGroup")(control.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/forms.@angular/forms.FormGroup<any> */ Boolean]

inline def isFormRecord(control: Any): /* is @angular/forms.@angular/forms.FormRecord<@angular/forms.@angular/forms.AbstractControl<any, any>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFormRecord")(control.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/forms.@angular/forms.FormRecord<@angular/forms.@angular/forms.AbstractControl<any, any>> */ Boolean]

type AsyncValidatorFn = js.Function1[
/* control */ AbstractControl[Any, Any], 
(js.Promise[ValidationErrors | Null]) | (Observable_[ValidationErrors | Null])]

/**
  * Base class for all built-in ControlValueAccessor classes (except DefaultValueAccessor, which is
  * used in case no other CVAs can be found). We use this class to distinguish between default CVA,
  * built-in CVAs and custom CVAs, so that Forms logic can recognize built-in CVAs and treat custom
  * ones with higher priority (when both built-in and custom CVAs are present).
  *
  * Note: this is an *internal-only* class and should not be extended or used directly in
  * applications code.
  */
type BuiltInControlValueAccessor = BaseControlValueAccessor

type ControlConfig[T] = js.Tuple3[
T | FormControlState[T], 
js.UndefOr[ValidatorFn | js.Array[ValidatorFn]], 
js.UndefOr[AsyncValidatorFn | js.Array[AsyncValidatorFn]]]

type FormControlStatus = "VALID" | "INVALID" | "PENDING" | "DISABLED"

type FormHooks = "change" | "blur" | "submit"

/**
  * The compiler may not always be able to prove that the elements of the control config are a tuple
  * (i.e. occur in a fixed order). This slightly looser type is used for inference, to catch cases
  * where the compiler cannot prove order and position.
  *
  * For example, consider the simple case `fb.group({foo: ['bar', Validators.required]})`. The
  * compiler will infer this as an array, not as a tuple.
  */
type PermissiveControlConfig[T] = js.Array[T | FormControlState[T] | ValidatorConfig]

type SetDisabledStateOption = "whenDisabledForLegacyCode" | "always"

type ValidationErrors = StringDictionary[Any]

/**
  * The union of all validator types that can be accepted by a ControlConfig.
  */
type ValidatorConfig = ValidatorFn | AsyncValidatorFn | (js.Array[AsyncValidatorFn | ValidatorFn])

type ValidatorFn = js.Function1[/* control */ AbstractControl[Any, Any], ValidationErrors | Null]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  S extends [infer Head, ...infer Tail] ? Head extends / * template literal string: ${number} * / string ? [number, ...@angular/forms.@angular/forms.ɵCoerceStrArrToNumArr<Tail>] : [Head, ...@angular/forms.@angular/forms.ɵCoerceStrArrToNumArr<Tail>] : []
  }}}
  */
type ɵCoerceStrArrToNumArr[S] = js.Array[Any]

type ɵFormArrayRawValue[T /* <: AbstractControl[Any, Any] */] = ɵTypedOrUntyped[T, js.Array[ɵRawValue[T]], js.Array[Any]]

type ɵFormArrayValue[T /* <: AbstractControl[Any, Any] */] = ɵTypedOrUntyped[T, js.Array[ɵValue[T]], js.Array[Any]]

type ɵFormGroupRawValue[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]:? @angular/forms.@angular/forms.AbstractControl<any, any>} */ js.Any */] = ɵTypedOrUntyped[
T, 
/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: @angular/forms.@angular/forms.ɵRawValue<T[K]>} */ js.Any, 
StringDictionary[Any]]

type ɵFormGroupValue[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]:? @angular/forms.@angular/forms.AbstractControl<any, any>} */ js.Any */] = ɵTypedOrUntyped[
T, 
Partial[
  /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: @angular/forms.@angular/forms.ɵValue<T[K]>} */ js.Any
], 
StringDictionary[Any]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  K extends string ? @angular/forms.@angular/forms.ɵGetProperty<T, @angular/forms.@angular/forms.ɵCoerceStrArrToNumArr<@angular/forms.@angular/forms.ɵTokenize<K, '.'>>> : @angular/forms.@angular/forms.ɵWriteable<K> extends std.Array<string | number> ? @angular/forms.@angular/forms.ɵNavigate<T, @angular/forms.@angular/forms.ɵWriteable<K>> : any
  }}}
  */
type ɵGetProperty[T, K] = ɵNavigate[T, ɵWriteable[ɵCoerceStrArrToNumArr[ɵTokenize[K, "."]]]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  0 extends 1 & T ? Y : N
  }}}
  */
type ɵIsAny[T, Y, N] = Y

type ɵOptionalKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? undefined extends T[K]? K : never}[keyof T] */ js.Any

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  string extends S ? std.Array<string> : S extends / * template literal string: ${inferT}${D}${inferU} * / string ? [/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify T * / any, ...@angular/forms.@angular/forms.ɵTokenize</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U * / any, D>] : [S]
  }}}
  */
type ɵTokenize[S /* <: String */, D /* <: String */] = js.Array[String]

type ɵTypedOrUntyped[T, Typed, Untyped] = ɵIsAny[T, Untyped, Typed]

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {-readonly [ P in keyof T ]: T[P]}
  }}}
  */
type ɵWriteable[T] = T
