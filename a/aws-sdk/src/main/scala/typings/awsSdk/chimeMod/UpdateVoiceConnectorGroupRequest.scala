package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVoiceConnectorGroupRequest extends js.Object {
  /**
    * The name of the Amazon Chime Voice Connector group.
    */
  var Name: VoiceConnectorGroupName = js.native
  /**
    * The Amazon Chime Voice Connector group ID.
    */
  var VoiceConnectorGroupId: NonEmptyString = js.native
  /**
    * The VoiceConnectorItems to associate with the group.
    */
  var VoiceConnectorItems: VoiceConnectorItemList = js.native
}

object UpdateVoiceConnectorGroupRequest {
  @scala.inline
  def apply(
    Name: VoiceConnectorGroupName,
    VoiceConnectorGroupId: NonEmptyString,
    VoiceConnectorItems: VoiceConnectorItemList
  ): UpdateVoiceConnectorGroupRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], VoiceConnectorGroupId = VoiceConnectorGroupId.asInstanceOf[js.Any], VoiceConnectorItems = VoiceConnectorItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVoiceConnectorGroupRequest]
  }
  @scala.inline
  implicit class UpdateVoiceConnectorGroupRequestOps[Self <: UpdateVoiceConnectorGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: VoiceConnectorGroupName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setVoiceConnectorGroupId(value: NonEmptyString): Self = this.set("VoiceConnectorGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVoiceConnectorItemsVarargs(value: VoiceConnectorItem*): Self = this.set("VoiceConnectorItems", js.Array(value :_*))
    @scala.inline
    def setVoiceConnectorItems(value: VoiceConnectorItemList): Self = this.set("VoiceConnectorItems", value.asInstanceOf[js.Any])
  }
  
}

