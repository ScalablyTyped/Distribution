package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultPushNotificationMessage extends js.Object {
  /**
    * The default action to occur if a recipient taps the push notification. Valid values are: OPEN_APP - Your app opens or it becomes the foreground app if it was sent to the background. This is the default action. DEEP_LINK - Your app opens and displays a designated user interface in the app. This setting uses the deep-linking features of the iOS and Android platforms. URL - The default mobile browser on the recipient's device opens and loads the web page at a URL that you specify.
    */
  var Action: js.UndefOr[typings.awsDashSdk.clientsPinpointMod.Action] = js.undefined
  /**
    * The default body of the notification message.
    */
  var Body: js.UndefOr[__string] = js.undefined
  /**
    * The JSON data payload to use for the default push notification, if the notification is a silent push notification. This payload is added to the data.pinpoint.jsonBody object of the notification.
    */
  var Data: js.UndefOr[MapOf__string] = js.undefined
  /**
    * Specifies whether the default notification is a silent push notification, which is a push notification that doesn't display on a recipient's device. Silent push notifications can be used for cases such as updating an app's configuration or delivering messages to an in-app notification center.
    */
  var SilentPush: js.UndefOr[__boolean] = js.undefined
  /**
    * The default message variables to use in the notification message. You can override the default variables with individual address variables.
    */
  var Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined
  /**
    * The default title to display above the notification message on a recipient's device.
    */
  var Title: js.UndefOr[__string] = js.undefined
  /**
    * The default URL to open in a recipient's default mobile browser, if a recipient taps the push notification and the value of the Action property is URL.
    */
  var Url: js.UndefOr[__string] = js.undefined
}

object DefaultPushNotificationMessage {
  @scala.inline
  def apply(
    Action: Action = null,
    Body: __string = null,
    Data: MapOf__string = null,
    SilentPush: js.UndefOr[__boolean] = js.undefined,
    Substitutions: MapOfListOf__string = null,
    Title: __string = null,
    Url: __string = null
  ): DefaultPushNotificationMessage = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Body != null) __obj.updateDynamic("Body")(Body)
    if (Data != null) __obj.updateDynamic("Data")(Data)
    if (!js.isUndefined(SilentPush)) __obj.updateDynamic("SilentPush")(SilentPush)
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions)
    if (Title != null) __obj.updateDynamic("Title")(Title)
    if (Url != null) __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[DefaultPushNotificationMessage]
  }
}

