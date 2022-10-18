package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOrganizationConfigRulesRequest extends StObject {
  
  /**
    * The maximum number of organization Config rules returned on each page. If you do no specify a number, Config uses the default. The default is 100.
    */
  var Limit: js.UndefOr[CosmosPageLimit] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The names of organization Config rules for which you want details. If you do not specify any names, Config returns details for all your organization Config rules.
    */
  var OrganizationConfigRuleNames: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.OrganizationConfigRuleNames] = js.undefined
}
object DescribeOrganizationConfigRulesRequest {
  
  inline def apply(): DescribeOrganizationConfigRulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationConfigRulesRequest]
  }
  
  extension [Self <: DescribeOrganizationConfigRulesRequest](x: Self) {
    
    inline def setLimit(value: CosmosPageLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOrganizationConfigRuleNames(value: OrganizationConfigRuleNames): Self = StObject.set(x, "OrganizationConfigRuleNames", value.asInstanceOf[js.Any])
    
    inline def setOrganizationConfigRuleNamesUndefined: Self = StObject.set(x, "OrganizationConfigRuleNames", js.undefined)
    
    inline def setOrganizationConfigRuleNamesVarargs(value: StringWithCharLimit64*): Self = StObject.set(x, "OrganizationConfigRuleNames", js.Array(value*))
  }
}
