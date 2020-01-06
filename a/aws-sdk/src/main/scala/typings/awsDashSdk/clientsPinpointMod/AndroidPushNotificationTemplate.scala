package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidPushNotificationTemplate extends js.Object {
  /**
    * The action to occur if a recipient taps a push notification that's based on the message template. Valid values are: OPEN_APP - Your app opens or it becomes the foreground app if it was sent to the background. This is the default action. DEEP_LINK - Your app opens and displays a designated user interface in the app. This action uses the deep-linking features of the Android platform. URL - The default mobile browser on the recipient's device opens and loads the web page at a URL that you specify.
    */
  var Action: js.UndefOr[typings.awsDashSdk.clientsPinpointMod.Action] = js.native
  /**
    * The message body to use in a push notification that's based on the message template.
    */
  var Body: js.UndefOr[__string] = js.native
  /**
    * The URL of the large icon image to display in the content view of a push notification that's based on the message template.
    */
  var ImageIconUrl: js.UndefOr[__string] = js.native
  /**
    * The URL of an image to display in a push notification that's based on the message template.
    */
  var ImageUrl: js.UndefOr[__string] = js.native
  /**
    * The raw, JSON-formatted string to use as the payload for a push notification that's based on the message template. If specified, this value overrides all other content for the message template.
    */
  var RawContent: js.UndefOr[__string] = js.native
  /**
    * The URL of the small icon image to display in the status bar and the content view of a push notification that's based on the message template.
    */
  var SmallImageIconUrl: js.UndefOr[__string] = js.native
  /**
    * The sound to play when a recipient receives a push notification that's based on the message template. You can use the default stream or specify the file name of a sound resource that's bundled in your app. On an Android platform, the sound file must reside in /res/raw/.
    */
  var Sound: js.UndefOr[__string] = js.native
  /**
    * The title to use in a push notification that's based on the message template. This title appears above the notification message on a recipient's device.
    */
  var Title: js.UndefOr[__string] = js.native
  /**
    * The URL to open in a recipient's default mobile browser, if a recipient taps a a push notification that's based on the message template and the value of the Action property is URL.
    */
  var Url: js.UndefOr[__string] = js.native
}

object AndroidPushNotificationTemplate {
  @scala.inline
  def apply(
    Action: Action = null,
    Body: __string = null,
    ImageIconUrl: __string = null,
    ImageUrl: __string = null,
    RawContent: __string = null,
    SmallImageIconUrl: __string = null,
    Sound: __string = null,
    Title: __string = null,
    Url: __string = null
  ): AndroidPushNotificationTemplate = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (ImageIconUrl != null) __obj.updateDynamic("ImageIconUrl")(ImageIconUrl.asInstanceOf[js.Any])
    if (ImageUrl != null) __obj.updateDynamic("ImageUrl")(ImageUrl.asInstanceOf[js.Any])
    if (RawContent != null) __obj.updateDynamic("RawContent")(RawContent.asInstanceOf[js.Any])
    if (SmallImageIconUrl != null) __obj.updateDynamic("SmallImageIconUrl")(SmallImageIconUrl.asInstanceOf[js.Any])
    if (Sound != null) __obj.updateDynamic("Sound")(Sound.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidPushNotificationTemplate]
  }
}

