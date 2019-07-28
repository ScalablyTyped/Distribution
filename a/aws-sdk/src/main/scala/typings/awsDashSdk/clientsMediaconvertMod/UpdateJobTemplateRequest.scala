package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateJobTemplateRequest extends js.Object {
  /**
    * Accelerated transcoding can significantly speed up jobs with long, visually complex content. Outputs that use this feature incur pro-tier pricing. For information about feature limitations, see the AWS Elemental MediaConvert User Guide.
    */
  var AccelerationSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.AccelerationSettings] = js.undefined
  /**
    * The new category for the job template, if you are changing it.
    */
  var Category: js.UndefOr[__string] = js.undefined
  /**
    * The new description for the job template, if you are changing it.
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * The name of the job template you are modifying
    */
  var Name: __string
  /**
    * The new queue for the job template, if you are changing it.
    */
  var Queue: js.UndefOr[__string] = js.undefined
  /**
    * JobTemplateSettings contains all the transcode settings saved in the template that will be applied to jobs created from it.
    */
  var Settings: js.UndefOr[JobTemplateSettings] = js.undefined
  /**
    * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins processing your job to the time it completes the transcode or encounters an error.
    */
  var StatusUpdateInterval: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.StatusUpdateInterval] = js.undefined
}

object UpdateJobTemplateRequest {
  @scala.inline
  def apply(
    Name: __string,
    AccelerationSettings: AccelerationSettings = null,
    Category: __string = null,
    Description: __string = null,
    Queue: __string = null,
    Settings: JobTemplateSettings = null,
    StatusUpdateInterval: StatusUpdateInterval = null
  ): UpdateJobTemplateRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (AccelerationSettings != null) __obj.updateDynamic("AccelerationSettings")(AccelerationSettings)
    if (Category != null) __obj.updateDynamic("Category")(Category)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Queue != null) __obj.updateDynamic("Queue")(Queue)
    if (Settings != null) __obj.updateDynamic("Settings")(Settings)
    if (StatusUpdateInterval != null) __obj.updateDynamic("StatusUpdateInterval")(StatusUpdateInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobTemplateRequest]
  }
}

