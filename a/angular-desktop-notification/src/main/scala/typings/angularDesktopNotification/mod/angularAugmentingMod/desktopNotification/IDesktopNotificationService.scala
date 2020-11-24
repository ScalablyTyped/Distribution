package typings.angularDesktopNotification.mod.angularAugmentingMod.desktopNotification

import typings.angular.mod.IPromise
import typings.angularDesktopNotification.anon.Default
import typings.std.NotificationOptions
import typings.std.NotificationPermission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-name
@js.native
trait IDesktopNotificationService extends js.Object {
  
  /**
    * This method will get the current permission set in the browser which could be one of the ff.
    * - desktopNotification.permissions.default
    * - desktopNotification.permissions.denied
    * - desktopNotification.permissions.granted
    */
  def currentPermission(): NotificationPermission = js.native
  
  /**
    * This method returns true if the browser supports the Notification API, false otherwise
    */
  def isSupported(): Boolean = js.native
  
  var permissions: Default = js.native
  
  /**
    * This method returns a $q promise, if the user allowed the notification the successCallback will be executed,
    * errorCallback will be executed otherwise
    */
  def requestPermission(): IPromise[NotificationPermission] = js.native
  
  /**
    * This method will display the notification using the parameter values.
    * See all available options here at https://developer.mozilla.org/en-US/docs/Web/API/notification#Instance_properties
    */
  def show(title: String): Unit = js.native
  def show(title: String, options: AugmentedNotificationOptions): Unit = js.native
  def show(title: String, options: NotificationOptions): Unit = js.native
}
