package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/pinpoint", "Pinpoint")
@js.native
object PinpointNs extends js.Object {
  trait ADMChannelRequest extends js.Object {
    /**
      * The Client ID that you obtained from the Amazon App Distribution Portal.
      */
    var ClientId: js.UndefOr[__string] = js.undefined
    /**
      * The Client Secret that you obtained from the Amazon App Distribution Portal.
      */
    var ClientSecret: js.UndefOr[__string] = js.undefined
    /**
      * Indicates whether or not the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[__boolean] = js.undefined
  }
  
  trait ADMChannelResponse extends js.Object {
    /**
      * The ID of the application to which the channel applies.
      */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
      * The date and time when this channel was created.
      */
    var CreationDate: js.UndefOr[__string] = js.undefined
    /**
      * Indicates whether or not the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[__boolean] = js.undefined
    /**
      * Not used. Retained for backwards compatibility.
      */
    var HasCredential: js.UndefOr[__boolean] = js.undefined
    /**
      * (Deprecated) An identifier for the channel. Retained for backwards compatibility.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * Indicates whether or not the channel is archived.
      */
    var IsArchived: js.UndefOr[__boolean] = js.undefined
    /**
      * The user who last updated this channel.
      */
    var LastModifiedBy: js.UndefOr[__string] = js.undefined
    /**
      * The date and time when this channel was last modified.
      */
    var LastModifiedDate: js.UndefOr[__string] = js.undefined
    /**
      * The platform type. For this channel, the value is always "ADM."
      */
    var Platform: js.UndefOr[__string] = js.undefined
    /**
      * The channel version.
      */
    var Version: js.UndefOr[__integer] = js.undefined
  }
  
  trait ADMMessage extends js.Object {
    /**
      * The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app launches, or it becomes the foreground app if it has been sent to the background. This is the default action. DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user interface within the app. URL - The default mobile browser on the user's device launches and opens a web page at the URL you specify. Possible values include: OPEN_APP | DEEP_LINK | URL
      */
    var Action: js.UndefOr[Action] = js.undefined
    /**
      * The message body of the notification.
      */
    var Body: js.UndefOr[__string] = js.undefined
    /**
      * Optional. Arbitrary string used to indicate multiple messages are logically the same and that ADM is allowed to drop previously enqueued messages in favor of this one.
      */
    var ConsolidationKey: js.UndefOr[__string] = js.undefined
    /**
      * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody' object
      */
    var Data: js.UndefOr[MapOf__string] = js.undefined
    /**
      * Optional. Number of seconds ADM should retain the message if the device is offline
      */
    var ExpiresAfter: js.UndefOr[__string] = js.undefined
    /**
      * The icon image name of the asset saved in your application.
      */
    var IconReference: js.UndefOr[__string] = js.undefined
    /**
      * The URL that points to an image used as the large icon to the notification content view.
      */
    var ImageIconUrl: js.UndefOr[__string] = js.undefined
    /**
      * The URL that points to an image used in the push notification.
      */
    var ImageUrl: js.UndefOr[__string] = js.undefined
    /**
      * Optional. Base-64-encoded MD5 checksum of the data parameter. Used to verify data integrity
      */
    var MD5: js.UndefOr[__string] = js.undefined
    /**
      * The Raw JSON formatted string to be used as the payload. This value overrides the message.
      */
    var RawContent: js.UndefOr[__string] = js.undefined
    /**
      * Indicates if the message should display on the users device. Silent pushes can be used for Remote Configuration and Phone Home use cases.
      */
    var SilentPush: js.UndefOr[__boolean] = js.undefined
    /**
      * The URL that points to an image used as the small icon for the notification which will be used to represent the notification in the status bar and content view
      */
    var SmallImageIconUrl: js.UndefOr[__string] = js.undefined
    /**
      * Indicates a sound to play when the device receives the notification. Supports default, or the filename of a sound resource bundled in the app. Android sound files must reside in /res/raw/
      */
    var Sound: js.UndefOr[__string] = js.undefined
    /**
      * Default message substitutions. Can be overridden by individual address substitutions.
      */
    var Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined
    /**
      * The message title that displays above the message on the user's device.
      */
    var Title: js.UndefOr[__string] = js.undefined
    /**
      * The URL to open in the user's mobile browser. Used if the value for Action is URL.
      */
    var Url: js.UndefOr[__string] = js.undefined
  }
  
  trait APNSChannelRequest extends js.Object {
    /**
      * The bundle id used for APNs Tokens.
      */
    var BundleId: js.UndefOr[__string] = js.undefined
    /**
      * The distribution certificate from Apple.
      */
    var Certificate: js.UndefOr[__string] = js.undefined
    /**
      * The default authentication method used for APNs.
      */
    var DefaultAuthenticationMethod: js.UndefOr[__string] = js.undefined
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[__boolean] = js.undefined
    /**
      * The certificate private key.
      */
    var PrivateKey: js.UndefOr[__string] = js.undefined
    /**
      * The team id used for APNs Tokens.
      */
    var TeamId: js.UndefOr[__string] = js.undefined
    /**
      * The token key used for APNs Tokens.
      */
    var TokenKey: js.UndefOr[__string] = js.undefined
    /**
      * The token key used for APNs Tokens.
      */
    var TokenKeyId: js.UndefOr[__string] = js.undefined
  }
  
  trait APNSChannelResponse extends js.Object {
    /**
      * The ID of the application that the channel applies to.
      */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
      * The date and time when this channel was created.
      */
    var CreationDate: js.UndefOr[__string] = js.undefined
    /**
      * The default authentication method used for APNs.
      */
    var DefaultAuthenticationMethod: js.UndefOr[__string] = js.undefined
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[__boolean] = js.undefined
    /**
      * Not used. Retained for backwards compatibility.
      */
    var HasCredential: js.UndefOr[__boolean] = js.undefined
    /**
      * Indicates whether the channel is configured with a key for APNs token authentication. Provide a token key by setting the TokenKey attribute.
      */
    var HasTokenKey: js.UndefOr[__boolean] = js.undefined
    /**
      * (Deprecated) An identifier for the channel. Retained for backwards compatibility.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * Indicates whether or not the channel is archived.
      */
    var IsArchived: js.UndefOr[__boolean] = js.undefined
    /**
      * The user who last updated this channel.
      */
    var LastModifiedBy: js.UndefOr[__string] = js.undefined
    /**
      * The date and time when this channel was last modified.
      */
    var LastModifiedDate: js.UndefOr[__string] = js.undefined
    /**
      * The platform type. For this channel, the value is always "ADM."
      */
    var Platform: js.UndefOr[__string] = js.undefined
    /**
      * The channel version.
      */
    var Version: js.UndefOr[__integer] = js.undefined
  }
  
  trait APNSMessage extends js.Object {
    /**
      * The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app launches, or it becomes the foreground app if it has been sent to the background. This is the default action. DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user interface within the app. URL - The default mobile browser on the user's device launches and opens a web page at the URL you specify. Possible values include: OPEN_APP | DEEP_LINK | URL
      */
    var Action: js.UndefOr[Action] = js.undefined
    /**
      * Include this key when you want the system to modify the badge of your app icon. If this key is not included in the dictionary, the badge is not changed. To remove the badge, set the value of this key to 0.
      */
    var Badge: js.UndefOr[__integer] = js.undefined
    /**
      * The message body of the notification.
      */
    var Body: js.UndefOr[__string] = js.undefined
    /**
      * Provide this key with a string value that represents the notification's type. This value corresponds to the value in the identifier property of one of your app's registered categories.
      */
    var Category: js.UndefOr[__string] = js.undefined
    /**
      * An ID that, if assigned to multiple messages, causes APNs to coalesce the messages into a single push notification instead of delivering each message individually. The value must not exceed 64 bytes. Amazon Pinpoint uses this value to set the apns-collapse-id request header when it sends the message to APNs.
      */
    var CollapseId: js.UndefOr[__string] = js.undefined
    /**
      * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody' object
      */
    var Data: js.UndefOr[MapOf__string] = js.undefined
    /**
      * A URL that refers to the location of an image or video that you want to display in the push notification.
      */
    var MediaUrl: js.UndefOr[__string] = js.undefined
    /**
      * The preferred authentication method, either "CERTIFICATE" or "TOKEN"
      */
    var PreferredAuthenticationMethod: js.UndefOr[__string] = js.undefined
    /**
      * The message priority. Amazon Pinpoint uses this value to set the apns-priority request header when it sends the message to APNs. Accepts the following values:
    "5" - Low priority. Messages might be delayed, delivered in groups, and throttled.
    "10" - High priority. Messages are sent immediately. High priority messages must cause an alert, sound, or badge on the receiving device.
    The default value is "10".
    The equivalent values for FCM or GCM messages are "normal" and "high". Amazon Pinpoint accepts these values for APNs messages and converts them.
    For more information about the apns-priority parameter, see Communicating with APNs in the APNs Local and Remote Notification Programming Guide.
      */
    var Priority: js.UndefOr[__string] = js.undefined
    /**
      * The Raw JSON formatted string to be used as the payload. This value overrides the message.
      */
    var RawContent: js.UndefOr[__string] = js.undefined
    /**
      * Indicates if the message should display on the users device. Silent pushes can be used for Remote Configuration and Phone Home use cases.
      */
    var SilentPush: js.UndefOr[__boolean] = js.undefined
    /**
      * Include this key when you want the system to play a sound. The value of this key is the name of a sound file in your app's main bundle or in the Library/Sounds folder of your app's data container. If the sound file cannot be found, or if you specify defaultfor the value, the system plays the default alert sound.
      */
    var Sound: js.UndefOr[__string] = js.undefined
    /**
      * Default message substitutions. Can be overridden by individual address substitutions.
      */
    var Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined
    /**
      * Provide this key with a string value that represents the app-specific identifier for grouping notifications. If you provide a Notification Content app extension, you can use this value to group your notifications together.
      */
    var ThreadId: js.UndefOr[__string] = js.undefined
    /**
      * The length of time (in seconds) that APNs stores and attempts to deliver the message. If the value is 0, APNs does not store the message or attempt to deliver it more than once. Amazon Pinpoint uses this value to set the apns-expiration request header when it sends the message to APNs.
      */
    var TimeToLive: js.UndefOr[__integer] = js.undefined
    /**
      * The message title that displays above the message on the user's device.
      */
    var Title: js.UndefOr[__string] = js.undefined
    /**
      * The URL to open in the user's mobile browser. Used if the value for Action is URL.
      */
    var Url: js.UndefOr[__string] = js.undefined
  }
  
  trait APNSSandboxChannelRequest extends js.Object {
    /**
      * The bundle id used for APNs Tokens.
      */
    var BundleId: js.UndefOr[__string] = js.undefined
    /**
      * The distribution certificate from Apple.
      */
    var Certificate: js.UndefOr[__string] = js.undefined
    /**
      * The default authentication method used for APNs.
      */
    var DefaultAuthenticationMethod: js.UndefOr[__string] = js.undefined
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[__boolean] = js.undefined
    /**
      * The certificate private key.
      */
    var PrivateKey: js.UndefOr[__string] = js.undefined
    /**
      * The team id used for APNs Tokens.
      */
    var TeamId: js.UndefOr[__string] = js.undefined
    /**
      * The token key used for APNs Tokens.
      */
    var TokenKey: js.UndefOr[__string] = js.undefined
    /**
      * The token key used for APNs Tokens.
      */
    var TokenKeyId: js.UndefOr[__string] = js.undefined
  }
  
  trait APNSSandboxChannelResponse extends js.Object {
    /**
      * The ID of the application to which the channel applies.
      */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
      * When was this segment created
      */
    var CreationDate: js.UndefOr[__string] = js.undefined
    /**
      * The default authentication method used for APNs.
      */
    var DefaultAuthenticationMethod: js.UndefOr[__string] = js.undefined
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[__boolean] = js.undefined
    /**
      * Not used. Retained for backwards compatibility.
      */
    var HasCredential: js.UndefOr[__boolean] = js.undefined
    /**
      * Indicates whether the channel is configured with a key for APNs token authentication. Provide a token key by setting the TokenKey attribute.
      */
    var HasTokenKey: js.UndefOr[__boolean] = js.undefined
    /**
      * Channel ID. Not used, only for backwards compatibility.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * Is this channel archived
      */
    var IsArchived: js.UndefOr[__boolean] = js.undefined
    /**
      * Who last updated this entry
      */
    var LastModifiedBy: js.UndefOr[__string] = js.undefined
    /**
      * Last date this was updated
      */
    var LastModifiedDate: js.UndefOr[__string] = js.undefined
    /**
      * The platform type. Will be APNS_SANDBOX.
      */
    var Platform: js.UndefOr[__string] = js.undefined
    /**
      * Version of channel
      */
    var Version: js.UndefOr[__integer] = js.undefined
  }
  
  trait APNSVoipChannelRequest extends js.Object {
    /**
      * The bundle id used for APNs Tokens.
      */
    var BundleId: js.UndefOr[__string] = js.undefined
    /**
      * The distribution certificate from Apple.
      */
    var Certificate: js.UndefOr[__string] = js.undefined
    /**
      * The default authentication method used for APNs.
      */
    var DefaultAuthenticationMethod: js.UndefOr[__string] = js.undefined
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[__boolean] = js.undefined
    /**
      * The certificate private key.
      */
    var PrivateKey: js.UndefOr[__string] = js.undefined
    /**
      * The team id used for APNs Tokens.
      */
    var TeamId: js.UndefOr[__string] = js.undefined
    /**
      * The token key used for APNs Tokens.
      */
    var TokenKey: js.UndefOr[__string] = js.undefined
    /**
      * The token key used for APNs Tokens.
      */
    var TokenKeyId: js.UndefOr[__string] = js.undefined
  }
  
  trait APNSVoipChannelResponse extends js.Object {
    /**
      * Application id
      */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
      * When was this segment created
      */
    var CreationDate: js.UndefOr[__string] = js.undefined
    /**
      * The default authentication method used for APNs.
      */
    var DefaultAuthenticationMethod: js.UndefOr[__string] = js.undefined
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[__boolean] = js.undefined
    /**
      * Not used. Retained for backwards compatibility.
      */
    var HasCredential: js.UndefOr[__boolean] = js.undefined
    /**
      * If the channel is registered with a token key for authentication.
      */
    var HasTokenKey: js.UndefOr[__boolean] = js.undefined
    /**
      * Channel ID. Not used, only for backwards compatibility.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * Is this channel archived
      */
    var IsArchived: js.UndefOr[__boolean] = js.undefined
    /**
      * Who made the last change
      */
    var LastModifiedBy: js.UndefOr[__string] = js.undefined
    /**
      * Last date this was updated
      */
    var LastModifiedDate: js.UndefOr[__string] = js.undefined
    /**
      * The platform type. Will be APNS.
      */
    var Platform: js.UndefOr[__string] = js.undefined
    /**
      * Version of channel
      */
    var Version: js.UndefOr[__integer] = js.undefined
  }
  
  trait APNSVoipSandboxChannelRequest extends js.Object {
    /**
      * The bundle id used for APNs Tokens.
      */
    var BundleId: js.UndefOr[__string] = js.undefined
    /**
      * The distribution certificate from Apple.
      */
    var Certificate: js.UndefOr[__string] = js.undefined
    /**
      * The default authentication method used for APNs.
      */
    var DefaultAuthenticationMethod: js.UndefOr[__string] = js.undefined
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[__boolean] = js.undefined
    /**
      * The certificate private key.
      */
    var PrivateKey: js.UndefOr[__string] = js.undefined
    /**
      * The team id used for APNs Tokens.
      */
    var TeamId: js.UndefOr[__string] = js.undefined
    /**
      * The token key used for APNs Tokens.
      */
    var TokenKey: js.UndefOr[__string] = js.undefined
    /**
      * The token key used for APNs Tokens.
      */
    var TokenKeyId: js.UndefOr[__string] = js.undefined
  }
  
  trait APNSVoipSandboxChannelResponse extends js.Object {
    /**
      * Application id
      */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
      * When was this segment created
      */
    var CreationDate: js.UndefOr[__string] = js.undefined
    /**
      * The default authentication method used for APNs.
      */
    var DefaultAuthenticationMethod: js.UndefOr[__string] = js.undefined
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[__boolean] = js.undefined
    /**
      * Not used. Retained for backwards compatibility.
      */
    var HasCredential: js.UndefOr[__boolean] = js.undefined
    /**
      * If the channel is registered with a token key for authentication.
      */
    var HasTokenKey: js.UndefOr[__boolean] = js.undefined
    /**
      * Channel ID. Not used, only for backwards compatibility.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * Is this channel archived
      */
    var IsArchived: js.UndefOr[__boolean] = js.undefined
    /**
      * Who made the last change
      */
    var LastModifiedBy: js.UndefOr[__string] = js.undefined
    /**
      * Last date this was updated
      */
    var LastModifiedDate: js.UndefOr[__string] = js.undefined
    /**
      * The platform type. Will be APNS.
      */
    var Platform: js.UndefOr[__string] = js.undefined
    /**
      * Version of channel
      */
    var Version: js.UndefOr[__integer] = js.undefined
  }
  
  trait ActivitiesResponse extends js.Object {
    /**
      * List of campaign activities
      */
    var Item: js.UndefOr[ListOfActivityResponse] = js.undefined
    /**
      * The string that you use in a subsequent request to get the next page of results in a paginated response.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ActivityResponse extends js.Object {
    /**
      * The ID of the application to which the campaign applies.
      */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the campaign to which the activity applies.
      */
    var CampaignId: js.UndefOr[__string] = js.undefined
    /**
      * The actual time the activity was marked CANCELLED or COMPLETED. Provided in ISO 8601 format.
      */
    var End: js.UndefOr[__string] = js.undefined
    /**
      * The unique activity ID.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * Indicates whether the activity succeeded.
    Valid values: SUCCESS, FAIL
      */
    var Result: js.UndefOr[__string] = js.undefined
    /**
      * The scheduled start time for the activity in ISO 8601 format.
      */
    var ScheduledStart: js.UndefOr[__string] = js.undefined
    /**
      * The actual start time of the activity in ISO 8601 format.
      */
    var Start: js.UndefOr[__string] = js.undefined
    /**
      * The state of the activity.
    Valid values: PENDING, INITIALIZING, RUNNING, PAUSED, CANCELLED, COMPLETED
      */
    var State: js.UndefOr[__string] = js.undefined
    /**
      * The total number of endpoints to which the campaign successfully delivered messages.
      */
    var SuccessfulEndpointCount: js.UndefOr[__integer] = js.undefined
    /**
      * The total number of timezones completed.
      */
    var TimezonesCompletedCount: js.UndefOr[__integer] = js.undefined
    /**
      * The total number of unique timezones present in the segment.
      */
    var TimezonesTotalCount: js.UndefOr[__integer] = js.undefined
    /**
      * The total number of endpoints to which the campaign attempts to deliver messages.
      */
    var TotalEndpointCount: js.UndefOr[__integer] = js.undefined
    /**
      * The ID of a variation of the campaign used for A/B testing.
      */
    var TreatmentId: js.UndefOr[__string] = js.undefined
  }
  
  trait AddressConfiguration extends js.Object {
    /**
      * Body override. If specified will override default body.
      */
    var BodyOverride: js.UndefOr[__string] = js.undefined
    /**
      * The channel type.
    Valid values: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU
      */
    var ChannelType: js.UndefOr[ChannelType] = js.undefined
    /**
      * A map of custom attributes to attributes to be attached to the message for this address. This payload is added to the push notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
      */
    var Context: js.UndefOr[MapOf__string] = js.undefined
    /**
      * The Raw JSON formatted string to be used as the payload. This value overrides the message.
      */
    var RawContent: js.UndefOr[__string] = js.undefined
    /**
      * A map of substitution values for the message to be merged with the DefaultMessage's substitutions. Substitutions on this map take precedence over the all other substitutions.
      */
    var Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined
    /**
      * Title override. If specified will override default title if applicable.
      */
    var TitleOverride: js.UndefOr[__string] = js.undefined
  }
  
  trait ApplicationResponse extends js.Object {
    /**
      * The arn for the application.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The unique application ID.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The display name of the application.
      */
    var Name: js.UndefOr[__string] = js.undefined
    /**
      * The Tags for the application.
      */
    var tags: js.UndefOr[MapOf__string] = js.undefined
  }
  
