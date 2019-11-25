package typings.amphtmlDashValidator.amphtmlDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.UNKNOWN_SEVERITY
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.ERROR
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.WARNING
*/
trait ValidationErrorSeverity extends js.Object

object ValidationErrorSeverity {
  @scala.inline
  def ERROR: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def UNKNOWN_SEVERITY: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.UNKNOWN_SEVERITY = this.cast("UNKNOWN_SEVERITY")
  @scala.inline
  def WARNING: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.WARNING = this.cast("WARNING")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

