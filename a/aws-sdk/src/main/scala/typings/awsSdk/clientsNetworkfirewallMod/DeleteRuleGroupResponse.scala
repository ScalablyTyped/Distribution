package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRuleGroupResponse extends StObject {
  
  /**
    * The high-level properties of a rule group. This, along with the RuleGroup, define the rule group. You can retrieve all objects for a rule group by calling DescribeRuleGroup. 
    */
  var RuleGroupResponse: typings.awsSdk.clientsNetworkfirewallMod.RuleGroupResponse
}
object DeleteRuleGroupResponse {
  
  inline def apply(RuleGroupResponse: RuleGroupResponse): DeleteRuleGroupResponse = {
    val __obj = js.Dynamic.literal(RuleGroupResponse = RuleGroupResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRuleGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRuleGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setRuleGroupResponse(value: RuleGroupResponse): Self = StObject.set(x, "RuleGroupResponse", value.asInstanceOf[js.Any])
  }
}