  trait ApplicationSettingsResource extends js.Object {
    /**
      * The unique ID for the application.
      */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
      * Default campaign hook.
      */
    var CampaignHook: js.UndefOr[CampaignHook] = js.undefined
    /**
      * The date that the settings were last updated in ISO 8601 format.
      */
    var LastModifiedDate: js.UndefOr[__string] = js.undefined
    /**
      * The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own.
      */
    var Limits: js.UndefOr[CampaignLimits] = js.undefined
    /**
      * The default quiet time for the app. Campaigns in the app don't send messages to endpoints during the quiet time.
    Note: Make sure that your endpoints include the Demographics.Timezone attribute if you plan to enable a quiet time for your app. If your endpoints don't include this attribute, they'll receive the messages that you send them, even if quiet time is enabled.
    When you set up an app to use quiet time, campaigns in that app don't send messages during the time range you specified, as long as all of the following are true:
    - The endpoint includes a valid Demographic.Timezone attribute.
    - The current time in the endpoint's time zone is later than or equal to the time specified in the QuietTime.Start attribute for the app (or campaign, if applicable).
    - The current time in the endpoint's time zone is earlier than or equal to the time specified in the QuietTime.End attribute for the app (or campaign, if applicable).
    Individual campaigns within the app can have their own quiet time settings, which override the quiet time settings at the app level.
      */
    var QuietTime: js.UndefOr[QuietTime] = js.undefined
  }
  
  trait ApplicationsResponse extends js.Object {
    /**
      * List of applications returned in this page.
      */
    var Item: js.UndefOr[ListOfApplicationResponse] = js.undefined
    /**
      * The string that you use in a subsequent request to get the next page of results in a paginated response.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait AttributeDimension extends js.Object {
    /**
      * The type of dimension:
    INCLUSIVE - Endpoints that match the criteria are included in the segment.
    EXCLUSIVE - Endpoints that match the criteria are excluded from the segment.
      */
    var AttributeType: js.UndefOr[AttributeType] = js.undefined
    /**
      * The criteria values for the segment dimension. Endpoints with matching attribute values are included or excluded from the segment, depending on the setting for Type.
      */
    var Values: js.UndefOr[ListOf__string] = js.undefined
  }
  
  trait AttributesResource extends js.Object {
    /**
      * The unique ID for the application.
      */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
      * The attribute type for the application.
      */
    var AttributeType: js.UndefOr[__string] = js.undefined
    /**
      * The attributes for the application.
      */
    var Attributes: js.UndefOr[ListOf__string] = js.undefined
  }
  
  trait BaiduChannelRequest extends js.Object {
    /**
      * Platform credential API key from Baidu.
      */
    var ApiKey: js.UndefOr[__string] = js.undefined
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[__boolean] = js.undefined
    /**
      * Platform credential Secret key from Baidu.
      */
    var SecretKey: js.UndefOr[__string] = js.undefined
  }
  
  trait BaiduChannelResponse extends js.Object {
    /**
      * Application id
      */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
      * When was this segment created
      */
    var CreationDate: js.UndefOr[__string] = js.undefined
    /**
      * The Baidu API key from Baidu.
      */
    var Credential: js.UndefOr[__string] = js.undefined
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[__boolean] = js.undefined
    /**
      * Not used. Retained for backwards compatibility.
      */
    var HasCredential: js.UndefOr[__boolean] = js.undefined
    /**
      * Channel ID. Not used, only for backwards compatibility.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * Is this channel archived
      */
    var IsArchived: js.UndefOr[__boolean] = js.undefined
    /**
      * Who made the last change
      */
    var LastModifiedBy: js.UndefOr[__string] = js.undefined
    /**
      * Last date this was updated
      */
    var LastModifiedDate: js.UndefOr[__string] = js.undefined
    /**
      * The platform type. Will be BAIDU
      */
    var Platform: js.UndefOr[__string] = js.undefined
    /**
      * Version of channel
      */
    var Version: js.UndefOr[__integer] = js.undefined
  }
  
  trait BaiduMessage extends js.Object {
    /**
      * The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app launches, or it becomes the foreground app if it has been sent to the background. This is the default action. DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user interface within the app. URL - The default mobile browser on the user's device launches and opens a web page at the URL you specify. Possible values include: OPEN_APP | DEEP_LINK | URL
      */
    var Action: js.UndefOr[Action] = js.undefined
    /**
      * The message body of the notification.
      */
    var Body: js.UndefOr[__string] = js.undefined
    /**
      * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody' object
      */
    var Data: js.UndefOr[MapOf__string] = js.undefined
    /**
      * The icon image name of the asset saved in your application.
      */
    var IconReference: js.UndefOr[__string] = js.undefined
    /**
      * The URL that points to an image used as the large icon to the notification content view.
      */
    var ImageIconUrl: js.UndefOr[__string] = js.undefined
    /**
      * The URL that points to an image used in the push notification.
      */
    var ImageUrl: js.UndefOr[__string] = js.undefined
    /**
      * The Raw JSON formatted string to be used as the payload. This value overrides the message.
      */
    var RawContent: js.UndefOr[__string] = js.undefined
    /**
      * Indicates if the message should display on the users device. Silent pushes can be used for Remote Configuration and Phone Home use cases.
      */
    var SilentPush: js.UndefOr[__boolean] = js.undefined
    /**
      * The URL that points to an image used as the small icon for the notification which will be used to represent the notification in the status bar and content view
      */
    var SmallImageIconUrl: js.UndefOr[__string] = js.undefined
    /**
      * Indicates a sound to play when the device receives the notification. Supports default, or the filename of a sound resource bundled in the app. Android sound files must reside in /res/raw/
      */
    var Sound: js.UndefOr[__string] = js.undefined
    /**
      * Default message substitutions. Can be overridden by individual address substitutions.
      */
    var Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined
    /**
      * This parameter specifies how long (in seconds) the message should be kept in Baidu storage if the device is offline. The and the default value and the maximum time to live supported is 7 days (604800 seconds)
      */
    var TimeToLive: js.UndefOr[__integer] = js.undefined
    /**
      * The message title that displays above the message on the user's device.
      */
    var Title: js.UndefOr[__string] = js.undefined
    /**
      * The URL to open in the user's mobile browser. Used if the value for Action is URL.
      */
    var Url: js.UndefOr[__string] = js.undefined
  }
  
  trait CampaignEmailMessage extends js.Object {
    /**
      * The email text body.
      */
    var Body: js.UndefOr[__string] = js.undefined
    /**
      * The email address used to send the email from. Defaults to use FromAddress specified in the Email Channel.
      */
    var FromAddress: js.UndefOr[__string] = js.undefined
    /**
      * The email html body.
      */
    var HtmlBody: js.UndefOr[__string] = js.undefined
    /**
      * The email title (Or subject).
      */
    var Title: js.UndefOr[__string] = js.undefined
  }
  
  trait CampaignEventFilter extends js.Object {
    /**
      * An object that defines the dimensions for the event filter.
      */
    var Dimensions: js.UndefOr[EventDimensions] = js.undefined
    /**
      * The type of event that causes the campaign to be sent. Possible values:
    SYSTEM - Send the campaign when a system event occurs. See the System resource for more information.
    ENDPOINT - Send the campaign when an endpoint event occurs. See the Event resource for more information.
      */
    var FilterType: js.UndefOr[FilterType] = js.undefined
  }
  
  trait CampaignHook extends js.Object {
    /**
      * Lambda function name or arn to be called for delivery
      */
    var LambdaFunctionName: js.UndefOr[__string] = js.undefined
    /**
      * What mode Lambda should be invoked in.
      */
    var Mode: js.UndefOr[Mode] = js.undefined
    /**
      * Web URL to call for hook. If the URL has authentication specified it will be added as authentication to the request
      */
    var WebUrl: js.UndefOr[__string] = js.undefined
  }
  
  trait CampaignLimits extends js.Object {
    /**
      * The maximum number of messages that each campaign can send to a single endpoint in a 24-hour period.
      */
    var Daily: js.UndefOr[__integer] = js.undefined
    /**
      * The length of time (in seconds) that the campaign can run before it ends and message deliveries stop. This duration begins at the scheduled start time for the campaign. The minimum value is 60.
      */
    var MaximumDuration: js.UndefOr[__integer] = js.undefined
    /**
      * The number of messages that the campaign can send per second. The minimum value is 50, and the maximum is 20000.
      */
    var MessagesPerSecond: js.UndefOr[__integer] = js.undefined
    /**
      * The maximum number of messages that an individual campaign can send to a single endpoint over the course of the campaign.
      */
    var Total: js.UndefOr[__integer] = js.undefined
  }
  
  trait CampaignResponse extends js.Object {
    /**
      * Treatments that are defined in addition to the default treatment.
      */
    var AdditionalTreatments: js.UndefOr[ListOfTreatmentResource] = js.undefined
    /**
      * The ID of the application to which the campaign applies.
      */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
      * The arn for the campaign.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The date the campaign was created in ISO 8601 format.
      */
    var CreationDate: js.UndefOr[__string] = js.undefined
    /**
      * The status of the campaign's default treatment. Only present for A/B test campaigns.
      */
    var DefaultState: js.UndefOr[CampaignState] = js.undefined
    /**
      * A description of the campaign.
      */
    var Description: js.UndefOr[__string] = js.undefined
    /**
      * The allocated percentage of end users who will not receive messages from this campaign.
      */
    var HoldoutPercent: js.UndefOr[__integer] = js.undefined
    /**
      * Campaign hook information.
      */
    var Hook: js.UndefOr[CampaignHook] = js.undefined
    /**
      * The unique campaign ID.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * Indicates whether the campaign is paused. A paused campaign does not send messages unless you resume it by setting IsPaused to false.
      */
    var IsPaused: js.UndefOr[__boolean] = js.undefined
    /**
      * The date the campaign was last updated in ISO 8601 format.	
      */
    var LastModifiedDate: js.UndefOr[__string] = js.undefined
    /**
      * The campaign limits settings.
      */
    var Limits: js.UndefOr[CampaignLimits] = js.undefined
    /**
      * The message configuration settings.
      */
    var MessageConfiguration: js.UndefOr[MessageConfiguration] = js.undefined
    /**
      * The custom name of the campaign.
      */
    var Name: js.UndefOr[__string] = js.undefined
    /**
      * The campaign schedule.
      */
    var Schedule: js.UndefOr[Schedule] = js.undefined
    /**
      * The ID of the segment to which the campaign sends messages.
      */
    var SegmentId: js.UndefOr[__string] = js.undefined
    /**
      * The version of the segment to which the campaign sends messages.
      */
    var SegmentVersion: js.UndefOr[__integer] = js.undefined
    /**
      * The campaign status.
    An A/B test campaign will have a status of COMPLETED only when all treatments have a status of COMPLETED.
      */
    var State: js.UndefOr[CampaignState] = js.undefined
    /**
      * A custom description for the treatment.
      */
    var TreatmentDescription: js.UndefOr[__string] = js.undefined
    /**
      * The custom name of a variation of the campaign used for A/B testing.
      */
    var TreatmentName: js.UndefOr[__string] = js.undefined
    /**
      * The campaign version number.
      */
    var Version: js.UndefOr[__integer] = js.undefined
    /**
      * The Tags for the campaign.
      */
    var tags: js.UndefOr[MapOf__string] = js.undefined
  }
  
  trait CampaignSmsMessage extends js.Object {
    /**
      * The SMS text body.
      */
    var Body: js.UndefOr[__string] = js.undefined
    /**
      * Is this is a transactional SMS message, otherwise a promotional message.
      */
    var MessageType: js.UndefOr[MessageType] = js.undefined
    /**
      * Sender ID of sent message.
      */
    var SenderId: js.UndefOr[__string] = js.undefined
  }
  
  trait CampaignState extends js.Object {
    /**
      * The status of the campaign, or the status of a treatment that belongs to an A/B test campaign.
    Valid values: SCHEDULED, EXECUTING, PENDING_NEXT_RUN, COMPLETED, PAUSED
      */
    var CampaignStatus: js.UndefOr[CampaignStatus] = js.undefined
  }
  
  trait CampaignsResponse extends js.Object {
    /**
      * A list of campaigns.
      */
    var Item: js.UndefOr[ListOfCampaignResponse] = js.undefined
    /**
      * The string that you use in a subsequent request to get the next page of results in a paginated response.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ChannelResponse extends js.Object {
    /**
      * Application id
      */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
      * When was this segment created
      */
    var CreationDate: js.UndefOr[__string] = js.undefined
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[__boolean] = js.undefined
    /**
      * Not used. Retained for backwards compatibility.
      */
    var HasCredential: js.UndefOr[__boolean] = js.undefined
    /**
      * Channel ID. Not used, only for backwards compatibility.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * Is this channel archived
      */
    var IsArchived: js.UndefOr[__boolean] = js.undefined
    /**
      * Who made the last change
      */
    var LastModifiedBy: js.UndefOr[__string] = js.undefined
    /**
      * Last date this was updated
      */
    var LastModifiedDate: js.UndefOr[__string] = js.undefined
    /**
      * Version of channel
      */
    var Version: js.UndefOr[__integer] = js.undefined
  }
  
  trait ChannelsResponse extends js.Object {
    /**
      * A map of channels, with the ChannelType as the key and the Channel as the value.
      */
    var Channels: js.UndefOr[MapOfChannelResponse] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateAppRequest extends js.Object {
    var CreateApplicationRequest: awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateApplicationRequest
  }
  
  trait CreateAppResponse extends js.Object {
    var ApplicationResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.ApplicationResponse
  }
  
  trait CreateApplicationRequest extends js.Object {
    /**
      * The display name of the application. Used in the Amazon Pinpoint console.
      */
    var Name: js.UndefOr[__string] = js.undefined
    /**
      * The Tags for the app.
      */
    var tags: js.UndefOr[MapOf__string] = js.undefined
  }
  
  trait CreateCampaignRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    var WriteCampaignRequest: awsDashSdkLib.clientsPinpointMod.PinpointNs.WriteCampaignRequest
  }
  
  trait CreateCampaignResponse extends js.Object {
    var CampaignResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.CampaignResponse
  }
  
