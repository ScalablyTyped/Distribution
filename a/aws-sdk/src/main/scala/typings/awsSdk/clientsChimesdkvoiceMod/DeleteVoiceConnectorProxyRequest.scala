package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVoiceConnectorProxyRequest extends StObject {
  
  /**
    * The Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString128
}
object DeleteVoiceConnectorProxyRequest {
  
  inline def apply(VoiceConnectorId: NonEmptyString128): DeleteVoiceConnectorProxyRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVoiceConnectorProxyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteVoiceConnectorProxyRequest] (val x: Self) extends AnyVal {
    
    inline def setVoiceConnectorId(value: NonEmptyString128): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
