package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcknowledgeJobOutput extends js.Object {
  /**
    * Whether the job worker has received the specified job.
    */
  var status: js.UndefOr[JobStatus] = js.undefined
}

object AcknowledgeJobOutput {
  @scala.inline
  def apply(status: JobStatus = null): AcknowledgeJobOutput = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcknowledgeJobOutput]
  }
}

