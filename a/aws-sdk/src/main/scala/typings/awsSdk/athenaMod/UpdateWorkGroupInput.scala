package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateWorkGroupInput extends StObject {
  
  /**
    * The workgroup configuration that will be updated for the given workgroup.
    */
  var ConfigurationUpdates: js.UndefOr[WorkGroupConfigurationUpdates] = js.native
  
  /**
    * The workgroup description.
    */
  var Description: js.UndefOr[WorkGroupDescriptionString] = js.native
  
  /**
    * The workgroup state that will be updated for the given workgroup.
    */
  var State: js.UndefOr[WorkGroupState] = js.native
  
  /**
    * The specified workgroup that will be updated.
    */
  var WorkGroup: WorkGroupName = js.native
}
object UpdateWorkGroupInput {
  
  @scala.inline
  def apply(WorkGroup: WorkGroupName): UpdateWorkGroupInput = {
    val __obj = js.Dynamic.literal(WorkGroup = WorkGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkGroupInput]
  }
  
  @scala.inline
  implicit class UpdateWorkGroupInputMutableBuilder[Self <: UpdateWorkGroupInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationUpdates(value: WorkGroupConfigurationUpdates): Self = StObject.set(x, "ConfigurationUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUpdatesUndefined: Self = StObject.set(x, "ConfigurationUpdates", js.undefined)
    
    @scala.inline
    def setDescription(value: WorkGroupDescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setState(value: WorkGroupState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setWorkGroup(value: WorkGroupName): Self = StObject.set(x, "WorkGroup", value.asInstanceOf[js.Any])
  }
}
