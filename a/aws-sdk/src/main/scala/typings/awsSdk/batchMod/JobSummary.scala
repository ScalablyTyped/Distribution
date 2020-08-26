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
  def apply(jobId: String, jobName: String): JobSummary = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobSummary]
  }
  @scala.inline
  implicit class JobSummaryOps[Self <: JobSummary] (val x: Self) extends AnyVal {
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
    def setJobId(value: String): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobName(value: String): Self = this.set("jobName", value.asInstanceOf[js.Any])
    @scala.inline
    def setArrayProperties(value: ArrayPropertiesSummary): Self = this.set("arrayProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrayProperties: Self = this.set("arrayProperties", js.undefined)
    @scala.inline
    def setContainer(value: ContainerSummary): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setCreatedAt(value: Long): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setNodeProperties(value: NodePropertiesSummary): Self = this.set("nodeProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeProperties: Self = this.set("nodeProperties", js.undefined)
    @scala.inline
    def setStartedAt(value: Long): Self = this.set("startedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartedAt: Self = this.set("startedAt", js.undefined)
    @scala.inline
    def setStatus(value: JobStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusReason(value: String): Self = this.set("statusReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusReason: Self = this.set("statusReason", js.undefined)
    @scala.inline
    def setStoppedAt(value: Long): Self = this.set("stoppedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoppedAt: Self = this.set("stoppedAt", js.undefined)
  }
  
}

