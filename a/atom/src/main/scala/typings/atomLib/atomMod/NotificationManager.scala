package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationManager extends js.Object {
  /** Add an error notification. */
  def addError(message: java.lang.String): Notification = js.native
  /** Add an error notification. */
  def addError(message: java.lang.String, options: ErrorNotificationOptions): Notification = js.native
  /** Add a fatal error notification. */
  def addFatalError(message: java.lang.String): Notification = js.native
  /** Add a fatal error notification. */
  def addFatalError(message: java.lang.String, options: ErrorNotificationOptions): Notification = js.native
  /** Add an informational notification. */
  def addInfo(message: java.lang.String): Notification = js.native
  /** Add an informational notification. */
  def addInfo(message: java.lang.String, options: NotificationOptions): Notification = js.native
  // Adding Notifications
  /** Add a success notification. */
  def addSuccess(message: java.lang.String): Notification = js.native
  // Adding Notifications
  /** Add a success notification. */
  def addSuccess(message: java.lang.String, options: NotificationOptions): Notification = js.native
  /** Add a warning notification. */
  def addWarning(message: java.lang.String): Notification = js.native
  /** Add a warning notification. */
  def addWarning(message: java.lang.String, options: NotificationOptions): Notification = js.native
  // Managing Notifications
  /** Clear all the notifications. */
  def clear(): scala.Unit = js.native
  // Getting Notifications
  /** Get all the notifications. */
  def getNotifications(): js.Array[Notification] = js.native
  // Events
  /** Invoke the given callback after a notification has been added. */
  def onDidAddNotification(callback: js.Function1[/* notification */ Notification, scala.Unit]): Disposable = js.native
  /** Invoke the given callback after the notifications have been cleared. */
  def onDidClearNotifications(callback: js.Function0[scala.Unit]): Disposable = js.native
}

