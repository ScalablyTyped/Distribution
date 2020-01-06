package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * The state of the job queue. If the job queue state is ENABLED, it is able to accept jobs.
    */
  var state: js.UndefOr[JQState] = js.native
}

object CreateJobQueueRequest {
  @scala.inline
  def apply(
    computeEnvironmentOrder: ComputeEnvironmentOrders,
    jobQueueName: String,
    priority: Integer,
    state: JQState = null
  ): CreateJobQueueRequest = {
    val __obj = js.Dynamic.literal(computeEnvironmentOrder = computeEnvironmentOrder.asInstanceOf[js.Any], jobQueueName = jobQueueName.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobQueueRequest]
  }
}

