package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDetails extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the cluster that hosts the task. 
    */
  var ClusterArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The containers that are associated with the task. 
    */
  var Containers: js.UndefOr[AwsEcsContainerDetailsList] = js.undefined
  
  /**
    * The Unix timestamp for the time when the task was created. More specifically, it's for the time when the task entered the PENDING state. 
    */
  var CreatedAt: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the task group that's associated with the task. 
    */
  var Group: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Unix timestamp for the time when the task started. More specifically, it's for the time when the task transitioned from the PENDING state to the RUNNING state. 
    */
  var StartedAt: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The tag specified when a task is started. If an Amazon ECS service started the task, the startedBy parameter contains the deployment ID of that service. 
    */
  var StartedBy: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN of the task definition that creates the task. 
    */
  var TaskDefinitionArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The version counter for the task. 
    */
  var Version: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Details about the data volume that is used in a task definition. 
    */
  var Volumes: js.UndefOr[AwsEcsTaskVolumeDetailsList] = js.undefined
}
object AwsEcsTaskDetails {
  
  inline def apply(): AwsEcsTaskDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDetails]
  }
  
  extension [Self <: AwsEcsTaskDetails](x: Self) {
    
    inline def setClusterArn(value: NonEmptyString): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    inline def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    inline def setContainers(value: AwsEcsContainerDetailsList): Self = StObject.set(x, "Containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "Containers", js.undefined)
    
    inline def setContainersVarargs(value: AwsEcsContainerDetails*): Self = StObject.set(x, "Containers", js.Array(value*))
    
    inline def setCreatedAt(value: NonEmptyString): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setGroup(value: NonEmptyString): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
    
    inline def setStartedAt(value: NonEmptyString): Self = StObject.set(x, "StartedAt", value.asInstanceOf[js.Any])
    
    inline def setStartedAtUndefined: Self = StObject.set(x, "StartedAt", js.undefined)
    
    inline def setStartedBy(value: NonEmptyString): Self = StObject.set(x, "StartedBy", value.asInstanceOf[js.Any])
    
    inline def setStartedByUndefined: Self = StObject.set(x, "StartedBy", js.undefined)
    
    inline def setTaskDefinitionArn(value: NonEmptyString): Self = StObject.set(x, "TaskDefinitionArn", value.asInstanceOf[js.Any])
    
    inline def setTaskDefinitionArnUndefined: Self = StObject.set(x, "TaskDefinitionArn", js.undefined)
    
    inline def setVersion(value: NonEmptyString): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
    
    inline def setVolumes(value: AwsEcsTaskVolumeDetailsList): Self = StObject.set(x, "Volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesUndefined: Self = StObject.set(x, "Volumes", js.undefined)
    
    inline def setVolumesVarargs(value: AwsEcsTaskVolumeDetails*): Self = StObject.set(x, "Volumes", js.Array(value*))
  }
}
