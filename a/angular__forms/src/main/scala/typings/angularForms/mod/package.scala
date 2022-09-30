package typings.angularForms.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.Version
import typings.angularForms.mod.^
import typings.std.Exclude
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

type AsyncValidatorFn = js.Function1[
/* control */ AbstractControl[Any, Any], 
(js.Promise[ValidationErrors | Null]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<ValidationErrors | null> */ Any)]

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

/**
  * The compiler may not always be able to prove that the elements of the control config are a tuple
  * (i.e. occur in a fixed order). This slightly looser type is used for inference, to catch cases
  * where the compiler cannot prove order and position.
  *
  * For example, consider the simple case `fb.group({foo: ['bar', Validators.required]})`. The
  * compiler will infer this as an array, not as a tuple.
  */
type PermissiveControlConfig[T] = js.Array[T | FormControlState[T] | ValidatorConfig]

type ValidationErrors = StringDictionary[Any]

/**
  * The union of all validator types that can be accepted by a ControlConfig.
  */
type ValidatorConfig = ValidatorFn | AsyncValidatorFn | (js.Array[AsyncValidatorFn | ValidatorFn])

type ValidatorFn = js.Function1[/* control */ AbstractControl[Any, Any], ValidationErrors | Null]

type ɵCoerceStrArrToNumArr[S] = js.Array[Any]

type ɵElement[T, N /* <: Null */] = (FormControl[Any | (Exclude[Any, ValidatorConfig]) | N | T]) | (AbstractControl[Any, Any]) | FormArray[Any] | FormRecord[Any] | FormGroup[Any]

type ɵFormArrayRawValue[T /* <: AbstractControl[Any, Any] */] = ɵTypedOrUntyped[T, js.Array[ɵRawValue[T]], js.Array[Any]]

type ɵFormArrayValue[T /* <: AbstractControl[Any, Any] */] = ɵTypedOrUntyped[T, js.Array[ɵValue[T]], js.Array[Any]]

type ɵFormGroupRawValue[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]:? @angular/forms.@angular/forms.AbstractControl<any, any>}
  */ typings.angularForms.angularFormsStrings.ɵFormGroupRawValue & TopLevel[Any] */] = ɵTypedOrUntyped[
T, 
/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]: @angular/forms.@angular/forms.ɵRawValue<T[K]>}
  */ typings.angularForms.angularFormsStrings.ɵFormGroupRawValue & TopLevel[T], 
StringDictionary[Any]]

type ɵFormGroupValue[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]:? @angular/forms.@angular/forms.AbstractControl<any, any>}
  */ typings.angularForms.angularFormsStrings.ɵFormGroupValue & TopLevel[Any] */] = ɵTypedOrUntyped[
T, 
Partial[
  /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]: @angular/forms.@angular/forms.ɵValue<T[K]>}
  */ typings.angularForms.angularFormsStrings.ɵFormGroupValue & TopLevel[T]
], 
StringDictionary[Any]]

type ɵGetProperty[T, K] = ɵNavigate[T, ɵWriteable[K]]

type ɵIsAny[T, Y, N] = N | Y

type ɵNavigate[T, K /* <: js.Array[String | Double] */] = /* import warning: importer.ImportType#apply Failed type conversion: T[any] */ js.Any

type ɵOptionalKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? undefined extends T[K]? K : never}[keyof T] */ js.Any

type ɵRawValue[T /* <: js.UndefOr[AbstractControl[Any, Any]] */] = Any

type ɵTokenize[S /* <: String */, D /* <: String */] = js.Array[Any | S | String]

type ɵTypedOrUntyped[T, Typed, Untyped] = ɵIsAny[T, Untyped, Typed]

type ɵValue[T /* <: js.UndefOr[AbstractControl[Any, Any]] */] = /* import warning: importer.ImportType#apply Failed type conversion: T['value'] */ js.Any

type ɵWriteable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{-readonly [ P in keyof T ]: T[P]}
  */ typings.angularForms.angularFormsStrings.ɵWriteable & TopLevel[T]
