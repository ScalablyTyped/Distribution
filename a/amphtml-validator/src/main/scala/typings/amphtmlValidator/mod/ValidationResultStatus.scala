package typings.amphtmlValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN
  - typings.amphtmlValidator.amphtmlValidatorStrings.PASS
  - typings.amphtmlValidator.amphtmlValidatorStrings.FAIL
*/
trait ValidationResultStatus extends js.Object

object ValidationResultStatus {
  @scala.inline
  def FAIL: typings.amphtmlValidator.amphtmlValidatorStrings.FAIL = this.cast("FAIL")
  @scala.inline
  def PASS: typings.amphtmlValidator.amphtmlValidatorStrings.PASS = this.cast("PASS")
  @scala.inline
  def UNKNOWN: typings.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

