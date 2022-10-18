package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserRequest extends StObject {
  
  /**
    * The unique identifier of the user to get data for.
    */
  var userId: UserId
}
object GetUserRequest {
  
  inline def apply(userId: UserId): GetUserRequest = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserRequest]
  }
  
  extension [Self <: GetUserRequest](x: Self) {
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
