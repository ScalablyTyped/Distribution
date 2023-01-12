package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobQueueDetail extends StObject {
  
  /**
    * The compute environments that are attached to the job queue and the order that job placement is preferred. Compute environments are selected for job placement in ascending order.
    */
  var computeEnvironmentOrder: ComputeEnvironmentOrders
  
  /**
    * The Amazon Resource Name (ARN) of the job queue.
    */
  var jobQueueArn: String
  
  /**
    * The job queue name.
    */
  var jobQueueName: String
  
  /**
    * The priority of the job queue. Job queues with a higher priority (or a higher integer value for the priority parameter) are evaluated first when associated with the same compute environment. Priority is determined in descending order. For example, a job queue with a priority value of 10 is given scheduling preference over a job queue with a priority value of 1. All of the compute environments must be either EC2 (EC2 or SPOT) or Fargate (FARGATE or FARGATE_SPOT). EC2 and Fargate compute environments can't be mixed.
    */
  var priority: Integer
  
  /**
    * The Amazon Resource Name (ARN) of the scheduling policy. The format is aws:Partition:batch:Region:Account:scheduling-policy/Name . For example, aws:aws:batch:us-west-2:123456789012:scheduling-policy/MySchedulingPolicy.
    */
  var schedulingPolicyArn: js.UndefOr[String] = js.undefined
  
  /**
    * Describes the ability of the queue to accept new jobs. If the job queue state is ENABLED, it can accept jobs. If the job queue state is DISABLED, new jobs can't be added to the queue, but jobs already in the queue can finish.
    */
  var state: JQState
  
  /**
    * The status of the job queue (for example, CREATING or VALID).
    */
  var status: js.UndefOr[JQStatus] = js.undefined
  
  /**
    * A short, human-readable string to provide additional details for the current status of the job queue.
    */
  var statusReason: js.UndefOr[String] = js.undefined
  
  /**
    * The tags that are applied to the job queue. For more information, see Tagging your Batch resources in Batch User Guide.
    */
  var tags: js.UndefOr[TagrisTagsMap] = js.undefined
}
object JobQueueDetail {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: JobQueueDetail] (val x: Self) extends AnyVal {
    
    inline def setComputeEnvironmentOrder(value: ComputeEnvironmentOrders): Self = StObject.set(x, "computeEnvironmentOrder", value.asInstanceOf[js.Any])
    
    inline def setComputeEnvironmentOrderVarargs(value: ComputeEnvironmentOrder*): Self = StObject.set(x, "computeEnvironmentOrder", js.Array(value*))
    
    inline def setJobQueueArn(value: String): Self = StObject.set(x, "jobQueueArn", value.asInstanceOf[js.Any])
    
    inline def setJobQueueName(value: String): Self = StObject.set(x, "jobQueueName", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Integer): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setSchedulingPolicyArn(value: String): Self = StObject.set(x, "schedulingPolicyArn", value.asInstanceOf[js.Any])
    
    inline def setSchedulingPolicyArnUndefined: Self = StObject.set(x, "schedulingPolicyArn", js.undefined)
    
    inline def setState(value: JQState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: JQStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: TagrisTagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
