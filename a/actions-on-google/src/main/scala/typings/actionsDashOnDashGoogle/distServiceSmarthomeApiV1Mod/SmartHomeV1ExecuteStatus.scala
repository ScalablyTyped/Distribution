package typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.SUCCESS
  - typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.PENDING
  - typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.OFFLINE
  - typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.ERROR
*/
trait SmartHomeV1ExecuteStatus extends js.Object

object SmartHomeV1ExecuteStatus {
  @scala.inline
  def ERROR: typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def OFFLINE: typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.OFFLINE = this.cast("OFFLINE")
  @scala.inline
  def PENDING: typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.PENDING = this.cast("PENDING")
  @scala.inline
  def SUCCESS: typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.SUCCESS = this.cast("SUCCESS")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

