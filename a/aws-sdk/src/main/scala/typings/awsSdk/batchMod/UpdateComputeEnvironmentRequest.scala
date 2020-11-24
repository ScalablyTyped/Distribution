package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateComputeEnvironmentRequest extends js.Object {
  
  /**
    * The name or full Amazon Resource Name (ARN) of the compute environment to update.
    */
  var computeEnvironment: String = js.native
  
  /**
    * Details of the compute resources managed by the compute environment. Required for a managed compute environment.
    */
  var computeResources: js.UndefOr[ComputeResourceUpdate] = js.native
  
  /**
    * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf. If your specified role has a path other than /, then you must either specify the full role ARN (this is recommended) or prefix the role name with the path.  Depending on how you created your AWS Batch service role, its ARN may contain the service-role path prefix. When you only specify the name of the service role, AWS Batch assumes that your ARN does not use the service-role path prefix. Because of this, we recommend that you specify the full ARN of your service role when you create compute environments. 
    */
  var serviceRole: js.UndefOr[String] = js.native
  
  /**
    * The state of the compute environment. Compute environments in the ENABLED state can accept jobs from a queue and scale in or out automatically based on the workload demand of its associated queues.
    */
  var state: js.UndefOr[CEState] = js.native
}
object UpdateComputeEnvironmentRequest {
  
  @scala.inline
  def apply(computeEnvironment: String): UpdateComputeEnvironmentRequest = {
    val __obj = js.Dynamic.literal(computeEnvironment = computeEnvironment.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateComputeEnvironmentRequest]
  }
  
  @scala.inline
  implicit class UpdateComputeEnvironmentRequestOps[Self <: UpdateComputeEnvironmentRequest] (val x: Self) extends AnyVal {
    
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
    def setComputeEnvironment(value: String): Self = this.set("computeEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeResources(value: ComputeResourceUpdate): Self = this.set("computeResources", value.asInstanceOf[js.Any])
    
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
  }
}
