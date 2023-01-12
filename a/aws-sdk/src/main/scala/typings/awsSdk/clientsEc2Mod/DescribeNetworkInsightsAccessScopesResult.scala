package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNetworkInsightsAccessScopesResult extends StObject {
  
  /**
    * The Network Access Scopes.
    */
  var NetworkInsightsAccessScopes: js.UndefOr[NetworkInsightsAccessScopeList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeNetworkInsightsAccessScopesResult {
  
  inline def apply(): DescribeNetworkInsightsAccessScopesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNetworkInsightsAccessScopesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeNetworkInsightsAccessScopesResult] (val x: Self) extends AnyVal {
    
    inline def setNetworkInsightsAccessScopes(value: NetworkInsightsAccessScopeList): Self = StObject.set(x, "NetworkInsightsAccessScopes", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsAccessScopesUndefined: Self = StObject.set(x, "NetworkInsightsAccessScopes", js.undefined)
    
    inline def setNetworkInsightsAccessScopesVarargs(value: NetworkInsightsAccessScope*): Self = StObject.set(x, "NetworkInsightsAccessScopes", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
