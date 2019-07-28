package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThirdPartyJob extends js.Object {
  /**
    * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed access to the job and its details.
    */
  var clientId: js.UndefOr[ClientId] = js.undefined
  /**
    * The identifier used to identify the job in AWS CodePipeline.
    */
  var jobId: js.UndefOr[JobId] = js.undefined
}

object ThirdPartyJob {
  @scala.inline
  def apply(clientId: ClientId = null, jobId: JobId = null): ThirdPartyJob = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (jobId != null) __obj.updateDynamic("jobId")(jobId)
    __obj.asInstanceOf[ThirdPartyJob]
  }
}

