package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeComplianceByConfigRuleResponse extends StObject {
  
  /**
    * Indicates whether each of the specified Config rules is compliant.
    */
  var ComplianceByConfigRules: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ComplianceByConfigRules] = js.undefined
  
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeComplianceByConfigRuleResponse {
  
  inline def apply(): DescribeComplianceByConfigRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComplianceByConfigRuleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeComplianceByConfigRuleResponse] (val x: Self) extends AnyVal {
    
    inline def setComplianceByConfigRules(value: ComplianceByConfigRules): Self = StObject.set(x, "ComplianceByConfigRules", value.asInstanceOf[js.Any])
    
    inline def setComplianceByConfigRulesUndefined: Self = StObject.set(x, "ComplianceByConfigRules", js.undefined)
    
    inline def setComplianceByConfigRulesVarargs(value: ComplianceByConfigRule*): Self = StObject.set(x, "ComplianceByConfigRules", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
