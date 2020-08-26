package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobDetail extends js.Object {
  /**
    * The array properties of the job, if it is an array job.
    */
  var arrayProperties: js.UndefOr[ArrayPropertiesDetail] = js.native
  /**
    * A list of job attempts associated with this job.
    */
  var attempts: js.UndefOr[AttemptDetails] = js.native
  /**
    * An object representing the details of the container that is associated with the job.
    */
  var container: js.UndefOr[ContainerDetail] = js.native
  /**
    * The Unix timestamp (in seconds and milliseconds) for when the job was created. For non-array jobs and parent array jobs, this is when the job entered the SUBMITTED state (at the time SubmitJob was called). For array child jobs, this is when the child job was spawned by its parent and entered the PENDING state.
    */
  var createdAt: js.UndefOr[Long] = js.native
  /**
    * A list of job IDs on which this job depends.
    */
  var dependsOn: js.UndefOr[JobDependencyList] = js.native
  /**
    * The job definition that is used by this job.
    */
  var jobDefinition: String = js.native
  /**
    * The ID for the job.
    */
  var jobId: String = js.native
  /**
    * The name of the job.
    */
  var jobName: String = js.native
  /**
    * The Amazon Resource Name (ARN) of the job queue with which the job is associated.
    */
  var jobQueue: String = js.native
  /**
    * An object representing the details of a node that is associated with a multi-node parallel job.
    */
  var nodeDetails: js.UndefOr[NodeDetails] = js.native
  /**
    * An object representing the node properties of a multi-node parallel job.
    */
  var nodeProperties: js.UndefOr[NodeProperties] = js.native
  /**
    * Additional parameters passed to the job that replace parameter substitution placeholders or override any corresponding parameter defaults from the job definition.
    */
  var parameters: js.UndefOr[ParametersMap] = js.native
  /**
    * The retry strategy to use for this job if an attempt fails.
    */
  var retryStrategy: js.UndefOr[RetryStrategy] = js.native
  /**
    * The Unix timestamp (in seconds and milliseconds) for when the job was started (when the job transitioned from the STARTING state to the RUNNING state).
    */
  var startedAt: Long = js.native
  /**
    * The current status for the job.  If your jobs do not progress to STARTING, see Jobs Stuck in RUNNABLE Status in the troubleshooting section of the AWS Batch User Guide. 
    */
  var status: JobStatus = js.native
  /**
    * A short, human-readable string to provide additional details about the current status of the job.
    */
  var statusReason: js.UndefOr[String] = js.native
  /**
    * The Unix timestamp (in seconds and milliseconds) for when the job was stopped (when the job transitioned from the RUNNING state to a terminal state, such as SUCCEEDED or FAILED).
    */
  var stoppedAt: js.UndefOr[Long] = js.native
  /**
    * The timeout configuration for the job.
    */
  var timeout: js.UndefOr[JobTimeout] = js.native
}

object JobDetail {
  @scala.inline
  def apply(
    jobDefinition: String,
    jobId: String,
    jobName: String,
    jobQueue: String,
    startedAt: Long,
    status: JobStatus
  ): JobDetail = {
    val __obj = js.Dynamic.literal(jobDefinition = jobDefinition.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], jobQueue = jobQueue.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobDetail]
  }
  @scala.inline
  implicit class JobDetailOps[Self <: JobDetail] (val x: Self) extends AnyVal {
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
    def setJobDefinition(value: String): Self = this.set("jobDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobId(value: String): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobName(value: String): Self = this.set("jobName", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobQueue(value: String): Self = this.set("jobQueue", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartedAt(value: Long): Self = this.set("startedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: JobStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setArrayProperties(value: ArrayPropertiesDetail): Self = this.set("arrayProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrayProperties: Self = this.set("arrayProperties", js.undefined)
    @scala.inline
    def setAttemptsVarargs(value: AttemptDetail*): Self = this.set("attempts", js.Array(value :_*))
    @scala.inline
    def setAttempts(value: AttemptDetails): Self = this.set("attempts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttempts: Self = this.set("attempts", js.undefined)
    @scala.inline
    def setContainer(value: ContainerDetail): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setCreatedAt(value: Long): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setDependsOnVarargs(value: JobDependency*): Self = this.set("dependsOn", js.Array(value :_*))
    @scala.inline
    def setDependsOn(value: JobDependencyList): Self = this.set("dependsOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependsOn: Self = this.set("dependsOn", js.undefined)
    @scala.inline
    def setNodeDetails(value: NodeDetails): Self = this.set("nodeDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeDetails: Self = this.set("nodeDetails", js.undefined)
    @scala.inline
    def setNodeProperties(value: NodeProperties): Self = this.set("nodeProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeProperties: Self = this.set("nodeProperties", js.undefined)
    @scala.inline
    def setParameters(value: ParametersMap): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setRetryStrategy(value: RetryStrategy): Self = this.set("retryStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetryStrategy: Self = this.set("retryStrategy", js.undefined)
    @scala.inline
    def setStatusReason(value: String): Self = this.set("statusReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusReason: Self = this.set("statusReason", js.undefined)
    @scala.inline
    def setStoppedAt(value: Long): Self = this.set("stoppedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoppedAt: Self = this.set("stoppedAt", js.undefined)
    @scala.inline
    def setTimeout(value: JobTimeout): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

