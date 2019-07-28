package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Job extends js.Object {
  /**
    * Accelerated transcoding can significantly speed up jobs with long, visually complex content.
    */
  var AccelerationSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.AccelerationSettings] = js.undefined
  /**
    * An identifier for this resource that is unique within all of AWS.
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * Optional. Choose a tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert costs on any billing report that you set up. Any transcoding outputs that don't have an associated tag will appear in your billing report unsorted. If you don't choose a valid value for this field, your job outputs will appear on the billing report unsorted.
    */
  var BillingTagsSource: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.BillingTagsSource] = js.undefined
  /**
    * The time, in Unix epoch format in seconds, when the job got created.
    */
  var CreatedAt: js.UndefOr[__timestampUnix] = js.undefined
  /**
    * A job's phase can be PROBING, TRANSCODING OR UPLOADING
    */
  var CurrentPhase: js.UndefOr[JobPhase] = js.undefined
  /**
    * Error code for the job
    */
  var ErrorCode: js.UndefOr[__integer] = js.undefined
  /**
    * Error message of Job
    */
  var ErrorMessage: js.UndefOr[__string] = js.undefined
  /**
    * A portion of the job's ARN, unique within your AWS Elemental MediaConvert resources
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * An estimate of how far your job has progressed. This estimate is shown as a percentage of the total time from when your job leaves its queue to when your output files appear in your output Amazon S3 bucket. AWS Elemental MediaConvert provides jobPercentComplete in CloudWatch STATUS_UPDATE events and in the response to GetJob and ListJobs requests. The jobPercentComplete estimate is reliable for the following input containers: Quicktime, Transport Stream, MP4, and MXF. For some jobs, the service can't provide information about job progress. In those cases, jobPercentComplete returns a null value.
    */
  var JobPercentComplete: js.UndefOr[__integer] = js.undefined
  /**
    * The job template that the job is created from, if it is created from a job template.
    */
  var JobTemplate: js.UndefOr[__string] = js.undefined
  /**
    * List of output group details
    */
  var OutputGroupDetails: js.UndefOr[__listOfOutputGroupDetail] = js.undefined
  /**
    * Optional. When you create a job, you can specify a queue to send it to. If you don't specify, the job will go to the default queue. For more about queues, see the User Guide topic at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
    */
  var Queue: js.UndefOr[__string] = js.undefined
  /**
    * The number of times that the service automatically attempted to process your job after encountering an error.
    */
  var RetryCount: js.UndefOr[__integer] = js.undefined
  /**
    * The IAM role you use for creating this job. For details about permissions, see the User Guide topic at the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
    */
  var Role: __string
  /**
    * JobSettings contains all the transcode settings for a job.
    */
  var Settings: JobSettings
  /**
    * A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR.
    */
  var Status: js.UndefOr[JobStatus] = js.undefined
  /**
    * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins processing your job to the time it completes the transcode or encounters an error.
    */
  var StatusUpdateInterval: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.StatusUpdateInterval] = js.undefined
  /**
    * Information about when jobs are submitted, started, and finished is specified in Unix epoch format in seconds.
    */
  var Timing: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.Timing] = js.undefined
  /**
    * User-defined metadata that you want to associate with an MediaConvert job. You specify metadata in key/value pairs.
    */
  var UserMetadata: js.UndefOr[__mapOf__string] = js.undefined
}

object Job {
  @scala.inline
  def apply(
    Role: __string,
    Settings: JobSettings,
    AccelerationSettings: AccelerationSettings = null,
    Arn: __string = null,
    BillingTagsSource: BillingTagsSource = null,
    CreatedAt: __timestampUnix = null,
    CurrentPhase: JobPhase = null,
    ErrorCode: js.UndefOr[__integer] = js.undefined,
    ErrorMessage: __string = null,
    Id: __string = null,
    JobPercentComplete: js.UndefOr[__integer] = js.undefined,
    JobTemplate: __string = null,
    OutputGroupDetails: __listOfOutputGroupDetail = null,
    Queue: __string = null,
    RetryCount: js.UndefOr[__integer] = js.undefined,
    Status: JobStatus = null,
    StatusUpdateInterval: StatusUpdateInterval = null,
    Timing: Timing = null,
    UserMetadata: __mapOf__string = null
  ): Job = {
    val __obj = js.Dynamic.literal(Role = Role, Settings = Settings)
    if (AccelerationSettings != null) __obj.updateDynamic("AccelerationSettings")(AccelerationSettings)
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (BillingTagsSource != null) __obj.updateDynamic("BillingTagsSource")(BillingTagsSource.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (CurrentPhase != null) __obj.updateDynamic("CurrentPhase")(CurrentPhase.asInstanceOf[js.Any])
    if (!js.isUndefined(ErrorCode)) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (!js.isUndefined(JobPercentComplete)) __obj.updateDynamic("JobPercentComplete")(JobPercentComplete)
    if (JobTemplate != null) __obj.updateDynamic("JobTemplate")(JobTemplate)
    if (OutputGroupDetails != null) __obj.updateDynamic("OutputGroupDetails")(OutputGroupDetails)
    if (Queue != null) __obj.updateDynamic("Queue")(Queue)
    if (!js.isUndefined(RetryCount)) __obj.updateDynamic("RetryCount")(RetryCount)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusUpdateInterval != null) __obj.updateDynamic("StatusUpdateInterval")(StatusUpdateInterval.asInstanceOf[js.Any])
    if (Timing != null) __obj.updateDynamic("Timing")(Timing)
    if (UserMetadata != null) __obj.updateDynamic("UserMetadata")(UserMetadata)
    __obj.asInstanceOf[Job]
  }
}

