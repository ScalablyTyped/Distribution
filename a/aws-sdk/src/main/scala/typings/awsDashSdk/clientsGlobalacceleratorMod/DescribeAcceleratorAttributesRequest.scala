package typings.awsDashSdk.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAcceleratorAttributesRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the accelerator with the attributes that you want to describe.
    */
  var AcceleratorArn: GenericString = js.native
}

object DescribeAcceleratorAttributesRequest {
  @scala.inline
  def apply(AcceleratorArn: GenericString): DescribeAcceleratorAttributesRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeAcceleratorAttributesRequest]
  }
}

