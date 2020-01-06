package typings.awsDashSdk.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAcceleratorRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the accelerator to describe.
    */
  var AcceleratorArn: GenericString = js.native
}

object DescribeAcceleratorRequest {
  @scala.inline
  def apply(AcceleratorArn: GenericString): DescribeAcceleratorRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeAcceleratorRequest]
  }
}

