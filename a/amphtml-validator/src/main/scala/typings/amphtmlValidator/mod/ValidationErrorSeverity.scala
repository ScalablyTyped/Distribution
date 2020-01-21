package typings.amphtmlValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN_SEVERITY
  - typings.amphtmlValidator.amphtmlValidatorStrings.ERROR
  - typings.amphtmlValidator.amphtmlValidatorStrings.WARNING
*/
trait ValidationErrorSeverity extends js.Object

object ValidationErrorSeverity {
  @scala.inline
  def ERROR: typings.amphtmlValidator.amphtmlValidatorStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def UNKNOWN_SEVERITY: typings.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN_SEVERITY = this.cast("UNKNOWN_SEVERITY")
  @scala.inline
  def WARNING: typings.amphtmlValidator.amphtmlValidatorStrings.WARNING = this.cast("WARNING")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

