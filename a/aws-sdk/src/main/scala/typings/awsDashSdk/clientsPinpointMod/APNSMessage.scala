package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APNSMessage extends js.Object {
  /**
    * The action to occur if the recipient taps the push notification. Valid values are: OPEN_APP - Your app opens or it becomes the foreground app if it was sent to the background. This is the default action. DEEP_LINK - Your app opens and displays a designated user interface in the app. This setting uses the deep-linking features of the iOS platform. URL - The default mobile browser on the recipient's device opens and loads the web page at a URL that you specify.
    */
  var Action: js.UndefOr[typings.awsDashSdk.clientsPinpointMod.Action] = js.undefined
  /**
    * The key that indicates whether and how to modify the badge of your app's icon when the recipient receives the push notification. If this key isn't included in the dictionary, the badge doesn't change. To remove the badge, set this value to 0.
    */
  var Badge: js.UndefOr[__integer] = js.undefined
  /**
    * The body of the notification message.
    */
  var Body: js.UndefOr[__string] = js.undefined
  /**
    * The key that indicates the notification type for the push notification. This key is a value that's defined by the identifier property of one of your app's registered categories.
    */
  var Category: js.UndefOr[__string] = js.undefined
  /**
    * An arbitrary identifier that, if assigned to multiple messages, APNs uses to coalesce the messages into a single push notification instead of delivering each message individually. This value can't exceed 64 bytes. Amazon Pinpoint specifies this value in the apns-collapse-id request header when it sends the notification message to APNs.
    */
  var CollapseId: js.UndefOr[__string] = js.undefined
  /**
    * The JSON payload to use for a silent push notification. This payload is added to the data.pinpoint.jsonBody object of the notification.
    */
  var Data: js.UndefOr[MapOf__string] = js.undefined
  /**
    * The URL of an image or video to display in the push notification.
    */
  var MediaUrl: js.UndefOr[__string] = js.undefined
  /**
    * The authentication method that you want Amazon Pinpoint to use when authenticating with Apple Push Notification service (APNs), CERTIFICATE or TOKEN.
    */
  var PreferredAuthenticationMethod: js.UndefOr[__string] = js.undefined
  /**
    * para>5 - Low priority, the notification might be delayed, delivered as part of a group, or throttled./listitem> 10 - High priority, the notification is sent immediately. This is the default value. A high priority notification should trigger an alert, play a sound, or badge your app's icon on the recipient's device./para> Amazon Pinpoint specifies this value in the apns-priority request header when it sends the notification message to APNs. The equivalent values for Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), are normal, for 5, and high, for 10. If you specify an FCM value for this property, Amazon Pinpoint accepts and converts the value to the corresponding APNs value.
    */
  var Priority: js.UndefOr[__string] = js.undefined
  /**
    * The raw, JSON-formatted string to use as the payload for the notification message. This value overrides the message.
    */
  var RawContent: js.UndefOr[__string] = js.undefined
  /**
    * Specifies whether the notification is a silent push notification, which is a push notification that doesn't display on a recipient's device. Silent push notifications can be used for cases such as updating an app's configuration, displaying messages in an in-app message center, or supporting phone home functionality.
    */
  var SilentPush: js.UndefOr[__boolean] = js.undefined
  /**
    * The key for the sound to play when the recipient receives the push notification. The value of this key is the name of a sound file in your app's main bundle or the Library/Sounds folder in your app's data container. If the sound file can't be found or you specify default for the value, the system plays the default alert sound.
    */
  var Sound: js.UndefOr[__string] = js.undefined
  /**
    * The default message variables to use in the notification message. You can override these default variables with individual address variables.
    */
  var Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined
  /**
    * The key that represents your app-specific identifier for grouping notifications. If you provide a Notification Content app extension, you can use this value to group your notifications together.
    */
  var ThreadId: js.UndefOr[__string] = js.undefined
  /**
    * The amount of time, in seconds, that APNs should store and attempt to deliver the push notification, if the service is unable to deliver the notification the first time. If this value is 0, APNs treats the notification as if it expires immediately and the service doesn't store or try to deliver the notification again. Amazon Pinpoint specifies this value in the apns-expiration request header when it sends the notification message to APNs.
    */
  var TimeToLive: js.UndefOr[__integer] = js.undefined
  /**
    * The title to display above the notification message on the recipient's device.
    */
  var Title: js.UndefOr[__string] = js.undefined
  /**
    * The URL to open in the recipient's default mobile browser, if a recipient taps the push notification and the value of the Action property is URL.
    */
  var Url: js.UndefOr[__string] = js.undefined
}

object APNSMessage {
  @scala.inline
  def apply(
    Action: Action = null,
    Badge: js.UndefOr[__integer] = js.undefined,
    Body: __string = null,
    Category: __string = null,
    CollapseId: __string = null,
    Data: MapOf__string = null,
    MediaUrl: __string = null,
    PreferredAuthenticationMethod: __string = null,
    Priority: __string = null,
    RawContent: __string = null,
    SilentPush: js.UndefOr[__boolean] = js.undefined,
    Sound: __string = null,
    Substitutions: MapOfListOf__string = null,
    ThreadId: __string = null,
    TimeToLive: js.UndefOr[__integer] = js.undefined,
    Title: __string = null,
    Url: __string = null
  ): APNSMessage = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (!js.isUndefined(Badge)) __obj.updateDynamic("Badge")(Badge)
    if (Body != null) __obj.updateDynamic("Body")(Body)
    if (Category != null) __obj.updateDynamic("Category")(Category)
    if (CollapseId != null) __obj.updateDynamic("CollapseId")(CollapseId)
    if (Data != null) __obj.updateDynamic("Data")(Data)
    if (MediaUrl != null) __obj.updateDynamic("MediaUrl")(MediaUrl)
    if (PreferredAuthenticationMethod != null) __obj.updateDynamic("PreferredAuthenticationMethod")(PreferredAuthenticationMethod)
    if (Priority != null) __obj.updateDynamic("Priority")(Priority)
    if (RawContent != null) __obj.updateDynamic("RawContent")(RawContent)
    if (!js.isUndefined(SilentPush)) __obj.updateDynamic("SilentPush")(SilentPush)
    if (Sound != null) __obj.updateDynamic("Sound")(Sound)
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions)
    if (ThreadId != null) __obj.updateDynamic("ThreadId")(ThreadId)
    if (!js.isUndefined(TimeToLive)) __obj.updateDynamic("TimeToLive")(TimeToLive)
    if (Title != null) __obj.updateDynamic("Title")(Title)
    if (Url != null) __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[APNSMessage]
  }
}

