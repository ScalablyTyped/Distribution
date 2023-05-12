package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConfigRulesRequest extends StObject {
  
  /**
    * The names of the Config rules for which you want details. If you do not specify any names, Config returns details for all your rules.
    */
  var ConfigRuleNames: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ConfigRuleNames] = js.undefined
  
  /**
    * Returns a list of Detective or Proactive Config rules. By default, this API returns an unfiltered list. For more information on Detective or Proactive Config rules, see  Evaluation Mode  in the Config Developer Guide.
    */
  var Filters: js.UndefOr[DescribeConfigRulesFilters] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeConfigRulesRequest {
  
  inline def apply(): DescribeConfigRulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigRulesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeConfigRulesRequest] (val x: Self) extends AnyVal {
    
    inline def setConfigRuleNames(value: ConfigRuleNames): Self = StObject.set(x, "ConfigRuleNames", value.asInstanceOf[js.Any])
    
    inline def setConfigRuleNamesUndefined: Self = StObject.set(x, "ConfigRuleNames", js.undefined)
    
    inline def setConfigRuleNamesVarargs(value: ConfigRuleName*): Self = StObject.set(x, "ConfigRuleNames", js.Array(value*))
    
    inline def setFilters(value: DescribeConfigRulesFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
