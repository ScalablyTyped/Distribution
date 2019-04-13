package typings
package awsDashSdkLib.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelSimulationJobRequest extends js.Object {
  /**
    * The simulation job ARN to cancel.
    */
  var job: Arn
}

object CancelSimulationJobRequest {
  @scala.inline
  def apply(job: Arn): CancelSimulationJobRequest = {
    val __obj = js.Dynamic.literal(job = job)
  
    __obj.asInstanceOf[CancelSimulationJobRequest]
  }
}

