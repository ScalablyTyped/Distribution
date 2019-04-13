package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutThirdPartyJobFailureResultInput extends js.Object {
  /**
    * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed access to the job and its details.
    */
  var clientToken: ClientToken
  /**
    * Represents information about failure details.
    */
  var failureDetails: FailureDetails
  /**
    * The ID of the job that failed. This is the same ID returned from PollForThirdPartyJobs.
    */
  var jobId: ThirdPartyJobId
}

object PutThirdPartyJobFailureResultInput {
  @scala.inline
  def apply(clientToken: ClientToken, failureDetails: FailureDetails, jobId: ThirdPartyJobId): PutThirdPartyJobFailureResultInput = {
    val __obj = js.Dynamic.literal(clientToken = clientToken, failureDetails = failureDetails, jobId = jobId)
  
    __obj.asInstanceOf[PutThirdPartyJobFailureResultInput]
  }
}

