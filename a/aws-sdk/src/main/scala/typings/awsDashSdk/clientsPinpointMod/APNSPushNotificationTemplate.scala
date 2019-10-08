package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APNSPushNotificationTemplate extends js.Object {
  /**
    * The action to occur if a recipient taps a push notification that's based on the message template. Valid values are: OPEN_APP - Your app opens or it becomes the foreground app if it was sent to the background. This is the default action. DEEP_LINK - Your app opens and displays a designated user interface in the app. This setting uses the deep-linking features of the iOS platform. URL - The default mobile browser on the recipient's device opens and loads the web page at a URL that you specify.
    */
  var Action: js.UndefOr[typings.awsDashSdk.clientsPinpointMod.Action] = js.undefined
  /**
    * The message body to use in push notifications that are based on the message template.
    */
  var Body: js.UndefOr[__string] = js.undefined
  /**
    * The URL of an image or video to display in push notifications that are based on the message template.
    */
  var MediaUrl: js.UndefOr[__string] = js.undefined
  /**
    * The key for the sound to play when the recipient receives a push notification that's based on the message template. The value for this key is the name of a sound file in your app's main bundle or the Library/Sounds folder in your app's data container. If the sound file can't be found or you specify default for the value, the system plays the default alert sound.
    */
  var Sound: js.UndefOr[__string] = js.undefined
  /**
    * The title to use in push notifications that are based on the message template. This title appears above the notification message on a recipient's device.
    */
  var Title: js.UndefOr[__string] = js.undefined
  /**
    * The URL to open in the recipient's default mobile browser, if a recipient taps a push notification that's based on the message template and the value of the Action property is URL.
    */
  var Url: js.UndefOr[__string] = js.undefined
}

object APNSPushNotificationTemplate {
  @scala.inline
  def apply(
    Action: Action = null,
    Body: __string = null,
    MediaUrl: __string = null,
    Sound: __string = null,
    Title: __string = null,
    Url: __string = null
  ): APNSPushNotificationTemplate = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Body != null) __obj.updateDynamic("Body")(Body)
    if (MediaUrl != null) __obj.updateDynamic("MediaUrl")(MediaUrl)
    if (Sound != null) __obj.updateDynamic("Sound")(Sound)
    if (Title != null) __obj.updateDynamic("Title")(Title)
    if (Url != null) __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[APNSPushNotificationTemplate]
  }
}

