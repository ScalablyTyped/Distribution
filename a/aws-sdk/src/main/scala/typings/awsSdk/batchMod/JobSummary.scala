package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobSummary extends js.Object {
  /**
    * The array properties of the job, if it is an array job.
    */
  var arrayProperties: js.UndefOr[ArrayPropertiesSummary] = js.native
  /**
    * An object representing the details of the container that is associated with the job.
    */
  var container: js.UndefOr[ContainerSummary] = js.native
  /**
    * The Unix timestamp for when the job was created. For non-array jobs and parent array jobs, this is when the job entered the SUBMITTED state (at the time SubmitJob was called). For array child jobs, this is when the child job was spawned by its parent and entered the PENDING state.
    */
  var createdAt: js.UndefOr[Long] = js.native
  /**
    * The ID of the job.
    */
  var jobId: String = js.native
  /**
    * The name of the job.
    */
  var jobName: String = js.native
  /**
    * The node properties for a single node in a job summary list.
    */
  var nodeProperties: js.UndefOr[NodePropertiesSummary] = js.native
  /**
    * The Unix timestamp for when the job was started (when the job transitioned from the STARTING state to the RUNNING state).
    */
  var startedAt: js.UndefOr[Long] = js.native
  /**
    * The current status for the job.
    */
  var status: js.UndefOr[JobStatus] = js.native
  /**
    * A short, human-readable string to provide additional details about the current status of the job.
    */
  var statusReason: js.UndefOr[String] = js.native
  /**
    * The Unix timestamp for when the job was stopped (when the job transitioned from the RUNNING state to a terminal state, such as SUCCEEDED or FAILED).
    */
  var stoppedAt: js.UndefOr[Long] = js.native
}

object JobSummary {
  @scala.inline
  def apply(
    jobId: String,
    jobName: String,
    arrayProperties: ArrayPropertiesSummary = null,
    container: ContainerSummary = null,
    createdAt: Int | Double = null,
    nodeProperties: NodePropertiesSummary = null,
    startedAt: Int | Double = null,
    status: JobStatus = null,
    statusReason: String = null,
    stoppedAt: Int | Double = null
  ): JobSummary = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any])
    if (arrayProperties != null) __obj.updateDynamic("arrayProperties")(arrayProperties.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (nodeProperties != null) __obj.updateDynamic("nodeProperties")(nodeProperties.asInstanceOf[js.Any])
    if (startedAt != null) __obj.updateDynamic("startedAt")(startedAt.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusReason != null) __obj.updateDynamic("statusReason")(statusReason.asInstanceOf[js.Any])
    if (stoppedAt != null) __obj.updateDynamic("stoppedAt")(stoppedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobSummary]
  }
}

