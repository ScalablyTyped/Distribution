package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcknowledgeThirdPartyJobInput extends js.Object {
  /**
    * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed access to the job and its details.
    */
  var clientToken: ClientToken
  /**
    * The unique system-generated ID of the job.
    */
  var jobId: ThirdPartyJobId
  /**
    * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one job worker. Get this number from the response to a GetThirdPartyJobDetails request.
    */
  var nonce: Nonce
}

object AcknowledgeThirdPartyJobInput {
  @scala.inline
  def apply(clientToken: ClientToken, jobId: ThirdPartyJobId, nonce: Nonce): AcknowledgeThirdPartyJobInput = {
    val __obj = js.Dynamic.literal(clientToken = clientToken, jobId = jobId, nonce = nonce)
  
    __obj.asInstanceOf[AcknowledgeThirdPartyJobInput]
  }
}

