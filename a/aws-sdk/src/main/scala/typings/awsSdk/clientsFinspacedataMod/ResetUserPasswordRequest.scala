package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetUserPasswordRequest extends StObject {
  
  /**
    * A token that ensures idempotency. This token expires in 10 minutes.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The unique identifier of the user that a temporary password is requested for.
    */
  var userId: UserId
}
object ResetUserPasswordRequest {
  
  inline def apply(userId: UserId): ResetUserPasswordRequest = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetUserPasswordRequest]
  }
  
  extension [Self <: ResetUserPasswordRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
