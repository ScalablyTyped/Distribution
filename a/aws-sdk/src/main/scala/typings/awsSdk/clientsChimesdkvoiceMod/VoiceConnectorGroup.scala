package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceConnectorGroup extends StObject {
  
  /**
    * The Voice Connector group's creation time stamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of a Voice Connector group.
    */
  var Name: js.UndefOr[VoiceConnectorGroupName] = js.undefined
  
  /**
    * The Voice Connector group's creation time stamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the Voice Connector group.
    */
  var VoiceConnectorGroupArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ID of a Voice Connector group.
    */
  var VoiceConnectorGroupId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Voice Connectors to which you route inbound calls.
    */
  var VoiceConnectorItems: js.UndefOr[VoiceConnectorItemList] = js.undefined
}
object VoiceConnectorGroup {
  
  inline def apply(): VoiceConnectorGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceConnectorGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoiceConnectorGroup] (val x: Self) extends AnyVal {
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setName(value: VoiceConnectorGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
    
    inline def setVoiceConnectorGroupArn(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorGroupArn", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorGroupArnUndefined: Self = StObject.set(x, "VoiceConnectorGroupArn", js.undefined)
    
    inline def setVoiceConnectorGroupId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorGroupId", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorGroupIdUndefined: Self = StObject.set(x, "VoiceConnectorGroupId", js.undefined)
    
    inline def setVoiceConnectorItems(value: VoiceConnectorItemList): Self = StObject.set(x, "VoiceConnectorItems", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorItemsUndefined: Self = StObject.set(x, "VoiceConnectorItems", js.undefined)
    
    inline def setVoiceConnectorItemsVarargs(value: VoiceConnectorItem*): Self = StObject.set(x, "VoiceConnectorItems", js.Array(value*))
  }
}
