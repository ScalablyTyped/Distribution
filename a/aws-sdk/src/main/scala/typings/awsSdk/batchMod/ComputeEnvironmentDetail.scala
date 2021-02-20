package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputeEnvironmentDetail extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the compute environment.
    */
  var computeEnvironmentArn: String = js.native
  
  /**
    * The name of the compute environment.
    */
  var computeEnvironmentName: String = js.native
  
  /**
    * The compute resources defined for the compute environment.
    */
  var computeResources: js.UndefOr[ComputeResource] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the underlying Amazon ECS cluster used by the compute environment.
    */
  var ecsClusterArn: String = js.native
  
  /**
    * The service role associated with the compute environment that allows AWS Batch to make calls to AWS API operations on your behalf.
    */
  var serviceRole: js.UndefOr[String] = js.native
  
  /**
    * The state of the compute environment. The valid values are ENABLED or DISABLED. If the state is ENABLED, then the AWS Batch scheduler can attempt to place jobs from an associated job queue on the compute resources within the environment. If the compute environment is managed, then it can scale its instances out or in automatically, based on the job queue demand. If the state is DISABLED, then the AWS Batch scheduler does not attempt to place jobs within the environment. Jobs in a STARTING or RUNNING state continue to progress normally. Managed compute environments in the DISABLED state do not scale out. However, they scale in to minvCpus value after instances become idle.
    */
  var state: js.UndefOr[CEState] = js.native
  
  /**
    * The current status of the compute environment (for example, CREATING or VALID).
    */
  var status: js.UndefOr[CEStatus] = js.native
  
  /**
    * A short, human-readable string to provide additional details about the current status of the compute environment.
    */
  var statusReason: js.UndefOr[String] = js.native
  
  /**
    * The tags applied to the compute environment.
    */
  var tags: js.UndefOr[TagrisTagsMap] = js.native
  
  /**
    * The type of the compute environment.
    */
  var `type`: js.UndefOr[CEType] = js.native
}
object ComputeEnvironmentDetail {
  
  @scala.inline
  def apply(computeEnvironmentArn: String, computeEnvironmentName: String, ecsClusterArn: String): ComputeEnvironmentDetail = {
    val __obj = js.Dynamic.literal(computeEnvironmentArn = computeEnvironmentArn.asInstanceOf[js.Any], computeEnvironmentName = computeEnvironmentName.asInstanceOf[js.Any], ecsClusterArn = ecsClusterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeEnvironmentDetail]
  }
  
  @scala.inline
  implicit class ComputeEnvironmentDetailMutableBuilder[Self <: ComputeEnvironmentDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputeEnvironmentArn(value: String): Self = StObject.set(x, "computeEnvironmentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeEnvironmentName(value: String): Self = StObject.set(x, "computeEnvironmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeResources(value: ComputeResource): Self = StObject.set(x, "computeResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeResourcesUndefined: Self = StObject.set(x, "computeResources", js.undefined)
    
    @scala.inline
    def setEcsClusterArn(value: String): Self = StObject.set(x, "ecsClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRole(value: String): Self = StObject.set(x, "serviceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRoleUndefined: Self = StObject.set(x, "serviceRole", js.undefined)
    
    @scala.inline
    def setState(value: CEState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setStatus(value: CEStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTags(value: TagrisTagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setType(value: CEType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
