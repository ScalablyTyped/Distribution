package typings
package awsDashSdkLib.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputeEnvironmentOrder extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the compute environment.
    */
  var computeEnvironment: String
  /**
    * The order of the compute environment.
    */
  var order: Integer
}

object ComputeEnvironmentOrder {
  @scala.inline
  def apply(computeEnvironment: String, order: Integer): ComputeEnvironmentOrder = {
    val __obj = js.Dynamic.literal(computeEnvironment = computeEnvironment, order = order)
  
    __obj.asInstanceOf[ComputeEnvironmentOrder]
  }
}

