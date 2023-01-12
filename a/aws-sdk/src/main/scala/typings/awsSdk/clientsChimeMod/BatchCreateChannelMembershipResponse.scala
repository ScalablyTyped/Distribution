package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateChannelMembershipResponse extends StObject {
  
  /**
    * The list of channel memberships in the response.
    */
  var BatchChannelMemberships: js.UndefOr[typings.awsSdk.clientsChimeMod.BatchChannelMemberships] = js.undefined
  
  /**
    * If the action fails for one or more of the memberships in the request, a list of the memberships is returned, along with error codes and error messages.
    */
  var Errors: js.UndefOr[BatchCreateChannelMembershipErrors] = js.undefined
}
object BatchCreateChannelMembershipResponse {
  
  inline def apply(): BatchCreateChannelMembershipResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateChannelMembershipResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchCreateChannelMembershipResponse] (val x: Self) extends AnyVal {
    
    inline def setBatchChannelMemberships(value: BatchChannelMemberships): Self = StObject.set(x, "BatchChannelMemberships", value.asInstanceOf[js.Any])
    
    inline def setBatchChannelMembershipsUndefined: Self = StObject.set(x, "BatchChannelMemberships", js.undefined)
    
    inline def setErrors(value: BatchCreateChannelMembershipErrors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: BatchCreateChannelMembershipError*): Self = StObject.set(x, "Errors", js.Array(value*))
  }
}
