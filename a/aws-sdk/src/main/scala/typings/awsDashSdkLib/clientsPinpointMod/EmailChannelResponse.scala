package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailChannelResponse extends js.Object {
  /**
    * The unique identifier for the application that the email channel applies to.
    */
  var ApplicationId: js.UndefOr[__string] = js.undefined
  /**
    * The configuration set that's applied to email that's sent through the channel by using the Amazon Pinpoint Email API.
    */
  var ConfigurationSet: js.UndefOr[__string] = js.undefined
  /**
    * The date and time, in ISO 8601 format, when the email channel was enabled.
    */
  var CreationDate: js.UndefOr[__string] = js.undefined
  /**
    * Specifies whether the email channel is enabled for the application.
    */
  var Enabled: js.UndefOr[__boolean] = js.undefined
  /**
    * The verified email address that you send email from when you send email through the channel.
    */
  var FromAddress: js.UndefOr[__string] = js.undefined
  /**
    * (Not used) This property is retained only for backward compatibility.
    */
  var HasCredential: js.UndefOr[__boolean] = js.undefined
  /**
    * (Deprecated) An identifier for the email channel. This property is retained only for backward compatibility.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    *  The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple Email Service (Amazon SES), that you use when you send email through the channel.
    */
  var Identity: js.UndefOr[__string] = js.undefined
  /**
    * Specifies whether the email channel is archived.
    */
  var IsArchived: js.UndefOr[__boolean] = js.undefined
  /**
    * The user who last modified the email channel.
    */
  var LastModifiedBy: js.UndefOr[__string] = js.undefined
  /**
    * The date and time, in ISO 8601 format, when the email channel was last modified.
    */
  var LastModifiedDate: js.UndefOr[__string] = js.undefined
  /**
    * The maximum number of emails that you can send through the channel each second.
    */
  var MessagesPerSecond: js.UndefOr[__integer] = js.undefined
  /**
    * The type of messaging or notification platform for the channel. For the email channel, this value is EMAIL.
    */
  var Platform: __string
  /**
    *  The ARN of the AWS Identity and Access Management (IAM) role that Amazon Pinpoint uses to submit email-related event data for the channel.
    */
  var RoleArn: js.UndefOr[__string] = js.undefined
  /**
    * The current version of the email channel.
    */
  var Version: js.UndefOr[__integer] = js.undefined
}

object EmailChannelResponse {
  @scala.inline
  def apply(
    Platform: __string,
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
    RoleArn: __string = null,
    Version: js.UndefOr[__integer] = js.undefined
  ): EmailChannelResponse = {
    val __obj = js.Dynamic.literal(Platform = Platform)
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
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[EmailChannelResponse]
  }
}

