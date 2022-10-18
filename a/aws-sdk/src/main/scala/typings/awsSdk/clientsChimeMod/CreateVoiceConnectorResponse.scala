package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVoiceConnectorResponse extends StObject {
  
  /**
    * The Amazon Chime Voice Connector details.
    */
  var VoiceConnector: js.UndefOr[typings.awsSdk.clientsChimeMod.VoiceConnector] = js.undefined
}
object CreateVoiceConnectorResponse {
  
  inline def apply(): CreateVoiceConnectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVoiceConnectorResponse]
  }
  
  extension [Self <: CreateVoiceConnectorResponse](x: Self) {
    
    inline def setVoiceConnector(value: VoiceConnector): Self = StObject.set(x, "VoiceConnector", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorUndefined: Self = StObject.set(x, "VoiceConnector", js.undefined)
  }
}
