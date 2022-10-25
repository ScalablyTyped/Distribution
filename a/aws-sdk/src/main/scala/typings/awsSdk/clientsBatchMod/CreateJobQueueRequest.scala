package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJobQueueRequest extends StObject {
  
  /**
    * The set of compute environments mapped to a job queue and their order relative to each other. The job scheduler uses this parameter to determine which compute environment runs a specific job. Compute environments must be in the VALID state before you can associate them with a job queue. You can associate up to three compute environments with a job queue. All of the compute environments must be either EC2 (EC2 or SPOT) or Fargate (FARGATE or FARGATE_SPOT); EC2 and Fargate compute environments can't be mixed.  All compute environments that are associated with a job queue must share the same architecture. Batch doesn't support mixing compute environment architecture types in a single job queue. 
    */
  var computeEnvironmentOrder: ComputeEnvironmentOrders
  
  /**
    * The name of the job queue. It can be up to 128 letters long. It can contain uppercase and lowercase letters, numbers, hyphens (-), and underscores (_).
    */
  var jobQueueName: String
  
  /**
    * The priority of the job queue. Job queues with a higher priority (or a higher integer value for the priority parameter) are evaluated first when associated with the same compute environment. Priority is determined in descending order. For example, a job queue with a priority value of 10 is given scheduling preference over a job queue with a priority value of 1. All of the compute environments must be either EC2 (EC2 or SPOT) or Fargate (FARGATE or FARGATE_SPOT); EC2 and Fargate compute environments can't be mixed.
    */
  var priority: Integer
  
  /**
    * The Amazon Resource Name (ARN) of the fair share scheduling policy. If this parameter is specified, the job queue uses a fair share scheduling policy. If this parameter isn't specified, the job queue uses a first in, first out (FIFO) scheduling policy. After a job queue is created, you can replace but can't remove the fair share scheduling policy. The format is aws:Partition:batch:Region:Account:scheduling-policy/Name . An example is aws:aws:batch:us-west-2:123456789012:scheduling-policy/MySchedulingPolicy.
    */
  var schedulingPolicyArn: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the job queue. If the job queue state is ENABLED, it is able to accept jobs. If the job queue state is DISABLED, new jobs can't be added to the queue, but jobs already in the queue can finish.
    */
  var state: js.UndefOr[JQState] = js.undefined
  
  /**
    * The tags that you apply to the job queue to help you categorize and organize your resources. Each tag consists of a key and an optional value. For more information, see Tagging your Batch resources in Batch User Guide.
    */
  var tags: js.UndefOr[TagrisTagsMap] = js.undefined
}
object CreateJobQueueRequest {
  
  inline def apply(computeEnvironmentOrder: ComputeEnvironmentOrders, jobQueueName: String, priority: Integer): CreateJobQueueRequest = {
    val __obj = js.Dynamic.literal(computeEnvironmentOrder = computeEnvironmentOrder.asInstanceOf[js.Any], jobQueueName = jobQueueName.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobQueueRequest]
  }
  
  extension [Self <: CreateJobQueueRequest](x: Self) {
    
    inline def setComputeEnvironmentOrder(value: ComputeEnvironmentOrders): Self = StObject.set(x, "computeEnvironmentOrder", value.asInstanceOf[js.Any])
    
    inline def setComputeEnvironmentOrderVarargs(value: ComputeEnvironmentOrder*): Self = StObject.set(x, "computeEnvironmentOrder", js.Array(value*))
    
    inline def setJobQueueName(value: String): Self = StObject.set(x, "jobQueueName", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Integer): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setSchedulingPolicyArn(value: String): Self = StObject.set(x, "schedulingPolicyArn", value.asInstanceOf[js.Any])
    
    inline def setSchedulingPolicyArnUndefined: Self = StObject.set(x, "schedulingPolicyArn", js.undefined)
    
    inline def setState(value: JQState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTags(value: TagrisTagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
