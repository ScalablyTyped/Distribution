package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceRootVolumeTask extends StObject {
  
  /**
    * The time the task completed.
    */
  var CompleteTime: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the original root volume is to be deleted after the root volume replacement task completes.
    */
  var DeleteReplacedRootVolume: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the AMI used to create the replacement root volume.
    */
  var ImageId: js.UndefOr[typings.awsSdk.clientsEc2Mod.ImageId] = js.undefined
  
  /**
    * The ID of the instance for which the root volume replacement task was created.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the root volume replacement task.
    */
  var ReplaceRootVolumeTaskId: js.UndefOr[typings.awsSdk.clientsEc2Mod.ReplaceRootVolumeTaskId] = js.undefined
  
  /**
    * The ID of the snapshot used to create the replacement root volume.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.clientsEc2Mod.SnapshotId] = js.undefined
  
  /**
    * The time the task was started.
    */
  var StartTime: js.UndefOr[String] = js.undefined
  
  /**
    * The tags assigned to the task.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The state of the task. The task can be in one of the following states:    pending - the replacement volume is being created.    in-progress - the original volume is being detached and the replacement volume is being attached.    succeeded - the replacement volume has been successfully attached to the instance and the instance is available.    failing - the replacement task is in the process of failing.    failed - the replacement task has failed but the original root volume is still attached.    failing-detached - the replacement task is in the process of failing. The instance might have no root volume attached.    failed-detached - the replacement task has failed and the instance has no root volume attached.  
    */
  var TaskState: js.UndefOr[ReplaceRootVolumeTaskState] = js.undefined
}
object ReplaceRootVolumeTask {
  
  inline def apply(): ReplaceRootVolumeTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceRootVolumeTask]
  }
  
  extension [Self <: ReplaceRootVolumeTask](x: Self) {
    
    inline def setCompleteTime(value: String): Self = StObject.set(x, "CompleteTime", value.asInstanceOf[js.Any])
    
    inline def setCompleteTimeUndefined: Self = StObject.set(x, "CompleteTime", js.undefined)
    
    inline def setDeleteReplacedRootVolume(value: Boolean): Self = StObject.set(x, "DeleteReplacedRootVolume", value.asInstanceOf[js.Any])
    
    inline def setDeleteReplacedRootVolumeUndefined: Self = StObject.set(x, "DeleteReplacedRootVolume", js.undefined)
    
    inline def setImageId(value: ImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setReplaceRootVolumeTaskId(value: ReplaceRootVolumeTaskId): Self = StObject.set(x, "ReplaceRootVolumeTaskId", value.asInstanceOf[js.Any])
    
    inline def setReplaceRootVolumeTaskIdUndefined: Self = StObject.set(x, "ReplaceRootVolumeTaskId", js.undefined)
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTaskState(value: ReplaceRootVolumeTaskState): Self = StObject.set(x, "TaskState", value.asInstanceOf[js.Any])
    
    inline def setTaskStateUndefined: Self = StObject.set(x, "TaskState", js.undefined)
  }
}
