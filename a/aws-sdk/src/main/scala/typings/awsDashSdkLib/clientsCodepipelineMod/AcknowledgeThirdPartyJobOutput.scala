package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcknowledgeThirdPartyJobOutput extends js.Object {
  /**
    * The status information for the third party job, if any.
    */
  var status: js.UndefOr[JobStatus] = js.undefined
}

object AcknowledgeThirdPartyJobOutput {
  @scala.inline
  def apply(status: JobStatus = null): AcknowledgeThirdPartyJobOutput = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcknowledgeThirdPartyJobOutput]
  }
}

