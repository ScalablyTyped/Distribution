package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoiceConnectorGroup extends js.Object {
  /**
    * The Amazon Chime Voice Connector group creation timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
  /**
    * The name of the Amazon Chime Voice Connector group.
    */
  var Name: js.UndefOr[VoiceConnectorGroupName] = js.native
  /**
    * The updated Amazon Chime Voice Connector group timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
  /**
    * The Amazon Chime Voice Connector group ID.
    */
  var VoiceConnectorGroupId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The Amazon Chime Voice Connectors to which to route inbound calls.
    */
  var VoiceConnectorItems: js.UndefOr[VoiceConnectorItemList] = js.native
}

object VoiceConnectorGroup {
  @scala.inline
  def apply(
    CreatedTimestamp: Iso8601Timestamp = null,
    Name: VoiceConnectorGroupName = null,
    UpdatedTimestamp: Iso8601Timestamp = null,
    VoiceConnectorGroupId: NonEmptyString = null,
    VoiceConnectorItems: VoiceConnectorItemList = null
  ): VoiceConnectorGroup = {
    val __obj = js.Dynamic.literal()
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (UpdatedTimestamp != null) __obj.updateDynamic("UpdatedTimestamp")(UpdatedTimestamp.asInstanceOf[js.Any])
    if (VoiceConnectorGroupId != null) __obj.updateDynamic("VoiceConnectorGroupId")(VoiceConnectorGroupId.asInstanceOf[js.Any])
    if (VoiceConnectorItems != null) __obj.updateDynamic("VoiceConnectorItems")(VoiceConnectorItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceConnectorGroup]
  }
}

