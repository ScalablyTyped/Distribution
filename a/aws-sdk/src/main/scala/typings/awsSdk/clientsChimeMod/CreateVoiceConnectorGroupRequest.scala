package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVoiceConnectorGroupRequest extends StObject {
  
  /**
    * The name of the Amazon Chime Voice Connector group.
    */
  var Name: VoiceConnectorGroupName
  
  /**
    * The Amazon Chime Voice Connectors to route inbound calls to.
    */
  var VoiceConnectorItems: js.UndefOr[VoiceConnectorItemList] = js.undefined
}
object CreateVoiceConnectorGroupRequest {
  
  inline def apply(Name: VoiceConnectorGroupName): CreateVoiceConnectorGroupRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVoiceConnectorGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVoiceConnectorGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: VoiceConnectorGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorItems(value: VoiceConnectorItemList): Self = StObject.set(x, "VoiceConnectorItems", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorItemsUndefined: Self = StObject.set(x, "VoiceConnectorItems", js.undefined)
    
    inline def setVoiceConnectorItemsVarargs(value: VoiceConnectorItem*): Self = StObject.set(x, "VoiceConnectorItems", js.Array(value*))
  }
}
