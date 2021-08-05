package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceConnectorGroup extends StObject {
  
  /**
    * The Amazon Chime Voice Connector group creation timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
  
  /**
    * The name of the Amazon Chime Voice Connector group.
    */
  var Name: js.UndefOr[VoiceConnectorGroupName] = js.undefined
  
  /**
    * The updated Amazon Chime Voice Connector group timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
  
  /**
    * The Amazon Chime Voice Connector group ID.
    */
  var VoiceConnectorGroupId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Amazon Chime Voice Connectors to which to route inbound calls.
    */
  var VoiceConnectorItems: js.UndefOr[VoiceConnectorItemList] = js.undefined
}
object VoiceConnectorGroup {
  
  inline def apply(): VoiceConnectorGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceConnectorGroup]
  }
  
  extension [Self <: VoiceConnectorGroup](x: Self) {
    
    inline def setCreatedTimestamp(value: Iso8601Timestamp): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setName(value: VoiceConnectorGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setUpdatedTimestamp(value: Iso8601Timestamp): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
    
    inline def setVoiceConnectorGroupId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorGroupId", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorGroupIdUndefined: Self = StObject.set(x, "VoiceConnectorGroupId", js.undefined)
    
    inline def setVoiceConnectorItems(value: VoiceConnectorItemList): Self = StObject.set(x, "VoiceConnectorItems", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorItemsUndefined: Self = StObject.set(x, "VoiceConnectorItems", js.undefined)
    
    inline def setVoiceConnectorItemsVarargs(value: VoiceConnectorItem*): Self = StObject.set(x, "VoiceConnectorItems", js.Array(value :_*))
  }
}
