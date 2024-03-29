package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupSourceStatelessRuleMatchAttributesDestinations extends StObject {
  
  /**
    * An IP address or a block of IP addresses.
    */
  var AddressDefinition: js.UndefOr[NonEmptyString] = js.undefined
}
object RuleGroupSourceStatelessRuleMatchAttributesDestinations {
  
  inline def apply(): RuleGroupSourceStatelessRuleMatchAttributesDestinations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupSourceStatelessRuleMatchAttributesDestinations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleGroupSourceStatelessRuleMatchAttributesDestinations] (val x: Self) extends AnyVal {
    
    inline def setAddressDefinition(value: NonEmptyString): Self = StObject.set(x, "AddressDefinition", value.asInstanceOf[js.Any])
    
    inline def setAddressDefinitionUndefined: Self = StObject.set(x, "AddressDefinition", js.undefined)
  }
}
