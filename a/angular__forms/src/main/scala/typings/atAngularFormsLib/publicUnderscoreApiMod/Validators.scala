package typings
package atAngularFormsLib.publicUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms/public_api", "Validators")
@js.native
class Validators ()
  extends atAngularFormsLib.srcFormsMod.Validators

/* static members */
@JSImport("@angular/forms/public_api", "Validators")
@js.native
object Validators extends js.Object {
  /**
    * @description
    * Compose multiple validators into a single function that returns the union
    * of the individual error maps for the provided control.
    *
    * @returns A validator function that returns an error map with the
    * merged error maps of the validators if the validation check fails, otherwise `null`.
    */
  def compose(): scala.Null = js.native
  def compose(
    validators: js.Array[
      js.UndefOr[atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn | scala.Null]
    ]
  ): atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn | scala.Null = js.native
  /**
    * @description
    * Compose multiple async validators into a single function that returns the union
    * of the individual error objects for the provided control.
    *
    * @returns A validator function that returns an error map with the
    * merged error objects of the async validators if the validation check fails, otherwise `null`.
    */
  def composeAsync(validators: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn | scala.Null]): atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn | scala.Null = js.native
  /**
    * @description
    * Validator that requires the control's value pass an email validation test.
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
    */
  def email(control: atAngularFormsLib.srcModelMod.AbstractControl): atAngularFormsLib.srcDirectivesValidatorsMod.ValidationErrors | scala.Null = js.native
  /**
    * @description
    * Validator that requires the control's value to be less than or equal to the provided number.
    * The validator exists only as a function and not as a directive.
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
    */
  def max(max: scala.Double): atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn = js.native
  /**
    * @description
    * Validator that requires the length of the control's value to be less than or equal
    * to the provided maximum length. This validator is also provided by default if you use the
    * the HTML5 `maxlength` attribute.
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
    */
  def maxLength(maxLength: scala.Double): atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn = js.native
  /**
    * @description
    * Validator that requires the control's value to be greater than or equal to the provided number.
    * The validator exists only as a function and not as a directive.
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
    */
  def min(min: scala.Double): atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn = js.native
  /**
    * @description
    * Validator that requires the length of the control's value to be greater than or equal
    * to the provided minimum length. This validator is also provided by default if you use the
    * the HTML5 `minlength` attribute.
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
    * `minlength` if the validation check fails, otherwise `null`.
    */
  def minLength(minLength: scala.Double): atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn = js.native
  /**
    * @description
    * Validator that performs no operation.
    */
  def nullValidator(control: atAngularFormsLib.srcModelMod.AbstractControl): atAngularFormsLib.srcDirectivesValidatorsMod.ValidationErrors | scala.Null = js.native
  /**
    * @description
    * Validator that requires the control's value to match a regex pattern. This validator is also
    * provided by default if you use the HTML5 `pattern` attribute.
    *
    * Note that if a Regexp is provided, the Regexp is used as is to test the values. On the other
    * hand, if a string is passed, the `^` character is prepended and the `$` character is
    * appended to the provided string (if not already present), and the resulting regular
    * expression is used to test the values.
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
    * @returns A validator function that returns an error map with the
    * `pattern` property if the validation check fails, otherwise `null`.
    */
  def pattern(pattern: java.lang.String): atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn = js.native
  def pattern(pattern: stdLib.RegExp): atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn = js.native
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
    */
  def required(control: atAngularFormsLib.srcModelMod.AbstractControl): atAngularFormsLib.srcDirectivesValidatorsMod.ValidationErrors | scala.Null = js.native
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
    * const control = new FormControl('', Validators.requiredTrue);
    *
    * console.log(control.errors); // {required: true}
    * ```
    *
    * @returns An error map that contains the `required` property
    * set to `true` if the validation check fails, otherwise `null`.
    */
  def requiredTrue(control: atAngularFormsLib.srcModelMod.AbstractControl): atAngularFormsLib.srcDirectivesValidatorsMod.ValidationErrors | scala.Null = js.native
}

