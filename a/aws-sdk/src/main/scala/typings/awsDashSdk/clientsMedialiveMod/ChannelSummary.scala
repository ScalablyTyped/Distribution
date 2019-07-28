package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSummary extends js.Object {
  /**
    * The unique arn of the channel.
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * The class for this channel. STANDARD for a channel with two pipelines or SINGLE_PIPELINE for a channel with one pipeline.
    */
  var ChannelClass: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.ChannelClass] = js.undefined
  /**
    * A list of destinations of the channel. For UDP outputs, there is one
  destination per output. For other types (HLS, for example), there is
  one destination per packager.
    */
  var Destinations: js.UndefOr[__listOfOutputDestination] = js.undefined
  /**
    * The endpoints where outgoing connections initiate from
    */
  var EgressEndpoints: js.UndefOr[__listOfChannelEgressEndpoint] = js.undefined
  /**
    * The unique id of the channel.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * List of input attachments for channel.
    */
  var InputAttachments: js.UndefOr[__listOfInputAttachment] = js.undefined
  var InputSpecification: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.InputSpecification] = js.undefined
  /**
    * The log level being written to CloudWatch Logs.
    */
  var LogLevel: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.LogLevel] = js.undefined
  /**
    * The name of the channel. (user-mutable)
    */
  var Name: js.UndefOr[__string] = js.undefined
  /**
    * The number of currently healthy pipelines.
    */
  var PipelinesRunningCount: js.UndefOr[__integer] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the role assumed when running the Channel.
    */
  var RoleArn: js.UndefOr[__string] = js.undefined
  var State: js.UndefOr[ChannelState] = js.undefined
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.Tags] = js.undefined
}

object ChannelSummary {
  @scala.inline
  def apply(
    Arn: __string = null,
    ChannelClass: ChannelClass = null,
    Destinations: __listOfOutputDestination = null,
    EgressEndpoints: __listOfChannelEgressEndpoint = null,
    Id: __string = null,
    InputAttachments: __listOfInputAttachment = null,
    InputSpecification: InputSpecification = null,
    LogLevel: LogLevel = null,
    Name: __string = null,
    PipelinesRunningCount: js.UndefOr[__integer] = js.undefined,
    RoleArn: __string = null,
    State: ChannelState = null,
    Tags: Tags = null
  ): ChannelSummary = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (ChannelClass != null) __obj.updateDynamic("ChannelClass")(ChannelClass.asInstanceOf[js.Any])
    if (Destinations != null) __obj.updateDynamic("Destinations")(Destinations)
    if (EgressEndpoints != null) __obj.updateDynamic("EgressEndpoints")(EgressEndpoints)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (InputAttachments != null) __obj.updateDynamic("InputAttachments")(InputAttachments)
    if (InputSpecification != null) __obj.updateDynamic("InputSpecification")(InputSpecification)
    if (LogLevel != null) __obj.updateDynamic("LogLevel")(LogLevel.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (!js.isUndefined(PipelinesRunningCount)) __obj.updateDynamic("PipelinesRunningCount")(PipelinesRunningCount)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ChannelSummary]
  }
}

