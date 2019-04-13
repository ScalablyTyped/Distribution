package typings
package awsDashSdkLib.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobQueueDetail extends js.Object {
  /**
    * The compute environments that are attached to the job queue and the order in which job placement is preferred. Compute environments are selected for job placement in ascending order.
    */
  var computeEnvironmentOrder: ComputeEnvironmentOrders
  /**
    * The Amazon Resource Name (ARN) of the job queue.
    */
  var jobQueueArn: String
  /**
    * The name of the job queue.
    */
  var jobQueueName: String
  /**
    * The priority of the job queue. 
    */
  var priority: Integer
  /**
    * Describes the ability of the queue to accept new jobs.
    */
  var state: JQState
  /**
    * The status of the job queue (for example, CREATING or VALID).
    */
  var status: js.UndefOr[JQStatus] = js.undefined
  /**
    * A short, human-readable string to provide additional details about the current status of the job queue.
    */
  var statusReason: js.UndefOr[String] = js.undefined
}

object JobQueueDetail {
  @scala.inline
  def apply(
    computeEnvironmentOrder: ComputeEnvironmentOrders,
    jobQueueArn: String,
    jobQueueName: String,
    priority: Integer,
    state: JQState,
    status: JQStatus = null,
    statusReason: String = null
  ): JobQueueDetail = {
    val __obj = js.Dynamic.literal(computeEnvironmentOrder = computeEnvironmentOrder, jobQueueArn = jobQueueArn, jobQueueName = jobQueueName, priority = priority, state = state.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusReason != null) __obj.updateDynamic("statusReason")(statusReason)
    __obj.asInstanceOf[JobQueueDetail]
  }
}

