package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupSourceStatelessRuleMatchAttributesDestinationPorts extends StObject {
  
  /**
    * The starting port value for the port range.
    */
  var FromPort: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ending port value for the port range.
    */
  var ToPort: js.UndefOr[Integer] = js.undefined
}
object RuleGroupSourceStatelessRuleMatchAttributesDestinationPorts {
  
  inline def apply(): RuleGroupSourceStatelessRuleMatchAttributesDestinationPorts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupSourceStatelessRuleMatchAttributesDestinationPorts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleGroupSourceStatelessRuleMatchAttributesDestinationPorts] (val x: Self) extends AnyVal {
    
    inline def setFromPort(value: Integer): Self = StObject.set(x, "FromPort", value.asInstanceOf[js.Any])
    
    inline def setFromPortUndefined: Self = StObject.set(x, "FromPort", js.undefined)
    
    inline def setToPort(value: Integer): Self = StObject.set(x, "ToPort", value.asInstanceOf[js.Any])
    
    inline def setToPortUndefined: Self = StObject.set(x, "ToPort", js.undefined)
  }
}
