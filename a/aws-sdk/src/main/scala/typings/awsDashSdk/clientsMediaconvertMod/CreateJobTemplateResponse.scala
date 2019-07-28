package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateJobTemplateResponse extends js.Object {
  /**
    * A job template is a pre-made set of encoding instructions that you can use to quickly create a job.
    */
  var JobTemplate: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.JobTemplate] = js.undefined
}

object CreateJobTemplateResponse {
  @scala.inline
  def apply(JobTemplate: JobTemplate = null): CreateJobTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (JobTemplate != null) __obj.updateDynamic("JobTemplate")(JobTemplate)
    __obj.asInstanceOf[CreateJobTemplateResponse]
  }
}

