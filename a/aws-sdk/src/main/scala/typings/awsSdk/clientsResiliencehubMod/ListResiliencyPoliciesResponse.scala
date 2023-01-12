package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResiliencyPoliciesResponse extends StObject {
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The resiliency policies for the Resilience Hub applications.
    */
  var resiliencyPolicies: ResiliencyPolicies
}
object ListResiliencyPoliciesResponse {
  
  inline def apply(resiliencyPolicies: ResiliencyPolicies): ListResiliencyPoliciesResponse = {
    val __obj = js.Dynamic.literal(resiliencyPolicies = resiliencyPolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResiliencyPoliciesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListResiliencyPoliciesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResiliencyPolicies(value: ResiliencyPolicies): Self = StObject.set(x, "resiliencyPolicies", value.asInstanceOf[js.Any])
    
    inline def setResiliencyPoliciesVarargs(value: ResiliencyPolicy*): Self = StObject.set(x, "resiliencyPolicies", js.Array(value*))
  }
}
