package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSipMediaApplicationCallRequest extends StObject {
  
  /**
    * Arguments made available to the Lambda function as part of the CALL_UPDATE_REQUESTED event. Can contain 0-20 key-value pairs.
    */
  var Arguments: SMAUpdateCallArgumentsMap
  
  /**
    * The ID of the SIP media application handling the call.
    */
  var SipMediaApplicationId: NonEmptyString
  
  /**
    * The ID of the call transaction.
    */
  var TransactionId: NonEmptyString
}
object UpdateSipMediaApplicationCallRequest {
  
  inline def apply(
    Arguments: SMAUpdateCallArgumentsMap,
    SipMediaApplicationId: NonEmptyString,
    TransactionId: NonEmptyString
  ): UpdateSipMediaApplicationCallRequest = {
    val __obj = js.Dynamic.literal(Arguments = Arguments.asInstanceOf[js.Any], SipMediaApplicationId = SipMediaApplicationId.asInstanceOf[js.Any], TransactionId = TransactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSipMediaApplicationCallRequest]
  }
  
  extension [Self <: UpdateSipMediaApplicationCallRequest](x: Self) {
    
    inline def setArguments(value: SMAUpdateCallArgumentsMap): Self = StObject.set(x, "Arguments", value.asInstanceOf[js.Any])
    
    inline def setSipMediaApplicationId(value: NonEmptyString): Self = StObject.set(x, "SipMediaApplicationId", value.asInstanceOf[js.Any])
    
    inline def setTransactionId(value: NonEmptyString): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
  }
}
