package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallPolicyStatelessCustomActionsDetails extends StObject {
  
  /**
    * The definition of the custom action.
    */
  var ActionDefinition: js.UndefOr[StatelessCustomActionDefinition] = js.undefined
  
  /**
    * The name of the custom action.
    */
  var ActionName: js.UndefOr[NonEmptyString] = js.undefined
}
object FirewallPolicyStatelessCustomActionsDetails {
  
  inline def apply(): FirewallPolicyStatelessCustomActionsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirewallPolicyStatelessCustomActionsDetails]
  }
  
  extension [Self <: FirewallPolicyStatelessCustomActionsDetails](x: Self) {
    
    inline def setActionDefinition(value: StatelessCustomActionDefinition): Self = StObject.set(x, "ActionDefinition", value.asInstanceOf[js.Any])
    
    inline def setActionDefinitionUndefined: Self = StObject.set(x, "ActionDefinition", js.undefined)
    
    inline def setActionName(value: NonEmptyString): Self = StObject.set(x, "ActionName", value.asInstanceOf[js.Any])
    
    inline def setActionNameUndefined: Self = StObject.set(x, "ActionName", js.undefined)
  }
}
