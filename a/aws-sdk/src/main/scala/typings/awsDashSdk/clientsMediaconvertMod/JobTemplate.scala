package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTemplate extends js.Object {
  /**
    * Accelerated transcoding can significantly speed up jobs with long, visually complex content.
    */
  var AccelerationSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.AccelerationSettings] = js.undefined
  /**
    * An identifier for this resource that is unique within all of AWS.
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * An optional category you create to organize your job templates.
    */
  var Category: js.UndefOr[__string] = js.undefined
  /**
    * The timestamp in epoch seconds for Job template creation.
    */
  var CreatedAt: js.UndefOr[__timestampUnix] = js.undefined
  /**
    * An optional description you create for each job template.
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * The timestamp in epoch seconds when the Job template was last updated.
    */
  var LastUpdated: js.UndefOr[__timestampUnix] = js.undefined
  /**
    * A name you create for each job template. Each name must be unique within your account.
    */
  var Name: __string
  /**
    * Optional. The queue that jobs created from this template are assigned to. If you don't specify this, jobs will go to the default queue.
    */
  var Queue: js.UndefOr[__string] = js.undefined
  /**
    * JobTemplateSettings contains all the transcode settings saved in the template that will be applied to jobs created from it.
    */
  var Settings: JobTemplateSettings
  /**
    * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins processing your job to the time it completes the transcode or encounters an error.
    */
  var StatusUpdateInterval: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.StatusUpdateInterval] = js.undefined
  /**
    * A job template can be of two types: system or custom. System or built-in job templates can't be modified or deleted by the user.
    */
  var Type: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.Type] = js.undefined
}

object JobTemplate {
  @scala.inline
  def apply(
    Name: __string,
    Settings: JobTemplateSettings,
    AccelerationSettings: AccelerationSettings = null,
    Arn: __string = null,
    Category: __string = null,
    CreatedAt: __timestampUnix = null,
    Description: __string = null,
    LastUpdated: __timestampUnix = null,
    Queue: __string = null,
    StatusUpdateInterval: StatusUpdateInterval = null,
    Type: Type = null
  ): JobTemplate = {
    val __obj = js.Dynamic.literal(Name = Name, Settings = Settings)
    if (AccelerationSettings != null) __obj.updateDynamic("AccelerationSettings")(AccelerationSettings)
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Category != null) __obj.updateDynamic("Category")(Category)
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (LastUpdated != null) __obj.updateDynamic("LastUpdated")(LastUpdated)
    if (Queue != null) __obj.updateDynamic("Queue")(Queue)
    if (StatusUpdateInterval != null) __obj.updateDynamic("StatusUpdateInterval")(StatusUpdateInterval.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobTemplate]
  }
}

