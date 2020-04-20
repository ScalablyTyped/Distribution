package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputeEnvironmentOrder extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the compute environment.
    */
  var computeEnvironment: String = js.native
  /**
    * The order of the compute environment.
    */
  var order: Integer = js.native
}

object ComputeEnvironmentOrder {
  @scala.inline
  def apply(computeEnvironment: String, order: Integer): ComputeEnvironmentOrder = {
    val __obj = js.Dynamic.literal(computeEnvironment = computeEnvironment.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeEnvironmentOrder]
  }
}

