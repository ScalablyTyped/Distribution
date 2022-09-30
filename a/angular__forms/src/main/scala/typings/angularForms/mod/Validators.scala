package typings.angularForms.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "Validators")
@js.native
open class Validators () extends StObject
/* static members */
object Validators {
  
  @JSImport("@angular/forms", "Validators")
  @js.native
  val ^ : js.Any = js.native
  
  inline def compose(validators: js.Array[js.UndefOr[ValidatorFn | Null]]): ValidatorFn | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(validators.asInstanceOf[js.Any]).asInstanceOf[ValidatorFn | Null]
  /**
    * @description
    * Compose multiple validators into a single function that returns the union
    * of the individual error maps for the provided control.
    *
    * @returns A validator function that returns an error map with the
    * merged error maps of the validators if the validation check fails, otherwise `null`.
    *
    * @see `updateValueAndValidity()`
    *
    */
  inline def compose(validators: Null): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(validators.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  /**
    * @description
    * Compose multiple async validators into a single function that returns the union
    * of the individual error objects for the provided control.
    *
    * @returns A validator function that returns an error map with the
    * merged error objects of the async validators if the validation check fails, otherwise `null`.
    *
    * @see `updateValueAndValidity()`
    *
    */
  inline def composeAsync(validators: js.Array[AsyncValidatorFn | Null]): AsyncValidatorFn | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("composeAsync")(validators.asInstanceOf[js.Any]).asInstanceOf[AsyncValidatorFn | Null]
  
  /**
    * @description
    * Validator that requires the control's value pass an email validation test.
    *
    * Tests the value using a [regular
    * expression](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_Expressions)
    * pattern suitable for common use cases. The pattern is based on the definition of a valid email
    * address in the [WHATWG HTML
    * specification](https://html.spec.whatwg.org/multipage/input.html#valid-e-mail-address) with
    * some enhancements to incorporate more RFC rules (such as rules related to domain names and the
    * lengths of different parts of the address).
    *
    * The differences from the WHATWG version include:
    * - Disallow `local-part` (the part before the `@` symbol) to begin or end with a period (`.`).
    * - Disallow `local-part` to be longer than 64 characters.
    * - Disallow the whole address to be longer than 254 characters.
    *
    * If this pattern does not satisfy your business needs, you can use `Validators.pattern()` to
    * validate the value against a different pattern.
    *
    * @usageNotes
    *
    * ### Validate that the field matches a valid email pattern
    *
    * ```typescript
    * const control = new FormControl('bad@', Validators.email);
    *
    * console.log(control.errors); // {email: true}
    * ```
    *
    * @returns An error map with the `email` property
    * if the validation check fails, otherwise `null`.
    *
    * @see `updateValueAndValidity()`
    *
    */
  inline def email(control: AbstractControl[Any, Any]): ValidationErrors | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("email")(control.asInstanceOf[js.Any]).asInstanceOf[ValidationErrors | Null]
  
  /**
    * @description
    * Validator that requires the control's value to be less than or equal to the provided number.
    *
    * @usageNotes
    *
    * ### Validate against a maximum of 15
    *
    * ```typescript
    * const control = new FormControl(16, Validators.max(15));
    *
    * console.log(control.errors); // {max: {max: 15, actual: 16}}
    * ```
    *
    * @returns A validator function that returns an error map with the
    * `max` property if the validation check fails, otherwise `null`.
    *
    * @see `updateValueAndValidity()`
    *
    */
  inline def max(max: Double): ValidatorFn = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(max.asInstanceOf[js.Any]).asInstanceOf[ValidatorFn]
  
  /**
    * @description
    * Validator that requires the length of the control's value to be less than or equal
    * to the provided maximum length. This validator is also provided by default if you use the
    * the HTML5 `maxlength` attribute. Note that the `maxLength` validator is intended to be used
    * only for types that have a numeric `length` property, such as strings or arrays.
    *
    * @usageNotes
    *
    * ### Validate that the field has maximum of 5 characters
    *
    * ```typescript
    * const control = new FormControl('Angular', Validators.maxLength(5));
    *
    * console.log(control.errors); // {maxlength: {requiredLength: 5, actualLength: 7}}
    * ```
    *
    * ```html
    * <input maxlength="5">
    * ```
    *
    * @returns A validator function that returns an error map with the
    * `maxlength` property if the validation check fails, otherwise `null`.
    *
    * @see `updateValueAndValidity()`
    *
    */
  inline def maxLength(maxLength: Double): ValidatorFn = ^.asInstanceOf[js.Dynamic].applyDynamic("maxLength")(maxLength.asInstanceOf[js.Any]).asInstanceOf[ValidatorFn]
  
  /**
    * @description
    * Validator that requires the control's value to be greater than or equal to the provided number.
    *
    * @usageNotes
    *
    * ### Validate against a minimum of 3
    *
    * ```typescript
    * const control = new FormControl(2, Validators.min(3));
    *
    * console.log(control.errors); // {min: {min: 3, actual: 2}}
    * ```
    *
    * @returns A validator function that returns an error map with the
    * `min` property if the validation check fails, otherwise `null`.
    *
    * @see `updateValueAndValidity()`
    *
    */
  inline def min(min: Double): ValidatorFn = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(min.asInstanceOf[js.Any]).asInstanceOf[ValidatorFn]
  
  /**
    * @description
    * Validator that requires the length of the control's value to be greater than or equal
    * to the provided minimum length. This validator is also provided by default if you use the
    * the HTML5 `minlength` attribute. Note that the `minLength` validator is intended to be used
    * only for types that have a numeric `length` property, such as strings or arrays. The
    * `minLength` validator logic is also not invoked for values when their `length` property is 0
    * (for example in case of an empty string or an empty array), to support optional controls. You
    * can use the standard `required` validator if empty values should not be considered valid.
    *
    * @usageNotes
    *
    * ### Validate that the field has a minimum of 3 characters
    *
    * ```typescript
    * const control = new FormControl('ng', Validators.minLength(3));
    *
    * console.log(control.errors); // {minlength: {requiredLength: 3, actualLength: 2}}
    * ```
    *
    * ```html
    * <input minlength="5">
    * ```
    *
    * @returns A validator function that returns an error map with the
    * `minlength` property if the validation check fails, otherwise `null`.
    *
    * @see `updateValueAndValidity()`
    *
    */
  inline def minLength(minLength: Double): ValidatorFn = ^.asInstanceOf[js.Dynamic].applyDynamic("minLength")(minLength.asInstanceOf[js.Any]).asInstanceOf[ValidatorFn]
  
  /**
    * @description
    * Validator that performs no operation.
    *
    * @see `updateValueAndValidity()`
    *
    */
  inline def nullValidator(control: AbstractControl[Any, Any]): ValidationErrors | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("nullValidator")(control.asInstanceOf[js.Any]).asInstanceOf[ValidationErrors | Null]
  
  /**
    * @description
    * Validator that requires the control's value to match a regex pattern. This validator is also
    * provided by default if you use the HTML5 `pattern` attribute.
    *
    * @usageNotes
    *
    * ### Validate that the field only contains letters or spaces
    *
    * ```typescript
    * const control = new FormControl('1', Validators.pattern('[a-zA-Z ]*'));
    *
    * console.log(control.errors); // {pattern: {requiredPattern: '^[a-zA-Z ]*$', actualValue: '1'}}
    * ```
    *
    * ```html
    * <input pattern="[a-zA-Z ]*">
    * ```
    *
    * ### Pattern matching with the global or sticky flag
    *
    * `RegExp` objects created with the `g` or `y` flags that are passed into `Validators.pattern`
    * can produce different results on the same input when validations are run consecutively. This is
    * due to how the behavior of `RegExp.prototype.test` is
    * specified in [ECMA-262](https://tc39.es/ecma262/#sec-regexpbuiltinexec)
    * (`RegExp` preserves the index of the last match when the global or sticky flag is used).
    * Due to this behavior, it is recommended that when using
    * `Validators.pattern` you **do not** pass in a `RegExp` object with either the global or sticky
    * flag enabled.
    *
    * ```typescript
    * // Not recommended (since the `g` flag is used)
    * const controlOne = new FormControl('1', Validators.pattern(/foo/g));
    *
    * // Good
    * const controlTwo = new FormControl('1', Validators.pattern(/foo/));
    * ```
    *
    * @param pattern A regular expression to be used as is to test the values, or a string.
    * If a string is passed, the `^` character is prepended and the `$` character is
    * appended to the provided string (if not already present), and the resulting regular
    * expression is used to test the values.
    *
    * @returns A validator function that returns an error map with the
    * `pattern` property if the validation check fails, otherwise `null`.
    *
    * @see `updateValueAndValidity()`
    *
    */
  inline def pattern(pattern: String): ValidatorFn = ^.asInstanceOf[js.Dynamic].applyDynamic("pattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[ValidatorFn]
  inline def pattern(pattern: js.RegExp): ValidatorFn = ^.asInstanceOf[js.Dynamic].applyDynamic("pattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[ValidatorFn]
  
  /**
    * @description
    * Validator that requires the control have a non-empty value.
    *
    * @usageNotes
    *
    * ### Validate that the field is non-empty
    *
    * ```typescript
    * const control = new FormControl('', Validators.required);
    *
    * console.log(control.errors); // {required: true}
    * ```
    *
    * @returns An error map with the `required` property
    * if the validation check fails, otherwise `null`.
    *
    * @see `updateValueAndValidity()`
    *
    */
  inline def required(control: AbstractControl[Any, Any]): ValidationErrors | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("required")(control.asInstanceOf[js.Any]).asInstanceOf[ValidationErrors | Null]
  
  /**
    * @description
    * Validator that requires the control's value be true. This validator is commonly
    * used for required checkboxes.
    *
    * @usageNotes
    *
    * ### Validate that the field value is true
    *
    * ```typescript
    * const control = new FormControl('some value', Validators.requiredTrue);
    *
    * console.log(control.errors); // {required: true}
    * ```
    *
    * @returns An error map that contains the `required` property
    * set to `true` if the validation check fails, otherwise `null`.
    *
    * @see `updateValueAndValidity()`
    *
    */
  inline def requiredTrue(control: AbstractControl[Any, Any]): ValidationErrors | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("requiredTrue")(control.asInstanceOf[js.Any]).asInstanceOf[ValidationErrors | Null]
}
