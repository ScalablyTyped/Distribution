package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableUserResponse extends StObject {
  
  /**
    * The unique identifier for the enabled user account.
    */
  var userId: js.UndefOr[UserId] = js.undefined
}
object EnableUserResponse {
  
  inline def apply(): EnableUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableUserResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableUserResponse] (val x: Self) extends AnyVal {
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
