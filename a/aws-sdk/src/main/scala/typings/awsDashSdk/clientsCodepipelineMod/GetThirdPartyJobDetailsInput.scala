package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetThirdPartyJobDetailsInput extends js.Object {
  /**
    * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed access to the job and its details.
    */
  var clientToken: ClientToken = js.native
  /**
    * The unique system-generated ID used for identifying the job.
    */
  var jobId: ThirdPartyJobId = js.native
}

object GetThirdPartyJobDetailsInput {
  @scala.inline
  def apply(clientToken: ClientToken, jobId: ThirdPartyJobId): GetThirdPartyJobDetailsInput = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetThirdPartyJobDetailsInput]
  }
}

