package typings
package awsDashSdkLib.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateJobQueueRequest extends js.Object {
  /**
    * Details the set of compute environments mapped to a job queue and their order relative to each other. This is one of the parameters used by the job scheduler to determine which compute environment should execute a given job. 
    */
  var computeEnvironmentOrder: js.UndefOr[ComputeEnvironmentOrders] = js.undefined
  /**
    * The name or the Amazon Resource Name (ARN) of the job queue.
    */
  var jobQueue: String
  /**
    * The priority of the job queue. Job queues with a higher priority (or a higher integer value for the priority parameter) are evaluated first when associated with the same compute environment. Priority is determined in descending order, for example, a job queue with a priority value of 10 is given scheduling preference over a job queue with a priority value of 1.
    */
  var priority: js.UndefOr[Integer] = js.undefined
  /**
    * Describes the queue's ability to accept new jobs.
    */
  var state: js.UndefOr[JQState] = js.undefined
}

object UpdateJobQueueRequest {
  @scala.inline
  def apply(
    jobQueue: String,
    computeEnvironmentOrder: ComputeEnvironmentOrders = null,
    priority: js.UndefOr[Integer] = js.undefined,
    state: JQState = null
  ): UpdateJobQueueRequest = {
    val __obj = js.Dynamic.literal(jobQueue = jobQueue)
    if (computeEnvironmentOrder != null) __obj.updateDynamic("computeEnvironmentOrder")(computeEnvironmentOrder)
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobQueueRequest]
  }
}

