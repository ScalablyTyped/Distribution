package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsWafRateBasedRuleMatchPredicate extends StObject {
  
  /**
    * The unique identifier for the predicate.
    */
  var DataId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * If set to true, then the rule actions are performed on requests that match the predicate settings. If set to false, then the rule actions are performed on all requests except those that match the predicate settings. 
    */
  var Negated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of predicate. Valid values are as follows:    ByteMatch     GeoMatch     IPMatch     RegexMatch     SizeConstraint     SqlInjectionMatch     XssMatch   
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsWafRateBasedRuleMatchPredicate {
  
  inline def apply(): AwsWafRateBasedRuleMatchPredicate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafRateBasedRuleMatchPredicate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsWafRateBasedRuleMatchPredicate] (val x: Self) extends AnyVal {
    
    inline def setDataId(value: NonEmptyString): Self = StObject.set(x, "DataId", value.asInstanceOf[js.Any])
    
    inline def setDataIdUndefined: Self = StObject.set(x, "DataId", js.undefined)
    
    inline def setNegated(value: Boolean): Self = StObject.set(x, "Negated", value.asInstanceOf[js.Any])
    
    inline def setNegatedUndefined: Self = StObject.set(x, "Negated", js.undefined)
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
