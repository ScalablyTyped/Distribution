package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProxySessionRequest extends StObject {
  
  /**
    * The proxy session ID.
    */
  var ProxySessionId: NonEmptyString128
  
  /**
    * The Amazon Chime voice connector ID.
    */
  var VoiceConnectorId: NonEmptyString128
}
object GetProxySessionRequest {
  
  @scala.inline
  def apply(ProxySessionId: NonEmptyString128, VoiceConnectorId: NonEmptyString128): GetProxySessionRequest = {
    val __obj = js.Dynamic.literal(ProxySessionId = ProxySessionId.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProxySessionRequest]
  }
  
  @scala.inline
  implicit class GetProxySessionRequestMutableBuilder[Self <: GetProxySessionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProxySessionId(value: NonEmptyString128): Self = StObject.set(x, "ProxySessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString128): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
