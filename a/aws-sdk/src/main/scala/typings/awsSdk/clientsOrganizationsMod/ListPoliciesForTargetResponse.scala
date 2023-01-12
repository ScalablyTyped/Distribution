package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPoliciesForTargetResponse extends StObject {
  
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.NextToken] = js.undefined
  
  /**
    * The list of policies that match the criteria in the request.
    */
  var Policies: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.Policies] = js.undefined
}
object ListPoliciesForTargetResponse {
  
  inline def apply(): ListPoliciesForTargetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPoliciesForTargetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPoliciesForTargetResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPolicies(value: Policies): Self = StObject.set(x, "Policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "Policies", js.undefined)
    
    inline def setPoliciesVarargs(value: PolicySummary*): Self = StObject.set(x, "Policies", js.Array(value*))
  }
}
