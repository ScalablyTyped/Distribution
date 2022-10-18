package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsWafRegionalWebAclDetails extends StObject {
  
  /**
    * The action to perform if none of the rules contained in the web ACL match. 
    */
  var DefaultAction: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A name for the metrics for this web ACL. 
    */
  var MetricName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A descriptive name for the web ACL. 
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * An array that contains the action for each rule in a web ACL, the priority of the rule, and the ID of the rule. 
    */
  var RulesList: js.UndefOr[AwsWafRegionalWebAclRulesList] = js.undefined
  
  /**
    * The ID of the web ACL. 
    */
  var WebAclId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsWafRegionalWebAclDetails {
  
  inline def apply(): AwsWafRegionalWebAclDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafRegionalWebAclDetails]
  }
  
  extension [Self <: AwsWafRegionalWebAclDetails](x: Self) {
    
    inline def setDefaultAction(value: NonEmptyString): Self = StObject.set(x, "DefaultAction", value.asInstanceOf[js.Any])
    
    inline def setDefaultActionUndefined: Self = StObject.set(x, "DefaultAction", js.undefined)
    
    inline def setMetricName(value: NonEmptyString): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRulesList(value: AwsWafRegionalWebAclRulesList): Self = StObject.set(x, "RulesList", value.asInstanceOf[js.Any])
    
    inline def setRulesListUndefined: Self = StObject.set(x, "RulesList", js.undefined)
    
    inline def setRulesListVarargs(value: AwsWafRegionalWebAclRulesListDetails*): Self = StObject.set(x, "RulesList", js.Array(value*))
    
    inline def setWebAclId(value: NonEmptyString): Self = StObject.set(x, "WebAclId", value.asInstanceOf[js.Any])
    
    inline def setWebAclIdUndefined: Self = StObject.set(x, "WebAclId", js.undefined)
  }
}
