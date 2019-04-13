package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object EmailChannelRequest {
  @scala.inline
  def apply(
    ConfigurationSet: __string = null,
    Enabled: js.UndefOr[__boolean] = js.undefined,
    FromAddress: __string = null,
    Identity: __string = null,
    RoleArn: __string = null
  ): EmailChannelRequest = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationSet != null) __obj.updateDynamic("ConfigurationSet")(ConfigurationSet)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (FromAddress != null) __obj.updateDynamic("FromAddress")(FromAddress)
    if (Identity != null) __obj.updateDynamic("Identity")(Identity)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    __obj.asInstanceOf[EmailChannelRequest]
  }
}

