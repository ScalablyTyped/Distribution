package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationManager extends js.Object {
  /** Add an error notification. */
  def addError(message: String): Notification = js.native
  def addError(message: String, options: ErrorNotificationOptions): Notification = js.native
  /** Add a fatal error notification. */
  def addFatalError(message: String): Notification = js.native
  def addFatalError(message: String, options: ErrorNotificationOptions): Notification = js.native
  /** Add an informational notification. */
  def addInfo(message: String): Notification = js.native
  def addInfo(message: String, options: NotificationOptions): Notification = js.native
  // Adding Notifications
  /** Add a success notification. */
  def addSuccess(message: String): Notification = js.native
  def addSuccess(message: String, options: NotificationOptions): Notification = js.native
  /** Add a warning notification. */
  def addWarning(message: String): Notification = js.native
  def addWarning(message: String, options: NotificationOptions): Notification = js.native
  // Managing Notifications
  /** Clear all the notifications. */
  def clear(): Unit = js.native
  // Getting Notifications
  /** Get all the notifications. */
  def getNotifications(): js.Array[Notification] = js.native
  // Events
  /** Invoke the given callback after a notification has been added. */
  def onDidAddNotification(callback: js.Function1[/* notification */ Notification, Unit]): Disposable = js.native
  /** Invoke the given callback after the notifications have been cleared. */
  def onDidClearNotifications(callback: js.Function0[Unit]): Disposable = js.native
}

