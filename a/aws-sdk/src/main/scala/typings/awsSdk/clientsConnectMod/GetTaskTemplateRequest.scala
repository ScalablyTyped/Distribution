package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTaskTemplateRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The system generated version of a task template that is associated with a task, when the task is created.
    */
  var SnapshotVersion: js.UndefOr[typings.awsSdk.clientsConnectMod.SnapshotVersion] = js.undefined
  
  /**
    * A unique identifier for the task template.
    */
  var TaskTemplateId: typings.awsSdk.clientsConnectMod.TaskTemplateId
}
object GetTaskTemplateRequest {
  
  inline def apply(InstanceId: InstanceId, TaskTemplateId: TaskTemplateId): GetTaskTemplateRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], TaskTemplateId = TaskTemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTaskTemplateRequest]
  }
  
  extension [Self <: GetTaskTemplateRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotVersion(value: SnapshotVersion): Self = StObject.set(x, "SnapshotVersion", value.asInstanceOf[js.Any])
    
    inline def setSnapshotVersionUndefined: Self = StObject.set(x, "SnapshotVersion", js.undefined)
    
    inline def setTaskTemplateId(value: TaskTemplateId): Self = StObject.set(x, "TaskTemplateId", value.asInstanceOf[js.Any])
  }
}
