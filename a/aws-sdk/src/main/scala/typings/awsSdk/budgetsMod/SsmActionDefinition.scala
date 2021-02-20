package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SsmActionDefinition extends StObject {
  
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
  implicit class SsmActionDefinitionMutableBuilder[Self <: SsmActionDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionSubType(value: ActionSubType): Self = StObject.set(x, "ActionSubType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIds(value: InstanceIds): Self = StObject.set(x, "InstanceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdsVarargs(value: InstanceId*): Self = StObject.set(x, "InstanceIds", js.Array(value :_*))
    
    @scala.inline
    def setRegion(value: Region): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
  }
}
