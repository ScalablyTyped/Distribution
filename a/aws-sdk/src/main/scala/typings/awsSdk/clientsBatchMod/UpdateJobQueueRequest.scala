package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateJobQueueRequest extends StObject {
  
  /**
    * Details the set of compute environments mapped to a job queue and their order relative to each other. This is one of the parameters used by the job scheduler to determine which compute environment runs a given job. Compute environments must be in the VALID state before you can associate them with a job queue. All of the compute environments must be either EC2 (EC2 or SPOT) or Fargate (FARGATE or FARGATE_SPOT). EC2 and Fargate compute environments can't be mixed.  All compute environments that are associated with a job queue must share the same architecture. Batch doesn't support mixing compute environment architecture types in a single job queue. 
    */
  var computeEnvironmentOrder: js.UndefOr[ComputeEnvironmentOrders] = js.undefined
  
  /**
    * The name or the Amazon Resource Name (ARN) of the job queue.
    */
  var jobQueue: String
  
  /**
    * The priority of the job queue. Job queues with a higher priority (or a higher integer value for the priority parameter) are evaluated first when associated with the same compute environment. Priority is determined in descending order. For example, a job queue with a priority value of 10 is given scheduling preference over a job queue with a priority value of 1. All of the compute environments must be either EC2 (EC2 or SPOT) or Fargate (FARGATE or FARGATE_SPOT). EC2 and Fargate compute environments can't be mixed.
    */
  var priority: js.UndefOr[Integer] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the fair share scheduling policy. Once a job queue is created, the fair share scheduling policy can be replaced but not removed. The format is aws:Partition:batch:Region:Account:scheduling-policy/Name . For example, aws:aws:batch:us-west-2:123456789012:scheduling-policy/MySchedulingPolicy.
    */
  var schedulingPolicyArn: js.UndefOr[String] = js.undefined
  
  /**
    * Describes the queue's ability to accept new jobs. If the job queue state is ENABLED, it can accept jobs. If the job queue state is DISABLED, new jobs can't be added to the queue, but jobs already in the queue can finish.
    */
  var state: js.UndefOr[JQState] = js.undefined
}
object UpdateJobQueueRequest {
  
  inline def apply(jobQueue: String): UpdateJobQueueRequest = {
    val __obj = js.Dynamic.literal(jobQueue = jobQueue.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobQueueRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateJobQueueRequest] (val x: Self) extends AnyVal {
    
    inline def setComputeEnvironmentOrder(value: ComputeEnvironmentOrders): Self = StObject.set(x, "computeEnvironmentOrder", value.asInstanceOf[js.Any])
    
    inline def setComputeEnvironmentOrderUndefined: Self = StObject.set(x, "computeEnvironmentOrder", js.undefined)
    
    inline def setComputeEnvironmentOrderVarargs(value: ComputeEnvironmentOrder*): Self = StObject.set(x, "computeEnvironmentOrder", js.Array(value*))
    
    inline def setJobQueue(value: String): Self = StObject.set(x, "jobQueue", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Integer): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setSchedulingPolicyArn(value: String): Self = StObject.set(x, "schedulingPolicyArn", value.asInstanceOf[js.Any])
    
    inline def setSchedulingPolicyArnUndefined: Self = StObject.set(x, "schedulingPolicyArn", js.undefined)
    
    inline def setState(value: JQState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
