package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserResponse extends StObject {
  
  /**
    * The user details.
    */
  var User: js.UndefOr[typings.awsSdk.clientsChimeMod.User] = js.undefined
}
object GetUserResponse {
  
  inline def apply(): GetUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserResponse]
  }
  
  extension [Self <: GetUserResponse](x: Self) {
    
    inline def setUser(value: User): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
