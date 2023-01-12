package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcsTaskDetails extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the task.
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * The containers that's associated with the task.
    */
  var Containers: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.Containers] = js.undefined
  
  /**
    * The ARN of the task definition that creates the task.
    */
  var DefinitionArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the task group that's associated with the task.
    */
  var Group: js.UndefOr[String] = js.undefined
  
  /**
    * The Unix timestamp for the time when the task started.
    */
  var StartedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Contains the tag specified when a task is started.
    */
  var StartedBy: js.UndefOr[String] = js.undefined
  
  /**
    * The tags of the ECS Task.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.Tags] = js.undefined
  
  /**
    * The Unix timestamp for the time when the task was created.
    */
  var TaskCreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The version counter for the task.
    */
  var Version: js.UndefOr[String] = js.undefined
  
  /**
    * The list of data volume definitions for the task.
    */
  var Volumes: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.Volumes] = js.undefined
}
object EcsTaskDetails {
  
  inline def apply(): EcsTaskDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EcsTaskDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EcsTaskDetails] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setContainers(value: Containers): Self = StObject.set(x, "Containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "Containers", js.undefined)
    
    inline def setContainersVarargs(value: Container*): Self = StObject.set(x, "Containers", js.Array(value*))
    
    inline def setDefinitionArn(value: String): Self = StObject.set(x, "DefinitionArn", value.asInstanceOf[js.Any])
    
    inline def setDefinitionArnUndefined: Self = StObject.set(x, "DefinitionArn", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
    
    inline def setStartedAt(value: js.Date): Self = StObject.set(x, "StartedAt", value.asInstanceOf[js.Any])
    
    inline def setStartedAtUndefined: Self = StObject.set(x, "StartedAt", js.undefined)
    
    inline def setStartedBy(value: String): Self = StObject.set(x, "StartedBy", value.asInstanceOf[js.Any])
    
    inline def setStartedByUndefined: Self = StObject.set(x, "StartedBy", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTaskCreatedAt(value: js.Date): Self = StObject.set(x, "TaskCreatedAt", value.asInstanceOf[js.Any])
    
    inline def setTaskCreatedAtUndefined: Self = StObject.set(x, "TaskCreatedAt", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
    
    inline def setVolumes(value: Volumes): Self = StObject.set(x, "Volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesUndefined: Self = StObject.set(x, "Volumes", js.undefined)
    
    inline def setVolumesVarargs(value: Volume*): Self = StObject.set(x, "Volumes", js.Array(value*))
  }
}
