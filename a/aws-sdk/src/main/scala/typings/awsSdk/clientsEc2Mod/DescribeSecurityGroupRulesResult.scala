package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSecurityGroupRulesResult extends StObject {
  
  /**
    * The token to include in another request to get the next page of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about security group rules.
    */
  var SecurityGroupRules: js.UndefOr[SecurityGroupRuleList] = js.undefined
}
object DescribeSecurityGroupRulesResult {
  
  inline def apply(): DescribeSecurityGroupRulesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSecurityGroupRulesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSecurityGroupRulesResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSecurityGroupRules(value: SecurityGroupRuleList): Self = StObject.set(x, "SecurityGroupRules", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupRulesUndefined: Self = StObject.set(x, "SecurityGroupRules", js.undefined)
    
    inline def setSecurityGroupRulesVarargs(value: SecurityGroupRule*): Self = StObject.set(x, "SecurityGroupRules", js.Array(value*))
  }
}
