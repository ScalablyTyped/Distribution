package typings.angularDesktopNotification.mod.angularAugmentingMod.desktopNotification

import typings.std.EventListener
import typings.std.Event_
import typings.std.MouseEvent
import typings.std.NotificationAction
import typings.std.NotificationDirection
import typings.std.NotificationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All options available during show notification according to https://developer.mozilla.org/en-US/docs/Web/API/notification
  */
trait AugmentedNotificationOptions extends NotificationOptions {
  /**
    * The onclick property of the Notification interface specifies an event listener to receive click events.
    * These events occur when the user clicks on a displayed Notification.
    *
    * The default behavior is to move the focus to the viewport of the notification's related browsing context.
    * If you don't want that behaviour, call preventDefault() on the event object.
    */
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  /**
    * The onerror property of the Notification interface specifies an event listener to receive error events.
    * These events occur when something goes wrong with a Notification (in many cases an error preventing the notification from being displayed.)
    *
    * A function which serves as the event handler for the error event. When an error occurs, the specified function will be called.
    * If null, no error handler is in effect.
    */
  var onError: js.UndefOr[EventListener] = js.undefined
  /**
    * The title read-only property of the Notification interface indicates the title of the notification, as specified in the title parameter
    * of the Notification() constructor.
    *
    * Note: This feature is available in Web Workers.
    * Ref: https://developer.mozilla.org/en-US/docs/Web/API/Notification/title
    */
  var title: js.UndefOr[String] = js.undefined
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

object AugmentedNotificationOptions {
  @scala.inline
  def apply(
    actions: js.Array[NotificationAction] = null,
    badge: String = null,
    body: String = null,
    data: js.Any = null,
    dir: NotificationDirection = null,
    icon: String = null,
    image: String = null,
    lang: String = null,
    onClick: /* event */ MouseEvent => Unit = null,
    onError: /* evt */ Event_ => Unit = null,
    renotify: js.UndefOr[Boolean] = js.undefined,
    requireInteraction: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    timestamp: Int | Double = null,
    title: String = null,
    vibrate: js.Any = null
  ): AugmentedNotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (!js.isUndefined(renotify)) __obj.updateDynamic("renotify")(renotify.asInstanceOf[js.Any])
    if (!js.isUndefined(requireInteraction)) __obj.updateDynamic("requireInteraction")(requireInteraction.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (vibrate != null) __obj.updateDynamic("vibrate")(vibrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AugmentedNotificationOptions]
  }
}

