package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScpActionDefinition extends StObject {
  
  /**
    * The policy ID attached. 
    */
  var PolicyId: typings.awsSdk.clientsBudgetsMod.PolicyId
  
  /**
    * A list of target IDs. 
    */
  var TargetIds: typings.awsSdk.clientsBudgetsMod.TargetIds
}
object ScpActionDefinition {
  
  inline def apply(PolicyId: PolicyId, TargetIds: TargetIds): ScpActionDefinition = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId.asInstanceOf[js.Any], TargetIds = TargetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScpActionDefinition]
  }
  
  extension [Self <: ScpActionDefinition](x: Self) {
    
    inline def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    inline def setTargetIds(value: TargetIds): Self = StObject.set(x, "TargetIds", value.asInstanceOf[js.Any])
    
    inline def setTargetIdsVarargs(value: TargetId*): Self = StObject.set(x, "TargetIds", js.Array(value*))
  }
}
