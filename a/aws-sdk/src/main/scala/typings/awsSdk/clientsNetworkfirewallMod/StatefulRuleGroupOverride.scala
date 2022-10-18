package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulRuleGroupOverride extends StObject {
  
  /**
    * The action that changes the rule group from DROP to ALERT. This only applies to managed rule groups.
    */
  var Action: js.UndefOr[OverrideAction] = js.undefined
}
object StatefulRuleGroupOverride {
  
  inline def apply(): StatefulRuleGroupOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulRuleGroupOverride]
  }
  
  extension [Self <: StatefulRuleGroupOverride](x: Self) {
    
    inline def setAction(value: OverrideAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
  }
}
