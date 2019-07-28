package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateChannelRequest extends js.Object {
  /**
    * The class for this channel. STANDARD for a channel with two pipelines or SINGLE_PIPELINE for a channel with one pipeline.
    */
  var ChannelClass: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.ChannelClass] = js.undefined
  var Destinations: js.UndefOr[__listOfOutputDestination] = js.undefined
  var EncoderSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.EncoderSettings] = js.undefined
  /**
    * List of input attachments for channel.
    */
  var InputAttachments: js.UndefOr[__listOfInputAttachment] = js.undefined
  /**
    * Specification of input for this channel (max. bitrate, resolution, codec, etc.)
    */
  var InputSpecification: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.InputSpecification] = js.undefined
  /**
    * The log level to write to CloudWatch Logs.
    */
  var LogLevel: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.LogLevel] = js.undefined
  /**
    * Name of channel.
    */
  var Name: js.UndefOr[__string] = js.undefined
  /**
    * Unique request ID to be specified. This is needed to prevent retries from
  creating multiple resources.
    */
  var RequestId: js.UndefOr[__string] = js.undefined
  /**
    * Deprecated field that's only usable by whitelisted customers.
    */
  var Reserved: js.UndefOr[__string] = js.undefined
  /**
    * An optional Amazon Resource Name (ARN) of the role to assume when running the Channel.
    */
  var RoleArn: js.UndefOr[__string] = js.undefined
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.Tags] = js.undefined
}

object CreateChannelRequest {
  @scala.inline
  def apply(
    ChannelClass: ChannelClass = null,
    Destinations: __listOfOutputDestination = null,
    EncoderSettings: EncoderSettings = null,
    InputAttachments: __listOfInputAttachment = null,
    InputSpecification: InputSpecification = null,
    LogLevel: LogLevel = null,
    Name: __string = null,
    RequestId: __string = null,
    Reserved: __string = null,
    RoleArn: __string = null,
    Tags: Tags = null
  ): CreateChannelRequest = {
    val __obj = js.Dynamic.literal()
    if (ChannelClass != null) __obj.updateDynamic("ChannelClass")(ChannelClass.asInstanceOf[js.Any])
    if (Destinations != null) __obj.updateDynamic("Destinations")(Destinations)
    if (EncoderSettings != null) __obj.updateDynamic("EncoderSettings")(EncoderSettings)
    if (InputAttachments != null) __obj.updateDynamic("InputAttachments")(InputAttachments)
    if (InputSpecification != null) __obj.updateDynamic("InputSpecification")(InputSpecification)
    if (LogLevel != null) __obj.updateDynamic("LogLevel")(LogLevel.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId)
    if (Reserved != null) __obj.updateDynamic("Reserved")(Reserved)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateChannelRequest]
  }
}

