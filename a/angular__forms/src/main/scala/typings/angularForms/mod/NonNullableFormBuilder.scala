package typings.angularForms.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "NonNullableFormBuilder")
@js.native
abstract class NonNullableFormBuilder () extends StObject {
  
  /**
    * Similar to `FormBuilder#array`, except any implicitly constructed `FormControl`
    * will be non-nullable (i.e. it will have `nonNullable` set to true). Note
    * that already-constructed controls will not be altered.
    */
  def array[T](controls: js.Array[T]): FormArray[ɵElement[T, scala.Nothing]] = js.native
  def array[T](controls: js.Array[T], validatorOrOpts: js.Array[ValidatorFn]): FormArray[ɵElement[T, scala.Nothing]] = js.native
  def array[T](
    controls: js.Array[T],
    validatorOrOpts: js.Array[ValidatorFn],
    asyncValidator: js.Array[AsyncValidatorFn]
  ): FormArray[ɵElement[T, scala.Nothing]] = js.native
  def array[T](controls: js.Array[T], validatorOrOpts: js.Array[ValidatorFn], asyncValidator: AsyncValidatorFn): FormArray[ɵElement[T, scala.Nothing]] = js.native
  def array[T](controls: js.Array[T], validatorOrOpts: Null, asyncValidator: js.Array[AsyncValidatorFn]): FormArray[ɵElement[T, scala.Nothing]] = js.native
  def array[T](controls: js.Array[T], validatorOrOpts: Null, asyncValidator: AsyncValidatorFn): FormArray[ɵElement[T, scala.Nothing]] = js.native
  def array[T](controls: js.Array[T], validatorOrOpts: Unit, asyncValidator: js.Array[AsyncValidatorFn]): FormArray[ɵElement[T, scala.Nothing]] = js.native
  def array[T](controls: js.Array[T], validatorOrOpts: Unit, asyncValidator: AsyncValidatorFn): FormArray[ɵElement[T, scala.Nothing]] = js.native
  def array[T](controls: js.Array[T], validatorOrOpts: AbstractControlOptions): FormArray[ɵElement[T, scala.Nothing]] = js.native
  def array[T](
    controls: js.Array[T],
    validatorOrOpts: AbstractControlOptions,
    asyncValidator: js.Array[AsyncValidatorFn]
  ): FormArray[ɵElement[T, scala.Nothing]] = js.native
  def array[T](controls: js.Array[T], validatorOrOpts: AbstractControlOptions, asyncValidator: AsyncValidatorFn): FormArray[ɵElement[T, scala.Nothing]] = js.native
  def array[T](controls: js.Array[T], validatorOrOpts: ValidatorFn): FormArray[ɵElement[T, scala.Nothing]] = js.native
  def array[T](controls: js.Array[T], validatorOrOpts: ValidatorFn, asyncValidator: js.Array[AsyncValidatorFn]): FormArray[ɵElement[T, scala.Nothing]] = js.native
  def array[T](controls: js.Array[T], validatorOrOpts: ValidatorFn, asyncValidator: AsyncValidatorFn): FormArray[ɵElement[T, scala.Nothing]] = js.native
  
