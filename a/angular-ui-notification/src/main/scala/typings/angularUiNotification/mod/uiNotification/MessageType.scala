package typings.angularUiNotification.mod.uiNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.angularUiNotification.angularUiNotificationStrings.primary
  - typings.angularUiNotification.angularUiNotificationStrings.info
  - typings.angularUiNotification.angularUiNotificationStrings.success
  - typings.angularUiNotification.angularUiNotificationStrings.warning
  - typings.angularUiNotification.angularUiNotificationStrings.error
*/
trait MessageType extends js.Object

object MessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.angularUiNotification.angularUiNotificationStrings.error = this.cast("error")
  @scala.inline
  def info: typings.angularUiNotification.angularUiNotificationStrings.info = this.cast("info")
  @scala.inline
  def primary: typings.angularUiNotification.angularUiNotificationStrings.primary = this.cast("primary")
  @scala.inline
  def success: typings.angularUiNotification.angularUiNotificationStrings.success = this.cast("success")
  @scala.inline
  def warning: typings.angularUiNotification.angularUiNotificationStrings.warning = this.cast("warning")
}

