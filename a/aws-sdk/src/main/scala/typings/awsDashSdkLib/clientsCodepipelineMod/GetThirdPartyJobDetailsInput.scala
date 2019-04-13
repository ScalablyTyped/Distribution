package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetThirdPartyJobDetailsInput extends js.Object {
  /**
    * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed access to the job and its details.
    */
  var clientToken: ClientToken
  /**
    * The unique system-generated ID used for identifying the job.
    */
  var jobId: ThirdPartyJobId
}

object GetThirdPartyJobDetailsInput {
  @scala.inline
  def apply(clientToken: ClientToken, jobId: ThirdPartyJobId): GetThirdPartyJobDetailsInput = {
    val __obj = js.Dynamic.literal(clientToken = clientToken, jobId = jobId)
  
    __obj.asInstanceOf[GetThirdPartyJobDetailsInput]
  }
}

