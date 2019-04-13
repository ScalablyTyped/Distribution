package typings
package allureDashJsDashCommonsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object allureDashJsDashCommonsLibStrings {
  @js.native
  sealed trait broken
    extends allureDashJsDashCommonsLib.allureDashJsDashCommonsMod.Status
  
  @js.native
  sealed trait failed
    extends allureDashJsDashCommonsLib.allureDashJsDashCommonsMod.Status
  
  @js.native
  sealed trait passed
    extends allureDashJsDashCommonsLib.allureDashJsDashCommonsMod.Status
  
  @js.native
  sealed trait pending
    extends allureDashJsDashCommonsLib.allureDashJsDashCommonsMod.Status
  
  @js.native
  sealed trait skipped
    extends allureDashJsDashCommonsLib.allureDashJsDashCommonsMod.Status
  
  @scala.inline
  def broken: broken = "broken".asInstanceOf[broken]
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  @scala.inline
  def passed: passed = "passed".asInstanceOf[passed]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def skipped: skipped = "skipped".asInstanceOf[skipped]
}

