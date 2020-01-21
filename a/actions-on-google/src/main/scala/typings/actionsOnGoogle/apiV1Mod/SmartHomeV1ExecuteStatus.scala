package typings.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.actionsOnGoogle.actionsOnGoogleStrings.SUCCESS
  - typings.actionsOnGoogle.actionsOnGoogleStrings.PENDING
  - typings.actionsOnGoogle.actionsOnGoogleStrings.OFFLINE
  - typings.actionsOnGoogle.actionsOnGoogleStrings.ERROR
*/
trait SmartHomeV1ExecuteStatus extends js.Object

object SmartHomeV1ExecuteStatus {
  @scala.inline
  def ERROR: typings.actionsOnGoogle.actionsOnGoogleStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def OFFLINE: typings.actionsOnGoogle.actionsOnGoogleStrings.OFFLINE = this.cast("OFFLINE")
  @scala.inline
  def PENDING: typings.actionsOnGoogle.actionsOnGoogleStrings.PENDING = this.cast("PENDING")
  @scala.inline
  def SUCCESS: typings.actionsOnGoogle.actionsOnGoogleStrings.SUCCESS = this.cast("SUCCESS")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

