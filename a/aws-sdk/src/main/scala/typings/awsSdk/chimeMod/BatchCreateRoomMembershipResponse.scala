package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchCreateRoomMembershipResponse extends StObject {
  
  /**
    * If the action fails for one or more of the member IDs in the request, a list of the member IDs is returned, along with error codes and error messages.
    */
  var Errors: js.UndefOr[MemberErrorList] = js.native
}
object BatchCreateRoomMembershipResponse {
  
  @scala.inline
  def apply(): BatchCreateRoomMembershipResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateRoomMembershipResponse]
  }
  
  @scala.inline
  implicit class BatchCreateRoomMembershipResponseMutableBuilder[Self <: BatchCreateRoomMembershipResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: MemberErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: MemberError*): Self = StObject.set(x, "Errors", js.Array(value :_*))
  }
}
