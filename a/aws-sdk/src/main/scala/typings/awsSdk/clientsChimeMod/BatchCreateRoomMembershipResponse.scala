package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateRoomMembershipResponse extends StObject {
  
  /**
    * If the action fails for one or more of the member IDs in the request, a list of the member IDs is returned, along with error codes and error messages.
    */
  var Errors: js.UndefOr[MemberErrorList] = js.undefined
}
object BatchCreateRoomMembershipResponse {
  
  inline def apply(): BatchCreateRoomMembershipResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateRoomMembershipResponse]
  }
  
  extension [Self <: BatchCreateRoomMembershipResponse](x: Self) {
    
    inline def setErrors(value: MemberErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: MemberError*): Self = StObject.set(x, "Errors", js.Array(value*))
  }
}
