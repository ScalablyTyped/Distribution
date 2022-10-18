package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableUserRequest extends StObject {
  
  /**
    * A token that ensures idempotency. This token expires in 10 minutes.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The unique identifier for the user account that you want to enable.
    */
  var userId: UserId
}
object EnableUserRequest {
  
  inline def apply(userId: UserId): EnableUserRequest = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableUserRequest]
  }
  
  extension [Self <: EnableUserRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