  /**
    * Similar to `FormBuilder#control`, except this overridden version of `control` forces
    * `nonNullable` to be `true`, resulting in the control always being non-nullable.
    */
  def control[T](formState: T): FormControl[T] = js.native
  def control[T](formState: T, validatorOrOpts: js.Array[ValidatorFn]): FormControl[T] = js.native
  def control[T](formState: T, validatorOrOpts: js.Array[ValidatorFn], asyncValidator: js.Array[AsyncValidatorFn]): FormControl[T] = js.native
  def control[T](formState: T, validatorOrOpts: js.Array[ValidatorFn], asyncValidator: AsyncValidatorFn): FormControl[T] = js.native
  def control[T](formState: T, validatorOrOpts: Null, asyncValidator: js.Array[AsyncValidatorFn]): FormControl[T] = js.native
  def control[T](formState: T, validatorOrOpts: Null, asyncValidator: AsyncValidatorFn): FormControl[T] = js.native
  def control[T](formState: T, validatorOrOpts: Unit, asyncValidator: js.Array[AsyncValidatorFn]): FormControl[T] = js.native
  def control[T](formState: T, validatorOrOpts: Unit, asyncValidator: AsyncValidatorFn): FormControl[T] = js.native
  def control[T](formState: T, validatorOrOpts: AbstractControlOptions): FormControl[T] = js.native
  def control[T](formState: T, validatorOrOpts: AbstractControlOptions, asyncValidator: js.Array[AsyncValidatorFn]): FormControl[T] = js.native
  def control[T](formState: T, validatorOrOpts: AbstractControlOptions, asyncValidator: AsyncValidatorFn): FormControl[T] = js.native
  def control[T](formState: T, validatorOrOpts: ValidatorFn): FormControl[T] = js.native
  def control[T](formState: T, validatorOrOpts: ValidatorFn, asyncValidator: js.Array[AsyncValidatorFn]): FormControl[T] = js.native
  def control[T](formState: T, validatorOrOpts: ValidatorFn, asyncValidator: AsyncValidatorFn): FormControl[T] = js.native
  def control[T](formState: FormControlState[T]): FormControl[T] = js.native
  def control[T](formState: FormControlState[T], validatorOrOpts: js.Array[ValidatorFn]): FormControl[T] = js.native
  def control[T](
    formState: FormControlState[T],
    validatorOrOpts: js.Array[ValidatorFn],
    asyncValidator: js.Array[AsyncValidatorFn]
  ): FormControl[T] = js.native
  def control[T](
    formState: FormControlState[T],
    validatorOrOpts: js.Array[ValidatorFn],
    asyncValidator: AsyncValidatorFn
  ): FormControl[T] = js.native
  def control[T](formState: FormControlState[T], validatorOrOpts: Null, asyncValidator: js.Array[AsyncValidatorFn]): FormControl[T] = js.native
  def control[T](formState: FormControlState[T], validatorOrOpts: Null, asyncValidator: AsyncValidatorFn): FormControl[T] = js.native
  def control[T](formState: FormControlState[T], validatorOrOpts: Unit, asyncValidator: js.Array[AsyncValidatorFn]): FormControl[T] = js.native
  def control[T](formState: FormControlState[T], validatorOrOpts: Unit, asyncValidator: AsyncValidatorFn): FormControl[T] = js.native
  def control[T](formState: FormControlState[T], validatorOrOpts: AbstractControlOptions): FormControl[T] = js.native
  def control[T](
    formState: FormControlState[T],
    validatorOrOpts: AbstractControlOptions,
    asyncValidator: js.Array[AsyncValidatorFn]
  ): FormControl[T] = js.native
  def control[T](
    formState: FormControlState[T],
    validatorOrOpts: AbstractControlOptions,
    asyncValidator: AsyncValidatorFn
  ): FormControl[T] = js.native
  def control[T](formState: FormControlState[T], validatorOrOpts: ValidatorFn): FormControl[T] = js.native
  def control[T](
    formState: FormControlState[T],
    validatorOrOpts: ValidatorFn,
    asyncValidator: js.Array[AsyncValidatorFn]
  ): FormControl[T] = js.native
  def control[T](formState: FormControlState[T], validatorOrOpts: ValidatorFn, asyncValidator: AsyncValidatorFn): FormControl[T] = js.native
  
  /**
    * Similar to `FormBuilder#group`, except any implicitly constructed `FormControl`
    * will be non-nullable (i.e. it will have `nonNullable` set to true). Note
    * that already-constructed controls will not be altered.
    */
  def group[T /* <: js.Object */](controls: T): FormGroup[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: @angular/forms.@angular/forms.ɵElement<T[K], never>}
    */ typings.angularForms.angularFormsStrings.NonNullableFormBuilder & TopLevel[T]
  ] = js.native
  def group[T /* <: js.Object */](controls: T, options: AbstractControlOptions): FormGroup[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: @angular/forms.@angular/forms.ɵElement<T[K], never>}
    */ typings.angularForms.angularFormsStrings.NonNullableFormBuilder & TopLevel[T]
  ] = js.native
  
  /**
    * Similar to `FormBuilder#record`, except any implicitly constructed `FormControl`
    * will be non-nullable (i.e. it will have `nonNullable` set to true). Note
    * that already-constructed controls will not be altered.
    */
  def record[T](controls: StringDictionary[T]): FormRecord[ɵElement[T, scala.Nothing]] = js.native
  def record[T](controls: StringDictionary[T], options: AbstractControlOptions): FormRecord[ɵElement[T, scala.Nothing]] = js.native
}
/* static members */
object NonNullableFormBuilder {
  
  @JSImport("@angular/forms", "NonNullableFormBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/forms", "NonNullableFormBuilder.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[NonNullableFormBuilder, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[NonNullableFormBuilder, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/forms", "NonNullableFormBuilder.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[NonNullableFormBuilder] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[NonNullableFormBuilder]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
