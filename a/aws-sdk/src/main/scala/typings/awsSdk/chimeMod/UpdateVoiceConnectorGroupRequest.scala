package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVoiceConnectorGroupRequest extends StObject {
  
  /**
    * The name of the Amazon Chime Voice Connector group.
    */
  var Name: VoiceConnectorGroupName
  
  /**
    * The Amazon Chime Voice Connector group ID.
    */
  var VoiceConnectorGroupId: NonEmptyString
  
  /**
    * The VoiceConnectorItems to associate with the group.
    */
  var VoiceConnectorItems: VoiceConnectorItemList
}
object UpdateVoiceConnectorGroupRequest {
  
  inline def apply(
    Name: VoiceConnectorGroupName,
    VoiceConnectorGroupId: NonEmptyString,
    VoiceConnectorItems: VoiceConnectorItemList
  ): UpdateVoiceConnectorGroupRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], VoiceConnectorGroupId = VoiceConnectorGroupId.asInstanceOf[js.Any], VoiceConnectorItems = VoiceConnectorItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVoiceConnectorGroupRequest]
  }
  
  extension [Self <: UpdateVoiceConnectorGroupRequest](x: Self) {
    
    inline def setName(value: VoiceConnectorGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorGroupId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorGroupId", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorItems(value: VoiceConnectorItemList): Self = StObject.set(x, "VoiceConnectorItems", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorItemsVarargs(value: VoiceConnectorItem*): Self = StObject.set(x, "VoiceConnectorItems", js.Array(value :_*))
  }
}
