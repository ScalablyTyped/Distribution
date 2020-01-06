package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelDeploymentJobRequest extends js.Object {
  /**
    * The deployment job ARN to cancel.
    */
  var job: Arn = js.native
}

object CancelDeploymentJobRequest {
  @scala.inline
  def apply(job: Arn): CancelDeploymentJobRequest = {
    val __obj = js.Dynamic.literal(job = job.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CancelDeploymentJobRequest]
  }
}

