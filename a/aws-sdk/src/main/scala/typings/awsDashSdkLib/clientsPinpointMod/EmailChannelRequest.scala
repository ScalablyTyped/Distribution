package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailChannelRequest extends js.Object {
  /**
    * The configuration set that you want to apply to email that you send through the channel by using the Amazon Pinpoint Email API.
    */
  var ConfigurationSet: js.UndefOr[__string] = js.undefined
  /**
    * Specifies whether to enable the email channel for the application.
    */
  var Enabled: js.UndefOr[__boolean] = js.undefined
  /**
    *  The verified email address that you want to send email from when you send email through the channel.
    */
  var FromAddress: __string
  /**
    *  The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple Email Service (Amazon SES), that you want to use when you send email through the channel.
    */
  var Identity: __string
  /**
    *  The ARN of the AWS Identity and Access Management (IAM) role that you want Amazon Pinpoint to use when it submits email-related event data for the channel.
    */
  var RoleArn: js.UndefOr[__string] = js.undefined
}

object EmailChannelRequest {
  @scala.inline
  def apply(
    FromAddress: __string,
    Identity: __string,
    ConfigurationSet: __string = null,
    Enabled: js.UndefOr[__boolean] = js.undefined,
    RoleArn: __string = null
  ): EmailChannelRequest = {
    val __obj = js.Dynamic.literal(FromAddress = FromAddress, Identity = Identity)
    if (ConfigurationSet != null) __obj.updateDynamic("ConfigurationSet")(ConfigurationSet)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    __obj.asInstanceOf[EmailChannelRequest]
  }
}

