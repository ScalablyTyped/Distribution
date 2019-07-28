package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobSummary extends js.Object {
  /**
    * The array properties of the job, if it is an array job.
    */
  var arrayProperties: js.UndefOr[ArrayPropertiesSummary] = js.undefined
  /**
    * An object representing the details of the container that is associated with the job.
    */
  var container: js.UndefOr[ContainerSummary] = js.undefined
  /**
    * The Unix timestamp for when the job was created. For non-array jobs and parent array jobs, this is when the job entered the SUBMITTED state (at the time SubmitJob was called). For array child jobs, this is when the child job was spawned by its parent and entered the PENDING state.
    */
  var createdAt: js.UndefOr[Long] = js.undefined
  /**
    * The ID of the job.
    */
  var jobId: String
  /**
    * The name of the job.
    */
  var jobName: String
  /**
    * The node properties for a single node in a job summary list.
    */
  var nodeProperties: js.UndefOr[NodePropertiesSummary] = js.undefined
  /**
    * The Unix timestamp for when the job was started (when the job transitioned from the STARTING state to the RUNNING state).
    */
  var startedAt: js.UndefOr[Long] = js.undefined
  /**
    * The current status for the job.
    */
  var status: js.UndefOr[JobStatus] = js.undefined
  /**
    * A short, human-readable string to provide additional details about the current status of the job.
    */
  var statusReason: js.UndefOr[String] = js.undefined
  /**
    * The Unix timestamp for when the job was stopped (when the job transitioned from the RUNNING state to a terminal state, such as SUCCEEDED or FAILED).
    */
  var stoppedAt: js.UndefOr[Long] = js.undefined
}

object JobSummary {
  @scala.inline
  def apply(
    jobId: String,
    jobName: String,
    arrayProperties: ArrayPropertiesSummary = null,
    container: ContainerSummary = null,
    createdAt: js.UndefOr[Long] = js.undefined,
    nodeProperties: NodePropertiesSummary = null,
    startedAt: js.UndefOr[Long] = js.undefined,
    status: JobStatus = null,
    statusReason: String = null,
    stoppedAt: js.UndefOr[Long] = js.undefined
  ): JobSummary = {
    val __obj = js.Dynamic.literal(jobId = jobId, jobName = jobName)
    if (arrayProperties != null) __obj.updateDynamic("arrayProperties")(arrayProperties)
    if (container != null) __obj.updateDynamic("container")(container)
    if (!js.isUndefined(createdAt)) __obj.updateDynamic("createdAt")(createdAt)
    if (nodeProperties != null) __obj.updateDynamic("nodeProperties")(nodeProperties)
    if (!js.isUndefined(startedAt)) __obj.updateDynamic("startedAt")(startedAt)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusReason != null) __obj.updateDynamic("statusReason")(statusReason)
    if (!js.isUndefined(stoppedAt)) __obj.updateDynamic("stoppedAt")(stoppedAt)
    __obj.asInstanceOf[JobSummary]
  }
}

