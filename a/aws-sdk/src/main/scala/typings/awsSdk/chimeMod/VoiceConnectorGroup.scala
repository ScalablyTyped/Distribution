package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): VoiceConnectorGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceConnectorGroup]
  }
  
  @scala.inline
  implicit class VoiceConnectorGroupOps[Self <: VoiceConnectorGroup] (val x: Self) extends AnyVal {
    
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
    def setCreatedTimestamp(value: Iso8601Timestamp): Self = this.set("CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTimestamp: Self = this.set("CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setName(value: VoiceConnectorGroupName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setUpdatedTimestamp(value: Iso8601Timestamp): Self = this.set("UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedTimestamp: Self = this.set("UpdatedTimestamp", js.undefined)
    
    @scala.inline
    def setVoiceConnectorGroupId(value: NonEmptyString): Self = this.set("VoiceConnectorGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoiceConnectorGroupId: Self = this.set("VoiceConnectorGroupId", js.undefined)
    
    @scala.inline
    def setVoiceConnectorItemsVarargs(value: VoiceConnectorItem*): Self = this.set("VoiceConnectorItems", js.Array(value :_*))
    
    @scala.inline
    def setVoiceConnectorItems(value: VoiceConnectorItemList): Self = this.set("VoiceConnectorItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoiceConnectorItems: Self = this.set("VoiceConnectorItems", js.undefined)
  }
}
