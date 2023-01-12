package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsWafRegionalRateBasedRuleDetails extends StObject {
  
  /**
    * The predicates to include in the rate-based rule.
    */
  var MatchPredicates: js.UndefOr[AwsWafRegionalRateBasedRuleMatchPredicateList] = js.undefined
  
  /**
    * The name of the metrics for the rate-based rule.
    */
  var MetricName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the rate-based rule.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The field that WAF uses to determine whether requests are likely arriving from single source and are subject to rate monitoring.
    */
  var RateKey: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The maximum number of requests that have an identical value for the field specified in RateKey that are allowed within a five-minute period. If the number of requests exceeds RateLimit and the other predicates specified in the rule are met, WAF triggers the action for the rule.
    */
  var RateLimit: js.UndefOr[Long] = js.undefined
  
  /**
    * The unique identifier for the rate-based rule.
    */
  var RuleId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsWafRegionalRateBasedRuleDetails {
  
  inline def apply(): AwsWafRegionalRateBasedRuleDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafRegionalRateBasedRuleDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsWafRegionalRateBasedRuleDetails] (val x: Self) extends AnyVal {
    
    inline def setMatchPredicates(value: AwsWafRegionalRateBasedRuleMatchPredicateList): Self = StObject.set(x, "MatchPredicates", value.asInstanceOf[js.Any])
    
    inline def setMatchPredicatesUndefined: Self = StObject.set(x, "MatchPredicates", js.undefined)
    
    inline def setMatchPredicatesVarargs(value: AwsWafRegionalRateBasedRuleMatchPredicate*): Self = StObject.set(x, "MatchPredicates", js.Array(value*))
    
    inline def setMetricName(value: NonEmptyString): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRateKey(value: NonEmptyString): Self = StObject.set(x, "RateKey", value.asInstanceOf[js.Any])
    
    inline def setRateKeyUndefined: Self = StObject.set(x, "RateKey", js.undefined)
    
    inline def setRateLimit(value: Long): Self = StObject.set(x, "RateLimit", value.asInstanceOf[js.Any])
    
    inline def setRateLimitUndefined: Self = StObject.set(x, "RateLimit", js.undefined)
    
    inline def setRuleId(value: NonEmptyString): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
    
    inline def setRuleIdUndefined: Self = StObject.set(x, "RuleId", js.undefined)
  }
}
