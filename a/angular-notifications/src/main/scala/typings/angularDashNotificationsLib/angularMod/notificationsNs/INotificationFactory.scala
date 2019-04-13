package typings
package angularDashNotificationsLib.angularMod.notificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INotificationFactory
  extends angularLib.angularMod.IModule {
  def awesomeNotify(
    `type`: java.lang.String,
    icon: java.lang.String,
    title: java.lang.String,
    content: java.lang.String,
    userData: js.Any
  ): INotification = js.native
  def clear(): scala.Unit = js.native
  /* ========== SETTINGS RELATED METHODS =============*/
  def disableHtml5Mode(): scala.Unit = js.native
  def disableType(notificationType: java.lang.String): scala.Unit = js.native
  def enableHtml5Mode(): scala.Unit = js.native
  def enableType(notificationType: java.lang.String): scala.Unit = js.native
  def error(title: java.lang.String): INotification = js.native
  def error(title: java.lang.String, content: java.lang.String): INotification = js.native
  def error(title: java.lang.String, content: java.lang.String, userData: js.Any): INotification = js.native
  /* ============ QUERYING RELATED METHODS ============*/
  def getAll(): js.Array[INotification] = js.native
  def getQueue(): js.Array[INotification] = js.native
  def getSettings(): ISettings = js.native
  /* ============== NOTIFICATION METHODS ==============*/
  def info(title: java.lang.String): INotification = js.native
  def info(title: java.lang.String, content: java.lang.String): INotification = js.native
  def info(title: java.lang.String, content: java.lang.String, userData: js.Any): INotification = js.native
  def makeNotification(
    `type`: java.lang.String,
    image: java.lang.String,
    icon: java.lang.String,
    title: java.lang.String,
    content: java.lang.String,
    userData: js.Any
  ): INotification = js.native
  def notify(image: java.lang.String, title: java.lang.String, content: java.lang.String, userData: js.Any): INotification = js.native
  def requestHtml5ModePermissions(): scala.Boolean = js.native
  def restore(): scala.Unit = js.native
  /* ============ PERSISTENCE METHODS ============ */
  def save(): scala.Unit = js.native
  def success(title: java.lang.String): INotification = js.native
  def success(title: java.lang.String, content: java.lang.String): INotification = js.native
  def success(title: java.lang.String, content: java.lang.String, userData: js.Any): INotification = js.native
  def toggleHtml5Mode(): scala.Unit = js.native
  def toggleType(notificationType: java.lang.String): scala.Unit = js.native
  def warning(title: java.lang.String): INotification = js.native
  def warning(title: java.lang.String, content: java.lang.String): INotification = js.native
  def warning(title: java.lang.String, content: java.lang.String, userData: js.Any): INotification = js.native
}

