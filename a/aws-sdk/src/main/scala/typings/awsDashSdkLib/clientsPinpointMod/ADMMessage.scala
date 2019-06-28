package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ADMMessage extends js.Object {
  /**
    * The action to occur if the recipient taps the push notification. Valid values are: OPEN_APP - Your app opens or it becomes the foreground app if it was sent to the background. This is the default action. DEEP_LINK - Your app opens and displays a designated user interface in the app. This action uses the deep-linking features of the Android platform. URL - The default mobile browser on the recipient's device opens and loads the web page at a URL that you specify.
    */
  var Action: js.UndefOr[Action] = js.undefined
  /**
    * The body of the notification message.
    */
  var Body: js.UndefOr[__string] = js.undefined
  /**
    * An arbitrary string that indicates that multiple messages are logically the same and that Amazon Device Messaging (ADM) can drop previously enqueued messages in favor of this message.
    */
  var ConsolidationKey: js.UndefOr[__string] = js.undefined
  /**
    * The JSON data payload to use for the push notification, if the notification is a silent push notification. This payload is added to the data.pinpoint.jsonBody object of the notification.
    */
  var Data: js.UndefOr[MapOf__string] = js.undefined
  /**
    * The amount of time, in seconds, that ADM should store the message if the recipient's device is offline. Amazon Pinpoint specifies this value in the expiresAfter parameter when it sends the notification message to ADM.
    */
  var ExpiresAfter: js.UndefOr[__string] = js.undefined
  /**
    * The icon image name of the asset saved in your app.
    */
  var IconReference: js.UndefOr[__string] = js.undefined
  /**
    * The URL of the large icon image to display in the content view of the push notification.
    */
  var ImageIconUrl: js.UndefOr[__string] = js.undefined
  /**
    * The URL of an image to display in the push notification.
    */
  var ImageUrl: js.UndefOr[__string] = js.undefined
  /**
    * The base64-encoded, MD5 checksum of the value specified by the Data property. ADM uses the MD5 value to verify the integrity of the data.
    */
  var MD5: js.UndefOr[__string] = js.undefined
  /**
    * The raw, JSON-formatted string to use as the payload for the notification message. This value overrides the message.
    */
  var RawContent: js.UndefOr[__string] = js.undefined
  /**
    * Specifies whether the notification is a silent push notification, which is a push notification that doesn't display on a recipient's device. Silent push notifications can be used for cases such as updating an app's configuration or supporting phone home functionality.
    */
  var SilentPush: js.UndefOr[__boolean] = js.undefined
  /**
    * The URL of the small icon image to display in the status bar and the content view of the push notification.
    */
  var SmallImageIconUrl: js.UndefOr[__string] = js.undefined
  /**
    * The sound to play when the recipient receives the push notification. You can use the default stream or specify the file name of a sound resource that's bundled in your app. On an Android platform, the sound file must reside in /res/raw/.
    */
  var Sound: js.UndefOr[__string] = js.undefined
  /**
    * The default message variables to use in the notification message. You can override the default variables with individual address variables.
    */
  var Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined
  /**
    * The title to display above the notification message on the recipient's device.
    */
  var Title: js.UndefOr[__string] = js.undefined
  /**
    * The URL to open in the recipient's default mobile browser, if a recipient taps the push notification and the value of the Action property is URL.
    */
  var Url: js.UndefOr[__string] = js.undefined
}

object ADMMessage {
  @scala.inline
  def apply(
    Action: Action = null,
    Body: __string = null,
    ConsolidationKey: __string = null,
    Data: MapOf__string = null,
    ExpiresAfter: __string = null,
    IconReference: __string = null,
    ImageIconUrl: __string = null,
    ImageUrl: __string = null,
    MD5: __string = null,
    RawContent: __string = null,
    SilentPush: js.UndefOr[__boolean] = js.undefined,
    SmallImageIconUrl: __string = null,
    Sound: __string = null,
    Substitutions: MapOfListOf__string = null,
    Title: __string = null,
    Url: __string = null
  ): ADMMessage = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Body != null) __obj.updateDynamic("Body")(Body)
    if (ConsolidationKey != null) __obj.updateDynamic("ConsolidationKey")(ConsolidationKey)
    if (Data != null) __obj.updateDynamic("Data")(Data)
    if (ExpiresAfter != null) __obj.updateDynamic("ExpiresAfter")(ExpiresAfter)
    if (IconReference != null) __obj.updateDynamic("IconReference")(IconReference)
    if (ImageIconUrl != null) __obj.updateDynamic("ImageIconUrl")(ImageIconUrl)
    if (ImageUrl != null) __obj.updateDynamic("ImageUrl")(ImageUrl)
    if (MD5 != null) __obj.updateDynamic("MD5")(MD5)
    if (RawContent != null) __obj.updateDynamic("RawContent")(RawContent)
    if (!js.isUndefined(SilentPush)) __obj.updateDynamic("SilentPush")(SilentPush)
    if (SmallImageIconUrl != null) __obj.updateDynamic("SmallImageIconUrl")(SmallImageIconUrl)
    if (Sound != null) __obj.updateDynamic("Sound")(Sound)
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions)
    if (Title != null) __obj.updateDynamic("Title")(Title)
    if (Url != null) __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[ADMMessage]
  }
}

