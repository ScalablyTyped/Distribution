package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRuleGroupsResponse extends StObject {
  
  /**
    * When you request a list of objects with a MaxResults setting, if the number of objects that are still available for retrieval exceeds the maximum you requested, Network Firewall returns a NextToken value in the response. To retrieve the next batch of objects, use the token returned from the prior request in your next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The rule group metadata objects that you've defined. Depending on your setting for max results and the number of rule groups, this might not be the full list. 
    */
  var RuleGroups: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.RuleGroups] = js.undefined
}
object ListRuleGroupsResponse {
  
  inline def apply(): ListRuleGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRuleGroupsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRuleGroupsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRuleGroups(value: RuleGroups): Self = StObject.set(x, "RuleGroups", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupsUndefined: Self = StObject.set(x, "RuleGroups", js.undefined)
    
    inline def setRuleGroupsVarargs(value: RuleGroupMetadata*): Self = StObject.set(x, "RuleGroups", js.Array(value*))
  }
}
