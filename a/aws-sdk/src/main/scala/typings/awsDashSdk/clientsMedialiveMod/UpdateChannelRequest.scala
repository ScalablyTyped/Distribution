package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateChannelRequest extends js.Object {
  /**
    * channel ID
    */
  var ChannelId: __string = js.native
  /**
    * A list of output destinations for this channel.
    */
  var Destinations: js.UndefOr[__listOfOutputDestination] = js.native
  /**
    * The encoder settings for this channel.
    */
  var EncoderSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.EncoderSettings] = js.native
  var InputAttachments: js.UndefOr[__listOfInputAttachment] = js.native
  /**
    * Specification of input for this channel (max. bitrate, resolution, codec, etc.)
    */
  var InputSpecification: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.InputSpecification] = js.native
  /**
    * The log level to write to CloudWatch Logs.
    */
  var LogLevel: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.LogLevel] = js.native
  /**
    * The name of the channel.
    */
  var Name: js.UndefOr[__string] = js.native
  /**
    * An optional Amazon Resource Name (ARN) of the role to assume when running the Channel. If you do not specify this on an update call but the role was previously set that role will be removed.
    */
  var RoleArn: js.UndefOr[__string] = js.native
}

object UpdateChannelRequest {
  @scala.inline
  def apply(
    ChannelId: __string,
    Destinations: __listOfOutputDestination = null,
    EncoderSettings: EncoderSettings = null,
    InputAttachments: __listOfInputAttachment = null,
    InputSpecification: InputSpecification = null,
    LogLevel: LogLevel = null,
    Name: __string = null,
    RoleArn: __string = null
  ): UpdateChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any])
    if (Destinations != null) __obj.updateDynamic("Destinations")(Destinations.asInstanceOf[js.Any])
    if (EncoderSettings != null) __obj.updateDynamic("EncoderSettings")(EncoderSettings.asInstanceOf[js.Any])
    if (InputAttachments != null) __obj.updateDynamic("InputAttachments")(InputAttachments.asInstanceOf[js.Any])
    if (InputSpecification != null) __obj.updateDynamic("InputSpecification")(InputSpecification.asInstanceOf[js.Any])
    if (LogLevel != null) __obj.updateDynamic("LogLevel")(LogLevel.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChannelRequest]
  }
}

