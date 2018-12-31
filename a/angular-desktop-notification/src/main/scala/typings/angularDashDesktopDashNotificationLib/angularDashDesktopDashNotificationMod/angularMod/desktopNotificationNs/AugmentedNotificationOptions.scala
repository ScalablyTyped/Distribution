package typings
package angularDashDesktopDashNotificationLib.angularDashDesktopDashNotificationMod.angularMod.desktopNotificationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All options available during show notification according to https://developer.mozilla.org/en-US/docs/Web/API/notification
  */
trait AugmentedNotificationOptions
  extends stdLib.NotificationOptions {
  /**
    * The onclick property of the Notification interface specifies an event listener to receive click events.
    * These events occur when the user clicks on a displayed Notification.
    *
    * The default behavior is to move the focus to the viewport of the notification's related browsing context.
    * If you don't want that behaviour, call preventDefault() on the event object.
    */
  var onClick: js.UndefOr[js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]] = js.undefined
  /**
    * The onerror property of the Notification interface specifies an event listener to receive error events.
    * These events occur when something goes wrong with a Notification (in many cases an error preventing the notification from being displayed.)
    *
    * A function which serves as the event handler for the error event. When an error occurs, the specified function will be called.
    * If null, no error handler is in effect.
    */
  var onError: js.UndefOr[stdLib.EventListener] = js.undefined
  /**
    * The title read-only property of the Notification interface indicates the title of the notification, as specified in the title parameter
    * of the Notification() constructor.
    *
    * Note: This feature is available in Web Workers.
    * Ref: https://developer.mozilla.org/en-US/docs/Web/API/Notification/title
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The vibrate read-only property of the Notification interface specifies a a vibration pattern for the device's vibration hardware to emit
    * when the notification fires. This is specified in the vibrate option of the Notification() constructor.
    *
    * Note: This property is not currently supported in any browser.
    * Ref: https://developer.mozilla.org/en-US/docs/Web/API/Notification/vibrate
    */
  @JSName("vibrate")
  var vibrate_AugmentedNotificationOptions: js.UndefOr[js.Any] = js.undefined
}

