package typings.awsDashSdk.clientsBatchMod

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
    * A list of job names or IDs on which this job depends.
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
    status: JobStatus,
    arrayProperties: ArrayPropertiesDetail = null,
    attempts: AttemptDetails = null,
    container: ContainerDetail = null,
    createdAt: Int | Double = null,
    dependsOn: JobDependencyList = null,
    nodeDetails: NodeDetails = null,
    nodeProperties: NodeProperties = null,
    parameters: ParametersMap = null,
    retryStrategy: RetryStrategy = null,
    statusReason: String = null,
    stoppedAt: Int | Double = null,
    timeout: JobTimeout = null
  ): JobDetail = {
    val __obj = js.Dynamic.literal(jobDefinition = jobDefinition.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], jobQueue = jobQueue.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (arrayProperties != null) __obj.updateDynamic("arrayProperties")(arrayProperties.asInstanceOf[js.Any])
    if (attempts != null) __obj.updateDynamic("attempts")(attempts.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (dependsOn != null) __obj.updateDynamic("dependsOn")(dependsOn.asInstanceOf[js.Any])
    if (nodeDetails != null) __obj.updateDynamic("nodeDetails")(nodeDetails.asInstanceOf[js.Any])
    if (nodeProperties != null) __obj.updateDynamic("nodeProperties")(nodeProperties.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (retryStrategy != null) __obj.updateDynamic("retryStrategy")(retryStrategy.asInstanceOf[js.Any])
    if (statusReason != null) __obj.updateDynamic("statusReason")(statusReason.asInstanceOf[js.Any])
    if (stoppedAt != null) __obj.updateDynamic("stoppedAt")(stoppedAt.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobDetail]
  }
}

