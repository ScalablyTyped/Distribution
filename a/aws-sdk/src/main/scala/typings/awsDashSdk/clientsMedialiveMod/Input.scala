package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Input extends js.Object {
  /**
    * The Unique ARN of the input (generated, immutable).
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * A list of channel IDs that that input is attached to (currently an input can only be attached to one channel).
    */
  var AttachedChannels: js.UndefOr[__listOf__string] = js.undefined
  /**
    * A list of the destinations of the input (PUSH-type).
    */
  var Destinations: js.UndefOr[__listOfInputDestination] = js.undefined
  /**
    * The generated ID of the input (unique for user account, immutable).
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * STANDARD - MediaLive expects two sources to be connected to this input. If the channel is also STANDARD, both sources will be ingested. If the channel is SINGLE_PIPELINE, only the first source will be ingested; the second source will always be ignored, even if the first source fails.
  SINGLE_PIPELINE - You can connect only one source to this input. If the ChannelClass is also  SINGLE_PIPELINE, this value is valid. If the ChannelClass is STANDARD, this value is not valid because the channel requires two sources in the input.
    */
  var InputClass: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.InputClass] = js.undefined
  /**
    * Certain pull input sources can be dynamic, meaning that they can have their URL's dynamically changes
  during input switch actions. Presently, this functionality only works with MP4_FILE inputs.
    */
  var InputSourceType: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.InputSourceType] = js.undefined
  /**
    * A list of MediaConnect Flows for this input.
    */
  var MediaConnectFlows: js.UndefOr[__listOfMediaConnectFlow] = js.undefined
  /**
    * The user-assigned name (This is a mutable value).
    */
  var Name: js.UndefOr[__string] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the role this input assumes during and after creation.
    */
  var RoleArn: js.UndefOr[__string] = js.undefined
  /**
    * A list of IDs for all the Input Security Groups attached to the input.
    */
  var SecurityGroups: js.UndefOr[__listOf__string] = js.undefined
  /**
    * A list of the sources of the input (PULL-type).
    */
  var Sources: js.UndefOr[__listOfInputSource] = js.undefined
  var State: js.UndefOr[InputState] = js.undefined
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.Tags] = js.undefined
  var Type: js.UndefOr[InputType] = js.undefined
}

object Input {
  @scala.inline
  def apply(
    Arn: __string = null,
    AttachedChannels: __listOf__string = null,
    Destinations: __listOfInputDestination = null,
    Id: __string = null,
    InputClass: InputClass = null,
    InputSourceType: InputSourceType = null,
    MediaConnectFlows: __listOfMediaConnectFlow = null,
    Name: __string = null,
    RoleArn: __string = null,
    SecurityGroups: __listOf__string = null,
    Sources: __listOfInputSource = null,
    State: InputState = null,
    Tags: Tags = null,
    Type: InputType = null
  ): Input = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (AttachedChannels != null) __obj.updateDynamic("AttachedChannels")(AttachedChannels)
    if (Destinations != null) __obj.updateDynamic("Destinations")(Destinations)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (InputClass != null) __obj.updateDynamic("InputClass")(InputClass.asInstanceOf[js.Any])
    if (InputSourceType != null) __obj.updateDynamic("InputSourceType")(InputSourceType.asInstanceOf[js.Any])
    if (MediaConnectFlows != null) __obj.updateDynamic("MediaConnectFlows")(MediaConnectFlows)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups)
    if (Sources != null) __obj.updateDynamic("Sources")(Sources)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
}

