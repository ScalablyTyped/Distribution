package typings
package awsDashSdkLib.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelDeploymentJobRequest extends js.Object {
  /**
    * The deployment job ARN to cancel.
    */
  var job: Arn
}

object CancelDeploymentJobRequest {
  @scala.inline
  def apply(job: Arn): CancelDeploymentJobRequest = {
    val __obj = js.Dynamic.literal(job = job)
  
    __obj.asInstanceOf[CancelDeploymentJobRequest]
  }
}

