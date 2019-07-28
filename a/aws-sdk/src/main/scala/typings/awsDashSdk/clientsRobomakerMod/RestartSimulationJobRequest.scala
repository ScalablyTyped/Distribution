package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestartSimulationJobRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the simulation job.
    */
  var job: Arn
}

object RestartSimulationJobRequest {
  @scala.inline
  def apply(job: Arn): RestartSimulationJobRequest = {
    val __obj = js.Dynamic.literal(job = job)
  
    __obj.asInstanceOf[RestartSimulationJobRequest]
  }
}

