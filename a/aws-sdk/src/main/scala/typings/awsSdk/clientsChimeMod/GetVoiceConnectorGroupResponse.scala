package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceConnectorGroupResponse extends StObject {
  
  /**
    * The Amazon Chime Voice Connector group details.
    */
  var VoiceConnectorGroup: js.UndefOr[typings.awsSdk.clientsChimeMod.VoiceConnectorGroup] = js.undefined
}
object GetVoiceConnectorGroupResponse {
  
  inline def apply(): GetVoiceConnectorGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorGroupResponse]
  }
  
  extension [Self <: GetVoiceConnectorGroupResponse](x: Self) {
    
    inline def setVoiceConnectorGroup(value: VoiceConnectorGroup): Self = StObject.set(x, "VoiceConnectorGroup", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorGroupUndefined: Self = StObject.set(x, "VoiceConnectorGroup", js.undefined)
  }
}
