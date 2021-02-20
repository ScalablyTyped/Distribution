package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobQueueDetail extends StObject {
  
  /**
    * The compute environments that are attached to the job queue and the order in which job placement is preferred. Compute environments are selected for job placement in ascending order.
    */
  var computeEnvironmentOrder: ComputeEnvironmentOrders = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the job queue.
    */
  var jobQueueArn: String = js.native
  
  /**
    * The name of the job queue.
    */
  var jobQueueName: String = js.native
  
  /**
    * The priority of the job queue.
    */
  var priority: Integer = js.native
  
  /**
    * Describes the ability of the queue to accept new jobs. If the job queue state is ENABLED, it is able to accept jobs. If the job queue state is DISABLED, new jobs cannot be added to the queue, but jobs already in the queue can finish.
    */
  var state: JQState = js.native
  
  /**
    * The status of the job queue (for example, CREATING or VALID).
    */
  var status: js.UndefOr[JQStatus] = js.native
  
  /**
    * A short, human-readable string to provide additional details about the current status of the job queue.
    */
  var statusReason: js.UndefOr[String] = js.native
  
  /**
    * The tags applied to the job queue.
    */
  var tags: js.UndefOr[TagrisTagsMap] = js.native
}
object JobQueueDetail {
  
  @scala.inline
  def apply(
    computeEnvironmentOrder: ComputeEnvironmentOrders,
    jobQueueArn: String,
    jobQueueName: String,
    priority: Integer,
    state: JQState
  ): JobQueueDetail = {
    val __obj = js.Dynamic.literal(computeEnvironmentOrder = computeEnvironmentOrder.asInstanceOf[js.Any], jobQueueArn = jobQueueArn.asInstanceOf[js.Any], jobQueueName = jobQueueName.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobQueueDetail]
  }
  
  @scala.inline
  implicit class JobQueueDetailMutableBuilder[Self <: JobQueueDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputeEnvironmentOrder(value: ComputeEnvironmentOrders): Self = StObject.set(x, "computeEnvironmentOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeEnvironmentOrderVarargs(value: ComputeEnvironmentOrder*): Self = StObject.set(x, "computeEnvironmentOrder", js.Array(value :_*))
    
    @scala.inline
    def setJobQueueArn(value: String): Self = StObject.set(x, "jobQueueArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobQueueName(value: String): Self = StObject.set(x, "jobQueueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Integer): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: JQState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: JQStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
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
  }
}
