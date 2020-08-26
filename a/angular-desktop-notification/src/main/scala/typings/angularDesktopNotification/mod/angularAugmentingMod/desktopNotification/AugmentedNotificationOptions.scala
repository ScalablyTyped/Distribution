package typings.angularDesktopNotification.mod.angularAugmentingMod.desktopNotification

import typings.std.Event
import typings.std.EventListener
import typings.std.MouseEvent
import typings.std.NotificationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All options available during show notification according to https://developer.mozilla.org/en-US/docs/Web/API/notification
  */
@js.native
trait AugmentedNotificationOptions extends NotificationOptions {
  /**
    * The onclick property of the Notification interface specifies an event listener to receive click events.
    * These events occur when the user clicks on a displayed Notification.
    *
    * The default behavior is to move the focus to the viewport of the notification's related browsing context.
    * If you don't want that behaviour, call preventDefault() on the event object.
    */
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  /**
    * The onerror property of the Notification interface specifies an event listener to receive error events.
    * These events occur when something goes wrong with a Notification (in many cases an error preventing the notification from being displayed.)
    *
    * A function which serves as the event handler for the error event. When an error occurs, the specified function will be called.
    * If null, no error handler is in effect.
    */
  var onError: js.UndefOr[EventListener] = js.native
  /**
    * The title read-only property of the Notification interface indicates the title of the notification, as specified in the title parameter
    * of the Notification() constructor.
    *
    * Note: This feature is available in Web Workers.
    * Ref: https://developer.mozilla.org/en-US/docs/Web/API/Notification/title
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The vibrate read-only property of the Notification interface specifies a a vibration pattern for the device's vibration hardware to emit
    * when the notification fires. This is specified in the vibrate option of the Notification() constructor.
    *
    * Note: This property is not currently supported in any browser.
    * Ref: https://developer.mozilla.org/en-US/docs/Web/API/Notification/vibrate
    */
  @JSName("vibrate")
  var vibrate_AugmentedNotificationOptions: js.UndefOr[js.Any] = js.native
}

object AugmentedNotificationOptions {
  @scala.inline
  def apply(): AugmentedNotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AugmentedNotificationOptions]
  }
  @scala.inline
  implicit class AugmentedNotificationOptionsOps[Self <: AugmentedNotificationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnClick(value: /* event */ MouseEvent => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnError(value: /* evt */ Event => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setVibrate(value: js.Any): Self = this.set("vibrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVibrate: Self = this.set("vibrate", js.undefined)
  }
  
}