  trait CreateExportJobRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    var ExportJobRequest: awsDashSdkLib.clientsPinpointMod.PinpointNs.ExportJobRequest
  }
  
  trait CreateExportJobResponse extends js.Object {
    var ExportJobResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.ExportJobResponse
  }
  
  trait CreateImportJobRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    var ImportJobRequest: awsDashSdkLib.clientsPinpointMod.PinpointNs.ImportJobRequest
  }
  
  trait CreateImportJobResponse extends js.Object {
    var ImportJobResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.ImportJobResponse
  }
  
  trait CreateSegmentRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    var WriteSegmentRequest: awsDashSdkLib.clientsPinpointMod.PinpointNs.WriteSegmentRequest
  }
  
  trait CreateSegmentResponse extends js.Object {
    var SegmentResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.SegmentResponse
  }
  
  trait DefaultMessage extends js.Object {
    /**
      * The message body of the notification, the email body or the text message.
      */
    var Body: js.UndefOr[__string] = js.undefined
    /**
      * Default message substitutions. Can be overridden by individual address substitutions.
      */
    var Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined
  }
  
  trait DefaultPushNotificationMessage extends js.Object {
    /**
      * The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app launches, or it becomes the foreground app if it has been sent to the background. This is the default action. DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user interface within the app. URL - The default mobile browser on the user's device launches and opens a web page at the URL you specify. Possible values include: OPEN_APP | DEEP_LINK | URL
      */
    var Action: js.UndefOr[Action] = js.undefined
    /**
      * The message body of the notification.
      */
    var Body: js.UndefOr[__string] = js.undefined
    /**
      * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody' object
      */
    var Data: js.UndefOr[MapOf__string] = js.undefined
    /**
      * Indicates if the message should display on the recipient's device. You can use silent pushes for remote configuration or to deliver messages to in-app notification centers.
      */
    var SilentPush: js.UndefOr[__boolean] = js.undefined
    /**
      * Default message substitutions. Can be overridden by individual address substitutions.
      */
    var Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined
    /**
      * The message title that displays above the message on the user's device.
      */
    var Title: js.UndefOr[__string] = js.undefined
    /**
      * The URL to open in the user's mobile browser. Used if the value for Action is URL.
      */
    var Url: js.UndefOr[__string] = js.undefined
  }
  
  trait DeleteAdmChannelRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait DeleteAdmChannelResponse extends js.Object {
    var ADMChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.ADMChannelResponse
  }
  
  trait DeleteApnsChannelRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait DeleteApnsChannelResponse extends js.Object {
    var APNSChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.APNSChannelResponse
  }
  
  trait DeleteApnsSandboxChannelRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait DeleteApnsSandboxChannelResponse extends js.Object {
    var APNSSandboxChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.APNSSandboxChannelResponse
  }
  
  trait DeleteApnsVoipChannelRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait DeleteApnsVoipChannelResponse extends js.Object {
    var APNSVoipChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.APNSVoipChannelResponse
  }
  
  trait DeleteApnsVoipSandboxChannelRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait DeleteApnsVoipSandboxChannelResponse extends js.Object {
    var APNSVoipSandboxChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.APNSVoipSandboxChannelResponse
  }
  
  trait DeleteAppRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait DeleteAppResponse extends js.Object {
    var ApplicationResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.ApplicationResponse
  }
  
  trait DeleteBaiduChannelRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait DeleteBaiduChannelResponse extends js.Object {
    var BaiduChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.BaiduChannelResponse
  }
  
  trait DeleteCampaignRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    /**
      * The unique ID of the campaign.
      */
    var CampaignId: __string
  }
  
  trait DeleteCampaignResponse extends js.Object {
    var CampaignResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.CampaignResponse
  }
  
  trait DeleteEmailChannelRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait DeleteEmailChannelResponse extends js.Object {
    var EmailChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.EmailChannelResponse
  }
  
  trait DeleteEndpointRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    /**
      * The unique ID of the endpoint.
      */
    var EndpointId: __string
  }
  
  trait DeleteEndpointResponse extends js.Object {
    var EndpointResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.EndpointResponse
  }
  
  trait DeleteEventStreamRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait DeleteEventStreamResponse extends js.Object {
    var EventStream: awsDashSdkLib.clientsPinpointMod.PinpointNs.EventStream
  }
  
  trait DeleteGcmChannelRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait DeleteGcmChannelResponse extends js.Object {
    var GCMChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.GCMChannelResponse
  }
  
  trait DeleteSegmentRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    /**
      * The unique ID of the segment.
      */
    var SegmentId: __string
  }
  
  trait DeleteSegmentResponse extends js.Object {
    var SegmentResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.SegmentResponse
  }
  
  trait DeleteSmsChannelRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait DeleteSmsChannelResponse extends js.Object {
    var SMSChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.SMSChannelResponse
  }
  
  trait DeleteUserEndpointsRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    /**
      * The unique ID of the user.
      */
    var UserId: __string
  }
  
  trait DeleteUserEndpointsResponse extends js.Object {
    var EndpointsResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.EndpointsResponse
  }
  
  trait DeleteVoiceChannelRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait DeleteVoiceChannelResponse extends js.Object {
    var VoiceChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.VoiceChannelResponse
  }
  
  trait DirectMessageConfiguration extends js.Object {
    /**
      * The message to ADM channels. Overrides the default push notification message.
      */
    var ADMMessage: js.UndefOr[ADMMessage] = js.undefined
    /**
      * The message to APNS channels. Overrides the default push notification message.
      */
    var APNSMessage: js.UndefOr[APNSMessage] = js.undefined
    /**
      * The message to Baidu GCM channels. Overrides the default push notification message.
      */
    var BaiduMessage: js.UndefOr[BaiduMessage] = js.undefined
    /**
      * The default message for all channels.
      */
    var DefaultMessage: js.UndefOr[DefaultMessage] = js.undefined
    /**
      * The default push notification message for all push channels.
      */
    var DefaultPushNotificationMessage: js.UndefOr[DefaultPushNotificationMessage] = js.undefined
    /**
      * The message to Email channels. Overrides the default message.
      */
    var EmailMessage: js.UndefOr[EmailMessage] = js.undefined
    /**
      * The message to GCM channels. Overrides the default push notification message.
      */
    var GCMMessage: js.UndefOr[GCMMessage] = js.undefined
    /**
      * The message to SMS channels. Overrides the default message.
      */
    var SMSMessage: js.UndefOr[SMSMessage] = js.undefined
    /**
      * The message to Voice channels. Overrides the default message.
      */
    var VoiceMessage: js.UndefOr[VoiceMessage] = js.undefined
  }
  
  trait EmailChannelRequest extends js.Object {
    /**
      * The configuration set that you want to use when you send email using the Pinpoint Email API.
      */
    var ConfigurationSet: js.UndefOr[__string] = js.undefined
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[__boolean] = js.undefined
    /**
      * The email address used to send emails from.
      */
    var FromAddress: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of an identity verified with SES.
      */
    var Identity: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service
      */
    var RoleArn: js.UndefOr[__string] = js.undefined
  }
  
  trait EmailChannelResponse extends js.Object {
    /**
      * The unique ID of the application to which the email channel belongs.
      */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
      * The configuration set that you want to use when you send email using the Pinpoint Email API.
      */
    var ConfigurationSet: js.UndefOr[__string] = js.undefined
    /**
      * The date that the settings were last updated in ISO 8601 format.
      */
    var CreationDate: js.UndefOr[__string] = js.undefined
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[__boolean] = js.undefined
    /**
      * The email address used to send emails from.
      */
    var FromAddress: js.UndefOr[__string] = js.undefined
    /**
      * Not used. Retained for backwards compatibility.
      */
    var HasCredential: js.UndefOr[__boolean] = js.undefined
    /**
      * Channel ID. Not used, only for backwards compatibility.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of an identity verified with SES.
      */
    var Identity: js.UndefOr[__string] = js.undefined
    /**
      * Is this channel archived
      */
    var IsArchived: js.UndefOr[__boolean] = js.undefined
    /**
      * Who last updated this entry
      */
    var LastModifiedBy: js.UndefOr[__string] = js.undefined
    /**
      * Last date this was updated
      */
    var LastModifiedDate: js.UndefOr[__string] = js.undefined
    /**
      * Messages per second that can be sent
      */
    var MessagesPerSecond: js.UndefOr[__integer] = js.undefined
    /**
      * Platform type. Will be "EMAIL"
      */
    var Platform: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service
      */
    var RoleArn: js.UndefOr[__string] = js.undefined
    /**
      * Version of channel
      */
    var Version: js.UndefOr[__integer] = js.undefined
  }
  
  trait EmailMessage extends js.Object {
    /**
      * The body of the email message.
      */
    var Body: js.UndefOr[__string] = js.undefined
    /**
      * The email address that bounces and complaints will be forwarded to when feedback forwarding is enabled.
      */
    var FeedbackForwardingAddress: js.UndefOr[__string] = js.undefined
    /**
      * The email address used to send the email from. Defaults to use FromAddress specified in the Email Channel.
      */
    var FromAddress: js.UndefOr[__string] = js.undefined
    /**
      * An email represented as a raw MIME message.
      */
    var RawEmail: js.UndefOr[RawEmail] = js.undefined
    /**
      * The reply-to email address(es) for the email. If the recipient replies to the email, each reply-to address will receive the reply.
      */
    var ReplyToAddresses: js.UndefOr[ListOf__string] = js.undefined
    /**
      * An email composed of a subject, a text part and a html part.
      */
    var SimpleEmail: js.UndefOr[SimpleEmail] = js.undefined
    /**
      * Default message substitutions. Can be overridden by individual address substitutions.
      */
    var Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined
  }
  
  trait EndpointBatchItem extends js.Object {
    /**
      * The destination for messages that you send to this endpoint. The address varies by channel. For mobile push channels, use the token provided by the push notification service, such as the APNs device token or the FCM registration token. For the SMS channel, use a phone number in E.164 format, such as +12065550100. For the email channel, use an email address.
      */
    var Address: js.UndefOr[__string] = js.undefined
    /**
      * Custom attributes that describe the endpoint by associating a name with an array of values. For example, an attribute named "interests" might have the values ["science", "politics", "travel"]. You can use these attributes as selection criteria when you create a segment of users to engage with a messaging campaign.
    The following characters are not recommended in attribute names: # : ? \ /. The Amazon Pinpoint console does not display attributes that include these characters in the name. This limitation does not apply to attribute values.
      */
    var Attributes: js.UndefOr[MapOfListOf__string] = js.undefined
    /**
      * The channel type.
    Valid values: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU
      */
    var ChannelType: js.UndefOr[ChannelType] = js.undefined
    /**
      * The endpoint demographic attributes.
      */
    var Demographic: js.UndefOr[EndpointDemographic] = js.undefined
    /**
      * The last time the endpoint was updated. Provided in ISO 8601 format.
      */
    var EffectiveDate: js.UndefOr[__string] = js.undefined
    /**
      * Unused.
      */
    var EndpointStatus: js.UndefOr[__string] = js.undefined
    /**
      * The unique Id for the Endpoint in the batch.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The endpoint location attributes.
      */
    var Location: js.UndefOr[EndpointLocation] = js.undefined
    /**
      * Custom metrics that your app reports to Amazon Pinpoint.
      */
    var Metrics: js.UndefOr[MapOf__double] = js.undefined
    /**
      * Indicates whether a user has opted out of receiving messages with one of the following values:
    ALL - User has opted out of all messages.
    NONE - Users has not opted out and receives all messages.
      */
    var OptOut: js.UndefOr[__string] = js.undefined
    /**
      * The unique ID for the most recent request to update the endpoint.
      */
    var RequestId: js.UndefOr[__string] = js.undefined
    /**
      * Custom user-specific attributes that your app reports to Amazon Pinpoint.
      */
    var User: js.UndefOr[EndpointUser] = js.undefined
  }
  
  trait EndpointBatchRequest extends js.Object {
    /**
      * List of items to update. Maximum 100 items
      */
    var Item: js.UndefOr[ListOfEndpointBatchItem] = js.undefined
  }
  
  trait EndpointDemographic extends js.Object {
    /**
      * The version of the application associated with the endpoint.
      */
    var AppVersion: js.UndefOr[__string] = js.undefined
    /**
      * The endpoint locale in the following format: The ISO 639-1 alpha-2 code, followed by an underscore, followed by an ISO 3166-1 alpha-2 value.
      */
    var Locale: js.UndefOr[__string] = js.undefined
    /**
      * The manufacturer of the endpoint device, such as Apple or Samsung.
      */
    var Make: js.UndefOr[__string] = js.undefined
    /**
      * The model name or number of the endpoint device, such as iPhone.
      */
    var Model: js.UndefOr[__string] = js.undefined
    /**
      * The model version of the endpoint device.
      */
    var ModelVersion: js.UndefOr[__string] = js.undefined
    /**
      * The platform of the endpoint device, such as iOS or Android.
      */
    var Platform: js.UndefOr[__string] = js.undefined
    /**
      * The platform version of the endpoint device.
      */
    var PlatformVersion: js.UndefOr[__string] = js.undefined
    /**
      * The timezone of the endpoint. Specified as a tz database value, such as Americas/Los_Angeles.
      */
    var Timezone: js.UndefOr[__string] = js.undefined
  }
  
  trait EndpointItemResponse extends js.Object {
    /**
      * A custom message associated with the registration of an endpoint when issuing a response.
      */
    var Message: js.UndefOr[__string] = js.undefined
    /**
      * The status code associated with the merging of an endpoint when issuing a response.
      */
    var StatusCode: js.UndefOr[__integer] = js.undefined
  }
  
  trait EndpointLocation extends js.Object {
    /**
      * The city where the endpoint is located.
      */
    var City: js.UndefOr[__string] = js.undefined
    /**
      * The two-letter code for the country or region of the endpoint. Specified as an ISO 3166-1 alpha-2 code, such as "US" for the United States.
      */
    var Country: js.UndefOr[__string] = js.undefined
    /**
      * The latitude of the endpoint location, rounded to one decimal place.
      */
    var Latitude: js.UndefOr[__double] = js.undefined
    /**
      * The longitude of the endpoint location, rounded to one decimal place.
      */
    var Longitude: js.UndefOr[__double] = js.undefined
    /**
      * The postal code or zip code of the endpoint.
      */
    var PostalCode: js.UndefOr[__string] = js.undefined
    /**
      * The region of the endpoint location. For example, in the United States, this corresponds to a state.
      */
    var Region: js.UndefOr[__string] = js.undefined
  }
  
  trait EndpointMessageResult extends js.Object {
    /**
      * Address that endpoint message was delivered to.
      */
    var Address: js.UndefOr[__string] = js.undefined
    /**
      * The delivery status of the message. Possible values:
    SUCCESS - The message was successfully delivered to the endpoint.
    TRANSIENT_FAILURE - A temporary error occurred. Amazon Pinpoint will attempt to deliver the message again later.
    FAILURE_PERMANENT - An error occurred when delivering the message to the endpoint. Amazon Pinpoint won't attempt to send the message again.
    TIMEOUT - The message couldn't be sent within the timeout period.
    QUIET_TIME - The local time for the endpoint was within the QuietTime for the campaign or app.
    DAILY_CAP - The endpoint has received the maximum number of messages it can receive within a 24-hour period.
    HOLDOUT - The endpoint was in a hold out treatment for the campaign.
    THROTTLED - Amazon Pinpoint throttled sending to this endpoint.
    EXPIRED - The endpoint address is expired.
    CAMPAIGN_CAP - The endpoint received the maximum number of messages allowed by the campaign.
    SERVICE_FAILURE - A service-level failure prevented Amazon Pinpoint from delivering the message.
    UNKNOWN - An unknown error occurred.
      */
    var DeliveryStatus: js.UndefOr[DeliveryStatus] = js.undefined
    /**
      * Unique message identifier associated with the message that was sent.
      */
    var MessageId: js.UndefOr[__string] = js.undefined
    /**
      * Downstream service status code.
      */
    var StatusCode: js.UndefOr[__integer] = js.undefined
    /**
      * Status message for message delivery.
      */
    var StatusMessage: js.UndefOr[__string] = js.undefined
    /**
      * If token was updated as part of delivery. (This is GCM Specific)
      */
    var UpdatedToken: js.UndefOr[__string] = js.undefined
  }
  
  trait EndpointRequest extends js.Object {
    /**
      * The destination for messages that you send to this endpoint. The address varies by channel. For mobile push channels, use the token provided by the push notification service, such as the APNs device token or the FCM registration token. For the SMS channel, use a phone number in E.164 format, such as +12065550100. For the email channel, use an email address.
      */
    var Address: js.UndefOr[__string] = js.undefined
    /**
      * Custom attributes that describe the endpoint by associating a name with an array of values. For example, an attribute named "interests" might have the values ["science", "politics", "travel"]. You can use these attributes as selection criteria when you create a segment of users to engage with a messaging campaign.
    The following characters are not recommended in attribute names: # : ? \ /. The Amazon Pinpoint console does not display attributes that include these characters in the name. This limitation does not apply to attribute values.
      */
    var Attributes: js.UndefOr[MapOfListOf__string] = js.undefined
    /**
      * The channel type.
    Valid values: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU
      */
    var ChannelType: js.UndefOr[ChannelType] = js.undefined
    /**
      * Demographic attributes for the endpoint.
      */
    var Demographic: js.UndefOr[EndpointDemographic] = js.undefined
    /**
      * The date and time when the endpoint was updated, shown in ISO 8601 format.
      */
    var EffectiveDate: js.UndefOr[__string] = js.undefined
    /**
      * Unused.
      */
    var EndpointStatus: js.UndefOr[__string] = js.undefined
    /**
      * The endpoint location attributes.
      */
    var Location: js.UndefOr[EndpointLocation] = js.undefined
    /**
      * Custom metrics that your app reports to Amazon Pinpoint.
      */
    var Metrics: js.UndefOr[MapOf__double] = js.undefined
    /**
      * Indicates whether a user has opted out of receiving messages with one of the following values:
    ALL - User has opted out of all messages.
    NONE - Users has not opted out and receives all messages.
      */
    var OptOut: js.UndefOr[__string] = js.undefined
    /**
      * The unique ID for the most recent request to update the endpoint.
      */
    var RequestId: js.UndefOr[__string] = js.undefined
    /**
      * Custom user-specific attributes that your app reports to Amazon Pinpoint.
      */
    var User: js.UndefOr[EndpointUser] = js.undefined
  }
  
  trait EndpointResponse extends js.Object {
    /**
      * The address of the endpoint as provided by your push provider. For example, the DeviceToken or RegistrationId.
      */
    var Address: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the application that is associated with the endpoint.
      */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
      * Custom attributes that describe the endpoint by associating a name with an array of values. For example, an attribute named "interests" might have the following values: ["science", "politics", "travel"]. You can use these attributes as selection criteria when you create segments.
    The Amazon Pinpoint console can't display attribute names that include the following characters: hash/pound sign (#), colon (:), question mark (?), backslash (\), and forward slash (/). For this reason, you should avoid using these characters in the names of custom attributes.
      */
    var Attributes: js.UndefOr[MapOfListOf__string] = js.undefined
    /**
      * The channel type.
    Valid values: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU
      */
    var ChannelType: js.UndefOr[ChannelType] = js.undefined
    /**
      * A number from 0-99 that represents the cohort the endpoint is assigned to. Endpoints are grouped into cohorts randomly, and each cohort contains approximately 1 percent of the endpoints for an app. Amazon Pinpoint assigns cohorts to the holdout or treatment allocations for a campaign.
      */
    var CohortId: js.UndefOr[__string] = js.undefined
    /**
      * The date and time when the endpoint was created, shown in ISO 8601 format.
      */
    var CreationDate: js.UndefOr[__string] = js.undefined
    /**
      * The endpoint demographic attributes.
      */
    var Demographic: js.UndefOr[EndpointDemographic] = js.undefined
    /**
      * The date and time when the endpoint was last updated, shown in ISO 8601 format.
      */
    var EffectiveDate: js.UndefOr[__string] = js.undefined
    /**
      * Unused.
      */
    var EndpointStatus: js.UndefOr[__string] = js.undefined
    /**
      * The unique ID that you assigned to the endpoint. The ID should be a globally unique identifier (GUID) to ensure that it doesn't conflict with other endpoint IDs associated with the application.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The endpoint location attributes.
      */
    var Location: js.UndefOr[EndpointLocation] = js.undefined
    /**
      * Custom metrics that your app reports to Amazon Pinpoint.
      */
    var Metrics: js.UndefOr[MapOf__double] = js.undefined
    /**
      * Indicates whether a user has opted out of receiving messages with one of the following values:
    ALL - User has opted out of all messages.
    NONE - Users has not opted out and receives all messages.
      */
    var OptOut: js.UndefOr[__string] = js.undefined
    /**
      * The unique ID for the most recent request to update the endpoint.
      */
    var RequestId: js.UndefOr[__string] = js.undefined
    /**
      * Custom user-specific attributes that your app reports to Amazon Pinpoint.
      */
    var User: js.UndefOr[EndpointUser] = js.undefined
  }
  
  trait EndpointSendConfiguration extends js.Object {
    /**
      * Body override. If specified will override default body.
      */
    var BodyOverride: js.UndefOr[__string] = js.undefined
    /**
      * A map of custom attributes to attributes to be attached to the message for this address. This payload is added to the push notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
      */
    var Context: js.UndefOr[MapOf__string] = js.undefined
    /**
      * The Raw JSON formatted string to be used as the payload. This value overrides the message.
      */
    var RawContent: js.UndefOr[__string] = js.undefined
    /**
      * A map of substitution values for the message to be merged with the DefaultMessage's substitutions. Substitutions on this map take precedence over the all other substitutions.
      */
    var Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined
    /**
      * Title override. If specified will override default title if applicable.
      */
    var TitleOverride: js.UndefOr[__string] = js.undefined
  }
  
  trait EndpointUser extends js.Object {
    /**
      * Custom attributes that describe the user by associating a name with an array of values. For example, an attribute named "interests" might have the following values: ["science", "politics", "travel"]. You can use these attributes as selection criteria when you create segments.
    The Amazon Pinpoint console can't display attribute names that include the following characters: hash/pound sign (#), colon (:), question mark (?), backslash (\), and forward slash (/). For this reason, you should avoid using these characters in the names of custom attributes.
      */
    var UserAttributes: js.UndefOr[MapOfListOf__string] = js.undefined
    /**
      * The unique ID of the user.
      */
    var UserId: js.UndefOr[__string] = js.undefined
  }
  
  trait EndpointsResponse extends js.Object {
    /**
      * The list of endpoints.
      */
    var Item: js.UndefOr[ListOfEndpointResponse] = js.undefined
  }
  
  trait Event extends js.Object {
    /**
      * The package name associated with the app that's recording the event.
      */
    var AppPackageName: js.UndefOr[__string] = js.undefined
    /**
      * The title of the app that's recording the event.
      */
    var AppTitle: js.UndefOr[__string] = js.undefined
    /**
      * The version number of the app that's recording the event.
      */
    var AppVersionCode: js.UndefOr[__string] = js.undefined
    /**
      * Custom attributes that are associated with the event you're adding or updating.
      */
    var Attributes: js.UndefOr[MapOf__string] = js.undefined
    /**
      * The version of the SDK that's running on the client device.
      */
    var ClientSdkVersion: js.UndefOr[__string] = js.undefined
    /**
      * The name of the custom event that you're recording.
      */
    var EventType: js.UndefOr[__string] = js.undefined
    /**
      * Custom metrics related to the event.
      */
    var Metrics: js.UndefOr[MapOf__double] = js.undefined
    /**
      * The name of the SDK that's being used to record the event.
      */
    var SdkName: js.UndefOr[__string] = js.undefined
    /**
      * Information about the session in which the event occurred.
      */
    var Session: js.UndefOr[Session] = js.undefined
    /**
      * The date and time when the event occurred, in ISO 8601 format.
      */
    var Timestamp: js.UndefOr[__string] = js.undefined
  }
  
  trait EventDimensions extends js.Object {
    /**
      * Custom attributes that your app reports to Amazon Pinpoint. You can use these attributes as selection criteria when you create an event filter.
      */
    var Attributes: js.UndefOr[MapOfAttributeDimension] = js.undefined
    /**
      * The name of the event that causes the campaign to be sent. This can be a standard event type that Amazon Pinpoint generates, such as _session.start, or a custom event that's specific to your app.
      */
    var EventType: js.UndefOr[SetDimension] = js.undefined
    /**
      * Custom metrics that your app reports to Amazon Pinpoint. You can use these attributes as selection criteria when you create an event filter.
      */
    var Metrics: js.UndefOr[MapOfMetricDimension] = js.undefined
  }
  
  trait EventItemResponse extends js.Object {
    /**
      * A custom message that is associated with the processing of an event.
      */
    var Message: js.UndefOr[__string] = js.undefined
    /**
      * The status returned in the response as a result of processing the event.
    Possible values: 400 (for invalid events) and 202 (for events that were accepted).
      */
    var StatusCode: js.UndefOr[__integer] = js.undefined
  }
  
  trait EventStream extends js.Object {
    /**
      * The ID of the application from which events should be published.
      */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to publish events.
      Firehose ARN: arn:aws:firehose:REGION:ACCOUNT_ID:deliverystream/STREAM_NAME
      Kinesis ARN: arn:aws:kinesis:REGION:ACCOUNT_ID:stream/STREAM_NAME
      */
    var DestinationStreamArn: js.UndefOr[__string] = js.undefined
    /**
      * (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by Amazon Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended for IAM roles assumed by Amazon Pinpoint.
      */
    var ExternalId: js.UndefOr[__string] = js.undefined
    /**
      * The date the event stream was last updated in ISO 8601 format.
      */
    var LastModifiedDate: js.UndefOr[__string] = js.undefined
    /**
      * The IAM user who last modified the event stream.
      */
    var LastUpdatedBy: js.UndefOr[__string] = js.undefined
    /**
      * The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
      */
    var RoleArn: js.UndefOr[__string] = js.undefined
  }
  
  trait EventsBatch extends js.Object {
    /**
      * The PublicEndpoint attached to the EndpointId from the request.
      */
    var Endpoint: js.UndefOr[PublicEndpoint] = js.undefined
    /**
      * An object that contains a set of events associated with the endpoint.
      */
    var Events: js.UndefOr[MapOfEvent] = js.undefined
  }
  
  trait EventsRequest extends js.Object {
    /**
      * A batch of events to process. Each BatchItem consists of an endpoint ID as the key, and an EventsBatch object as the value.
      */
    var BatchItem: js.UndefOr[MapOfEventsBatch] = js.undefined
  }
  
  trait EventsResponse extends js.Object {
    /**
      * A map that contains a multipart response for each endpoint. Each item in this object uses the endpoint ID as the key, and the item response as the value.
    If no item response exists, the value can also be one of the following: 202 (if the request was processed successfully) or 400 (if the payload was invalid, or required fields were missing).
      */
    var Results: js.UndefOr[MapOfItemResponse] = js.undefined
  }
  
  trait ExportJobRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the Amazon S3 location that endpoints will be exported to.
      */
    var RoleArn: js.UndefOr[__string] = js.undefined
    /**
      * A URL that points to the location within an Amazon S3 bucket that will receive the export. The location is typically a folder with multiple files.
    The URL should follow this format: s3://bucket-name/folder-name/
    Amazon Pinpoint will export endpoints to this location.
      */
    var S3UrlPrefix: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the segment to export endpoints from. If not present, Amazon Pinpoint exports all of the endpoints that belong to the application.
      */
    var SegmentId: js.UndefOr[__string] = js.undefined
    /**
      * The version of the segment to export if specified.
      */
    var SegmentVersion: js.UndefOr[__integer] = js.undefined
  }
  
  trait ExportJobResource extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the Amazon S3 location that endpoints will be exported to.
      */
    var RoleArn: js.UndefOr[__string] = js.undefined
    /**
      * A URL that points to the location within an Amazon S3 bucket that will receive the export. The location is typically a folder with multiple files.
    The URL should follow this format: s3://bucket-name/folder-name/
    Amazon Pinpoint will export endpoints to this location.
      */
    var S3UrlPrefix: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the segment to export endpoints from. If not present, Amazon Pinpoint exports all of the endpoints that belong to the application.
      */
    var SegmentId: js.UndefOr[__string] = js.undefined
    /**
      * The version of the segment to export if specified.
      */
    var SegmentVersion: js.UndefOr[__integer] = js.undefined
  }
  
  trait ExportJobResponse extends js.Object {
    /**
      * The unique ID of the application associated with the export job.
      */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
      * The number of pieces that have successfully completed as of the time of the request.
      */
    var CompletedPieces: js.UndefOr[__integer] = js.undefined
    /**
      * The date the job completed in ISO 8601 format.
      */
    var CompletionDate: js.UndefOr[__string] = js.undefined
    /**
      * The date the job was created in ISO 8601 format.
      */
    var CreationDate: js.UndefOr[__string] = js.undefined
    /**
      * The export job settings.
      */
    var Definition: js.UndefOr[ExportJobResource] = js.undefined
    /**
      * The number of pieces that failed to be processed as of the time of the request.
      */
    var FailedPieces: js.UndefOr[__integer] = js.undefined
    /**
      * Provides up to 100 of the first failed entries for the job, if any exist.
      */
    var Failures: js.UndefOr[ListOf__string] = js.undefined
    /**
      * The unique ID of the job.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The status of the job.
    Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING, FAILED
    The job status is FAILED if one or more pieces failed.
      */
    var JobStatus: js.UndefOr[JobStatus] = js.undefined
    /**
      * The number of endpoints that were not processed; for example, because of syntax errors.
      */
    var TotalFailures: js.UndefOr[__integer] = js.undefined
    /**
      * The total number of pieces that must be processed to finish the job. Each piece is an approximately equal portion of the endpoints.
      */
    var TotalPieces: js.UndefOr[__integer] = js.undefined
    /**
      * The number of endpoints that were processed by the job.
      */
    var TotalProcessed: js.UndefOr[__integer] = js.undefined
    /**
      * The job type. Will be 'EXPORT'.
      */
    var Type: js.UndefOr[__string] = js.undefined
  }
  
  trait ExportJobsResponse extends js.Object {
    /**
      * A list of export jobs for the application.
      */
    var Item: js.UndefOr[ListOfExportJobResponse] = js.undefined
    /**
      * The string that you use in a subsequent request to get the next page of results in a paginated response.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait GCMChannelRequest extends js.Object {
    /**
      * Platform credential API key from Google.
      */
    var ApiKey: js.UndefOr[__string] = js.undefined
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[__boolean] = js.undefined
  }
  
  trait GCMChannelResponse extends js.Object {
    /**
      * The ID of the application to which the channel applies.
      */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
      * When was this segment created
      */
    var CreationDate: js.UndefOr[__string] = js.undefined
    /**
      * The GCM API key from Google.
      */
    var Credential: js.UndefOr[__string] = js.undefined
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[__boolean] = js.undefined
    /**
      * Not used. Retained for backwards compatibility.
      */
    var HasCredential: js.UndefOr[__boolean] = js.undefined
    /**
      * Channel ID. Not used. Present only for backwards compatibility.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * Is this channel archived
      */
    var IsArchived: js.UndefOr[__boolean] = js.undefined
    /**
      * Who last updated this entry
      */
    var LastModifiedBy: js.UndefOr[__string] = js.undefined
    /**
      * Last date this was updated
      */
    var LastModifiedDate: js.UndefOr[__string] = js.undefined
    /**
      * The platform type. Will be GCM
      */
    var Platform: js.UndefOr[__string] = js.undefined
    /**
      * Version of channel
      */
    var Version: js.UndefOr[__integer] = js.undefined
  }
  
  trait GCMMessage extends js.Object {
    /**
      * The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app launches, or it becomes the foreground app if it has been sent to the background. This is the default action. DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user interface within the app. URL - The default mobile browser on the user's device launches and opens a web page at the URL you specify. Possible values include: OPEN_APP | DEEP_LINK | URL
      */
    var Action: js.UndefOr[Action] = js.undefined
    /**
      * The message body of the notification.
      */
    var Body: js.UndefOr[__string] = js.undefined
    /**
      * This parameter identifies a group of messages (e.g., with collapse_key: "Updates Available") that can be collapsed, so that only the last message gets sent when delivery can be resumed. This is intended to avoid sending too many of the same messages when the device comes back online or becomes active.
      */
    var CollapseKey: js.UndefOr[__string] = js.undefined
    /**
      * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody' object
      */
    var Data: js.UndefOr[MapOf__string] = js.undefined
    /**
      * The icon image name of the asset saved in your application.
      */
    var IconReference: js.UndefOr[__string] = js.undefined
    /**
      * The URL that points to an image used as the large icon to the notification content view.
      */
    var ImageIconUrl: js.UndefOr[__string] = js.undefined
    /**
      * The URL that points to an image used in the push notification.
      */
    var ImageUrl: js.UndefOr[__string] = js.undefined
    /**
      * The message priority. Amazon Pinpoint uses this value to set the FCM or GCM priority parameter when it sends the message. Accepts the following values:
    "Normal" - Messages might be delayed. Delivery is optimized for battery usage on the receiving device. Use normal priority unless immediate delivery is required.
    "High" - Messages are sent immediately and might wake a sleeping device.
    The equivalent values for APNs messages are "5" and "10". Amazon Pinpoint accepts these values here and converts them.
    For more information, see About FCM Messages in the Firebase documentation.
      */
    var Priority: js.UndefOr[__string] = js.undefined
    /**
      * The Raw JSON formatted string to be used as the payload. This value overrides the message.
      */
    var RawContent: js.UndefOr[__string] = js.undefined
    /**
      * This parameter specifies the package name of the application where the registration tokens must match in order to receive the message.
      */
    var RestrictedPackageName: js.UndefOr[__string] = js.undefined
    /**
      * Indicates if the message should display on the users device. Silent pushes can be used for Remote Configuration and Phone Home use cases.
      */
    var SilentPush: js.UndefOr[__boolean] = js.undefined
    /**
      * The URL that points to an image used as the small icon for the notification which will be used to represent the notification in the status bar and content view
      */
    var SmallImageIconUrl: js.UndefOr[__string] = js.undefined
    /**
      * Indicates a sound to play when the device receives the notification. Supports default, or the filename of a sound resource bundled in the app. Android sound files must reside in /res/raw/
      */
    var Sound: js.UndefOr[__string] = js.undefined
    /**
      * Default message substitutions. Can be overridden by individual address substitutions.
      */
    var Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined
    /**
      * The length of time (in seconds) that FCM or GCM stores and attempts to deliver the message. If unspecified, the value defaults to the maximum, which is 2,419,200 seconds (28 days). Amazon Pinpoint uses this value to set the FCM or GCM time_to_live parameter.
      */
    var TimeToLive: js.UndefOr[__integer] = js.undefined
    /**
      * The message title that displays above the message on the user's device.
      */
    var Title: js.UndefOr[__string] = js.undefined
    /**
      * The URL to open in the user's mobile browser. Used if the value for Action is URL.
      */
    var Url: js.UndefOr[__string] = js.undefined
  }
  
  trait GPSCoordinates extends js.Object {
    /**
      * Latitude
      */
    var Latitude: js.UndefOr[__double] = js.undefined
    /**
      * Longitude
      */
    var Longitude: js.UndefOr[__double] = js.undefined
  }
  
  trait GPSPointDimension extends js.Object {
    /**
      * Coordinate to measure distance from.
      */
    var Coordinates: js.UndefOr[GPSCoordinates] = js.undefined
    /**
      * Range in kilometers from the coordinate.
      */
    var RangeInKilometers: js.UndefOr[__double] = js.undefined
  }
  
  trait GetAdmChannelRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait GetAdmChannelResponse extends js.Object {
    var ADMChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.ADMChannelResponse
  }
  
  trait GetApnsChannelRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait GetApnsChannelResponse extends js.Object {
    var APNSChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.APNSChannelResponse
  }
  
  trait GetApnsSandboxChannelRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait GetApnsSandboxChannelResponse extends js.Object {
    var APNSSandboxChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.APNSSandboxChannelResponse
  }
  
  trait GetApnsVoipChannelRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait GetApnsVoipChannelResponse extends js.Object {
    var APNSVoipChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.APNSVoipChannelResponse
  }
  
  trait GetApnsVoipSandboxChannelRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait GetApnsVoipSandboxChannelResponse extends js.Object {
    var APNSVoipSandboxChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.APNSVoipSandboxChannelResponse
  }
  
  trait GetAppRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait GetAppResponse extends js.Object {
    var ApplicationResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.ApplicationResponse
  }
  
  trait GetApplicationSettingsRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait GetApplicationSettingsResponse extends js.Object {
    var ApplicationSettingsResource: awsDashSdkLib.clientsPinpointMod.PinpointNs.ApplicationSettingsResource
  }
  
  trait GetAppsRequest extends js.Object {
    /**
      * The number of entries you want on each page in the response.
      */
    var PageSize: js.UndefOr[__string] = js.undefined
    /**
      * The NextToken string returned on a previous page that you use to get the next page of results in a paginated response.
      */
    var Token: js.UndefOr[__string] = js.undefined
  }
  
  trait GetAppsResponse extends js.Object {
    var ApplicationsResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.ApplicationsResponse
  }
  
  trait GetBaiduChannelRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait GetBaiduChannelResponse extends js.Object {
    var BaiduChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.BaiduChannelResponse
  }
  
  trait GetCampaignActivitiesRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    /**
      * The unique ID of the campaign.
      */
    var CampaignId: __string
    /**
      * The number of entries you want on each page in the response.
      */
    var PageSize: js.UndefOr[__string] = js.undefined
    /**
      * The NextToken string returned on a previous page that you use to get the next page of results in a paginated response.
      */
    var Token: js.UndefOr[__string] = js.undefined
  }
  
  trait GetCampaignActivitiesResponse extends js.Object {
    var ActivitiesResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.ActivitiesResponse
  }
  
  trait GetCampaignRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    /**
      * The unique ID of the campaign.
      */
    var CampaignId: __string
  }
  
  trait GetCampaignResponse extends js.Object {
    var CampaignResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.CampaignResponse
  }
  
  trait GetCampaignVersionRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    /**
      * The unique ID of the campaign.
      */
    var CampaignId: __string
    /**
      * The version of the campaign.
      */
    var Version: __string
  }
  
  trait GetCampaignVersionResponse extends js.Object {
    var CampaignResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.CampaignResponse
  }
  
  trait GetCampaignVersionsRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    /**
      * The unique ID of the campaign.
      */
    var CampaignId: __string
    /**
      * The number of entries you want on each page in the response.
      */
    var PageSize: js.UndefOr[__string] = js.undefined
    /**
      * The NextToken string returned on a previous page that you use to get the next page of results in a paginated response.
      */
    var Token: js.UndefOr[__string] = js.undefined
  }
  
  trait GetCampaignVersionsResponse extends js.Object {
    var CampaignsResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.CampaignsResponse
  }
  
  trait GetCampaignsRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    /**
      * The number of entries you want on each page in the response.
      */
    var PageSize: js.UndefOr[__string] = js.undefined
    /**
      * The NextToken string returned on a previous page that you use to get the next page of results in a paginated response.
      */
    var Token: js.UndefOr[__string] = js.undefined
  }
  
  trait GetCampaignsResponse extends js.Object {
    var CampaignsResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.CampaignsResponse
  }
  
  trait GetChannelsRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait GetChannelsResponse extends js.Object {
    var ChannelsResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.ChannelsResponse
  }
  
  trait GetEmailChannelRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait GetEmailChannelResponse extends js.Object {
    var EmailChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.EmailChannelResponse
  }
  
  trait GetEndpointRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    /**
      * The unique ID of the endpoint.
      */
    var EndpointId: __string
  }
  
  trait GetEndpointResponse extends js.Object {
    var EndpointResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.EndpointResponse
  }
  
  trait GetEventStreamRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait GetEventStreamResponse extends js.Object {
    var EventStream: awsDashSdkLib.clientsPinpointMod.PinpointNs.EventStream
  }
  
  trait GetExportJobRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    /**
      * The unique ID of the job.
      */
    var JobId: __string
  }
  
  trait GetExportJobResponse extends js.Object {
    var ExportJobResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.ExportJobResponse
  }
  
  trait GetExportJobsRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    /**
      * The number of entries you want on each page in the response.
      */
    var PageSize: js.UndefOr[__string] = js.undefined
    /**
      * The NextToken string returned on a previous page that you use to get the next page of results in a paginated response.
      */
    var Token: js.UndefOr[__string] = js.undefined
  }
  
  trait GetExportJobsResponse extends js.Object {
    var ExportJobsResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.ExportJobsResponse
  }
  
  trait GetGcmChannelRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait GetGcmChannelResponse extends js.Object {
    var GCMChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.GCMChannelResponse
  }
  
  trait GetImportJobRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    /**
      * The unique ID of the job.
      */
    var JobId: __string
  }
  
  trait GetImportJobResponse extends js.Object {
    var ImportJobResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.ImportJobResponse
  }
  
  trait GetImportJobsRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    /**
      * The number of entries you want on each page in the response.
      */
    var PageSize: js.UndefOr[__string] = js.undefined
    /**
      * The NextToken string returned on a previous page that you use to get the next page of results in a paginated response.
      */
    var Token: js.UndefOr[__string] = js.undefined
  }
  
  trait GetImportJobsResponse extends js.Object {
    var ImportJobsResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.ImportJobsResponse
  }
  
  trait GetSegmentExportJobsRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    /**
      * The number of entries you want on each page in the response.
      */
    var PageSize: js.UndefOr[__string] = js.undefined
    /**
      * The unique ID of the segment.
      */
    var SegmentId: __string
    /**
      * The NextToken string returned on a previous page that you use to get the next page of results in a paginated response.
      */
    var Token: js.UndefOr[__string] = js.undefined
  }
  
  trait GetSegmentExportJobsResponse extends js.Object {
    var ExportJobsResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.ExportJobsResponse
  }
  
  trait GetSegmentImportJobsRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    /**
      * The number of entries you want on each page in the response.
      */
    var PageSize: js.UndefOr[__string] = js.undefined
    /**
      * The unique ID of the segment.
      */
    var SegmentId: __string
    /**
      * The NextToken string returned on a previous page that you use to get the next page of results in a paginated response.
      */
    var Token: js.UndefOr[__string] = js.undefined
  }
  
  trait GetSegmentImportJobsResponse extends js.Object {
    var ImportJobsResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.ImportJobsResponse
  }
  
  trait GetSegmentRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    /**
      * The unique ID of the segment.
      */
    var SegmentId: __string
  }
  
  trait GetSegmentResponse extends js.Object {
    var SegmentResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.SegmentResponse
  }
  
  trait GetSegmentVersionRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    /**
      * The unique ID of the segment.
      */
    var SegmentId: __string
    /**
      * The segment version.
      */
    var Version: __string
  }
  
  trait GetSegmentVersionResponse extends js.Object {
    var SegmentResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.SegmentResponse
  }
  
  trait GetSegmentVersionsRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    /**
      * The number of entries you want on each page in the response.
      */
    var PageSize: js.UndefOr[__string] = js.undefined
    /**
      * The unique ID of the segment.
      */
    var SegmentId: __string
    /**
      * The NextToken string returned on a previous page that you use to get the next page of results in a paginated response.
      */
    var Token: js.UndefOr[__string] = js.undefined
  }
  
  trait GetSegmentVersionsResponse extends js.Object {
    var SegmentsResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.SegmentsResponse
  }
  
  trait GetSegmentsRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    /**
      * The number of entries you want on each page in the response.
      */
    var PageSize: js.UndefOr[__string] = js.undefined
    /**
      * The NextToken string returned on a previous page that you use to get the next page of results in a paginated response.
      */
    var Token: js.UndefOr[__string] = js.undefined
  }
  
  trait GetSegmentsResponse extends js.Object {
    var SegmentsResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.SegmentsResponse
  }
  
  trait GetSmsChannelRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait GetSmsChannelResponse extends js.Object {
    var SMSChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.SMSChannelResponse
  }
  
  trait GetUserEndpointsRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    /**
      * The unique ID of the user.
      */
    var UserId: __string
  }
  
  trait GetUserEndpointsResponse extends js.Object {
    var EndpointsResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.EndpointsResponse
  }
  
  trait GetVoiceChannelRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait GetVoiceChannelResponse extends js.Object {
    var VoiceChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.VoiceChannelResponse
  }
  
  trait ImportJobRequest extends js.Object {
    /**
      * Sets whether the endpoints create a segment when they are imported.
      */
    var DefineSegment: js.UndefOr[__boolean] = js.undefined
    /**
      * (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by Amazon Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended for IAM roles assumed by Amazon Pinpoint.
      */
    var ExternalId: js.UndefOr[__string] = js.undefined
    /**
      * The format of the files that contain the endpoint definitions.
    Valid values: CSV, JSON
      */
    var Format: js.UndefOr[Format] = js.undefined
    /**
      * Sets whether the endpoints are registered with Amazon Pinpoint when they are imported.
      */
    var RegisterEndpoints: js.UndefOr[__boolean] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the Amazon S3 location that contains the endpoints to import.
      */
    var RoleArn: js.UndefOr[__string] = js.undefined
    /**
      * The URL of the S3 bucket that contains the segment information to import. The location can be a folder or a single file. The URL should use the following format: s3://bucket-name/folder-name/file-name
    Amazon Pinpoint imports endpoints from this location and any subfolders it contains.
      */
    var S3Url: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the segment to update if the import job is meant to update an existing segment.
      */
    var SegmentId: js.UndefOr[__string] = js.undefined
    /**
      * A custom name for the segment created by the import job. Use if DefineSegment is true.
      */
    var SegmentName: js.UndefOr[__string] = js.undefined
  }
  
  trait ImportJobResource extends js.Object {
    /**
      * Sets whether the endpoints create a segment when they are imported.
      */
    var DefineSegment: js.UndefOr[__boolean] = js.undefined
    /**
      * (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by Amazon Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended for IAM roles assumed by Amazon Pinpoint.
      */
    var ExternalId: js.UndefOr[__string] = js.undefined
    /**
      * The format of the files that contain the endpoint definitions.
    Valid values: CSV, JSON
      */
    var Format: js.UndefOr[Format] = js.undefined
    /**
      * Sets whether the endpoints are registered with Amazon Pinpoint when they are imported.
      */
    var RegisterEndpoints: js.UndefOr[__boolean] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the Amazon S3 location that contains the endpoints to import.
      */
    var RoleArn: js.UndefOr[__string] = js.undefined
    /**
      * The URL of the S3 bucket that contains the segment information to import. The location can be a folder or a single file. The URL should use the following format: s3://bucket-name/folder-name/file-name
    Amazon Pinpoint imports endpoints from this location and any subfolders it contains.
      */
    var S3Url: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the segment to update if the import job is meant to update an existing segment.
      */
    var SegmentId: js.UndefOr[__string] = js.undefined
    /**
      * A custom name for the segment created by the import job. Use if DefineSegment is true.
      */
    var SegmentName: js.UndefOr[__string] = js.undefined
  }
  
  trait ImportJobResponse extends js.Object {
    /**
      * The unique ID of the application to which the import job applies.
      */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
      * The number of pieces that have successfully imported as of the time of the request.
      */
    var CompletedPieces: js.UndefOr[__integer] = js.undefined
    /**
      * The date the import job completed in ISO 8601 format.
      */
    var CompletionDate: js.UndefOr[__string] = js.undefined
    /**
      * The date the import job was created in ISO 8601 format.
      */
    var CreationDate: js.UndefOr[__string] = js.undefined
    /**
      * The import job settings.
      */
    var Definition: js.UndefOr[ImportJobResource] = js.undefined
    /**
      * The number of pieces that have failed to import as of the time of the request.
      */
    var FailedPieces: js.UndefOr[__integer] = js.undefined
    /**
      * Provides up to 100 of the first failed entries for the job, if any exist.
      */
    var Failures: js.UndefOr[ListOf__string] = js.undefined
    /**
      * The unique ID of the import job.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The status of the import job.
    Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING, FAILED
    The job status is FAILED if one or more pieces failed to import.
      */
    var JobStatus: js.UndefOr[JobStatus] = js.undefined
    /**
      * The number of endpoints that failed to import; for example, because of syntax errors.
      */
    var TotalFailures: js.UndefOr[__integer] = js.undefined
    /**
      * The total number of pieces that must be imported to finish the job. Each piece is an approximately equal portion of the endpoints to import.
      */
    var TotalPieces: js.UndefOr[__integer] = js.undefined
    /**
      * The number of endpoints that were processed by the import job.
      */
    var TotalProcessed: js.UndefOr[__integer] = js.undefined
    /**
      * The job type. Will be Import.
      */
    var Type: js.UndefOr[__string] = js.undefined
  }
  
  trait ImportJobsResponse extends js.Object {
    /**
      * A list of import jobs for the application.
      */
    var Item: js.UndefOr[ListOfImportJobResponse] = js.undefined
    /**
      * The string that you use in a subsequent request to get the next page of results in a paginated response.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ItemResponse extends js.Object {
    /**
      * The response received after the endpoint was accepted.
      */
    var EndpointItemResponse: js.UndefOr[EndpointItemResponse] = js.undefined
    /**
      * A multipart response object that contains a key and value for each event ID in the request. In each object, the event ID is the key, and an EventItemResponse object is the value.
      */
    var EventsItemResponse: js.UndefOr[MapOfEventItemResponse] = js.undefined
  }
  
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: __string
  }
  
  trait ListTagsForResourceResponse extends js.Object {
    var TagsModel: awsDashSdkLib.clientsPinpointMod.PinpointNs.TagsModel
  }
  
  trait MapOfAddressConfiguration
    extends /* key */ org.scalablytyped.runtime.StringDictionary[AddressConfiguration]
  
  trait MapOfAttributeDimension
    extends /* key */ org.scalablytyped.runtime.StringDictionary[AttributeDimension]
  
  trait MapOfChannelResponse
    extends /* key */ org.scalablytyped.runtime.StringDictionary[ChannelResponse]
  
  trait MapOfEndpointMessageResult
    extends /* key */ org.scalablytyped.runtime.StringDictionary[EndpointMessageResult]
  
  trait MapOfEndpointSendConfiguration
    extends /* key */ org.scalablytyped.runtime.StringDictionary[EndpointSendConfiguration]
  
  trait MapOfEvent
    extends /* key */ org.scalablytyped.runtime.StringDictionary[Event]
  
  trait MapOfEventItemResponse
    extends /* key */ org.scalablytyped.runtime.StringDictionary[EventItemResponse]
  
  trait MapOfEventsBatch
    extends /* key */ org.scalablytyped.runtime.StringDictionary[EventsBatch]
  
  trait MapOfItemResponse
    extends /* key */ org.scalablytyped.runtime.StringDictionary[ItemResponse]
  
  trait MapOfListOf__string
    extends /* key */ org.scalablytyped.runtime.StringDictionary[ListOf__string]
  
  trait MapOfMapOfEndpointMessageResult
    extends /* key */ org.scalablytyped.runtime.StringDictionary[MapOfEndpointMessageResult]
  
  trait MapOfMessageResult
    extends /* key */ org.scalablytyped.runtime.StringDictionary[MessageResult]
  
  trait MapOfMetricDimension
    extends /* key */ org.scalablytyped.runtime.StringDictionary[MetricDimension]
  
  trait MapOf__double
    extends /* key */ org.scalablytyped.runtime.StringDictionary[__double]
  
  trait MapOf__integer
    extends /* key */ org.scalablytyped.runtime.StringDictionary[__integer]
  
  trait MapOf__string
    extends /* key */ org.scalablytyped.runtime.StringDictionary[__string]
  
  trait Message extends js.Object {
    /**
      * The action that occurs if the user taps a push notification delivered by the campaign:
    OPEN_APP - Your app launches, or it becomes the foreground app if it has been sent to the background. This is the default action.
    DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user interface within the app.
    URL - The default mobile browser on the user's device launches and opens a web page at the URL you specify.
      */
    var Action: js.UndefOr[Action] = js.undefined
    /**
      * The message body. Can include up to 140 characters.
      */
    var Body: js.UndefOr[__string] = js.undefined
    /**
      * The URL that points to the icon image for the push notification icon, for example, the app icon.
      */
    var ImageIconUrl: js.UndefOr[__string] = js.undefined
    /**
      * The URL that points to the small icon image for the push notification icon, for example, the app icon.
      */
    var ImageSmallIconUrl: js.UndefOr[__string] = js.undefined
    /**
      * The URL that points to an image used in the push notification.
      */
    var ImageUrl: js.UndefOr[__string] = js.undefined
    /**
      * The JSON payload used for a silent push.
      */
    var JsonBody: js.UndefOr[__string] = js.undefined
    /**
      * A URL that refers to the location of an image or video that you want to display in the push notification.
      */
    var MediaUrl: js.UndefOr[__string] = js.undefined
    /**
      * The Raw JSON formatted string to be used as the payload. This value overrides the message.
      */
    var RawContent: js.UndefOr[__string] = js.undefined
    /**
      * Indicates if the message should display on the users device.
    Silent pushes can be used for Remote Configuration and Phone Home use cases. 
      */
    var SilentPush: js.UndefOr[__boolean] = js.undefined
    /**
      * This parameter specifies how long (in seconds) the message should be kept if the service is unable to deliver the notification the first time. If the value is 0, it treats the notification as if it expires immediately and does not store the notification or attempt to redeliver it. This value is converted to the expiration field when sent to the service. It only applies to APNs and GCM
      */
    var TimeToLive: js.UndefOr[__integer] = js.undefined
    /**
      * The message title that displays above the message on the user's device.
      */
    var Title: js.UndefOr[__string] = js.undefined
    /**
      * The URL to open in the user's mobile browser. Used if the value for Action is URL.
      */
    var Url: js.UndefOr[__string] = js.undefined
  }
  
  trait MessageBody extends js.Object {
    /**
      * The error message that's returned from the API.
      */
    var Message: js.UndefOr[__string] = js.undefined
    /**
      * The unique message body ID.
      */
    var RequestID: js.UndefOr[__string] = js.undefined
  }
  
  trait MessageConfiguration extends js.Object {
    /**
      * The message that the campaign delivers to ADM channels. Overrides the default message.
      */
    var ADMMessage: js.UndefOr[Message] = js.undefined
    /**
      * The message that the campaign delivers to APNS channels. Overrides the default message.
      */
    var APNSMessage: js.UndefOr[Message] = js.undefined
    /**
      * The message that the campaign delivers to Baidu channels. Overrides the default message.
      */
    var BaiduMessage: js.UndefOr[Message] = js.undefined
    /**
      * The default message for all channels.
      */
    var DefaultMessage: js.UndefOr[Message] = js.undefined
    /**
      * The email message configuration.
      */
    var EmailMessage: js.UndefOr[CampaignEmailMessage] = js.undefined
    /**
      * The message that the campaign delivers to GCM channels. Overrides the default message.
      */
    var GCMMessage: js.UndefOr[Message] = js.undefined
    /**
      * The SMS message configuration.
      */
    var SMSMessage: js.UndefOr[CampaignSmsMessage] = js.undefined
  }
  
  trait MessageRequest extends js.Object {
    /**
      * A map of key-value pairs, where each key is an address and each value is an AddressConfiguration object. An address can be a push notification token, a phone number, or an email address.
      */
    var Addresses: js.UndefOr[MapOfAddressConfiguration] = js.undefined
    /**
      * A map of custom attributes to attributes to be attached to the message. This payload is added to the push notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
      */
    var Context: js.UndefOr[MapOf__string] = js.undefined
    /**
      * A map of key-value pairs, where each key is an endpoint ID and each value is an EndpointSendConfiguration object. Within an EndpointSendConfiguration object, you can tailor the message for an endpoint by specifying message overrides or substitutions.
      */
    var Endpoints: js.UndefOr[MapOfEndpointSendConfiguration] = js.undefined
    /**
      * Message configuration.
      */
    var MessageConfiguration: js.UndefOr[DirectMessageConfiguration] = js.undefined
    /**
      * A unique ID that you can use to trace a message. This ID is visible to recipients.
      */
    var TraceId: js.UndefOr[__string] = js.undefined
  }
  
  trait MessageResponse extends js.Object {
    /**
      * Application id of the message.
      */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
      * A map containing a multi part response for each address, with the endpointId as the key and the result as the value.
      */
    var EndpointResult: js.UndefOr[MapOfEndpointMessageResult] = js.undefined
    /**
      * Original request Id for which this message was delivered.
      */
    var RequestId: js.UndefOr[__string] = js.undefined
    /**
      * A map containing a multi part response for each address, with the address as the key(Email address, phone number or push token) and the result as the value.
      */
    var Result: js.UndefOr[MapOfMessageResult] = js.undefined
  }
  
  trait MessageResult extends js.Object {
    /**
      * The delivery status of the message. Possible values:
    SUCCESS - The message was successfully delivered to the endpoint.
    TRANSIENT_FAILURE - A temporary error occurred. Amazon Pinpoint will attempt to deliver the message again later.
    FAILURE_PERMANENT - An error occurred when delivering the message to the endpoint. Amazon Pinpoint won't attempt to send the message again.
    TIMEOUT - The message couldn't be sent within the timeout period.
    QUIET_TIME - The local time for the endpoint was within the QuietTime for the campaign or app.
    DAILY_CAP - The endpoint has received the maximum number of messages it can receive within a 24-hour period.
    HOLDOUT - The endpoint was in a hold out treatment for the campaign.
    THROTTLED - Amazon Pinpoint throttled sending to this endpoint.
    EXPIRED - The endpoint address is expired.
    CAMPAIGN_CAP - The endpoint received the maximum number of messages allowed by the campaign.
    SERVICE_FAILURE - A service-level failure prevented Amazon Pinpoint from delivering the message.
    UNKNOWN - An unknown error occurred.
      */
    var DeliveryStatus: js.UndefOr[DeliveryStatus] = js.undefined
    /**
      * Unique message identifier associated with the message that was sent.
      */
    var MessageId: js.UndefOr[__string] = js.undefined
    /**
      * Downstream service status code.
      */
    var StatusCode: js.UndefOr[__integer] = js.undefined
    /**
      * Status message for message delivery.
      */
    var StatusMessage: js.UndefOr[__string] = js.undefined
    /**
      * If token was updated as part of delivery. (This is GCM Specific)
      */
    var UpdatedToken: js.UndefOr[__string] = js.undefined
  }
  
  trait MetricDimension extends js.Object {
    /**
      * The operator that you're using to compare metric values. Possible values: GREATER_THAN, LESS_THAN, GREATER_THAN_OR_EQUAL, LESS_THAN_OR_EQUAL, or EQUAL
      */
    var ComparisonOperator: js.UndefOr[__string] = js.undefined
    /**
      * The value to be compared.
      */
    var Value: js.UndefOr[__double] = js.undefined
  }
  
  trait NumberValidateRequest extends js.Object {
    /**
      * (Optional) The two-character ISO country code for the country or region where the phone number was originally registered.
      */
    var IsoCountryCode: js.UndefOr[__string] = js.undefined
    /**
      * The phone number to get information about. The phone number that you provide should include a country code. If the number doesn't include a valid country code, the operation might result in an error.
      */
    var PhoneNumber: js.UndefOr[__string] = js.undefined
  }
  
  trait NumberValidateResponse extends js.Object {
    /**
      * The carrier or servive provider that the phone number is currently registered with.
      */
    var Carrier: js.UndefOr[__string] = js.undefined
    /**
      * The city where the phone number was originally registered.
      */
    var City: js.UndefOr[__string] = js.undefined
    /**
      * The cleansed phone number, shown in E.164 format.
      */
    var CleansedPhoneNumberE164: js.UndefOr[__string] = js.undefined
    /**
      * The cleansed phone number, shown in the local phone number format.
      */
    var CleansedPhoneNumberNational: js.UndefOr[__string] = js.undefined
    /**
      * The country or region where the phone number was originally registered.
      */
    var Country: js.UndefOr[__string] = js.undefined
    /**
      * The two-character ISO code for the country or region where the phone number was originally registered.
      */
    var CountryCodeIso2: js.UndefOr[__string] = js.undefined
    /**
      * The numeric code for the country or region where the phone number was originally registered.
      */
    var CountryCodeNumeric: js.UndefOr[__string] = js.undefined
    /**
      * The county where the phone number was originally registered.
      */
    var County: js.UndefOr[__string] = js.undefined
    /**
      * The two-character code (in ISO 3166-1 alpha-2 format) for the country or region in the request body.
      */
    var OriginalCountryCodeIso2: js.UndefOr[__string] = js.undefined
    /**
      * The phone number that you included in the request body.
      */
    var OriginalPhoneNumber: js.UndefOr[__string] = js.undefined
    /**
      * A description of the phone type. Possible values are MOBILE, LANDLINE, VOIP, INVALID, PREPAID, and OTHER.
      */
    var PhoneType: js.UndefOr[__string] = js.undefined
    /**
      * The phone type, represented by an integer. Possible values include 0 (MOBILE), 1 (LANDLINE), 2 (VOIP), 3 (INVALID), 4 (OTHER), and 5 (PREPAID).
      */
    var PhoneTypeCode: js.UndefOr[__integer] = js.undefined
    /**
      * The time zone for the location where the phone number was originally registered.
      */
    var Timezone: js.UndefOr[__string] = js.undefined
    /**
      * The postal code for the location where the phone number was originally registered.
      */
    var ZipCode: js.UndefOr[__string] = js.undefined
  }
  
  trait PhoneNumberValidateRequest extends js.Object {
    var NumberValidateRequest: awsDashSdkLib.clientsPinpointMod.PinpointNs.NumberValidateRequest
  }
  
  trait PhoneNumberValidateResponse extends js.Object {
    var NumberValidateResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.NumberValidateResponse
  }
  
  trait PublicEndpoint extends js.Object {
    /**
      * The unique identifier for the recipient. For example, an address could be a device token, email address, or mobile phone number.
      */
    var Address: js.UndefOr[__string] = js.undefined
    /**
      * Custom attributes that your app reports to Amazon Pinpoint. You can use these attributes as selection criteria when you create a segment.
      */
    var Attributes: js.UndefOr[MapOfListOf__string] = js.undefined
    /**
      * The channel type.
    Valid values: APNS, GCM
      */
    var ChannelType: js.UndefOr[ChannelType] = js.undefined
    /**
      * The endpoint demographic attributes.
      */
    var Demographic: js.UndefOr[EndpointDemographic] = js.undefined
    /**
      * The date and time when the endpoint was last updated, in  ISO 8601 format.
      */
    var EffectiveDate: js.UndefOr[__string] = js.undefined
    /**
      * The status of the endpoint. If the update fails, the value is INACTIVE. If the endpoint is updated successfully, the value is ACTIVE.
      */
    var EndpointStatus: js.UndefOr[__string] = js.undefined
    /**
      * The endpoint location attributes.
      */
    var Location: js.UndefOr[EndpointLocation] = js.undefined
    /**
      * Custom metrics that your app reports to Amazon Pinpoint.
      */
    var Metrics: js.UndefOr[MapOf__double] = js.undefined
    /**
      * Indicates whether a user has opted out of receiving messages with one of the following values:
    ALL - User has opted out of all messages.
    NONE - Users has not opted out and receives all messages.
      */
    var OptOut: js.UndefOr[__string] = js.undefined
    /**
      * A unique identifier that is generated each time the endpoint is updated.
      */
    var RequestId: js.UndefOr[__string] = js.undefined
    /**
      * Custom user-specific attributes that your app reports to Amazon Pinpoint.
      */
    var User: js.UndefOr[EndpointUser] = js.undefined
  }
  
  trait PutEventStreamRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    var WriteEventStream: awsDashSdkLib.clientsPinpointMod.PinpointNs.WriteEventStream
  }
  
  trait PutEventStreamResponse extends js.Object {
    var EventStream: awsDashSdkLib.clientsPinpointMod.PinpointNs.EventStream
  }
  
  trait PutEventsRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    var EventsRequest: awsDashSdkLib.clientsPinpointMod.PinpointNs.EventsRequest
  }
  
  trait PutEventsResponse extends js.Object {
    var EventsResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.EventsResponse
  }
  
  trait QuietTime extends js.Object {
    /**
      * The time at which quiet time should end. The value that you specify has to be in HH:mm format, where HH is the hour in 24-hour format (with a leading zero, if applicable), and mm is the minutes. For example, use 02:30 to represent 2:30 AM, or 14:30 to represent 2:30 PM.
      */
    var End: js.UndefOr[__string] = js.undefined
    /**
      * The time at which quiet time should begin. The value that you specify has to be in HH:mm format, where HH is the hour in 24-hour format (with a leading zero, if applicable), and mm is the minutes. For example, use 02:30 to represent 2:30 AM, or 14:30 to represent 2:30 PM.
      */
    var Start: js.UndefOr[__string] = js.undefined
  }
  
  trait RawEmail extends js.Object {
    /**
      * The raw email message itself. Then entire message must be base64-encoded.
      */
    var Data: js.UndefOr[__blob] = js.undefined
  }
  
  trait RecencyDimension extends js.Object {
    /**
      * The length of time during which users have been active or inactive with your app.
    Valid values: HR_24, DAY_7, DAY_14, DAY_30
      */
    var Duration: js.UndefOr[Duration] = js.undefined
    /**
      * The recency dimension type:
    ACTIVE - Users who have used your app within the specified duration are included in the segment.
    INACTIVE - Users who have not used your app within the specified duration are included in the segment.
      */
    var RecencyType: js.UndefOr[RecencyType] = js.undefined
  }
  
  trait RemoveAttributesRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    /**
      * Type of attribute. Can be endpoint-custom-attributes, endpoint-custom-metrics, endpoint-user-attributes.
      */
    var AttributeType: __string
    var UpdateAttributesRequest: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateAttributesRequest
  }
  
  trait RemoveAttributesResponse extends js.Object {
    var AttributesResource: awsDashSdkLib.clientsPinpointMod.PinpointNs.AttributesResource
  }
  
  trait SMSChannelRequest extends js.Object {
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[__boolean] = js.undefined
    /**
      * Sender identifier of your messages.
      */
    var SenderId: js.UndefOr[__string] = js.undefined
    /**
      * ShortCode registered with phone provider.
      */
    var ShortCode: js.UndefOr[__string] = js.undefined
  }
  
  trait SMSChannelResponse extends js.Object {
    /**
      * The unique ID of the application to which the SMS channel belongs.
      */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
      * The date that the settings were last updated in ISO 8601 format.
      */
    var CreationDate: js.UndefOr[__string] = js.undefined
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[__boolean] = js.undefined
    /**
      * Not used. Retained for backwards compatibility.
      */
    var HasCredential: js.UndefOr[__boolean] = js.undefined
    /**
      * Channel ID. Not used, only for backwards compatibility.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * Is this channel archived
      */
    var IsArchived: js.UndefOr[__boolean] = js.undefined
    /**
      * Who last updated this entry
      */
    var LastModifiedBy: js.UndefOr[__string] = js.undefined
    /**
      * Last date this was updated
      */
    var LastModifiedDate: js.UndefOr[__string] = js.undefined
    /**
      * Platform type. Will be "SMS"
      */
    var Platform: js.UndefOr[__string] = js.undefined
    /**
      * Promotional messages per second that can be sent
      */
    var PromotionalMessagesPerSecond: js.UndefOr[__integer] = js.undefined
    /**
      * Sender identifier of your messages.
      */
    var SenderId: js.UndefOr[__string] = js.undefined
    /**
      * The short code registered with the phone provider.
      */
    var ShortCode: js.UndefOr[__string] = js.undefined
    /**
      * Transactional messages per second that can be sent
      */
    var TransactionalMessagesPerSecond: js.UndefOr[__integer] = js.undefined
    /**
      * Version of channel
      */
    var Version: js.UndefOr[__integer] = js.undefined
  }
  
  trait SMSMessage extends js.Object {
    /**
      * The body of the SMS message.
      */
    var Body: js.UndefOr[__string] = js.undefined
    /**
      * The SMS program name that you provided to AWS Support when you requested your dedicated number.
      */
    var Keyword: js.UndefOr[__string] = js.undefined
    /**
      * Is this a transaction priority message or lower priority.
      */
    var MessageType: js.UndefOr[MessageType] = js.undefined
    /**
      * The phone number that the SMS message originates from. Specify one of the dedicated long codes or short codes that you requested from AWS Support and that is assigned to your account. If this attribute is not specified, Amazon Pinpoint randomly assigns a long code.
      */
    var OriginationNumber: js.UndefOr[__string] = js.undefined
    /**
      * The sender ID that is shown as the message sender on the recipient's device. Support for sender IDs varies by country or region.
      */
    var SenderId: js.UndefOr[__string] = js.undefined
    /**
      * Default message substitutions. Can be overridden by individual address substitutions.
      */
    var Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined
  }
  
  trait Schedule extends js.Object {
    /**
      * The scheduled time that the campaign ends in ISO 8601 format.
      */
    var EndTime: js.UndefOr[__string] = js.undefined
    /**
      * Defines the type of events that can trigger the campaign. Used when the Frequency is set to EVENT.
      */
    var EventFilter: js.UndefOr[CampaignEventFilter] = js.undefined
    /**
      * How often the campaign delivers messages.
    Valid values:
    ONCE
    HOURLY
    DAILY
    WEEKLY
    MONTHLY
    EVENT
      */
    var Frequency: js.UndefOr[Frequency] = js.undefined
    /**
      * Indicates whether the campaign schedule takes effect according to each user's local time.
      */
    var IsLocalTime: js.UndefOr[__boolean] = js.undefined
    /**
      * The default quiet time for the campaign. The campaign doesn't send messages to endpoints during the quiet time.
    Note: Make sure that your endpoints include the Demographics.Timezone attribute if you plan to enable a quiet time for your campaign. If your endpoints don't include this attribute, they'll receive the messages that you send them, even if quiet time is enabled.
    When you set up a campaign to use quiet time, the campaign doesn't send messages during the time range you specified, as long as all of the following are true:
    - The endpoint includes a valid Demographic.Timezone attribute.
    - The current time in the endpoint's time zone is later than or equal to the time specified in the QuietTime.Start attribute for the campaign.
    - The current time in the endpoint's time zone is earlier than or equal to the time specified in the QuietTime.End attribute for the campaign.
      */
    var QuietTime: js.UndefOr[QuietTime] = js.undefined
    /**
      * The scheduled time that the campaign begins in ISO 8601 format.
      */
    var StartTime: js.UndefOr[__string] = js.undefined
    /**
      * The starting UTC offset for the schedule if the value for isLocalTime is true
    Valid values: 
    UTC
    UTC+01
    UTC+02
    UTC+03
    UTC+03:30
    UTC+04
    UTC+04:30
    UTC+05
    UTC+05:30
    UTC+05:45
    UTC+06
    UTC+06:30
    UTC+07
    UTC+08
    UTC+09
    UTC+09:30
    UTC+10
    UTC+10:30
    UTC+11
    UTC+12
    UTC+13
    UTC-02
    UTC-03
    UTC-04
    UTC-05
    UTC-06
    UTC-07
    UTC-08
    UTC-09
    UTC-10
    UTC-11
      */
    var Timezone: js.UndefOr[__string] = js.undefined
  }
  
  trait SegmentBehaviors extends js.Object {
    /**
      * The recency of use.
      */
    var Recency: js.UndefOr[RecencyDimension] = js.undefined
  }
  
  trait SegmentDemographics extends js.Object {
    /**
      * The app version criteria for the segment.
      */
    var AppVersion: js.UndefOr[SetDimension] = js.undefined
    /**
      * The channel criteria for the segment.
      */
    var Channel: js.UndefOr[SetDimension] = js.undefined
    /**
      * The device type criteria for the segment.
      */
    var DeviceType: js.UndefOr[SetDimension] = js.undefined
    /**
      * The device make criteria for the segment.
      */
    var Make: js.UndefOr[SetDimension] = js.undefined
    /**
      * The device model criteria for the segment.
      */
    var Model: js.UndefOr[SetDimension] = js.undefined
    /**
      * The device platform criteria for the segment.
      */
    var Platform: js.UndefOr[SetDimension] = js.undefined
  }
  
  trait SegmentDimensions extends js.Object {
    /**
      * Custom segment attributes.
      */
    var Attributes: js.UndefOr[MapOfAttributeDimension] = js.undefined
    /**
      * The segment behaviors attributes.
      */
    var Behavior: js.UndefOr[SegmentBehaviors] = js.undefined
    /**
      * The segment demographics attributes.
      */
    var Demographic: js.UndefOr[SegmentDemographics] = js.undefined
    /**
      * The segment location attributes.
      */
    var Location: js.UndefOr[SegmentLocation] = js.undefined
    /**
      * Custom segment metrics.
      */
    var Metrics: js.UndefOr[MapOfMetricDimension] = js.undefined
    /**
      * Custom segment user attributes.
      */
    var UserAttributes: js.UndefOr[MapOfAttributeDimension] = js.undefined
  }
  
  trait SegmentGroup extends js.Object {
    /**
      * List of dimensions to include or exclude.
      */
    var Dimensions: js.UndefOr[ListOfSegmentDimensions] = js.undefined
    /**
      * The base segment that you build your segment on. The source segment defines the starting "universe" of endpoints. When you add dimensions to the segment, it filters the source segment based on the dimensions that you specify. You can specify more than one dimensional segment. You can only specify one imported segment.
    NOTE: If you specify an imported segment for this attribute, the segment size estimate that appears in the Amazon Pinpoint console shows the size of the imported segment, without any filters applied to it.
      */
    var SourceSegments: js.UndefOr[ListOfSegmentReference] = js.undefined
    /**
      * Specify how to handle multiple source segments. For example, if you specify three source segments, should the resulting segment be based on any or all of the segments? Acceptable values: ANY or ALL.
      */
    var SourceType: js.UndefOr[SourceType] = js.undefined
    /**
      * Specify how to handle multiple segment dimensions. For example, if you specify three dimensions, should the resulting segment include endpoints that are matched by all, any, or none of the dimensions? Acceptable values: ALL, ANY, or NONE.
      */
    var Type: js.UndefOr[Type] = js.undefined
  }
  
  trait SegmentGroupList extends js.Object {
    /**
      * A set of segment criteria to evaluate.
      */
    var Groups: js.UndefOr[ListOfSegmentGroup] = js.undefined
    /**
      * Specify how to handle multiple segment groups. For example, if the segment includes three segment groups, should the resulting segment include endpoints that are matched by all, any, or none of the segment groups you created. Acceptable values: ALL, ANY, or NONE.
      */
    var Include: js.UndefOr[Include] = js.undefined
  }
  
  trait SegmentImportResource extends js.Object {
    /**
      * The number of channel types in the imported segment.
      */
    var ChannelCounts: js.UndefOr[MapOf__integer] = js.undefined
    /**
      * (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by Amazon Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended for IAM roles assumed by Amazon Pinpoint.
      */
    var ExternalId: js.UndefOr[__string] = js.undefined
    /**
      * The format of the endpoint files that were imported to create this segment.
    Valid values: CSV, JSON
      */
    var Format: js.UndefOr[Format] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the endpoints in Amazon S3.
      */
    var RoleArn: js.UndefOr[__string] = js.undefined
    /**
      * The URL of the S3 bucket that the segment was imported from.
      */
    var S3Url: js.UndefOr[__string] = js.undefined
    /**
      * The number of endpoints that were successfully imported to create this segment.
      */
    var Size: js.UndefOr[__integer] = js.undefined
  }
  
  trait SegmentLocation extends js.Object {
    /**
      * The country or region, in ISO 3166-1 alpha-2 format.
      */
    var Country: js.UndefOr[SetDimension] = js.undefined
    /**
      * The GPS Point dimension.
      */
    var GPSPoint: js.UndefOr[GPSPointDimension] = js.undefined
  }
  
  trait SegmentReference extends js.Object {
    /**
      * A unique identifier for the segment.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * If specified contains a specific version of the segment included.
      */
    var Version: js.UndefOr[__integer] = js.undefined
  }
  
  trait SegmentResponse extends js.Object {
    /**
      * The ID of the application that the segment applies to.
      */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
      * The arn for the segment.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The date and time when the segment was created.
      */
    var CreationDate: js.UndefOr[__string] = js.undefined
    /**
      * The segment dimensions attributes.
      */
    var Dimensions: js.UndefOr[SegmentDimensions] = js.undefined
    /**
      * The unique segment ID.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The import job settings.
      */
    var ImportDefinition: js.UndefOr[SegmentImportResource] = js.undefined
    /**
      * The date and time when the segment was last modified.
      */
    var LastModifiedDate: js.UndefOr[__string] = js.undefined
    /**
      * The name of the segment.
      */
    var Name: js.UndefOr[__string] = js.undefined
    /**
      * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source segments.
      */
    var SegmentGroups: js.UndefOr[SegmentGroupList] = js.undefined
    /**
      * The segment type:
    DIMENSIONAL - A dynamic segment built from selection criteria based on endpoint data reported by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint console or by making a POST request to the segments resource.
    IMPORT - A static segment built from an imported set of endpoint definitions. You create this type of segment by importing a segment in the Amazon Pinpoint console or by making a POST request to the jobs/import resource.
      */
    var SegmentType: js.UndefOr[SegmentType] = js.undefined
    /**
      * The segment version number.
      */
    var Version: js.UndefOr[__integer] = js.undefined
    /**
      * The Tags for the segment.
      */
    var tags: js.UndefOr[MapOf__string] = js.undefined
  }
  
  trait SegmentsResponse extends js.Object {
    /**
      * The list of segments.
      */
    var Item: js.UndefOr[ListOfSegmentResponse] = js.undefined
    /**
      * An identifier used to retrieve the next page of results. The token is null if no additional pages exist.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait SendMessagesRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    var MessageRequest: awsDashSdkLib.clientsPinpointMod.PinpointNs.MessageRequest
  }
  
  trait SendMessagesResponse extends js.Object {
    var MessageResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.MessageResponse
  }
  
  trait SendUsersMessageRequest extends js.Object {
    /**
      * A map of custom attribute-value pairs. Amazon Pinpoint adds these attributes to the data.pinpoint object in the body of the push notification payload. Amazon Pinpoint also provides these attributes in the events that it generates for users-messages deliveries.
      */
    var Context: js.UndefOr[MapOf__string] = js.undefined
    /**
      * Message definitions for the default message and any messages that are tailored for specific channels.
      */
    var MessageConfiguration: js.UndefOr[DirectMessageConfiguration] = js.undefined
    /**
      * A unique ID that you can use to trace a message. This ID is visible to recipients.
      */
    var TraceId: js.UndefOr[__string] = js.undefined
    /**
      * A map that associates user IDs with EndpointSendConfiguration objects. Within an EndpointSendConfiguration object, you can tailor the message for a user by specifying message overrides or substitutions.
      */
    var Users: js.UndefOr[MapOfEndpointSendConfiguration] = js.undefined
  }
  
  trait SendUsersMessageResponse extends js.Object {
    /**
      * The unique ID of the Amazon Pinpoint project used to send the message.
      */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
      * The unique ID assigned to the users-messages request.
      */
    var RequestId: js.UndefOr[__string] = js.undefined
    /**
      * An object that shows the endpoints that were messaged for each user. The object provides a list of user IDs. For each user ID, it provides the endpoint IDs that were messaged. For each endpoint ID, it provides an EndpointMessageResult object.
      */
    var Result: js.UndefOr[MapOfMapOfEndpointMessageResult] = js.undefined
  }
  
  trait SendUsersMessagesRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    var SendUsersMessageRequest: awsDashSdkLib.clientsPinpointMod.PinpointNs.SendUsersMessageRequest
  }
  
  trait SendUsersMessagesResponse extends js.Object {
    var SendUsersMessageResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.SendUsersMessageResponse
  }
  
  trait Session extends js.Object {
    /**
      * The duration of the session, in milliseconds.
      */
    var Duration: js.UndefOr[__integer] = js.undefined
    /**
      * A unique identifier for the session.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The date and time when the session began.
      */
    var StartTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The date and time when the session ended.
      */
    var StopTimestamp: js.UndefOr[__string] = js.undefined
  }
  
  trait SetDimension extends js.Object {
    /**
      * The type of dimension:
    INCLUSIVE - Endpoints that match the criteria are included in the segment.
    EXCLUSIVE - Endpoints that match the criteria are excluded from the segment.
      */
    var DimensionType: js.UndefOr[DimensionType] = js.undefined
    /**
      * The criteria values for the segment dimension. Endpoints with matching attribute values are included or excluded from the segment, depending on the setting for Type.
      */
    var Values: js.UndefOr[ListOf__string] = js.undefined
  }
  
  trait SimpleEmail extends js.Object {
    /**
      * The content of the message, in HTML format. Use this for email clients that can process HTML. You can include clickable links, formatted text, and much more in an HTML message.
      */
    var HtmlPart: js.UndefOr[SimpleEmailPart] = js.undefined
    /**
      * The subject of the message: A short summary of the content, which will appear in the recipient's inbox.
      */
    var Subject: js.UndefOr[SimpleEmailPart] = js.undefined
    /**
      * The content of the message, in text format. Use this for text-based email clients, or clients on high-latency networks (such as mobile devices).
      */
    var TextPart: js.UndefOr[SimpleEmailPart] = js.undefined
  }
  
  trait SimpleEmailPart extends js.Object {
    /**
      * The character set of the content.
      */
    var Charset: js.UndefOr[__string] = js.undefined
    /**
      * The textual data of the content.
      */
    var Data: js.UndefOr[__string] = js.undefined
  }
  
  trait TagResourceRequest extends js.Object {
    var ResourceArn: __string
    var TagsModel: awsDashSdkLib.clientsPinpointMod.PinpointNs.TagsModel
  }
  
  trait TagsModel extends js.Object {
    var tags: MapOf__string
  }
  
  trait TreatmentResource extends js.Object {
    /**
      * The unique treatment ID.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The message configuration settings.
      */
    var MessageConfiguration: js.UndefOr[MessageConfiguration] = js.undefined
    /**
      * The campaign schedule.
      */
    var Schedule: js.UndefOr[Schedule] = js.undefined
    /**
      * The allocated percentage of users for this treatment.
      */
    var SizePercent: js.UndefOr[__integer] = js.undefined
    /**
      * The treatment status.
      */
    var State: js.UndefOr[CampaignState] = js.undefined
    /**
      * A custom description for the treatment.
      */
    var TreatmentDescription: js.UndefOr[__string] = js.undefined
    /**
      * The custom name of a variation of the campaign used for A/B testing.
      */
    var TreatmentName: js.UndefOr[__string] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Creates or updates an app.
      */
    def createApp(): awsDashSdkLib.libRequestMod.Request[CreateAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createApp(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAppResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or updates an app.
      */
    def createApp(params: CreateAppRequest): awsDashSdkLib.libRequestMod.Request[CreateAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createApp(
      params: CreateAppRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAppResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or updates a campaign.
      */
    def createCampaign(): awsDashSdkLib.libRequestMod.Request[CreateCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCampaign(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCampaignResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or updates a campaign.
      */
    def createCampaign(params: CreateCampaignRequest): awsDashSdkLib.libRequestMod.Request[CreateCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCampaign(
      params: CreateCampaignRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCampaignResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an export job.
      */
    def createExportJob(): awsDashSdkLib.libRequestMod.Request[CreateExportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createExportJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateExportJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateExportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an export job.
      */
    def createExportJob(params: CreateExportJobRequest): awsDashSdkLib.libRequestMod.Request[CreateExportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createExportJob(
      params: CreateExportJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateExportJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateExportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or updates an import job.
      */
    def createImportJob(): awsDashSdkLib.libRequestMod.Request[CreateImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createImportJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateImportJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or updates an import job.
      */
    def createImportJob(params: CreateImportJobRequest): awsDashSdkLib.libRequestMod.Request[CreateImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createImportJob(
      params: CreateImportJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateImportJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used to create or update a segment.
      */
    def createSegment(): awsDashSdkLib.libRequestMod.Request[CreateSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSegment(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSegmentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used to create or update a segment.
      */
    def createSegment(params: CreateSegmentRequest): awsDashSdkLib.libRequestMod.Request[CreateSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSegment(
      params: CreateSegmentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSegmentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete an ADM channel.
      */
    def deleteAdmChannel(): awsDashSdkLib.libRequestMod.Request[DeleteAdmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteAdmChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteAdmChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteAdmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete an ADM channel.
      */
    def deleteAdmChannel(params: DeleteAdmChannelRequest): awsDashSdkLib.libRequestMod.Request[DeleteAdmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteAdmChannel(
      params: DeleteAdmChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteAdmChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteAdmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the APNs channel for an app.
      */
    def deleteApnsChannel(): awsDashSdkLib.libRequestMod.Request[DeleteApnsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteApnsChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteApnsChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteApnsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the APNs channel for an app.
      */
    def deleteApnsChannel(params: DeleteApnsChannelRequest): awsDashSdkLib.libRequestMod.Request[DeleteApnsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteApnsChannel(
      params: DeleteApnsChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteApnsChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteApnsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete an APNS sandbox channel.
      */
    def deleteApnsSandboxChannel(): awsDashSdkLib.libRequestMod.Request[DeleteApnsSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteApnsSandboxChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteApnsSandboxChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteApnsSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete an APNS sandbox channel.
      */
    def deleteApnsSandboxChannel(params: DeleteApnsSandboxChannelRequest): awsDashSdkLib.libRequestMod.Request[DeleteApnsSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteApnsSandboxChannel(
      params: DeleteApnsSandboxChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteApnsSandboxChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteApnsSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete an APNS VoIP channel
      */
    def deleteApnsVoipChannel(): awsDashSdkLib.libRequestMod.Request[DeleteApnsVoipChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteApnsVoipChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteApnsVoipChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteApnsVoipChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete an APNS VoIP channel
      */
    def deleteApnsVoipChannel(params: DeleteApnsVoipChannelRequest): awsDashSdkLib.libRequestMod.Request[DeleteApnsVoipChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteApnsVoipChannel(
      params: DeleteApnsVoipChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteApnsVoipChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteApnsVoipChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete an APNS VoIP sandbox channel
      */
    def deleteApnsVoipSandboxChannel(): awsDashSdkLib.libRequestMod.Request[DeleteApnsVoipSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteApnsVoipSandboxChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteApnsVoipSandboxChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteApnsVoipSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete an APNS VoIP sandbox channel
      */
    def deleteApnsVoipSandboxChannel(params: DeleteApnsVoipSandboxChannelRequest): awsDashSdkLib.libRequestMod.Request[DeleteApnsVoipSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteApnsVoipSandboxChannel(
      params: DeleteApnsVoipSandboxChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteApnsVoipSandboxChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteApnsVoipSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an app.
      */
    def deleteApp(): awsDashSdkLib.libRequestMod.Request[DeleteAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteApp(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteAppResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an app.
      */
    def deleteApp(params: DeleteAppRequest): awsDashSdkLib.libRequestMod.Request[DeleteAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteApp(
      params: DeleteAppRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteAppResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete a BAIDU GCM channel
      */
    def deleteBaiduChannel(): awsDashSdkLib.libRequestMod.Request[DeleteBaiduChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBaiduChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteBaiduChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteBaiduChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete a BAIDU GCM channel
      */
    def deleteBaiduChannel(params: DeleteBaiduChannelRequest): awsDashSdkLib.libRequestMod.Request[DeleteBaiduChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBaiduChannel(
      params: DeleteBaiduChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteBaiduChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteBaiduChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a campaign.
      */
    def deleteCampaign(): awsDashSdkLib.libRequestMod.Request[DeleteCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCampaign(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteCampaignResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a campaign.
      */
    def deleteCampaign(params: DeleteCampaignRequest): awsDashSdkLib.libRequestMod.Request[DeleteCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCampaign(
      params: DeleteCampaignRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteCampaignResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete an email channel.
      */
    def deleteEmailChannel(): awsDashSdkLib.libRequestMod.Request[DeleteEmailChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteEmailChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteEmailChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteEmailChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete an email channel.
      */
    def deleteEmailChannel(params: DeleteEmailChannelRequest): awsDashSdkLib.libRequestMod.Request[DeleteEmailChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteEmailChannel(
      params: DeleteEmailChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteEmailChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteEmailChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an endpoint.
      */
    def deleteEndpoint(): awsDashSdkLib.libRequestMod.Request[DeleteEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteEndpoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an endpoint.
      */
    def deleteEndpoint(params: DeleteEndpointRequest): awsDashSdkLib.libRequestMod.Request[DeleteEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteEndpoint(
      params: DeleteEndpointRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the event stream for an app.
      */
    def deleteEventStream(): awsDashSdkLib.libRequestMod.Request[DeleteEventStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteEventStream(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteEventStreamResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteEventStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the event stream for an app.
      */
    def deleteEventStream(params: DeleteEventStreamRequest): awsDashSdkLib.libRequestMod.Request[DeleteEventStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteEventStream(
      params: DeleteEventStreamRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteEventStreamResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteEventStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the GCM channel for an app.
      */
    def deleteGcmChannel(): awsDashSdkLib.libRequestMod.Request[DeleteGcmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteGcmChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteGcmChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteGcmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the GCM channel for an app.
      */
    def deleteGcmChannel(params: DeleteGcmChannelRequest): awsDashSdkLib.libRequestMod.Request[DeleteGcmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteGcmChannel(
      params: DeleteGcmChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteGcmChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteGcmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a segment.
      */
    def deleteSegment(): awsDashSdkLib.libRequestMod.Request[DeleteSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSegment(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSegmentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a segment.
      */
    def deleteSegment(params: DeleteSegmentRequest): awsDashSdkLib.libRequestMod.Request[DeleteSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSegment(
      params: DeleteSegmentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSegmentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete an SMS channel.
      */
    def deleteSmsChannel(): awsDashSdkLib.libRequestMod.Request[DeleteSmsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSmsChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSmsChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSmsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete an SMS channel.
      */
    def deleteSmsChannel(params: DeleteSmsChannelRequest): awsDashSdkLib.libRequestMod.Request[DeleteSmsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSmsChannel(
      params: DeleteSmsChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSmsChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSmsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes endpoints that are associated with a User ID.
      */
    def deleteUserEndpoints(): awsDashSdkLib.libRequestMod.Request[DeleteUserEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteUserEndpoints(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteUserEndpointsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteUserEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes endpoints that are associated with a User ID.
      */
    def deleteUserEndpoints(params: DeleteUserEndpointsRequest): awsDashSdkLib.libRequestMod.Request[DeleteUserEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteUserEndpoints(
      params: DeleteUserEndpointsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteUserEndpointsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteUserEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete an Voice channel
      */
    def deleteVoiceChannel(): awsDashSdkLib.libRequestMod.Request[DeleteVoiceChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVoiceChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteVoiceChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteVoiceChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete an Voice channel
      */
    def deleteVoiceChannel(params: DeleteVoiceChannelRequest): awsDashSdkLib.libRequestMod.Request[DeleteVoiceChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVoiceChannel(
      params: DeleteVoiceChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteVoiceChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteVoiceChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get an ADM channel.
      */
    def getAdmChannel(): awsDashSdkLib.libRequestMod.Request[GetAdmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAdmChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAdmChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAdmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get an ADM channel.
      */
    def getAdmChannel(params: GetAdmChannelRequest): awsDashSdkLib.libRequestMod.Request[GetAdmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAdmChannel(
      params: GetAdmChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAdmChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAdmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the APNs channel for an app.
      */
    def getApnsChannel(): awsDashSdkLib.libRequestMod.Request[GetApnsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getApnsChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetApnsChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetApnsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the APNs channel for an app.
      */
    def getApnsChannel(params: GetApnsChannelRequest): awsDashSdkLib.libRequestMod.Request[GetApnsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getApnsChannel(
      params: GetApnsChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetApnsChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetApnsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get an APNS sandbox channel.
      */
    def getApnsSandboxChannel(): awsDashSdkLib.libRequestMod.Request[GetApnsSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getApnsSandboxChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetApnsSandboxChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetApnsSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get an APNS sandbox channel.
      */
    def getApnsSandboxChannel(params: GetApnsSandboxChannelRequest): awsDashSdkLib.libRequestMod.Request[GetApnsSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getApnsSandboxChannel(
      params: GetApnsSandboxChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetApnsSandboxChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetApnsSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get an APNS VoIP channel
      */
    def getApnsVoipChannel(): awsDashSdkLib.libRequestMod.Request[GetApnsVoipChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getApnsVoipChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetApnsVoipChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetApnsVoipChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get an APNS VoIP channel
      */
    def getApnsVoipChannel(params: GetApnsVoipChannelRequest): awsDashSdkLib.libRequestMod.Request[GetApnsVoipChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getApnsVoipChannel(
      params: GetApnsVoipChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetApnsVoipChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetApnsVoipChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get an APNS VoIPSandbox channel
      */
    def getApnsVoipSandboxChannel(): awsDashSdkLib.libRequestMod.Request[GetApnsVoipSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getApnsVoipSandboxChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetApnsVoipSandboxChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetApnsVoipSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get an APNS VoIPSandbox channel
      */
    def getApnsVoipSandboxChannel(params: GetApnsVoipSandboxChannelRequest): awsDashSdkLib.libRequestMod.Request[GetApnsVoipSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getApnsVoipSandboxChannel(
      params: GetApnsVoipSandboxChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetApnsVoipSandboxChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetApnsVoipSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about an app.
      */
    def getApp(): awsDashSdkLib.libRequestMod.Request[GetAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getApp(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetAppResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about an app.
      */
    def getApp(params: GetAppRequest): awsDashSdkLib.libRequestMod.Request[GetAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getApp(
      params: GetAppRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetAppResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used to request the settings for an app.
      */
    def getApplicationSettings(): awsDashSdkLib.libRequestMod.Request[GetApplicationSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getApplicationSettings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetApplicationSettingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetApplicationSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used to request the settings for an app.
      */
    def getApplicationSettings(params: GetApplicationSettingsRequest): awsDashSdkLib.libRequestMod.Request[GetApplicationSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getApplicationSettings(
      params: GetApplicationSettingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetApplicationSettingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetApplicationSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about your apps.
      */
    def getApps(): awsDashSdkLib.libRequestMod.Request[GetAppsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getApps(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetAppsResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetAppsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about your apps.
      */
    def getApps(params: GetAppsRequest): awsDashSdkLib.libRequestMod.Request[GetAppsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getApps(
      params: GetAppsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetAppsResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetAppsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get a BAIDU GCM channel
      */
    def getBaiduChannel(): awsDashSdkLib.libRequestMod.Request[GetBaiduChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBaiduChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBaiduChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBaiduChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get a BAIDU GCM channel
      */
    def getBaiduChannel(params: GetBaiduChannelRequest): awsDashSdkLib.libRequestMod.Request[GetBaiduChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBaiduChannel(
      params: GetBaiduChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBaiduChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBaiduChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a campaign.
      */
    def getCampaign(): awsDashSdkLib.libRequestMod.Request[GetCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCampaign(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCampaignResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a campaign.
      */
    def getCampaign(params: GetCampaignRequest): awsDashSdkLib.libRequestMod.Request[GetCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCampaign(
      params: GetCampaignRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCampaignResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the activity performed by a campaign.
      */
    def getCampaignActivities(): awsDashSdkLib.libRequestMod.Request[GetCampaignActivitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCampaignActivities(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCampaignActivitiesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCampaignActivitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the activity performed by a campaign.
      */
    def getCampaignActivities(params: GetCampaignActivitiesRequest): awsDashSdkLib.libRequestMod.Request[GetCampaignActivitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCampaignActivities(
      params: GetCampaignActivitiesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCampaignActivitiesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCampaignActivitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a specific version of a campaign.
      */
    def getCampaignVersion(): awsDashSdkLib.libRequestMod.Request[GetCampaignVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCampaignVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCampaignVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCampaignVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a specific version of a campaign.
      */
    def getCampaignVersion(params: GetCampaignVersionRequest): awsDashSdkLib.libRequestMod.Request[GetCampaignVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCampaignVersion(
      params: GetCampaignVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCampaignVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCampaignVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about your campaign versions.
      */
    def getCampaignVersions(): awsDashSdkLib.libRequestMod.Request[GetCampaignVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCampaignVersions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCampaignVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCampaignVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about your campaign versions.
      */
    def getCampaignVersions(params: GetCampaignVersionsRequest): awsDashSdkLib.libRequestMod.Request[GetCampaignVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCampaignVersions(
      params: GetCampaignVersionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCampaignVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCampaignVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about your campaigns.
      */
    def getCampaigns(): awsDashSdkLib.libRequestMod.Request[GetCampaignsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCampaigns(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCampaignsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCampaignsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about your campaigns.
      */
    def getCampaigns(params: GetCampaignsRequest): awsDashSdkLib.libRequestMod.Request[GetCampaignsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCampaigns(
      params: GetCampaignsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCampaignsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCampaignsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get all channels.
      */
    def getChannels(): awsDashSdkLib.libRequestMod.Request[GetChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getChannels(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetChannelsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get all channels.
      */
    def getChannels(params: GetChannelsRequest): awsDashSdkLib.libRequestMod.Request[GetChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getChannels(
      params: GetChannelsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetChannelsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get an email channel.
      */
    def getEmailChannel(): awsDashSdkLib.libRequestMod.Request[GetEmailChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getEmailChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetEmailChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetEmailChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get an email channel.
      */
    def getEmailChannel(params: GetEmailChannelRequest): awsDashSdkLib.libRequestMod.Request[GetEmailChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getEmailChannel(
      params: GetEmailChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetEmailChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetEmailChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about an endpoint.
      */
    def getEndpoint(): awsDashSdkLib.libRequestMod.Request[GetEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getEndpoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about an endpoint.
      */
    def getEndpoint(params: GetEndpointRequest): awsDashSdkLib.libRequestMod.Request[GetEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getEndpoint(
      params: GetEndpointRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the event stream for an app.
      */
    def getEventStream(): awsDashSdkLib.libRequestMod.Request[GetEventStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getEventStream(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetEventStreamResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetEventStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the event stream for an app.
      */
    def getEventStream(params: GetEventStreamRequest): awsDashSdkLib.libRequestMod.Request[GetEventStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getEventStream(
      params: GetEventStreamRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetEventStreamResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetEventStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about an export job.
      */
    def getExportJob(): awsDashSdkLib.libRequestMod.Request[GetExportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getExportJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetExportJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetExportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about an export job.
      */
    def getExportJob(params: GetExportJobRequest): awsDashSdkLib.libRequestMod.Request[GetExportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getExportJob(
      params: GetExportJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetExportJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetExportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about your export jobs.
      */
    def getExportJobs(): awsDashSdkLib.libRequestMod.Request[GetExportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getExportJobs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetExportJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetExportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about your export jobs.
      */
    def getExportJobs(params: GetExportJobsRequest): awsDashSdkLib.libRequestMod.Request[GetExportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getExportJobs(
      params: GetExportJobsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetExportJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetExportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the GCM channel for an app.
      */
    def getGcmChannel(): awsDashSdkLib.libRequestMod.Request[GetGcmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getGcmChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetGcmChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetGcmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the GCM channel for an app.
      */
    def getGcmChannel(params: GetGcmChannelRequest): awsDashSdkLib.libRequestMod.Request[GetGcmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getGcmChannel(
      params: GetGcmChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetGcmChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetGcmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about an import job.
      */
    def getImportJob(): awsDashSdkLib.libRequestMod.Request[GetImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getImportJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetImportJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about an import job.
      */
    def getImportJob(params: GetImportJobRequest): awsDashSdkLib.libRequestMod.Request[GetImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getImportJob(
      params: GetImportJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetImportJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about your import jobs.
      */
    def getImportJobs(): awsDashSdkLib.libRequestMod.Request[GetImportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getImportJobs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetImportJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetImportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about your import jobs.
      */
    def getImportJobs(params: GetImportJobsRequest): awsDashSdkLib.libRequestMod.Request[GetImportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getImportJobs(
      params: GetImportJobsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetImportJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetImportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a segment.
      */
    def getSegment(): awsDashSdkLib.libRequestMod.Request[GetSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSegment(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSegmentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a segment.
      */
    def getSegment(params: GetSegmentRequest): awsDashSdkLib.libRequestMod.Request[GetSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSegment(
      params: GetSegmentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSegmentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of export jobs for a specific segment.
      */
    def getSegmentExportJobs(): awsDashSdkLib.libRequestMod.Request[GetSegmentExportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSegmentExportJobs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSegmentExportJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSegmentExportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of export jobs for a specific segment.
      */
    def getSegmentExportJobs(params: GetSegmentExportJobsRequest): awsDashSdkLib.libRequestMod.Request[GetSegmentExportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSegmentExportJobs(
      params: GetSegmentExportJobsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSegmentExportJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSegmentExportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of import jobs for a specific segment.
      */
    def getSegmentImportJobs(): awsDashSdkLib.libRequestMod.Request[GetSegmentImportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSegmentImportJobs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSegmentImportJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSegmentImportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of import jobs for a specific segment.
      */
    def getSegmentImportJobs(params: GetSegmentImportJobsRequest): awsDashSdkLib.libRequestMod.Request[GetSegmentImportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSegmentImportJobs(
      params: GetSegmentImportJobsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSegmentImportJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSegmentImportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a segment version.
      */
    def getSegmentVersion(): awsDashSdkLib.libRequestMod.Request[GetSegmentVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSegmentVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSegmentVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSegmentVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a segment version.
      */
    def getSegmentVersion(params: GetSegmentVersionRequest): awsDashSdkLib.libRequestMod.Request[GetSegmentVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSegmentVersion(
      params: GetSegmentVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSegmentVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSegmentVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about your segment versions.
      */
    def getSegmentVersions(): awsDashSdkLib.libRequestMod.Request[GetSegmentVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSegmentVersions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSegmentVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSegmentVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about your segment versions.
      */
    def getSegmentVersions(params: GetSegmentVersionsRequest): awsDashSdkLib.libRequestMod.Request[GetSegmentVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSegmentVersions(
      params: GetSegmentVersionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSegmentVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSegmentVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used to get information about your segments.
      */
    def getSegments(): awsDashSdkLib.libRequestMod.Request[GetSegmentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSegments(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSegmentsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSegmentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used to get information about your segments.
      */
    def getSegments(params: GetSegmentsRequest): awsDashSdkLib.libRequestMod.Request[GetSegmentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSegments(
      params: GetSegmentsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSegmentsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSegmentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get an SMS channel.
      */
    def getSmsChannel(): awsDashSdkLib.libRequestMod.Request[GetSmsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSmsChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSmsChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSmsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get an SMS channel.
      */
    def getSmsChannel(params: GetSmsChannelRequest): awsDashSdkLib.libRequestMod.Request[GetSmsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSmsChannel(
      params: GetSmsChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSmsChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSmsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the endpoints that are associated with a User ID.
      */
    def getUserEndpoints(): awsDashSdkLib.libRequestMod.Request[GetUserEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getUserEndpoints(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetUserEndpointsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetUserEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the endpoints that are associated with a User ID.
      */
    def getUserEndpoints(params: GetUserEndpointsRequest): awsDashSdkLib.libRequestMod.Request[GetUserEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getUserEndpoints(
      params: GetUserEndpointsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetUserEndpointsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetUserEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get a Voice Channel
      */
    def getVoiceChannel(): awsDashSdkLib.libRequestMod.Request[GetVoiceChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getVoiceChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetVoiceChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetVoiceChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get a Voice Channel
      */
    def getVoiceChannel(params: GetVoiceChannelRequest): awsDashSdkLib.libRequestMod.Request[GetVoiceChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getVoiceChannel(
      params: GetVoiceChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetVoiceChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetVoiceChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * 
      */
    def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * 
      */
    def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      params: ListTagsForResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the specified phone number.
      */
    def phoneNumberValidate(): awsDashSdkLib.libRequestMod.Request[PhoneNumberValidateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def phoneNumberValidate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PhoneNumberValidateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PhoneNumberValidateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the specified phone number.
      */
    def phoneNumberValidate(params: PhoneNumberValidateRequest): awsDashSdkLib.libRequestMod.Request[PhoneNumberValidateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def phoneNumberValidate(
      params: PhoneNumberValidateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PhoneNumberValidateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PhoneNumberValidateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Use to create or update the event stream for an app.
      */
    def putEventStream(): awsDashSdkLib.libRequestMod.Request[PutEventStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putEventStream(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutEventStreamResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutEventStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Use to create or update the event stream for an app.
      */
    def putEventStream(params: PutEventStreamRequest): awsDashSdkLib.libRequestMod.Request[PutEventStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putEventStream(
      params: PutEventStreamRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutEventStreamResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutEventStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Use to record events for endpoints. This method creates events and creates or updates the endpoints that those events are associated with.
      */
    def putEvents(): awsDashSdkLib.libRequestMod.Request[PutEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putEvents(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutEventsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Use to record events for endpoints. This method creates events and creates or updates the endpoints that those events are associated with.
      */
    def putEvents(params: PutEventsRequest): awsDashSdkLib.libRequestMod.Request[PutEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putEvents(
      params: PutEventsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutEventsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used to remove the attributes for an app
      */
    def removeAttributes(): awsDashSdkLib.libRequestMod.Request[RemoveAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used to remove the attributes for an app
      */
    def removeAttributes(params: RemoveAttributesRequest): awsDashSdkLib.libRequestMod.Request[RemoveAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeAttributes(
      params: RemoveAttributesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used to send a direct message.
      */
    def sendMessages(): awsDashSdkLib.libRequestMod.Request[SendMessagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendMessages(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendMessagesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendMessagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used to send a direct message.
      */
    def sendMessages(params: SendMessagesRequest): awsDashSdkLib.libRequestMod.Request[SendMessagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendMessages(
      params: SendMessagesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendMessagesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendMessagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used to send a message to a list of users.
      */
    def sendUsersMessages(): awsDashSdkLib.libRequestMod.Request[SendUsersMessagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendUsersMessages(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendUsersMessagesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendUsersMessagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used to send a message to a list of users.
      */
    def sendUsersMessages(params: SendUsersMessagesRequest): awsDashSdkLib.libRequestMod.Request[SendUsersMessagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendUsersMessages(
      params: SendUsersMessagesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendUsersMessagesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendUsersMessagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * 
      */
    def tagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * 
      */
    def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      params: TagResourceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * 
      */
    def untagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * 
      */
    def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      params: UntagResourceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update an ADM channel.
      */
    def updateAdmChannel(): awsDashSdkLib.libRequestMod.Request[UpdateAdmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAdmChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateAdmChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateAdmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update an ADM channel.
      */
    def updateAdmChannel(params: UpdateAdmChannelRequest): awsDashSdkLib.libRequestMod.Request[UpdateAdmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAdmChannel(
      params: UpdateAdmChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateAdmChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateAdmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Use to update the APNs channel for an app.
      */
    def updateApnsChannel(): awsDashSdkLib.libRequestMod.Request[UpdateApnsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateApnsChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateApnsChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateApnsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Use to update the APNs channel for an app.
      */
    def updateApnsChannel(params: UpdateApnsChannelRequest): awsDashSdkLib.libRequestMod.Request[UpdateApnsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateApnsChannel(
      params: UpdateApnsChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateApnsChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateApnsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update an APNS sandbox channel.
      */
    def updateApnsSandboxChannel(): awsDashSdkLib.libRequestMod.Request[UpdateApnsSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateApnsSandboxChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateApnsSandboxChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateApnsSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update an APNS sandbox channel.
      */
    def updateApnsSandboxChannel(params: UpdateApnsSandboxChannelRequest): awsDashSdkLib.libRequestMod.Request[UpdateApnsSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateApnsSandboxChannel(
      params: UpdateApnsSandboxChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateApnsSandboxChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateApnsSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update an APNS VoIP channel
      */
    def updateApnsVoipChannel(): awsDashSdkLib.libRequestMod.Request[UpdateApnsVoipChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateApnsVoipChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateApnsVoipChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateApnsVoipChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update an APNS VoIP channel
      */
    def updateApnsVoipChannel(params: UpdateApnsVoipChannelRequest): awsDashSdkLib.libRequestMod.Request[UpdateApnsVoipChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateApnsVoipChannel(
      params: UpdateApnsVoipChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateApnsVoipChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateApnsVoipChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update an APNS VoIP sandbox channel
      */
    def updateApnsVoipSandboxChannel(): awsDashSdkLib.libRequestMod.Request[UpdateApnsVoipSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateApnsVoipSandboxChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateApnsVoipSandboxChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateApnsVoipSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update an APNS VoIP sandbox channel
      */
    def updateApnsVoipSandboxChannel(params: UpdateApnsVoipSandboxChannelRequest): awsDashSdkLib.libRequestMod.Request[UpdateApnsVoipSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateApnsVoipSandboxChannel(
      params: UpdateApnsVoipSandboxChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateApnsVoipSandboxChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateApnsVoipSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used to update the settings for an app.
      */
    def updateApplicationSettings(): awsDashSdkLib.libRequestMod.Request[UpdateApplicationSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateApplicationSettings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateApplicationSettingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateApplicationSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used to update the settings for an app.
      */
    def updateApplicationSettings(params: UpdateApplicationSettingsRequest): awsDashSdkLib.libRequestMod.Request[UpdateApplicationSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateApplicationSettings(
      params: UpdateApplicationSettingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateApplicationSettingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateApplicationSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update a BAIDU GCM channel
      */
    def updateBaiduChannel(): awsDashSdkLib.libRequestMod.Request[UpdateBaiduChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateBaiduChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateBaiduChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateBaiduChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update a BAIDU GCM channel
      */
    def updateBaiduChannel(params: UpdateBaiduChannelRequest): awsDashSdkLib.libRequestMod.Request[UpdateBaiduChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateBaiduChannel(
      params: UpdateBaiduChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateBaiduChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateBaiduChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Use to update a campaign.
      */
    def updateCampaign(): awsDashSdkLib.libRequestMod.Request[UpdateCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateCampaign(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateCampaignResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Use to update a campaign.
      */
    def updateCampaign(params: UpdateCampaignRequest): awsDashSdkLib.libRequestMod.Request[UpdateCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateCampaign(
      params: UpdateCampaignRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateCampaignResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update an email channel.
      */
    def updateEmailChannel(): awsDashSdkLib.libRequestMod.Request[UpdateEmailChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateEmailChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateEmailChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateEmailChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update an email channel.
      */
    def updateEmailChannel(params: UpdateEmailChannelRequest): awsDashSdkLib.libRequestMod.Request[UpdateEmailChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateEmailChannel(
      params: UpdateEmailChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateEmailChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateEmailChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or updates an endpoint.
      */
    def updateEndpoint(): awsDashSdkLib.libRequestMod.Request[UpdateEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateEndpoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or updates an endpoint.
      */
    def updateEndpoint(params: UpdateEndpointRequest): awsDashSdkLib.libRequestMod.Request[UpdateEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateEndpoint(
      params: UpdateEndpointRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Use to update a batch of endpoints.
      */
    def updateEndpointsBatch(): awsDashSdkLib.libRequestMod.Request[UpdateEndpointsBatchResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateEndpointsBatch(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateEndpointsBatchResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateEndpointsBatchResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Use to update a batch of endpoints.
      */
    def updateEndpointsBatch(params: UpdateEndpointsBatchRequest): awsDashSdkLib.libRequestMod.Request[UpdateEndpointsBatchResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateEndpointsBatch(
      params: UpdateEndpointsBatchRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateEndpointsBatchResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateEndpointsBatchResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Use to update the GCM channel for an app.
      */
    def updateGcmChannel(): awsDashSdkLib.libRequestMod.Request[UpdateGcmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateGcmChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateGcmChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateGcmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Use to update the GCM channel for an app.
      */
    def updateGcmChannel(params: UpdateGcmChannelRequest): awsDashSdkLib.libRequestMod.Request[UpdateGcmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateGcmChannel(
      params: UpdateGcmChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateGcmChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateGcmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used to update a segment.
      */
    def updateSegment(): awsDashSdkLib.libRequestMod.Request[UpdateSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateSegment(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSegmentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used to update a segment.
      */
    def updateSegment(params: UpdateSegmentRequest): awsDashSdkLib.libRequestMod.Request[UpdateSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateSegment(
      params: UpdateSegmentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSegmentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update an SMS channel.
      */
    def updateSmsChannel(): awsDashSdkLib.libRequestMod.Request[UpdateSmsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateSmsChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSmsChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSmsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update an SMS channel.
      */
    def updateSmsChannel(params: UpdateSmsChannelRequest): awsDashSdkLib.libRequestMod.Request[UpdateSmsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateSmsChannel(
      params: UpdateSmsChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSmsChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSmsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update an Voice channel
      */
    def updateVoiceChannel(): awsDashSdkLib.libRequestMod.Request[UpdateVoiceChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateVoiceChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateVoiceChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateVoiceChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update an Voice channel
      */
    def updateVoiceChannel(params: UpdateVoiceChannelRequest): awsDashSdkLib.libRequestMod.Request[UpdateVoiceChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateVoiceChannel(
      params: UpdateVoiceChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateVoiceChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateVoiceChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: __string
    /**
      * The key(s) of tag to be deleted
      */
    var TagKeys: ListOf__string
  }
  
  trait UpdateAdmChannelRequest extends js.Object {
    var ADMChannelRequest: awsDashSdkLib.clientsPinpointMod.PinpointNs.ADMChannelRequest
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait UpdateAdmChannelResponse extends js.Object {
    var ADMChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.ADMChannelResponse
  }
  
  trait UpdateApnsChannelRequest extends js.Object {
    var APNSChannelRequest: awsDashSdkLib.clientsPinpointMod.PinpointNs.APNSChannelRequest
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait UpdateApnsChannelResponse extends js.Object {
    var APNSChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.APNSChannelResponse
  }
  
  trait UpdateApnsSandboxChannelRequest extends js.Object {
    var APNSSandboxChannelRequest: awsDashSdkLib.clientsPinpointMod.PinpointNs.APNSSandboxChannelRequest
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait UpdateApnsSandboxChannelResponse extends js.Object {
    var APNSSandboxChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.APNSSandboxChannelResponse
  }
  
  trait UpdateApnsVoipChannelRequest extends js.Object {
    var APNSVoipChannelRequest: awsDashSdkLib.clientsPinpointMod.PinpointNs.APNSVoipChannelRequest
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait UpdateApnsVoipChannelResponse extends js.Object {
    var APNSVoipChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.APNSVoipChannelResponse
  }
  
  trait UpdateApnsVoipSandboxChannelRequest extends js.Object {
    var APNSVoipSandboxChannelRequest: awsDashSdkLib.clientsPinpointMod.PinpointNs.APNSVoipSandboxChannelRequest
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
  }
  
  trait UpdateApnsVoipSandboxChannelResponse extends js.Object {
    var APNSVoipSandboxChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.APNSVoipSandboxChannelResponse
  }
  
  trait UpdateApplicationSettingsRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    var WriteApplicationSettingsRequest: awsDashSdkLib.clientsPinpointMod.PinpointNs.WriteApplicationSettingsRequest
  }
  
  trait UpdateApplicationSettingsResponse extends js.Object {
    var ApplicationSettingsResource: awsDashSdkLib.clientsPinpointMod.PinpointNs.ApplicationSettingsResource
  }
  
  trait UpdateAttributesRequest extends js.Object {
    /**
      * The GLOB wildcard for removing the attributes in the application
      */
    var Blacklist: js.UndefOr[ListOf__string] = js.undefined
  }
  
  trait UpdateBaiduChannelRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    var BaiduChannelRequest: awsDashSdkLib.clientsPinpointMod.PinpointNs.BaiduChannelRequest
  }
  
  trait UpdateBaiduChannelResponse extends js.Object {
    var BaiduChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.BaiduChannelResponse
  }
  
  trait UpdateCampaignRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    /**
      * The unique ID of the campaign.
      */
    var CampaignId: __string
    var WriteCampaignRequest: awsDashSdkLib.clientsPinpointMod.PinpointNs.WriteCampaignRequest
  }
  
  trait UpdateCampaignResponse extends js.Object {
    var CampaignResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.CampaignResponse
  }
  
  trait UpdateEmailChannelRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    var EmailChannelRequest: awsDashSdkLib.clientsPinpointMod.PinpointNs.EmailChannelRequest
  }
  
  trait UpdateEmailChannelResponse extends js.Object {
    var EmailChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.EmailChannelResponse
  }
  
  trait UpdateEndpointRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    /**
      * The unique ID of the endpoint.
      */
    var EndpointId: __string
    var EndpointRequest: awsDashSdkLib.clientsPinpointMod.PinpointNs.EndpointRequest
  }
  
  trait UpdateEndpointResponse extends js.Object {
    var MessageBody: awsDashSdkLib.clientsPinpointMod.PinpointNs.MessageBody
  }
  
  trait UpdateEndpointsBatchRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    var EndpointBatchRequest: awsDashSdkLib.clientsPinpointMod.PinpointNs.EndpointBatchRequest
  }
  
  trait UpdateEndpointsBatchResponse extends js.Object {
    var MessageBody: awsDashSdkLib.clientsPinpointMod.PinpointNs.MessageBody
  }
  
  trait UpdateGcmChannelRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    var GCMChannelRequest: awsDashSdkLib.clientsPinpointMod.PinpointNs.GCMChannelRequest
  }
  
  trait UpdateGcmChannelResponse extends js.Object {
    var GCMChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.GCMChannelResponse
  }
  
  trait UpdateSegmentRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    /**
      * The unique ID of the segment.
      */
    var SegmentId: __string
    var WriteSegmentRequest: awsDashSdkLib.clientsPinpointMod.PinpointNs.WriteSegmentRequest
  }
  
  trait UpdateSegmentResponse extends js.Object {
    var SegmentResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.SegmentResponse
  }
  
  trait UpdateSmsChannelRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    var SMSChannelRequest: awsDashSdkLib.clientsPinpointMod.PinpointNs.SMSChannelRequest
  }
  
  trait UpdateSmsChannelResponse extends js.Object {
    var SMSChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.SMSChannelResponse
  }
  
  trait UpdateVoiceChannelRequest extends js.Object {
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: __string
    var VoiceChannelRequest: awsDashSdkLib.clientsPinpointMod.PinpointNs.VoiceChannelRequest
  }
  
  trait UpdateVoiceChannelResponse extends js.Object {
    var VoiceChannelResponse: awsDashSdkLib.clientsPinpointMod.PinpointNs.VoiceChannelResponse
  }
  
  trait VoiceChannelRequest extends js.Object {
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[__boolean] = js.undefined
  }
  
  trait VoiceChannelResponse extends js.Object {
    /**
      * Application id
      */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
      * The date that the settings were last updated in ISO 8601 format.
      */
    var CreationDate: js.UndefOr[__string] = js.undefined
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[__boolean] = js.undefined
    var HasCredential: js.UndefOr[__boolean] = js.undefined
    /**
      * Channel ID. Not used, only for backwards compatibility.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * Is this channel archived
      */
    var IsArchived: js.UndefOr[__boolean] = js.undefined
    /**
      * Who made the last change
      */
    var LastModifiedBy: js.UndefOr[__string] = js.undefined
    /**
      * Last date this was updated
      */
    var LastModifiedDate: js.UndefOr[__string] = js.undefined
    /**
      * Platform type. Will be "Voice"
      */
    var Platform: js.UndefOr[__string] = js.undefined
    /**
      * Version of channel
      */
    var Version: js.UndefOr[__integer] = js.undefined
  }
  
  trait VoiceMessage extends js.Object {
    /**
      * The message body of the notification, the email body or the text message.
      */
    var Body: js.UndefOr[__string] = js.undefined
    /**
      * Language of sent message
      */
    var LanguageCode: js.UndefOr[__string] = js.undefined
    /**
      * Is the number from the pool or messaging service to send from.
      */
    var OriginationNumber: js.UndefOr[__string] = js.undefined
    /**
      * Default message substitutions. Can be overridden by individual address substitutions.
      */
    var Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined
    /**
      * Voice ID of sent message.
      */
    var VoiceId: js.UndefOr[__string] = js.undefined
  }
  
  trait WriteApplicationSettingsRequest extends js.Object {
    /**
      * Default campaign hook information.
      */
    var CampaignHook: js.UndefOr[CampaignHook] = js.undefined
    /**
      * The CloudWatchMetrics settings for the app.
      */
    var CloudWatchMetricsEnabled: js.UndefOr[__boolean] = js.undefined
    /**
      * The limits that apply to each campaign in the project by default. Campaigns can also have their own limits, which override the settings at the project level.
      */
    var Limits: js.UndefOr[CampaignLimits] = js.undefined
    /**
      * The default quiet time for the app. Campaigns in the app don't send messages to endpoints during the quiet time.
    Note: Make sure that your endpoints include the Demographics.Timezone attribute if you plan to enable a quiet time for your app. If your endpoints don't include this attribute, they'll receive the messages that you send them, even if quiet time is enabled.
    When you set up an app to use quiet time, campaigns in that app don't send messages during the time range you specified, as long as all of the following are true:
    - The endpoint includes a valid Demographic.Timezone attribute.
    - The current time in the endpoint's time zone is later than or equal to the time specified in the QuietTime.Start attribute for the app (or campaign, if applicable).
    - The current time in the endpoint's time zone is earlier than or equal to the time specified in the QuietTime.End attribute for the app (or campaign, if applicable).
    Individual campaigns within the app can have their own quiet time settings, which override the quiet time settings at the app level.
      */
    var QuietTime: js.UndefOr[QuietTime] = js.undefined
  }
  
  trait WriteCampaignRequest extends js.Object {
    /**
      * Treatments that are defined in addition to the default treatment.
      */
    var AdditionalTreatments: js.UndefOr[ListOfWriteTreatmentResource] = js.undefined
    /**
      * A description of the campaign.
      */
    var Description: js.UndefOr[__string] = js.undefined
    /**
      * The allocated percentage of end users who will not receive messages from this campaign.
      */
    var HoldoutPercent: js.UndefOr[__integer] = js.undefined
    /**
      * Campaign hook information.
      */
    var Hook: js.UndefOr[CampaignHook] = js.undefined
    /**
      * Indicates whether the campaign is paused. A paused campaign does not send messages unless you resume it by setting IsPaused to false.
      */
    var IsPaused: js.UndefOr[__boolean] = js.undefined
    /**
      * The campaign limits settings.
      */
    var Limits: js.UndefOr[CampaignLimits] = js.undefined
    /**
      * The message configuration settings.
      */
    var MessageConfiguration: js.UndefOr[MessageConfiguration] = js.undefined
    /**
      * The custom name of the campaign.
      */
    var Name: js.UndefOr[__string] = js.undefined
    /**
      * The campaign schedule.
      */
    var Schedule: js.UndefOr[Schedule] = js.undefined
    /**
      * The ID of the segment to which the campaign sends messages.
      */
    var SegmentId: js.UndefOr[__string] = js.undefined
    /**
      * The version of the segment to which the campaign sends messages.
      */
    var SegmentVersion: js.UndefOr[__integer] = js.undefined
    /**
      * A custom description for the treatment.
      */
    var TreatmentDescription: js.UndefOr[__string] = js.undefined
    /**
      * The custom name of a variation of the campaign used for A/B testing.
      */
    var TreatmentName: js.UndefOr[__string] = js.undefined
    /**
      * The Tags for the campaign.
      */
    var tags: js.UndefOr[MapOf__string] = js.undefined
  }
  
  trait WriteEventStream extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to publish events.
      Firehose ARN: arn:aws:firehose:REGION:ACCOUNT_ID:deliverystream/STREAM_NAME
      Kinesis ARN: arn:aws:kinesis:REGION:ACCOUNT_ID:stream/STREAM_NAME
      */
    var DestinationStreamArn: js.UndefOr[__string] = js.undefined
    /**
      * The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
      */
    var RoleArn: js.UndefOr[__string] = js.undefined
  }
  
  trait WriteSegmentRequest extends js.Object {
    /**
      * The segment dimensions attributes.
      */
    var Dimensions: js.UndefOr[SegmentDimensions] = js.undefined
    /**
      * The name of segment
      */
    var Name: js.UndefOr[__string] = js.undefined
    /**
      * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source segments. Your request can only include one segment group. Your request can include either a SegmentGroups object or a Dimensions object, but not both.
      */
    var SegmentGroups: js.UndefOr[SegmentGroupList] = js.undefined
    /**
      * The Tags for the segments.
      */
    var tags: js.UndefOr[MapOf__string] = js.undefined
  }
  
  trait WriteTreatmentResource extends js.Object {
    /**
      * The message configuration settings.
      */
    var MessageConfiguration: js.UndefOr[MessageConfiguration] = js.undefined
    /**
      * The campaign schedule.
      */
    var Schedule: js.UndefOr[Schedule] = js.undefined
    /**
      * The allocated percentage of users for this treatment.
      */
    var SizePercent: js.UndefOr[__integer] = js.undefined
    /**
      * A custom description for the treatment.
      */
    var TreatmentDescription: js.UndefOr[__string] = js.undefined
    /**
      * The custom name of a variation of the campaign used for A/B testing.
      */
    var TreatmentName: js.UndefOr[__string] = js.undefined
  }
  
  trait _Action extends js.Object
  
  trait _AttributeType extends js.Object
  
  trait _CampaignStatus extends js.Object
  
  trait _ChannelType extends js.Object
  
  trait _DeliveryStatus extends js.Object
  
  trait _DimensionType extends js.Object
  
  trait _Duration extends js.Object
  
  trait _FilterType extends js.Object
  
  trait _Format extends js.Object
  
  trait _Frequency extends js.Object
  
  trait _Include extends js.Object
  
  trait _JobStatus extends js.Object
  
  trait _MessageType extends js.Object
  
  trait _Mode extends js.Object
  
  trait _RecencyType extends js.Object
  
  trait _SegmentType extends js.Object
  
  trait _SourceType extends js.Object
  
  trait _Type extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type Action = _Action | java.lang.String
  type AttributeType = _AttributeType | java.lang.String
  type CampaignStatus = _CampaignStatus | java.lang.String
  type ChannelType = _ChannelType | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DeliveryStatus = _DeliveryStatus | java.lang.String
  type DimensionType = _DimensionType | java.lang.String
  type Duration = _Duration | java.lang.String
  type FilterType = _FilterType | java.lang.String
  type Format = _Format | java.lang.String
  type Frequency = _Frequency | java.lang.String
  type Include = _Include | java.lang.String
  type JobStatus = _JobStatus | java.lang.String
  type ListOfActivityResponse = js.Array[ActivityResponse]
  type ListOfApplicationResponse = js.Array[ApplicationResponse]
  type ListOfCampaignResponse = js.Array[CampaignResponse]
  type ListOfEndpointBatchItem = js.Array[EndpointBatchItem]
  type ListOfEndpointResponse = js.Array[EndpointResponse]
  type ListOfExportJobResponse = js.Array[ExportJobResponse]
  type ListOfImportJobResponse = js.Array[ImportJobResponse]
  type ListOfSegmentDimensions = js.Array[SegmentDimensions]
  type ListOfSegmentGroup = js.Array[SegmentGroup]
  type ListOfSegmentReference = js.Array[SegmentReference]
  type ListOfSegmentResponse = js.Array[SegmentResponse]
  type ListOfTreatmentResource = js.Array[TreatmentResource]
  type ListOfWriteTreatmentResource = js.Array[WriteTreatmentResource]
  type ListOf__string = js.Array[__string]
  type MessageType = _MessageType | java.lang.String
  type Mode = _Mode | java.lang.String
  type RecencyType = _RecencyType | java.lang.String
  type SegmentType = _SegmentType | java.lang.String
  type SourceType = _SourceType | java.lang.String
  type Type = _Type | java.lang.String
  type __blob = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsPinpointMod.Blob | java.lang.String
  type __boolean = scala.Boolean
  type __double = scala.Double
  type __integer = scala.Double
  type __string = java.lang.String
  type apiVersion = _apiVersion | java.lang.String
}

