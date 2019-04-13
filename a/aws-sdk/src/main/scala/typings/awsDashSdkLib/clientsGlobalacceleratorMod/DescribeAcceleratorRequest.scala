package typings
package awsDashSdkLib.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAcceleratorRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the accelerator to describe.
    */
  var AcceleratorArn: GenericString
}

object DescribeAcceleratorRequest {
  @scala.inline
  def apply(AcceleratorArn: GenericString): DescribeAcceleratorRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn)
  
    __obj.asInstanceOf[DescribeAcceleratorRequest]
  }
}

