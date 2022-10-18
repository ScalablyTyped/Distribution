package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserResponse extends StObject {
  
  /**
    * The updated user details.
    */
  var User: js.UndefOr[typings.awsSdk.clientsChimeMod.User] = js.undefined
}
object UpdateUserResponse {
  
  inline def apply(): UpdateUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateUserResponse]
  }
  
  extension [Self <: UpdateUserResponse](x: Self) {
    
    inline def setUser(value: User): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
