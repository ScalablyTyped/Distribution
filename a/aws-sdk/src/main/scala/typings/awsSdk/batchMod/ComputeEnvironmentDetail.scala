package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputeEnvironmentDetail extends js.Object {
  
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
  implicit class ComputeEnvironmentDetailOps[Self <: ComputeEnvironmentDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComputeEnvironmentArn(value: String): Self = this.set("computeEnvironmentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeEnvironmentName(value: String): Self = this.set("computeEnvironmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcsClusterArn(value: String): Self = this.set("ecsClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeResources(value: ComputeResource): Self = this.set("computeResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputeResources: Self = this.set("computeResources", js.undefined)
    
    @scala.inline
    def setServiceRole(value: String): Self = this.set("serviceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceRole: Self = this.set("serviceRole", js.undefined)
    
    @scala.inline
    def setState(value: CEState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStatus(value: CEStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusReason(value: String): Self = this.set("statusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusReason: Self = this.set("statusReason", js.undefined)
    
    @scala.inline
    def setTags(value: TagrisTagsMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setType(value: CEType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
