package typings
package awsDashSdkLib.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobDetail extends js.Object {
  /**
    * The array properties of the job, if it is an array job.
    */
  var arrayProperties: js.UndefOr[ArrayPropertiesDetail] = js.undefined
  /**
    * A list of job attempts associated with this job.
    */
  var attempts: js.UndefOr[AttemptDetails] = js.undefined
  /**
    * An object representing the details of the container that is associated with the job.
    */
  var container: js.UndefOr[ContainerDetail] = js.undefined
  /**
    * The Unix timestamp (in seconds and milliseconds) for when the job was created. For non-array jobs and parent array jobs, this is when the job entered the SUBMITTED state (at the time SubmitJob was called). For array child jobs, this is when the child job was spawned by its parent and entered the PENDING state.
    */
  var createdAt: js.UndefOr[Long] = js.undefined
  /**
    * A list of job names or IDs on which this job depends.
    */
  var dependsOn: js.UndefOr[JobDependencyList] = js.undefined
  /**
    * The job definition that is used by this job.
    */
  var jobDefinition: String
  /**
    * The ID for the job.
    */
  var jobId: String
  /**
    * The name of the job.
    */
  var jobName: String
  /**
    * The Amazon Resource Name (ARN) of the job queue with which the job is associated.
    */
  var jobQueue: String
  /**
    * An object representing the details of a node that is associated with a multi-node parallel job.
    */
  var nodeDetails: js.UndefOr[NodeDetails] = js.undefined
  /**
    * An object representing the node properties of a multi-node parallel job.
    */
  var nodeProperties: js.UndefOr[NodeProperties] = js.undefined
  /**
    * Additional parameters passed to the job that replace parameter substitution placeholders or override any corresponding parameter defaults from the job definition. 
    */
  var parameters: js.UndefOr[ParametersMap] = js.undefined
  /**
    * The retry strategy to use for this job if an attempt fails.
    */
  var retryStrategy: js.UndefOr[RetryStrategy] = js.undefined
  /**
    * The Unix timestamp (in seconds and milliseconds) for when the job was started (when the job transitioned from the STARTING state to the RUNNING state).
    */
  var startedAt: Long
  /**
    * The current status for the job.   If your jobs do not progress to STARTING, see Jobs Stuck in RUNNABLE Status in the troubleshooting section of the AWS Batch User Guide. 
    */
  var status: JobStatus
  /**
    * A short, human-readable string to provide additional details about the current status of the job. 
    */
  var statusReason: js.UndefOr[String] = js.undefined
  /**
    * The Unix timestamp (in seconds and milliseconds) for when the job was stopped (when the job transitioned from the RUNNING state to a terminal state, such as SUCCEEDED or FAILED).
    */
  var stoppedAt: js.UndefOr[Long] = js.undefined
  /**
    * The timeout configuration for the job. 
    */
  var timeout: js.UndefOr[JobTimeout] = js.undefined
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
    createdAt: js.UndefOr[Long] = js.undefined,
    dependsOn: JobDependencyList = null,
    nodeDetails: NodeDetails = null,
    nodeProperties: NodeProperties = null,
    parameters: ParametersMap = null,
    retryStrategy: RetryStrategy = null,
    statusReason: String = null,
    stoppedAt: js.UndefOr[Long] = js.undefined,
    timeout: JobTimeout = null
  ): JobDetail = {
    val __obj = js.Dynamic.literal(jobDefinition = jobDefinition, jobId = jobId, jobName = jobName, jobQueue = jobQueue, startedAt = startedAt, status = status.asInstanceOf[js.Any])
    if (arrayProperties != null) __obj.updateDynamic("arrayProperties")(arrayProperties)
    if (attempts != null) __obj.updateDynamic("attempts")(attempts)
    if (container != null) __obj.updateDynamic("container")(container)
    if (!js.isUndefined(createdAt)) __obj.updateDynamic("createdAt")(createdAt)
    if (dependsOn != null) __obj.updateDynamic("dependsOn")(dependsOn)
    if (nodeDetails != null) __obj.updateDynamic("nodeDetails")(nodeDetails)
    if (nodeProperties != null) __obj.updateDynamic("nodeProperties")(nodeProperties)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (retryStrategy != null) __obj.updateDynamic("retryStrategy")(retryStrategy)
    if (statusReason != null) __obj.updateDynamic("statusReason")(statusReason)
    if (!js.isUndefined(stoppedAt)) __obj.updateDynamic("stoppedAt")(stoppedAt)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[JobDetail]
  }
}

