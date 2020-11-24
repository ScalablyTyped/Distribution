package typings.angularNotifications.mod.notifications

import typings.angular.mod.IModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INotificationFactory extends IModule {
  
  def awesomeNotify(`type`: String, icon: String, title: String, content: String, userData: js.Any): INotification = js.native
  
  def clear(): Unit = js.native
  
  /* ========== SETTINGS RELATED METHODS =============*/
  def disableHtml5Mode(): Unit = js.native
  
  def disableType(notificationType: String): Unit = js.native
  
  def enableHtml5Mode(): Unit = js.native
  
  def enableType(notificationType: String): Unit = js.native
  
  def error(title: String): INotification = js.native
  def error(title: String, content: String): INotification = js.native
  def error(title: String, content: String, userData: js.Any): INotification = js.native
  
  /* ============ QUERYING RELATED METHODS ============*/
  def getAll(): js.Array[INotification] = js.native
  
  def getQueue(): js.Array[INotification] = js.native
  
  def getSettings(): ISettings = js.native
  
  /* ============== NOTIFICATION METHODS ==============*/
  def info(title: String): INotification = js.native
  def info(title: String, content: String): INotification = js.native
  def info(title: String, content: String, userData: js.Any): INotification = js.native
  
  def makeNotification(`type`: String, image: String, icon: String, title: String, content: String, userData: js.Any): INotification = js.native
  
  def notify(image: String, title: String, content: String, userData: js.Any): INotification = js.native
  
  def requestHtml5ModePermissions(): Boolean = js.native
  
  def restore(): Unit = js.native
  
  /* ============ PERSISTENCE METHODS ============ */
  def save(): Unit = js.native
  
  def success(title: String): INotification = js.native
  def success(title: String, content: String): INotification = js.native
  def success(title: String, content: String, userData: js.Any): INotification = js.native
  
  def toggleHtml5Mode(): Unit = js.native
  
  def toggleType(notificationType: String): Unit = js.native
  
  def warning(title: String): INotification = js.native
  def warning(title: String, content: String): INotification = js.native
  def warning(title: String, content: String, userData: js.Any): INotification = js.native
}
