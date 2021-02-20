package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScpActionDefinition extends StObject {
  
  /**
    *  The policy ID attached. 
    */
  var PolicyId: typings.awsSdk.budgetsMod.PolicyId = js.native
  
  /**
    *  A list of target IDs. 
    */
  var TargetIds: typings.awsSdk.budgetsMod.TargetIds = js.native
}
object ScpActionDefinition {
  
  @scala.inline
  def apply(PolicyId: PolicyId, TargetIds: TargetIds): ScpActionDefinition = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId.asInstanceOf[js.Any], TargetIds = TargetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScpActionDefinition]
  }
  
  @scala.inline
  implicit class ScpActionDefinitionMutableBuilder[Self <: ScpActionDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIds(value: TargetIds): Self = StObject.set(x, "TargetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdsVarargs(value: TargetId*): Self = StObject.set(x, "TargetIds", js.Array(value :_*))
  }
}
