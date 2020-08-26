package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVoiceConnectorGroupRequest extends js.Object {
  /**
    * The name of the Amazon Chime Voice Connector group.
    */
  var Name: VoiceConnectorGroupName = js.native
  /**
    * The Amazon Chime Voice Connectors to route inbound calls to.
    */
  var VoiceConnectorItems: js.UndefOr[VoiceConnectorItemList] = js.native
}

object CreateVoiceConnectorGroupRequest {
  @scala.inline
  def apply(Name: VoiceConnectorGroupName): CreateVoiceConnectorGroupRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVoiceConnectorGroupRequest]
  }
  @scala.inline
  implicit class CreateVoiceConnectorGroupRequestOps[Self <: CreateVoiceConnectorGroupRequest] (val x: Self) extends AnyVal {
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
    def setVoiceConnectorItemsVarargs(value: VoiceConnectorItem*): Self = this.set("VoiceConnectorItems", js.Array(value :_*))
    @scala.inline
    def setVoiceConnectorItems(value: VoiceConnectorItemList): Self = this.set("VoiceConnectorItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoiceConnectorItems: Self = this.set("VoiceConnectorItems", js.undefined)
  }
  
}

