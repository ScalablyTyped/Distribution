package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateJobRequest extends js.Object {
  /**
    * Accelerated transcoding can significantly speed up jobs with long, visually complex content. Outputs that use this feature incur pro-tier pricing. For information about feature limitations, see the AWS Elemental MediaConvert User Guide.
    */
  var AccelerationSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.AccelerationSettings] = js.undefined
  /**
    * Optional. Choose a tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert costs on any billing report that you set up. Any transcoding outputs that don't have an associated tag will appear in your billing report unsorted. If you don't choose a valid value for this field, your job outputs will appear on the billing report unsorted.
    */
  var BillingTagsSource: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.BillingTagsSource] = js.undefined
  /**
    * Idempotency token for CreateJob operation.
    */
  var ClientRequestToken: js.UndefOr[__string] = js.undefined
  /**
    * When you create a job, you can either specify a job template or specify the transcoding settings individually
    */
  var JobTemplate: js.UndefOr[__string] = js.undefined
  /**
    * Specify the relative priority for this job. In any given queue, the service begins processing the job with the highest value first. When more than one job has the same priority, the service begins processing the job that you submitted first. If you don't specify a priority, the service uses the default value 0.
    */
  var Priority: js.UndefOr[__integerMinNegative50Max50] = js.undefined
  /**
    * Optional. When you create a job, you can specify a queue to send it to. If you don't specify, the job will go to the default queue. For more about queues, see the User Guide topic at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html.
    */
  var Queue: js.UndefOr[__string] = js.undefined
  /**
    * Required. The IAM role you use for creating this job. For details about permissions, see the User Guide topic at the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html.
    */
  var Role: __string
  /**
    * JobSettings contains all the transcode settings for a job.
    */
  var Settings: JobSettings
  /**
    * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins processing your job to the time it completes the transcode or encounters an error.
    */
  var StatusUpdateInterval: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.StatusUpdateInterval] = js.undefined
  /**
    * User-defined metadata that you want to associate with an MediaConvert job. You specify metadata in key/value pairs.
    */
  var UserMetadata: js.UndefOr[__mapOf__string] = js.undefined
}

object CreateJobRequest {
  @scala.inline
  def apply(
    Role: __string,
    Settings: JobSettings,
    AccelerationSettings: AccelerationSettings = null,
    BillingTagsSource: BillingTagsSource = null,
    ClientRequestToken: __string = null,
    JobTemplate: __string = null,
    Priority: js.UndefOr[__integerMinNegative50Max50] = js.undefined,
    Queue: __string = null,
    StatusUpdateInterval: StatusUpdateInterval = null,
    UserMetadata: __mapOf__string = null
  ): CreateJobRequest = {
    val __obj = js.Dynamic.literal(Role = Role, Settings = Settings)
    if (AccelerationSettings != null) __obj.updateDynamic("AccelerationSettings")(AccelerationSettings)
    if (BillingTagsSource != null) __obj.updateDynamic("BillingTagsSource")(BillingTagsSource.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (JobTemplate != null) __obj.updateDynamic("JobTemplate")(JobTemplate)
    if (!js.isUndefined(Priority)) __obj.updateDynamic("Priority")(Priority)
    if (Queue != null) __obj.updateDynamic("Queue")(Queue)
    if (StatusUpdateInterval != null) __obj.updateDynamic("StatusUpdateInterval")(StatusUpdateInterval.asInstanceOf[js.Any])
    if (UserMetadata != null) __obj.updateDynamic("UserMetadata")(UserMetadata)
    __obj.asInstanceOf[CreateJobRequest]
  }
}

