package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunListItem extends StObject {
  
  /**
    * The run's ARN.
    */
  var arn: js.UndefOr[RunArn] = js.undefined
  
  /**
    * When the run was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The run's ID.
    */
  var id: js.UndefOr[RunId] = js.undefined
  
  /**
    * The run's name.
    */
  var name: js.UndefOr[RunName] = js.undefined
  
  /**
    * The run's priority.
    */
  var priority: js.UndefOr[RunListItemPriorityInteger] = js.undefined
  
  /**
    * When the run started.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The run's status.
    */
  var status: js.UndefOr[RunStatus] = js.undefined
  
  /**
    * When the run stopped.
    */
  var stopTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The run's storage capacity.
    */
  var storageCapacity: js.UndefOr[RunListItemStorageCapacityInteger] = js.undefined
  
  /**
    * The run's workflow ID.
    */
  var workflowId: js.UndefOr[WorkflowId] = js.undefined
}
object RunListItem {
  
  inline def apply(): RunListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RunListItem] (val x: Self) extends AnyVal {
    
    inline def setArn(value: RunArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setId(value: RunId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: RunName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPriority(value: RunListItemPriorityInteger): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: RunStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStopTime(value: js.Date): Self = StObject.set(x, "stopTime", value.asInstanceOf[js.Any])
    
    inline def setStopTimeUndefined: Self = StObject.set(x, "stopTime", js.undefined)
    
    inline def setStorageCapacity(value: RunListItemStorageCapacityInteger): Self = StObject.set(x, "storageCapacity", value.asInstanceOf[js.Any])
    
    inline def setStorageCapacityUndefined: Self = StObject.set(x, "storageCapacity", js.undefined)
    
    inline def setWorkflowId(value: WorkflowId): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
    
    inline def setWorkflowIdUndefined: Self = StObject.set(x, "workflowId", js.undefined)
  }
}
