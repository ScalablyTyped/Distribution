package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object EmailChannelResponse {
  @scala.inline
  def apply(
    ApplicationId: __string = null,
    ConfigurationSet: __string = null,
    CreationDate: __string = null,
    Enabled: js.UndefOr[__boolean] = js.undefined,
    FromAddress: __string = null,
    HasCredential: js.UndefOr[__boolean] = js.undefined,
    Id: __string = null,
    Identity: __string = null,
    IsArchived: js.UndefOr[__boolean] = js.undefined,
    LastModifiedBy: __string = null,
    LastModifiedDate: __string = null,
    MessagesPerSecond: js.UndefOr[__integer] = js.undefined,
    Platform: __string = null,
    RoleArn: __string = null,
    Version: js.UndefOr[__integer] = js.undefined
  ): EmailChannelResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId)
    if (ConfigurationSet != null) __obj.updateDynamic("ConfigurationSet")(ConfigurationSet)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (FromAddress != null) __obj.updateDynamic("FromAddress")(FromAddress)
    if (!js.isUndefined(HasCredential)) __obj.updateDynamic("HasCredential")(HasCredential)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Identity != null) __obj.updateDynamic("Identity")(Identity)
    if (!js.isUndefined(IsArchived)) __obj.updateDynamic("IsArchived")(IsArchived)
    if (LastModifiedBy != null) __obj.updateDynamic("LastModifiedBy")(LastModifiedBy)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (!js.isUndefined(MessagesPerSecond)) __obj.updateDynamic("MessagesPerSecond")(MessagesPerSecond)
    if (Platform != null) __obj.updateDynamic("Platform")(Platform)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[EmailChannelResponse]
  }
}

