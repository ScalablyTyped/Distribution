package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobTemplateResponse extends js.Object {
  /**
    * A job template is a pre-made set of encoding instructions that you can use to quickly create a job.
    */
  var JobTemplate: js.UndefOr[JobTemplate] = js.undefined
}

object GetJobTemplateResponse {
  @scala.inline
  def apply(JobTemplate: JobTemplate = null): GetJobTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (JobTemplate != null) __obj.updateDynamic("JobTemplate")(JobTemplate)
    __obj.asInstanceOf[GetJobTemplateResponse]
  }
}

