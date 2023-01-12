package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSchedulingPoliciesResponse extends StObject {
  
  /**
    * The nextToken value to include in a future ListSchedulingPolicies request. When the results of a ListSchedulingPolicies request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of scheduling policies that match the request.
    */
  var schedulingPolicies: js.UndefOr[SchedulingPolicyListingDetailList] = js.undefined
}
object ListSchedulingPoliciesResponse {
  
  inline def apply(): ListSchedulingPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSchedulingPoliciesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSchedulingPoliciesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSchedulingPolicies(value: SchedulingPolicyListingDetailList): Self = StObject.set(x, "schedulingPolicies", value.asInstanceOf[js.Any])
    
    inline def setSchedulingPoliciesUndefined: Self = StObject.set(x, "schedulingPolicies", js.undefined)
    
    inline def setSchedulingPoliciesVarargs(value: SchedulingPolicyListingDetail*): Self = StObject.set(x, "schedulingPolicies", js.Array(value*))
  }
}
