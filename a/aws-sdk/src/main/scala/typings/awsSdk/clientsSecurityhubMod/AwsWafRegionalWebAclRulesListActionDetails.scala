package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsWafRegionalWebAclRulesListActionDetails extends StObject {
  
  /**
    * For actions that are associated with a rule, the action that WAF takes when a web request matches all conditions in a rule. 
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsWafRegionalWebAclRulesListActionDetails {
  
  inline def apply(): AwsWafRegionalWebAclRulesListActionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafRegionalWebAclRulesListActionDetails]
  }
  
  extension [Self <: AwsWafRegionalWebAclRulesListActionDetails](x: Self) {
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
