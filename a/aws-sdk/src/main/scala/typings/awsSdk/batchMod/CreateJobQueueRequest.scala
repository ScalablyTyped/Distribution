package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateJobQueueRequest extends js.Object {
  
  /**
    * The set of compute environments mapped to a job queue and their order relative to each other. The job scheduler uses this parameter to determine which compute environment should execute a given job. Compute environments must be in the VALID state before you can associate them with a job queue. You can associate up to three compute environments with a job queue.
    */
  var computeEnvironmentOrder: ComputeEnvironmentOrders = js.native
  
  /**
    * The name of the job queue.
    */
  var jobQueueName: String = js.native
  
  /**
    * The priority of the job queue. Job queues with a higher priority (or a higher integer value for the priority parameter) are evaluated first when associated with the same compute environment. Priority is determined in descending order, for example, a job queue with a priority value of 10 is given scheduling preference over a job queue with a priority value of 1.
    */
  var priority: Integer = js.native
  
  /**
    * The state of the job queue. If the job queue state is ENABLED, it is able to accept jobs. If the job queue state is DISABLED, new jobs cannot be added to the queue, but jobs already in the queue can finish.
    */
  var state: js.UndefOr[JQState] = js.native
  
  /**
    * The tags that you apply to the job queue to help you categorize and organize your resources. Each tag consists of a key and an optional value. For more information, see Tagging AWS Resources in AWS General Reference.
    */
  var tags: js.UndefOr[TagrisTagsMap] = js.native
}
object CreateJobQueueRequest {
  
  @scala.inline
  def apply(computeEnvironmentOrder: ComputeEnvironmentOrders, jobQueueName: String, priority: Integer): CreateJobQueueRequest = {
    val __obj = js.Dynamic.literal(computeEnvironmentOrder = computeEnvironmentOrder.asInstanceOf[js.Any], jobQueueName = jobQueueName.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobQueueRequest]
  }
  
  @scala.inline
  implicit class CreateJobQueueRequestOps[Self <: CreateJobQueueRequest] (val x: Self) extends AnyVal {
    
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
    def setComputeEnvironmentOrderVarargs(value: ComputeEnvironmentOrder*): Self = this.set("computeEnvironmentOrder", js.Array(value :_*))
    
    @scala.inline
    def setComputeEnvironmentOrder(value: ComputeEnvironmentOrders): Self = this.set("computeEnvironmentOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobQueueName(value: String): Self = this.set("jobQueueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Integer): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: JQState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTags(value: TagrisTagsMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
