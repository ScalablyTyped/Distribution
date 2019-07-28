package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncDeploymentJobRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: ClientRequestToken
  /**
    * The target fleet for the synchronization.
    */
  var fleet: Arn
}

object SyncDeploymentJobRequest {
  @scala.inline
  def apply(clientRequestToken: ClientRequestToken, fleet: Arn): SyncDeploymentJobRequest = {
    val __obj = js.Dynamic.literal(clientRequestToken = clientRequestToken, fleet = fleet)
  
    __obj.asInstanceOf[SyncDeploymentJobRequest]
  }
}

