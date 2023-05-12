package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutVoiceConnectorOriginationRequest extends StObject {
  
  /**
    * The origination settings being updated.
    */
  var Origination: typings.awsSdk.clientsChimesdkvoiceMod.Origination
  
  /**
    * The Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}
object PutVoiceConnectorOriginationRequest {
  
  inline def apply(Origination: Origination, VoiceConnectorId: NonEmptyString): PutVoiceConnectorOriginationRequest = {
    val __obj = js.Dynamic.literal(Origination = Origination.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutVoiceConnectorOriginationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutVoiceConnectorOriginationRequest] (val x: Self) extends AnyVal {
    
    inline def setOrigination(value: Origination): Self = StObject.set(x, "Origination", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
