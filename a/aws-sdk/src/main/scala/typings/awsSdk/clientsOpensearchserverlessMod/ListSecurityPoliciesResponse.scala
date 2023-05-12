package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSecurityPoliciesResponse extends StObject {
  
  /**
    * When nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Details about the security policies in your account.
    */
  var securityPolicySummaries: js.UndefOr[SecurityPolicySummaries] = js.undefined
}
object ListSecurityPoliciesResponse {
  
  inline def apply(): ListSecurityPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecurityPoliciesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSecurityPoliciesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSecurityPolicySummaries(value: SecurityPolicySummaries): Self = StObject.set(x, "securityPolicySummaries", value.asInstanceOf[js.Any])
    
    inline def setSecurityPolicySummariesUndefined: Self = StObject.set(x, "securityPolicySummaries", js.undefined)
    
    inline def setSecurityPolicySummariesVarargs(value: SecurityPolicySummary*): Self = StObject.set(x, "securityPolicySummaries", js.Array(value*))
  }
}
