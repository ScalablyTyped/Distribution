package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoiceConnectorGroup extends StObject {
  
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
  implicit class VoiceConnectorGroupMutableBuilder[Self <: VoiceConnectorGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedTimestamp(value: Iso8601Timestamp): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setName(value: VoiceConnectorGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setUpdatedTimestamp(value: Iso8601Timestamp): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
    
    @scala.inline
    def setVoiceConnectorGroupId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceConnectorGroupIdUndefined: Self = StObject.set(x, "VoiceConnectorGroupId", js.undefined)
    
    @scala.inline
    def setVoiceConnectorItems(value: VoiceConnectorItemList): Self = StObject.set(x, "VoiceConnectorItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceConnectorItemsUndefined: Self = StObject.set(x, "VoiceConnectorItems", js.undefined)
    
    @scala.inline
    def setVoiceConnectorItemsVarargs(value: VoiceConnectorItem*): Self = StObject.set(x, "VoiceConnectorItems", js.Array(value :_*))
  }
}
