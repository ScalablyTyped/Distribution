package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsWafRegionalWebAclRulesListOverrideActionDetails extends StObject {
  
  /**
    * Overrides the rule evaluation result in the rule group. 
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsWafRegionalWebAclRulesListOverrideActionDetails {
  
  inline def apply(): AwsWafRegionalWebAclRulesListOverrideActionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafRegionalWebAclRulesListOverrideActionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsWafRegionalWebAclRulesListOverrideActionDetails] (val x: Self) extends AnyVal {
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
