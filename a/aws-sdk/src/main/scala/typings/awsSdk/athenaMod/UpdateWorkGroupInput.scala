package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkGroupInput extends StObject {
  
  /**
    * The workgroup configuration that will be updated for the given workgroup.
    */
  var ConfigurationUpdates: js.UndefOr[WorkGroupConfigurationUpdates] = js.undefined
  
  /**
    * The workgroup description.
    */
  var Description: js.UndefOr[WorkGroupDescriptionString] = js.undefined
  
  /**
    * The workgroup state that will be updated for the given workgroup.
    */
  var State: js.UndefOr[WorkGroupState] = js.undefined
  
  /**
    * The specified workgroup that will be updated.
    */
  var WorkGroup: WorkGroupName
}
object UpdateWorkGroupInput {
  
  inline def apply(WorkGroup: WorkGroupName): UpdateWorkGroupInput = {
    val __obj = js.Dynamic.literal(WorkGroup = WorkGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkGroupInput]
  }
  
  extension [Self <: UpdateWorkGroupInput](x: Self) {
    
    inline def setConfigurationUpdates(value: WorkGroupConfigurationUpdates): Self = StObject.set(x, "ConfigurationUpdates", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUpdatesUndefined: Self = StObject.set(x, "ConfigurationUpdates", js.undefined)
    
    inline def setDescription(value: WorkGroupDescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setState(value: WorkGroupState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setWorkGroup(value: WorkGroupName): Self = StObject.set(x, "WorkGroup", value.asInstanceOf[js.Any])
  }
}
