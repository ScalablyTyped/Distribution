package typings
package angularDashDesktopDashNotificationLib.angularDashDesktopDashNotificationMod.angularMod.desktopNotificationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
@js.native
trait IDesktopNotificationService extends js.Object {
  var permissions: angularDashDesktopDashNotificationLib.Anon_Denied = js.native
  /**
               * This method will get the current permission set in the browser which could be one of the ff.
               * - desktopNotification.permissions.default
               * - desktopNotification.permissions.denied
               * - desktopNotification.permissions.granted
               */
  def currentPermission(): stdLib.NotificationPermission = js.native
  /**
               * This method returns true if the browser supports the Notification API, false otherwise
               */
  def isSupported(): scala.Boolean = js.native
  /**
               * This method returns a $q promise, if the user allowed the notification the successCallback will be executed,
               * errorCallback will be executed otherwise
               */
  def requestPermission(): angularLib.angularMod.angularNs.IPromise[stdLib.NotificationPermission] = js.native
  /**
               * This method will display the notification using the parameter values.
               * See all available options here at https://developer.mozilla.org/en-US/docs/Web/API/notification#Instance_properties
               */
  def show(title: java.lang.String): scala.Unit = js.native
  /**
               * This method will display the notification using the parameter values.
               * See all available options here at https://developer.mozilla.org/en-US/docs/Web/API/notification#Instance_properties
               */
  def show(title: java.lang.String, options: AugmentedNotificationOptions): scala.Unit = js.native
  /**
               * This method will display the notification using the parameter values.
               * See all available options here at https://developer.mozilla.org/en-US/docs/Web/API/notification#Instance_properties
               */
  def show(title: java.lang.String, options: stdLib.NotificationOptions): scala.Unit = js.native
}

