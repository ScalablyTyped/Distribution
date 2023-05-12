package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallDetails extends StObject {
  
  /**
    * Identifies a person as the caller or the callee.
    */
  var IsCaller: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The transaction ID of a Voice Connector call.
    */
  var TransactionId: js.UndefOr[NonEmptyString256] = js.undefined
  
  /**
    * The Voice Connector ID.
    */
  var VoiceConnectorId: js.UndefOr[NonEmptyString128] = js.undefined
}
object CallDetails {
  
  inline def apply(): CallDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallDetails] (val x: Self) extends AnyVal {
    
    inline def setIsCaller(value: Boolean): Self = StObject.set(x, "IsCaller", value.asInstanceOf[js.Any])
    
    inline def setIsCallerUndefined: Self = StObject.set(x, "IsCaller", js.undefined)
    
    inline def setTransactionId(value: NonEmptyString256): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "TransactionId", js.undefined)
    
    inline def setVoiceConnectorId(value: NonEmptyString128): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorIdUndefined: Self = StObject.set(x, "VoiceConnectorId", js.undefined)
  }
}
