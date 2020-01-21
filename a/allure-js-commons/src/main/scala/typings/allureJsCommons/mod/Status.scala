package typings.allureJsCommons.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.allureJsCommons.allureJsCommonsStrings.passed
  - typings.allureJsCommons.allureJsCommonsStrings.pending
  - typings.allureJsCommons.allureJsCommonsStrings.skipped
  - typings.allureJsCommons.allureJsCommonsStrings.failed
  - typings.allureJsCommons.allureJsCommonsStrings.broken
*/
trait Status extends js.Object

object Status {
  @scala.inline
  def broken: typings.allureJsCommons.allureJsCommonsStrings.broken = this.cast("broken")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: typings.allureJsCommons.allureJsCommonsStrings.failed = this.cast("failed")
  @scala.inline
  def passed: typings.allureJsCommons.allureJsCommonsStrings.passed = this.cast("passed")
  @scala.inline
  def pending: typings.allureJsCommons.allureJsCommonsStrings.pending = this.cast("pending")
  @scala.inline
  def skipped: typings.allureJsCommons.allureJsCommonsStrings.skipped = this.cast("skipped")
}

