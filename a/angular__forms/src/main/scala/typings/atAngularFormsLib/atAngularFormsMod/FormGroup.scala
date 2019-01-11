package typings
package atAngularFormsLib.atAngularFormsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms", "FormGroup")
@js.native
class FormGroup protected ()
  extends atAngularFormsLib.publicUnderscoreApiMod.FormGroup {
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
  def this(controls: org.scalablytyped.runtime.StringDictionary[atAngularFormsLib.srcModelMod.AbstractControl]) = this()
  def this(controls: org.scalablytyped.runtime.StringDictionary[atAngularFormsLib.srcModelMod.AbstractControl], validatorOrOpts: atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn) = this()
  def this(controls: org.scalablytyped.runtime.StringDictionary[atAngularFormsLib.srcModelMod.AbstractControl], validatorOrOpts: atAngularFormsLib.srcModelMod.AbstractControlOptions) = this()
  def this(controls: org.scalablytyped.runtime.StringDictionary[atAngularFormsLib.srcModelMod.AbstractControl], validatorOrOpts: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn]) = this()
  def this(controls: org.scalablytyped.runtime.StringDictionary[atAngularFormsLib.srcModelMod.AbstractControl], validatorOrOpts: atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn, asyncValidator: atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn) = this()
  def this(controls: org.scalablytyped.runtime.StringDictionary[atAngularFormsLib.srcModelMod.AbstractControl], validatorOrOpts: atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn, asyncValidator: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn]) = this()
  def this(controls: org.scalablytyped.runtime.StringDictionary[atAngularFormsLib.srcModelMod.AbstractControl], validatorOrOpts: atAngularFormsLib.srcModelMod.AbstractControlOptions, asyncValidator: atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn) = this()
  def this(controls: org.scalablytyped.runtime.StringDictionary[atAngularFormsLib.srcModelMod.AbstractControl], validatorOrOpts: atAngularFormsLib.srcModelMod.AbstractControlOptions, asyncValidator: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn]) = this()
  def this(controls: org.scalablytyped.runtime.StringDictionary[atAngularFormsLib.srcModelMod.AbstractControl], validatorOrOpts: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn], asyncValidator: atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn) = this()
  def this(controls: org.scalablytyped.runtime.StringDictionary[atAngularFormsLib.srcModelMod.AbstractControl], validatorOrOpts: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn], asyncValidator: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn]) = this()
  def this(controls: org.scalablytyped.runtime.StringDictionary[atAngularFormsLib.srcModelMod.AbstractControl], validatorOrOpts: scala.Null, asyncValidator: atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn) = this()
  def this(controls: org.scalablytyped.runtime.StringDictionary[atAngularFormsLib.srcModelMod.AbstractControl], validatorOrOpts: scala.Null, asyncValidator: js.Array[atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn]) = this()
}

