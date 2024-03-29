package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComplianceDetailsByConfigRuleRequest extends StObject {
  
  /**
    * Filters the results by compliance.  INSUFFICIENT_DATA is a valid ComplianceType that is returned when an Config rule cannot be evaluated. However, INSUFFICIENT_DATA cannot be used as a ComplianceType for filtering results.
    */
  var ComplianceTypes: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ComplianceTypes] = js.undefined
  
  /**
    * The name of the Config rule for which you want compliance information.
    */
  var ConfigRuleName: StringWithCharLimit64
  
  /**
    * The maximum number of evaluation results returned on each page. The default is 10. You cannot specify a number greater than 100. If you specify 0, Config uses the default.
    */
  var Limit: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.Limit] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.NextToken] = js.undefined
}
object GetComplianceDetailsByConfigRuleRequest {
  
  inline def apply(ConfigRuleName: StringWithCharLimit64): GetComplianceDetailsByConfigRuleRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComplianceDetailsByConfigRuleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetComplianceDetailsByConfigRuleRequest] (val x: Self) extends AnyVal {
    
    inline def setComplianceTypes(value: ComplianceTypes): Self = StObject.set(x, "ComplianceTypes", value.asInstanceOf[js.Any])
    
    inline def setComplianceTypesUndefined: Self = StObject.set(x, "ComplianceTypes", js.undefined)
    
    inline def setComplianceTypesVarargs(value: ComplianceType*): Self = StObject.set(x, "ComplianceTypes", js.Array(value*))
    
    inline def setConfigRuleName(value: StringWithCharLimit64): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
