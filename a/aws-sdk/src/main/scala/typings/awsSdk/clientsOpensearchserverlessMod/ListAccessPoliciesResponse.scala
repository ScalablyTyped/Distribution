package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccessPoliciesResponse extends StObject {
  
  /**
    * Details about the requested access policies.
    */
  var accessPolicySummaries: js.UndefOr[AccessPolicySummaries] = js.undefined
  
  /**
    * When nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListAccessPoliciesResponse {
  
  inline def apply(): ListAccessPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccessPoliciesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAccessPoliciesResponse] (val x: Self) extends AnyVal {
    
    inline def setAccessPolicySummaries(value: AccessPolicySummaries): Self = StObject.set(x, "accessPolicySummaries", value.asInstanceOf[js.Any])
    
    inline def setAccessPolicySummariesUndefined: Self = StObject.set(x, "accessPolicySummaries", js.undefined)
    
    inline def setAccessPolicySummariesVarargs(value: AccessPolicySummary*): Self = StObject.set(x, "accessPolicySummaries", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
