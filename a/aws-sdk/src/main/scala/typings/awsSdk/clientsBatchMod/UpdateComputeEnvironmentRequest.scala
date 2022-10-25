package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateComputeEnvironmentRequest extends StObject {
  
  /**
    * The name or full Amazon Resource Name (ARN) of the compute environment to update.
    */
  var computeEnvironment: String
  
  /**
    * Details of the compute resources managed by the compute environment. Required for a managed compute environment. For more information, see Compute Environments in the Batch User Guide.
    */
  var computeResources: js.UndefOr[ComputeResourceUpdate] = js.undefined
  
  /**
    * The full Amazon Resource Name (ARN) of the IAM role that allows Batch to make calls to other Amazon Web Services services on your behalf. For more information, see Batch service IAM role in the Batch User Guide.  If the compute environment has a service-linked role, it can't be changed to use a regular IAM role. Likewise, if the compute environment has a regular IAM role, it can't be changed to use a service-linked role. To update the parameters for the compute environment that require an infrastructure update to change, the AWSServiceRoleForBatch service-linked role must be used. For more information, see Updating compute environments in the Batch User Guide.  If your specified role has a path other than /, then you must either specify the full role ARN (recommended) or prefix the role name with the path.  Depending on how you created your Batch service role, its ARN might contain the service-role path prefix. When you only specify the name of the service role, Batch assumes that your ARN doesn't use the service-role path prefix. Because of this, we recommend that you specify the full ARN of your service role when you create compute environments. 
    */
  var serviceRole: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the compute environment. Compute environments in the ENABLED state can accept jobs from a queue and scale in or out automatically based on the workload demand of its associated queues. If the state is ENABLED, then the Batch scheduler can attempt to place jobs from an associated job queue on the compute resources within the environment. If the compute environment is managed, then it can scale its instances out or in automatically, based on the job queue demand. If the state is DISABLED, then the Batch scheduler doesn't attempt to place jobs within the environment. Jobs in a STARTING or RUNNING state continue to progress normally. Managed compute environments in the DISABLED state don't scale out. However, they scale in to minvCpus value after instances become idle.
    */
  var state: js.UndefOr[CEState] = js.undefined
  
  /**
    * The maximum number of vCPUs expected to be used for an unmanaged compute environment. Don't specify this parameter for a managed compute environment. This parameter is only used for fair share scheduling to reserve vCPU capacity for new share identifiers. If this parameter isn't provided for a fair share job queue, no vCPU capacity is reserved.
    */
  var unmanagedvCpus: js.UndefOr[Integer] = js.undefined
  
  /**
    * Specifies the updated infrastructure update policy for the compute environment. For more information about infrastructure updates, see Updating compute environments in the Batch User Guide.
    */
  var updatePolicy: js.UndefOr[UpdatePolicy] = js.undefined
}
object UpdateComputeEnvironmentRequest {
  
  inline def apply(computeEnvironment: String): UpdateComputeEnvironmentRequest = {
    val __obj = js.Dynamic.literal(computeEnvironment = computeEnvironment.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateComputeEnvironmentRequest]
  }
  
  extension [Self <: UpdateComputeEnvironmentRequest](x: Self) {
    
    inline def setComputeEnvironment(value: String): Self = StObject.set(x, "computeEnvironment", value.asInstanceOf[js.Any])
    
    inline def setComputeResources(value: ComputeResourceUpdate): Self = StObject.set(x, "computeResources", value.asInstanceOf[js.Any])
    
    inline def setComputeResourcesUndefined: Self = StObject.set(x, "computeResources", js.undefined)
    
    inline def setServiceRole(value: String): Self = StObject.set(x, "serviceRole", value.asInstanceOf[js.Any])
    
    inline def setServiceRoleUndefined: Self = StObject.set(x, "serviceRole", js.undefined)
    
    inline def setState(value: CEState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUnmanagedvCpus(value: Integer): Self = StObject.set(x, "unmanagedvCpus", value.asInstanceOf[js.Any])
    
    inline def setUnmanagedvCpusUndefined: Self = StObject.set(x, "unmanagedvCpus", js.undefined)
    
    inline def setUpdatePolicy(value: UpdatePolicy): Self = StObject.set(x, "updatePolicy", value.asInstanceOf[js.Any])
    
    inline def setUpdatePolicyUndefined: Self = StObject.set(x, "updatePolicy", js.undefined)
  }
}
