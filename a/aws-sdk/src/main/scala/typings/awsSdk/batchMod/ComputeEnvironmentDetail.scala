package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputeEnvironmentDetail extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the compute environment.
    */
  var computeEnvironmentArn: String
  
  /**
    * The name of the compute environment.
    */
  var computeEnvironmentName: String
  
  /**
    * The compute resources defined for the compute environment.
    */
  var computeResources: js.UndefOr[ComputeResource] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the underlying Amazon ECS cluster used by the compute environment.
    */
  var ecsClusterArn: String
  
  /**
    * The service role associated with the compute environment that allows AWS Batch to make calls to AWS API operations on your behalf.
    */
  var serviceRole: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the compute environment. The valid values are ENABLED or DISABLED. If the state is ENABLED, then the AWS Batch scheduler can attempt to place jobs from an associated job queue on the compute resources within the environment. If the compute environment is managed, then it can scale its instances out or in automatically, based on the job queue demand. If the state is DISABLED, then the AWS Batch scheduler does not attempt to place jobs within the environment. Jobs in a STARTING or RUNNING state continue to progress normally. Managed compute environments in the DISABLED state do not scale out. However, they scale in to minvCpus value after instances become idle.
    */
  var state: js.UndefOr[CEState] = js.undefined
  
  /**
    * The current status of the compute environment (for example, CREATING or VALID).
    */
  var status: js.UndefOr[CEStatus] = js.undefined
  
  /**
    * A short, human-readable string to provide additional details about the current status of the compute environment.
    */
  var statusReason: js.UndefOr[String] = js.undefined
  
  /**
    * The tags applied to the compute environment.
    */
  var tags: js.UndefOr[TagrisTagsMap] = js.undefined
  
  /**
    * The type of the compute environment.
    */
  var `type`: js.UndefOr[CEType] = js.undefined
}
object ComputeEnvironmentDetail {
  
  inline def apply(computeEnvironmentArn: String, computeEnvironmentName: String, ecsClusterArn: String): ComputeEnvironmentDetail = {
    val __obj = js.Dynamic.literal(computeEnvironmentArn = computeEnvironmentArn.asInstanceOf[js.Any], computeEnvironmentName = computeEnvironmentName.asInstanceOf[js.Any], ecsClusterArn = ecsClusterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeEnvironmentDetail]
  }
  
  extension [Self <: ComputeEnvironmentDetail](x: Self) {
    
    inline def setComputeEnvironmentArn(value: String): Self = StObject.set(x, "computeEnvironmentArn", value.asInstanceOf[js.Any])
    
    inline def setComputeEnvironmentName(value: String): Self = StObject.set(x, "computeEnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setComputeResources(value: ComputeResource): Self = StObject.set(x, "computeResources", value.asInstanceOf[js.Any])
    
    inline def setComputeResourcesUndefined: Self = StObject.set(x, "computeResources", js.undefined)
    
    inline def setEcsClusterArn(value: String): Self = StObject.set(x, "ecsClusterArn", value.asInstanceOf[js.Any])
    
    inline def setServiceRole(value: String): Self = StObject.set(x, "serviceRole", value.asInstanceOf[js.Any])
    
    inline def setServiceRoleUndefined: Self = StObject.set(x, "serviceRole", js.undefined)
    
    inline def setState(value: CEState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatus(value: CEStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: TagrisTagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: CEType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
