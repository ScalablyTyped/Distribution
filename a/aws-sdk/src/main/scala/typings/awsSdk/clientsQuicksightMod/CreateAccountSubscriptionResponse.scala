package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccountSubscriptionResponse extends StObject {
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * A SignupResponse object that returns information about a newly created Amazon QuickSight account.
    */
  var SignupResponse: js.UndefOr[typings.awsSdk.clientsQuicksightMod.SignupResponse] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object CreateAccountSubscriptionResponse {
  
  inline def apply(): CreateAccountSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAccountSubscriptionResponse]
  }
  
  extension [Self <: CreateAccountSubscriptionResponse](x: Self) {
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setSignupResponse(value: SignupResponse): Self = StObject.set(x, "SignupResponse", value.asInstanceOf[js.Any])
    
    inline def setSignupResponseUndefined: Self = StObject.set(x, "SignupResponse", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
