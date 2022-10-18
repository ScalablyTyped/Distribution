package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsWafRuleDetails extends StObject {
  
  /**
    * The name of the metrics for this rule. 
    */
  var MetricName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A descriptive name for the rule. 
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Specifies the ByteMatchSet, IPSet, SqlInjectionMatchSet, XssMatchSet, RegexMatchSet, GeoMatchSet, and SizeConstraintSet objects that you want to add to a rule and, for each object, indicates whether you want to negate the settings. 
    */
  var PredicateList: js.UndefOr[AwsWafRulePredicateList] = js.undefined
  
  /**
    * The ID of the WAF rule. 
    */
  var RuleId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsWafRuleDetails {
  
  inline def apply(): AwsWafRuleDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafRuleDetails]
  }
  
  extension [Self <: AwsWafRuleDetails](x: Self) {
    
    inline def setMetricName(value: NonEmptyString): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPredicateList(value: AwsWafRulePredicateList): Self = StObject.set(x, "PredicateList", value.asInstanceOf[js.Any])
    
    inline def setPredicateListUndefined: Self = StObject.set(x, "PredicateList", js.undefined)
    
    inline def setPredicateListVarargs(value: AwsWafRulePredicateListDetails*): Self = StObject.set(x, "PredicateList", js.Array(value*))
    
    inline def setRuleId(value: NonEmptyString): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
    
    inline def setRuleIdUndefined: Self = StObject.set(x, "RuleId", js.undefined)
  }
}
