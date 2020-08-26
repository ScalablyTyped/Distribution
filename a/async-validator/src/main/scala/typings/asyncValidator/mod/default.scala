package typings.asyncValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async-validator", JSImport.Default)
@js.native
class default protected () extends js.Object {
  def this(rule: Rules) = this()
  /**
    * Validate source
    * @param source The object to validate (required)
    * @param options An object describing processing options for the validation
    * @param callback A callback function to invoke when validation completes
    * @returns Promise
    */
  def validate(source: ValidateSource): js.Promise[Unit] = js.native
  def validate(
    source: ValidateSource,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* errors */ ErrorList, /* fields */ FieldErrorList, Unit]
  ): js.Promise[Unit] = js.native
  def validate(source: ValidateSource, options: ValidateOption): js.Promise[Unit] = js.native
  def validate(
    source: ValidateSource,
    options: ValidateOption,
    callback: js.Function2[/* errors */ ErrorList, /* fields */ FieldErrorList, Unit]
  ): js.Promise[Unit] = js.native
}

