package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScpActionDefinition extends js.Object {
  
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
  implicit class ScpActionDefinitionOps[Self <: ScpActionDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPolicyId(value: PolicyId): Self = this.set("PolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdsVarargs(value: TargetId*): Self = this.set("TargetIds", js.Array(value :_*))
    
    @scala.inline
    def setTargetIds(value: TargetIds): Self = this.set("TargetIds", value.asInstanceOf[js.Any])
  }
}
