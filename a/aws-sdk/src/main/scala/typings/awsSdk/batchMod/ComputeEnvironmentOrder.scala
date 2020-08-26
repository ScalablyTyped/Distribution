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
  @scala.inline
  implicit class ComputeEnvironmentOrderOps[Self <: ComputeEnvironmentOrder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComputeEnvironment(value: String): Self = this.set("computeEnvironment", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder(value: Integer): Self = this.set("order", value.asInstanceOf[js.Any])
  }
  
}

