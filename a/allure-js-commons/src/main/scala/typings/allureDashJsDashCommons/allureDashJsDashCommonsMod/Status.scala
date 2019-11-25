package typings.allureDashJsDashCommons.allureDashJsDashCommonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.allureDashJsDashCommons.allureDashJsDashCommonsStrings.passed
  - typings.allureDashJsDashCommons.allureDashJsDashCommonsStrings.pending
  - typings.allureDashJsDashCommons.allureDashJsDashCommonsStrings.skipped
  - typings.allureDashJsDashCommons.allureDashJsDashCommonsStrings.failed
  - typings.allureDashJsDashCommons.allureDashJsDashCommonsStrings.broken
*/
trait Status extends js.Object

object Status {
  @scala.inline
  def broken: typings.allureDashJsDashCommons.allureDashJsDashCommonsStrings.broken = this.cast("broken")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: typings.allureDashJsDashCommons.allureDashJsDashCommonsStrings.failed = this.cast("failed")
  @scala.inline
  def passed: typings.allureDashJsDashCommons.allureDashJsDashCommonsStrings.passed = this.cast("passed")
  @scala.inline
  def pending: typings.allureDashJsDashCommons.allureDashJsDashCommonsStrings.pending = this.cast("pending")
  @scala.inline
  def skipped: typings.allureDashJsDashCommons.allureDashJsDashCommonsStrings.skipped = this.cast("skipped")
}

