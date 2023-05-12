package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVoiceConnectorRequest extends StObject {
  
  /**
    * The name of the Voice Connector.
    */
  var Name: VoiceConnectorName
  
  /**
    * When enabled, requires encryption for the Voice Connector.
    */
  var RequireEncryption: Boolean
  
  /**
    * The Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}
object UpdateVoiceConnectorRequest {
  
  inline def apply(Name: VoiceConnectorName, RequireEncryption: Boolean, VoiceConnectorId: NonEmptyString): UpdateVoiceConnectorRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RequireEncryption = RequireEncryption.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVoiceConnectorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateVoiceConnectorRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: VoiceConnectorName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRequireEncryption(value: Boolean): Self = StObject.set(x, "RequireEncryption", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
