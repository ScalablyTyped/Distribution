package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVoiceConnectorResponse extends StObject {
  
  /**
    * The updated Amazon Chime Voice Connector details.
    */
  var VoiceConnector: js.UndefOr[typings.awsSdk.clientsChimeMod.VoiceConnector] = js.undefined
}
object UpdateVoiceConnectorResponse {
  
  inline def apply(): UpdateVoiceConnectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateVoiceConnectorResponse]
  }
  
  extension [Self <: UpdateVoiceConnectorResponse](x: Self) {
    
    inline def setVoiceConnector(value: VoiceConnector): Self = StObject.set(x, "VoiceConnector", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorUndefined: Self = StObject.set(x, "VoiceConnector", js.undefined)
  }
}
