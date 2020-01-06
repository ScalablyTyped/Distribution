package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSimulationJobRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the simulation job to be described.
    */
  var job: Arn = js.native
}

object DescribeSimulationJobRequest {
  @scala.inline
  def apply(job: Arn): DescribeSimulationJobRequest = {
    val __obj = js.Dynamic.literal(job = job.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeSimulationJobRequest]
  }
}

