package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
  /**
    * The action to occur if a recipient taps the push notification. Valid values are: OPEN_APP - Your app opens or it becomes the foreground app if it was sent to the background. This is the default action. DEEP_LINK - Your app opens and displays a designated user interface in the app. This setting uses the deep-linking features of iOS and Android. URL - The default mobile browser on the recipient's device opens and loads the web page at a URL that you specify.
    */
  var Action: js.UndefOr[typings.awsDashSdk.clientsPinpointMod.Action] = js.native
  /**
    * The body of the notification message. The maximum number of characters is 200.
    */
  var Body: js.UndefOr[__string] = js.native
  /**
    * The URL of the image to display as the push-notification icon, such as the icon for the app.
    */
  var ImageIconUrl: js.UndefOr[__string] = js.native
  /**
    * The URL of the image to display as the small, push-notification icon, such as a small version of the icon for the app.
    */
  var ImageSmallIconUrl: js.UndefOr[__string] = js.native
  /**
    * The URL of an image to display in the push notification.
    */
  var ImageUrl: js.UndefOr[__string] = js.native
  /**
    * The JSON payload to use for a silent push notification.
    */
  var JsonBody: js.UndefOr[__string] = js.native
  /**
    * The URL of the image or video to display in the push notification.
    */
  var MediaUrl: js.UndefOr[__string] = js.native
  /**
    * The raw, JSON-formatted string to use as the payload for the notification message. If specified, this value overrides all other content for the message.
    */
  var RawContent: js.UndefOr[__string] = js.native
  /**
    * Specifies whether the notification is a silent push notification, which is a push notification that doesn't display on a recipient's device. Silent push notifications can be used for cases such as updating an app's configuration, displaying messages in an in-app message center, or supporting phone home functionality.
    */
  var SilentPush: js.UndefOr[__boolean] = js.native
  /**
    * The number of seconds that the push-notification service should keep the message, if the service is unable to deliver the notification the first time. This value is converted to an expiration value when it's sent to a push-notification service. If this value is 0, the service treats the notification as if it expires immediately and the service doesn't store or try to deliver the notification again. This value doesn't apply to messages that are sent through the Amazon Device Messaging (ADM) service.
    */
  var TimeToLive: js.UndefOr[__integer] = js.native
  /**
    * The title to display above the notification message on a recipient's device.
    */
  var Title: js.UndefOr[__string] = js.native
  /**
    * The URL to open in a recipient's default mobile browser, if a recipient taps the push notification and the value of the Action property is URL.
    */
  var Url: js.UndefOr[__string] = js.native
}

object Message {
  @scala.inline
  def apply(
    Action: Action = null,
    Body: __string = null,
    ImageIconUrl: __string = null,
    ImageSmallIconUrl: __string = null,
    ImageUrl: __string = null,
    JsonBody: __string = null,
    MediaUrl: __string = null,
    RawContent: __string = null,
    SilentPush: js.UndefOr[Boolean] = js.undefined,
    TimeToLive: Int | Double = null,
    Title: __string = null,
    Url: __string = null
  ): Message = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (ImageIconUrl != null) __obj.updateDynamic("ImageIconUrl")(ImageIconUrl.asInstanceOf[js.Any])
    if (ImageSmallIconUrl != null) __obj.updateDynamic("ImageSmallIconUrl")(ImageSmallIconUrl.asInstanceOf[js.Any])
    if (ImageUrl != null) __obj.updateDynamic("ImageUrl")(ImageUrl.asInstanceOf[js.Any])
    if (JsonBody != null) __obj.updateDynamic("JsonBody")(JsonBody.asInstanceOf[js.Any])
    if (MediaUrl != null) __obj.updateDynamic("MediaUrl")(MediaUrl.asInstanceOf[js.Any])
    if (RawContent != null) __obj.updateDynamic("RawContent")(RawContent.asInstanceOf[js.Any])
    if (!js.isUndefined(SilentPush)) __obj.updateDynamic("SilentPush")(SilentPush.asInstanceOf[js.Any])
    if (TimeToLive != null) __obj.updateDynamic("TimeToLive")(TimeToLive.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

