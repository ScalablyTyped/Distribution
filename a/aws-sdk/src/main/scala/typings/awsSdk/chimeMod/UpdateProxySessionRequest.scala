package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProxySessionRequest extends StObject {
  
  /**
    * The proxy session capabilities.
    */
  var Capabilities: CapabilityList
  
  /**
    * The number of minutes allowed for the proxy session.
    */
  var ExpiryMinutes: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * The proxy session ID.
    */
  var ProxySessionId: NonEmptyString128
  
  /**
    * The Amazon Chime voice connector ID.
    */
  var VoiceConnectorId: NonEmptyString128
}
object UpdateProxySessionRequest {
  
  inline def apply(
    Capabilities: CapabilityList,
    ProxySessionId: NonEmptyString128,
    VoiceConnectorId: NonEmptyString128
  ): UpdateProxySessionRequest = {
    val __obj = js.Dynamic.literal(Capabilities = Capabilities.asInstanceOf[js.Any], ProxySessionId = ProxySessionId.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProxySessionRequest]
  }
  
  extension [Self <: UpdateProxySessionRequest](x: Self) {
    
    inline def setCapabilities(value: CapabilityList): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesVarargs(value: Capability*): Self = StObject.set(x, "Capabilities", js.Array(value :_*))
    
    inline def setExpiryMinutes(value: PositiveInteger): Self = StObject.set(x, "ExpiryMinutes", value.asInstanceOf[js.Any])
    
    inline def setExpiryMinutesUndefined: Self = StObject.set(x, "ExpiryMinutes", js.undefined)
    
    inline def setProxySessionId(value: NonEmptyString128): Self = StObject.set(x, "ProxySessionId", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorId(value: NonEmptyString128): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
