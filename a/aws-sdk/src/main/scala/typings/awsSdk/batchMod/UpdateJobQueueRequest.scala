package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateJobQueueRequest extends js.Object {
  
  /**
    * Details the set of compute environments mapped to a job queue and their order relative to each other. This is one of the parameters used by the job scheduler to determine which compute environment should execute a given job.
    */
  var computeEnvironmentOrder: js.UndefOr[ComputeEnvironmentOrders] = js.native
  
  /**
    * The name or the Amazon Resource Name (ARN) of the job queue.
    */
  var jobQueue: String = js.native
  
  /**
    * The priority of the job queue. Job queues with a higher priority (or a higher integer value for the priority parameter) are evaluated first when associated with the same compute environment. Priority is determined in descending order, for example, a job queue with a priority value of 10 is given scheduling preference over a job queue with a priority value of 1.
    */
  var priority: js.UndefOr[Integer] = js.native
  
  /**
    * Describes the queue's ability to accept new jobs. If the job queue state is ENABLED, it is able to accept jobs. If the job queue state is DISABLED, new jobs cannot be added to the queue, but jobs already in the queue can finish.
    */
  var state: js.UndefOr[JQState] = js.native
}
object UpdateJobQueueRequest {
  
  @scala.inline
  def apply(jobQueue: String): UpdateJobQueueRequest = {
    val __obj = js.Dynamic.literal(jobQueue = jobQueue.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobQueueRequest]
  }
  
  @scala.inline
  implicit class UpdateJobQueueRequestOps[Self <: UpdateJobQueueRequest] (val x: Self) extends AnyVal {
    
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
    def setJobQueue(value: String): Self = this.set("jobQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeEnvironmentOrderVarargs(value: ComputeEnvironmentOrder*): Self = this.set("computeEnvironmentOrder", js.Array(value :_*))
    
    @scala.inline
    def setComputeEnvironmentOrder(value: ComputeEnvironmentOrders): Self = this.set("computeEnvironmentOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputeEnvironmentOrder: Self = this.set("computeEnvironmentOrder", js.undefined)
    
    @scala.inline
    def setPriority(value: Integer): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setState(value: JQState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
