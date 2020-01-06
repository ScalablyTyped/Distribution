package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelSimulationJobRequest extends js.Object {
  /**
    * The simulation job ARN to cancel.
    */
  var job: Arn = js.native
}

object CancelSimulationJobRequest {
  @scala.inline
  def apply(job: Arn): CancelSimulationJobRequest = {
    val __obj = js.Dynamic.literal(job = job.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CancelSimulationJobRequest]
  }
}

