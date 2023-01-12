package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetUserPasswordResponse extends StObject {
  
  /**
    * A randomly generated temporary password for the requested user account. This password expires in 7 days.
    */
  var temporaryPassword: js.UndefOr[Password] = js.undefined
  
  /**
    * The unique identifier of the user that a new password is generated for.
    */
  var userId: js.UndefOr[UserId] = js.undefined
}
object ResetUserPasswordResponse {
  
  inline def apply(): ResetUserPasswordResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetUserPasswordResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResetUserPasswordResponse] (val x: Self) extends AnyVal {
    
    inline def setTemporaryPassword(value: Password): Self = StObject.set(x, "temporaryPassword", value.asInstanceOf[js.Any])
    
    inline def setTemporaryPasswordUndefined: Self = StObject.set(x, "temporaryPassword", js.undefined)
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
