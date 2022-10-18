package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceConnectorResponse extends StObject {
  
  /**
    * The Amazon Chime Voice Connector details.
    */
  var VoiceConnector: js.UndefOr[typings.awsSdk.clientsChimeMod.VoiceConnector] = js.undefined
}
object GetVoiceConnectorResponse {
  
  inline def apply(): GetVoiceConnectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorResponse]
  }
  
  extension [Self <: GetVoiceConnectorResponse](x: Self) {
    
    inline def setVoiceConnector(value: VoiceConnector): Self = StObject.set(x, "VoiceConnector", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorUndefined: Self = StObject.set(x, "VoiceConnector", js.undefined)
  }
}
