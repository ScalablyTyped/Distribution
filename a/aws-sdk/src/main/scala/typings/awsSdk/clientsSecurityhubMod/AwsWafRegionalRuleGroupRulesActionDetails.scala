package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsWafRegionalRuleGroupRulesActionDetails extends StObject {
  
  /**
    * Specifies the ByteMatchSet, IPSet, SqlInjectionMatchSet, XssMatchSet, RegexMatchSet, GeoMatchSet, and SizeConstraintSet objects that you want to add to a rule and, for each object, indicates whether you want to negate the settings.
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsWafRegionalRuleGroupRulesActionDetails {
  
  inline def apply(): AwsWafRegionalRuleGroupRulesActionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafRegionalRuleGroupRulesActionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsWafRegionalRuleGroupRulesActionDetails] (val x: Self) extends AnyVal {
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
