package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcsClusterDetails extends StObject {
  
  /**
    * The number of services that are running on the cluster in an ACTIVE state.
    */
  var ActiveServicesCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that identifies the cluster.
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the ECS Cluster.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The number of container instances registered into the cluster.
    */
  var RegisteredContainerInstancesCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of tasks in the cluster that are in the RUNNING state.
    */
  var RunningTasksCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The status of the ECS cluster.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The tags of the ECS Cluster.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.Tags] = js.undefined
  
  /**
    * Contains information about the details of the ECS Task.
    */
  var TaskDetails: js.UndefOr[EcsTaskDetails] = js.undefined
}
object EcsClusterDetails {
  
  inline def apply(): EcsClusterDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EcsClusterDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EcsClusterDetails] (val x: Self) extends AnyVal {
    
    inline def setActiveServicesCount(value: Integer): Self = StObject.set(x, "ActiveServicesCount", value.asInstanceOf[js.Any])
    
    inline def setActiveServicesCountUndefined: Self = StObject.set(x, "ActiveServicesCount", js.undefined)
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRegisteredContainerInstancesCount(value: Integer): Self = StObject.set(x, "RegisteredContainerInstancesCount", value.asInstanceOf[js.Any])
    
    inline def setRegisteredContainerInstancesCountUndefined: Self = StObject.set(x, "RegisteredContainerInstancesCount", js.undefined)
    
    inline def setRunningTasksCount(value: Integer): Self = StObject.set(x, "RunningTasksCount", value.asInstanceOf[js.Any])
    
    inline def setRunningTasksCountUndefined: Self = StObject.set(x, "RunningTasksCount", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTaskDetails(value: EcsTaskDetails): Self = StObject.set(x, "TaskDetails", value.asInstanceOf[js.Any])
    
    inline def setTaskDetailsUndefined: Self = StObject.set(x, "TaskDetails", js.undefined)
  }
}
