package typings.awsSdk.clientsAmpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRuleGroupsNamespacesResponse extends StObject {
  
  /**
    * Pagination token to use when requesting the next page in this list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The list of the selected rule groups namespaces.
    */
  var ruleGroupsNamespaces: RuleGroupsNamespaceSummaryList
}
object ListRuleGroupsNamespacesResponse {
  
  inline def apply(ruleGroupsNamespaces: RuleGroupsNamespaceSummaryList): ListRuleGroupsNamespacesResponse = {
    val __obj = js.Dynamic.literal(ruleGroupsNamespaces = ruleGroupsNamespaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRuleGroupsNamespacesResponse]
  }
  
  extension [Self <: ListRuleGroupsNamespacesResponse](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRuleGroupsNamespaces(value: RuleGroupsNamespaceSummaryList): Self = StObject.set(x, "ruleGroupsNamespaces", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupsNamespacesVarargs(value: RuleGroupsNamespaceSummary*): Self = StObject.set(x, "ruleGroupsNamespaces", js.Array(value*))
  }
}
