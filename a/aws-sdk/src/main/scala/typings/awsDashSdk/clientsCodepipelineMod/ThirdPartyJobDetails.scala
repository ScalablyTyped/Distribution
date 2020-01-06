package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThirdPartyJobDetails extends js.Object {
  /**
    * The data to be returned by the third party job worker.
    */
  var data: js.UndefOr[ThirdPartyJobData] = js.native
  /**
    * The identifier used to identify the job details in AWS CodePipeline.
    */
  var id: js.UndefOr[ThirdPartyJobId] = js.native
  /**
    * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one job worker. Use this number in an AcknowledgeThirdPartyJob request.
    */
  var nonce: js.UndefOr[Nonce] = js.native
}

object ThirdPartyJobDetails {
  @scala.inline
  def apply(data: ThirdPartyJobData = null, id: ThirdPartyJobId = null, nonce: Nonce = null): ThirdPartyJobDetails = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThirdPartyJobDetails]
  }
}

