package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateJobRequest extends js.Object {
  /**
    * Allows you to create criteria to abort a job.
    */
  var abortConfig: js.UndefOr[AbortConfig] = js.undefined
  /**
    * A short text description of the job.
    */
  var description: js.UndefOr[JobDescription] = js.undefined
  /**
    * Allows you to create a staged rollout of the job.
    */
  var jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig] = js.undefined
  /**
    * The ID of the job to be updated.
    */
  var jobId: JobId
  /**
    * Configuration information for pre-signed S3 URLs.
    */
  var presignedUrlConfig: js.UndefOr[PresignedUrlConfig] = js.undefined
  /**
    * Specifies the amount of time each device has to finish its execution of the job. The timer is started when the job execution status is set to IN_PROGRESS. If the job execution status is not set to another terminal state before the time expires, it will be automatically set to TIMED_OUT. 
    */
  var timeoutConfig: js.UndefOr[TimeoutConfig] = js.undefined
}

object UpdateJobRequest {
  @scala.inline
  def apply(
    jobId: JobId,
    abortConfig: AbortConfig = null,
    description: JobDescription = null,
    jobExecutionsRolloutConfig: JobExecutionsRolloutConfig = null,
    presignedUrlConfig: PresignedUrlConfig = null,
    timeoutConfig: TimeoutConfig = null
  ): UpdateJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId)
    if (abortConfig != null) __obj.updateDynamic("abortConfig")(abortConfig)
    if (description != null) __obj.updateDynamic("description")(description)
    if (jobExecutionsRolloutConfig != null) __obj.updateDynamic("jobExecutionsRolloutConfig")(jobExecutionsRolloutConfig)
    if (presignedUrlConfig != null) __obj.updateDynamic("presignedUrlConfig")(presignedUrlConfig)
    if (timeoutConfig != null) __obj.updateDynamic("timeoutConfig")(timeoutConfig)
    __obj.asInstanceOf[UpdateJobRequest]
  }
}

