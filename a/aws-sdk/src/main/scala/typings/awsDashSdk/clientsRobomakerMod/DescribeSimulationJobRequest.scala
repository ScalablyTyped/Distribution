package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSimulationJobRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the simulation job to be described.
    */
  var job: Arn
}

object DescribeSimulationJobRequest {
  @scala.inline
  def apply(job: Arn): DescribeSimulationJobRequest = {
    val __obj = js.Dynamic.literal(job = job)
  
    __obj.asInstanceOf[DescribeSimulationJobRequest]
  }
}

