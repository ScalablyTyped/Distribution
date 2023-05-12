package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSpeakerSearchTaskRequest extends StObject {
  
  /**
    * The unique identifier for the client request. Use a different token for different speaker search tasks.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestId] = js.undefined
  
  /**
    * The transaction ID of the call being analyzed.
    */
  var TransactionId: NonEmptyString256
  
  /**
    * The Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString128
  
  /**
    * The ID of the voice profile domain that will store the voice profile.
    */
  var VoiceProfileDomainId: NonEmptyString256
}
object StartSpeakerSearchTaskRequest {
  
  inline def apply(
    TransactionId: NonEmptyString256,
    VoiceConnectorId: NonEmptyString128,
    VoiceProfileDomainId: NonEmptyString256
  ): StartSpeakerSearchTaskRequest = {
    val __obj = js.Dynamic.literal(TransactionId = TransactionId.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any], VoiceProfileDomainId = VoiceProfileDomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSpeakerSearchTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartSpeakerSearchTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: ClientRequestId): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setTransactionId(value: NonEmptyString256): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorId(value: NonEmptyString128): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
    
    inline def setVoiceProfileDomainId(value: NonEmptyString256): Self = StObject.set(x, "VoiceProfileDomainId", value.asInstanceOf[js.Any])
  }
}
