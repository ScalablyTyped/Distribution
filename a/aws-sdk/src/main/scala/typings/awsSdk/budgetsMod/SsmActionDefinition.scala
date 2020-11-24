package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SsmActionDefinition extends js.Object {
  
  /**
    *  The action subType. 
    */
  var ActionSubType: typings.awsSdk.budgetsMod.ActionSubType = js.native
  
  /**
    *  The EC2 and RDS instance IDs. 
    */
  var InstanceIds: typings.awsSdk.budgetsMod.InstanceIds = js.native
  
  /**
    *  The Region to run the SSM document. 
    */
  var Region: typings.awsSdk.budgetsMod.Region = js.native
}
object SsmActionDefinition {
  
  @scala.inline
  def apply(ActionSubType: ActionSubType, InstanceIds: InstanceIds, Region: Region): SsmActionDefinition = {
    val __obj = js.Dynamic.literal(ActionSubType = ActionSubType.asInstanceOf[js.Any], InstanceIds = InstanceIds.asInstanceOf[js.Any], Region = Region.asInstanceOf[js.Any])
    __obj.asInstanceOf[SsmActionDefinition]
  }
  
  @scala.inline
  implicit class SsmActionDefinitionOps[Self <: SsmActionDefinition] (val x: Self) extends AnyVal {
    
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
    def setActionSubType(value: ActionSubType): Self = this.set("ActionSubType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdsVarargs(value: InstanceId*): Self = this.set("InstanceIds", js.Array(value :_*))
    
    @scala.inline
    def setInstanceIds(value: InstanceIds): Self = this.set("InstanceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: Region): Self = this.set("Region", value.asInstanceOf[js.Any])
  }
}
