package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceConnectorProxyRequest extends StObject {
  
  /**
    * The Amazon Chime voice connector ID.
    */
  var VoiceConnectorId: NonEmptyString128
}
object GetVoiceConnectorProxyRequest {
  
  inline def apply(VoiceConnectorId: NonEmptyString128): GetVoiceConnectorProxyRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceConnectorProxyRequest]
  }
  
  extension [Self <: GetVoiceConnectorProxyRequest](x: Self) {
    
    inline def setVoiceConnectorId(value: NonEmptyString128): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
