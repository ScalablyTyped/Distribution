package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsWafRuleGroupRulesActionDetails extends StObject {
  
  /**
    * The action that WAF should take on a web request when it matches the rule's statement.
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsWafRuleGroupRulesActionDetails {
  
  inline def apply(): AwsWafRuleGroupRulesActionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafRuleGroupRulesActionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsWafRuleGroupRulesActionDetails] (val x: Self) extends AnyVal {
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
