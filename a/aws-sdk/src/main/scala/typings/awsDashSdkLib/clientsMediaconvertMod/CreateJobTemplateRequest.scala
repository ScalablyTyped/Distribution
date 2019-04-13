package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateJobTemplateRequest extends js.Object {
  /**
    * This is a beta feature. If you are interested in using this feature please contact AWS customer support.
    */
  var AccelerationSettings: js.UndefOr[AccelerationSettings] = js.undefined
  /**
    * Optional. A category for the job template you are creating
    */
  var Category: js.UndefOr[__string] = js.undefined
  /**
    * Optional. A description of the job template you are creating.
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * The name of the job template you are creating.
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
  var StatusUpdateInterval: js.UndefOr[StatusUpdateInterval] = js.undefined
  /**
    * The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key.
    */
  var Tags: js.UndefOr[__mapOf__string] = js.undefined
}

object CreateJobTemplateRequest {
  @scala.inline
  def apply(
    Name: __string,
    Settings: JobTemplateSettings,
    AccelerationSettings: AccelerationSettings = null,
    Category: __string = null,
    Description: __string = null,
    Queue: __string = null,
    StatusUpdateInterval: StatusUpdateInterval = null,
    Tags: __mapOf__string = null
  ): CreateJobTemplateRequest = {
    val __obj = js.Dynamic.literal(Name = Name, Settings = Settings)
    if (AccelerationSettings != null) __obj.updateDynamic("AccelerationSettings")(AccelerationSettings)
    if (Category != null) __obj.updateDynamic("Category")(Category)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Queue != null) __obj.updateDynamic("Queue")(Queue)
    if (StatusUpdateInterval != null) __obj.updateDynamic("StatusUpdateInterval")(StatusUpdateInterval.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateJobTemplateRequest]
  }
}

