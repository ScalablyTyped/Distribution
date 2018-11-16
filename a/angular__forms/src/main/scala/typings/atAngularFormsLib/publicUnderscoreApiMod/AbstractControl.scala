package typings
package atAngularFormsLib.publicUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms/public_api", "AbstractControl")
@js.native
abstract class AbstractControl ()
  extends atAngularFormsLib.srcFormsMod.AbstractControl {
  /**
       * Initialize the AbstractControl instance.
       *
       * @param validator The function that determines the synchronous validity of this control.
       * @param asyncValidator The function that determines the asynchronous validity of this
       * control.
       */
  def this(validator: atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn) = this()
  /**
       * Initialize the AbstractControl instance.
       *
       * @param validator The function that determines the synchronous validity of this control.
       * @param asyncValidator The function that determines the asynchronous validity of this
       * control.
       */
  def this(validator: atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn, asyncValidator: atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn) = this()
  /**
       * Initialize the AbstractControl instance.
       *
       * @param validator The function that determines the synchronous validity of this control.
       * @param asyncValidator The function that determines the asynchronous validity of this
       * control.
       */
  def this(validator: scala.Null, asyncValidator: atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn) = this()
}

