package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateUserResponse extends StObject {
  
  /**
    * If the BatchUpdateUser action fails for one or more of the user IDs in the request, a list of the user IDs is returned, along with error codes and error messages.
    */
  var UserErrors: js.UndefOr[UserErrorList] = js.undefined
}
object BatchUpdateUserResponse {
  
  inline def apply(): BatchUpdateUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateUserResponse]
  }
  
  extension [Self <: BatchUpdateUserResponse](x: Self) {
    
    inline def setUserErrors(value: UserErrorList): Self = StObject.set(x, "UserErrors", value.asInstanceOf[js.Any])
    
    inline def setUserErrorsUndefined: Self = StObject.set(x, "UserErrors", js.undefined)
    
    inline def setUserErrorsVarargs(value: UserError*): Self = StObject.set(x, "UserErrors", js.Array(value :_*))
  }
}
