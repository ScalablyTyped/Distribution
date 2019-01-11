package typings
package atAngularFormsLib.atAngularFormsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms", "AbstractControl")
@js.native
abstract class AbstractControl ()
  extends atAngularFormsLib.publicUnderscoreApiMod.AbstractControl {
  def this(validator: atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn) = this()
  /**
    * Initialize the AbstractControl instance.
    *
    * @param validator The function that determines the synchronous validity of this control.
    * @param asyncValidator The function that determines the asynchronous validity of this
    * control.
    */
  def this(validator: atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn, asyncValidator: atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn) = this()
  def this(validator: scala.Null, asyncValidator: atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn) = this()
}

