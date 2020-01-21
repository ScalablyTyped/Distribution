package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobQueueDetail extends js.Object {
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
    * Describes the ability of the queue to accept new jobs.
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
    val __obj = js.Dynamic.literal(computeEnvironmentOrder = computeEnvironmentOrder.asInstanceOf[js.Any], jobQueueArn = jobQueueArn.asInstanceOf[js.Any], jobQueueName = jobQueueName.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusReason != null) __obj.updateDynamic("statusReason")(statusReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobQueueDetail]
  }
}

