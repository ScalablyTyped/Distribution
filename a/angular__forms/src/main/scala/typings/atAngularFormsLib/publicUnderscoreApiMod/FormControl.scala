package typings
package atAngularFormsLib.publicUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms/public_api", "FormControl")
@js.native
/**
  * Creates a new `FormControl` instance.
  *
  * @param formState Initializes the control with an initial value,
  * or an object that defines the initial value and disabled state.
  *
  * @param validatorOrOpts A synchronous validator function, or an array of
  * such functions, or an `AbstractControlOptions` object that contains validation functions
  * and a validation trigger.
  *
  * @param asyncValidator A single async validator or array of async validator functions
  *
  */
class FormControl ()
  extends atAngularFormsLib.srcFormsMod.FormControl {
  def this(formState: js.Any) = this()
  def this(formState: js.Any, validatorOrOpts: atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn) = this()
  def this(formState: js.Any, validatorOrOpts: atAngularFormsLib.srcModelMod.AbstractControlOptions) = this()
  def this(formState: js.Any, validatorOrOpts: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn]) = this()
  def this(formState: js.Any, validatorOrOpts: atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn, asyncValidator: atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn) = this()
  def this(formState: js.Any, validatorOrOpts: atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn, asyncValidator: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn]) = this()
  def this(formState: js.Any, validatorOrOpts: atAngularFormsLib.srcModelMod.AbstractControlOptions, asyncValidator: atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn) = this()
  def this(formState: js.Any, validatorOrOpts: atAngularFormsLib.srcModelMod.AbstractControlOptions, asyncValidator: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn]) = this()
  def this(formState: js.Any, validatorOrOpts: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn], asyncValidator: atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn) = this()
  def this(formState: js.Any, validatorOrOpts: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn], asyncValidator: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn]) = this()
  def this(formState: js.Any, validatorOrOpts: scala.Null, asyncValidator: atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn) = this()
  def this(formState: js.Any, validatorOrOpts: scala.Null, asyncValidator: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn]) = this()
}

