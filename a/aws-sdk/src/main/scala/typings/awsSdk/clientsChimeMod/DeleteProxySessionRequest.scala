package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProxySessionRequest extends StObject {
  
  /**
    * The proxy session ID.
    */
  var ProxySessionId: NonEmptyString128
  
  /**
    * The Amazon Chime voice connector ID.
    */
  var VoiceConnectorId: NonEmptyString128
}
object DeleteProxySessionRequest {
  
  inline def apply(ProxySessionId: NonEmptyString128, VoiceConnectorId: NonEmptyString128): DeleteProxySessionRequest = {
    val __obj = js.Dynamic.literal(ProxySessionId = ProxySessionId.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProxySessionRequest]
  }
  
  extension [Self <: DeleteProxySessionRequest](x: Self) {
    
    inline def setProxySessionId(value: NonEmptyString128): Self = StObject.set(x, "ProxySessionId", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorId(value: NonEmptyString128): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
