package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchSuspendUserResponse extends StObject {
  
  /**
    * If the BatchSuspendUser action fails for one or more of the user IDs in the request, a list of the user IDs is returned, along with error codes and error messages.
    */
  var UserErrors: js.UndefOr[UserErrorList] = js.undefined
}
object BatchSuspendUserResponse {
  
  @scala.inline
  def apply(): BatchSuspendUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchSuspendUserResponse]
  }
  
  @scala.inline
  implicit class BatchSuspendUserResponseMutableBuilder[Self <: BatchSuspendUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserErrors(value: UserErrorList): Self = StObject.set(x, "UserErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserErrorsUndefined: Self = StObject.set(x, "UserErrors", js.undefined)
    
    @scala.inline
    def setUserErrorsVarargs(value: UserError*): Self = StObject.set(x, "UserErrors", js.Array(value :_*))
  }
}
