package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobRequest extends js.Object {
  /**
    * Allows you to create criteria to abort a job.
    */
  var abortConfig: js.UndefOr[AbortConfig] = js.native
  /**
    * A short text description of the job.
    */
  var description: js.UndefOr[JobDescription] = js.native
  /**
    * The job document.  If the job document resides in an S3 bucket, you must use a placeholder link when specifying the document. The placeholder link is of the following form:  ${aws:iot:s3-presigned-url:https://s3.amazonaws.com/bucket/key}  where bucket is your bucket name and key is the object in the bucket to which you are linking. 
    */
  var document: js.UndefOr[JobDocument] = js.native
  /**
    * An S3 link to the job document.
    */
  var documentSource: js.UndefOr[JobDocumentSource] = js.native
  /**
    * Allows you to create a staged rollout of the job.
    */
  var jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig] = js.native
  /**
    * A job identifier which must be unique for your AWS account. We recommend using a UUID. Alpha-numeric characters, "-" and "_" are valid for use here.
    */
  var jobId: JobId = js.native
  /**
    * Configuration information for pre-signed S3 URLs.
    */
  var presignedUrlConfig: js.UndefOr[PresignedUrlConfig] = js.native
  /**
    * Metadata which can be used to manage the job.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is detected in a target. For example, a job will run on a thing when the thing is added to a target group, even after the job was completed by all things originally in the group.
    */
  var targetSelection: js.UndefOr[TargetSelection] = js.native
  /**
    * A list of things and thing groups to which the job should be sent.
    */
  var targets: JobTargets = js.native
  /**
    * Specifies the amount of time each device has to finish its execution of the job. The timer is started when the job execution status is set to IN_PROGRESS. If the job execution status is not set to another terminal state before the time expires, it will be automatically set to TIMED_OUT.
    */
  var timeoutConfig: js.UndefOr[TimeoutConfig] = js.native
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
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    if (abortConfig != null) __obj.updateDynamic("abortConfig")(abortConfig.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (documentSource != null) __obj.updateDynamic("documentSource")(documentSource.asInstanceOf[js.Any])
    if (jobExecutionsRolloutConfig != null) __obj.updateDynamic("jobExecutionsRolloutConfig")(jobExecutionsRolloutConfig.asInstanceOf[js.Any])
    if (presignedUrlConfig != null) __obj.updateDynamic("presignedUrlConfig")(presignedUrlConfig.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (targetSelection != null) __obj.updateDynamic("targetSelection")(targetSelection.asInstanceOf[js.Any])
    if (timeoutConfig != null) __obj.updateDynamic("timeoutConfig")(timeoutConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobRequest]
  }
}

