package typings.allureDashJsDashCommons

import typings.allureDashJsDashCommons.allureDashJsDashCommonsMod.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object allureDashJsDashCommonsStrings {
  @js.native
  sealed trait broken extends Status
  
  @js.native
  sealed trait failed extends Status
  
  @js.native
  sealed trait passed extends Status
  
  @js.native
  sealed trait pending extends Status
  
  @js.native
  sealed trait skipped extends Status
  
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

