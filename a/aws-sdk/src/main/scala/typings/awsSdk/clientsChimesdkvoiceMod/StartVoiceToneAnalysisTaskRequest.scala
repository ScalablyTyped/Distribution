package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartVoiceToneAnalysisTaskRequest extends StObject {
  
  /**
    * The unique identifier for the client request. Use a different token for different voice tone analysis tasks.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestId] = js.undefined
  
  /**
    * The language code.
    */
  var LanguageCode: typings.awsSdk.clientsChimesdkvoiceMod.LanguageCode
  
  /**
    * The transaction ID.
    */
  var TransactionId: NonEmptyString256
  
  /**
    * The Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString128
}
object StartVoiceToneAnalysisTaskRequest {
  
  inline def apply(LanguageCode: LanguageCode, TransactionId: NonEmptyString256, VoiceConnectorId: NonEmptyString128): StartVoiceToneAnalysisTaskRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], TransactionId = TransactionId.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartVoiceToneAnalysisTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartVoiceToneAnalysisTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: ClientRequestId): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setTransactionId(value: NonEmptyString256): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorId(value: NonEmptyString128): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
