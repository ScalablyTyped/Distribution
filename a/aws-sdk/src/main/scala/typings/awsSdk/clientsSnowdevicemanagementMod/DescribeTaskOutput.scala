package typings.awsSdk.clientsSnowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTaskOutput extends StObject {
  
  /**
    * When the task was completed.
    */
  var completedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * When the CreateTask operation was called.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description provided of the task and managed devices.
    */
  var description: js.UndefOr[TaskDescriptionString] = js.undefined
  
  /**
    * When the state of the task was last updated.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current state of the task.
    */
  var state: js.UndefOr[TaskState] = js.undefined
  
  /**
    * Optional metadata that you assign to a resource. You can use tags to categorize a resource in different ways, such as by purpose, owner, or environment.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The managed devices that the task was sent to.
    */
  var targets: js.UndefOr[TargetList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the task.
    */
  var taskArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the task.
    */
  var taskId: js.UndefOr[String] = js.undefined
}
object DescribeTaskOutput {
  
  inline def apply(): DescribeTaskOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTaskOutput]
  }
  
  extension [Self <: DescribeTaskOutput](x: Self) {
    
    inline def setCompletedAt(value: js.Date): Self = StObject.set(x, "completedAt", value.asInstanceOf[js.Any])
    
    inline def setCompletedAtUndefined: Self = StObject.set(x, "completedAt", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDescription(value: TaskDescriptionString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setState(value: TaskState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTargets(value: TargetList): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    inline def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value*))
    
    inline def setTaskArn(value: String): Self = StObject.set(x, "taskArn", value.asInstanceOf[js.Any])
    
    inline def setTaskArnUndefined: Self = StObject.set(x, "taskArn", js.undefined)
    
    inline def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    inline def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
  }
}
