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
    state: JQState
  ): JobQueueDetail = {
    val __obj = js.Dynamic.literal(computeEnvironmentOrder = computeEnvironmentOrder.asInstanceOf[js.Any], jobQueueArn = jobQueueArn.asInstanceOf[js.Any], jobQueueName = jobQueueName.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobQueueDetail]
  }
  @scala.inline
  implicit class JobQueueDetailOps[Self <: JobQueueDetail] (val x: Self) extends AnyVal {
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
    def setJobQueueArn(value: String): Self = this.set("jobQueueArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobQueueName(value: String): Self = this.set("jobQueueName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriority(value: Integer): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: JQState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: JQStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusReason(value: String): Self = this.set("statusReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusReason: Self = this.set("statusReason", js.undefined)
  }
  
}

