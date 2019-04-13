package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateJobRequest extends js.Object {
  /**
    * Allows you to create criteria to abort a job.
    */
  var abortConfig: js.UndefOr[AbortConfig] = js.undefined
  /**
    * A short text description of the job.
    */
  var description: js.UndefOr[JobDescription] = js.undefined
  /**
    * The job document.  If the job document resides in an S3 bucket, you must use a placeholder link when specifying the document. The placeholder link is of the following form:  ${aws:iot:s3-presigned-url:https://s3.amazonaws.com/bucket/key}  where bucket is your bucket name and key is the object in the bucket to which you are linking. 
    */
  var document: js.UndefOr[JobDocument] = js.undefined
  /**
    * An S3 link to the job document.
    */
  var documentSource: js.UndefOr[JobDocumentSource] = js.undefined
  /**
    * Allows you to create a staged rollout of the job.
    */
  var jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig] = js.undefined
  /**
    * A job identifier which must be unique for your AWS account. We recommend using a UUID. Alpha-numeric characters, "-" and "_" are valid for use here.
    */
  var jobId: JobId
  /**
    * Configuration information for pre-signed S3 URLs.
    */
  var presignedUrlConfig: js.UndefOr[PresignedUrlConfig] = js.undefined
  /**
    * Metadata which can be used to manage the job.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  /**
    * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is detected in a target. For example, a job will run on a thing when the thing is added to a target group, even after the job was completed by all things originally in the group.
    */
  var targetSelection: js.UndefOr[TargetSelection] = js.undefined
  /**
    * A list of things and thing groups to which the job should be sent.
    */
  var targets: JobTargets
  /**
    * Specifies the amount of time each device has to finish its execution of the job. The timer is started when the job execution status is set to IN_PROGRESS. If the job execution status is not set to another terminal state before the time expires, it will be automatically set to TIMED_OUT.
    */
  var timeoutConfig: js.UndefOr[TimeoutConfig] = js.undefined
}

object CreateJobRequest {
  @scala.inline
  def apply(
    jobId: JobId,
    targets: JobTargets,
    abortConfig: AbortConfig = null,
    description: JobDescription = null,
    document: JobDocument = null,
    documentSource: JobDocumentSource = null,
    jobExecutionsRolloutConfig: JobExecutionsRolloutConfig = null,
    presignedUrlConfig: PresignedUrlConfig = null,
    tags: TagList = null,
    targetSelection: TargetSelection = null,
    timeoutConfig: TimeoutConfig = null
  ): CreateJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId, targets = targets)
    if (abortConfig != null) __obj.updateDynamic("abortConfig")(abortConfig)
    if (description != null) __obj.updateDynamic("description")(description)
    if (document != null) __obj.updateDynamic("document")(document)
    if (documentSource != null) __obj.updateDynamic("documentSource")(documentSource)
    if (jobExecutionsRolloutConfig != null) __obj.updateDynamic("jobExecutionsRolloutConfig")(jobExecutionsRolloutConfig)
    if (presignedUrlConfig != null) __obj.updateDynamic("presignedUrlConfig")(presignedUrlConfig)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (targetSelection != null) __obj.updateDynamic("targetSelection")(targetSelection.asInstanceOf[js.Any])
    if (timeoutConfig != null) __obj.updateDynamic("timeoutConfig")(timeoutConfig)
    __obj.asInstanceOf[CreateJobRequest]
  }
}

