package typings
package awsDashSdkLib.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAcceleratorAttributesRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the accelerator with the attributes that you want to describe. Value is required.
    */
  var AcceleratorArn: js.UndefOr[GenericString] = js.undefined
}

object DescribeAcceleratorAttributesRequest {
  @scala.inline
  def apply(AcceleratorArn: GenericString = null): DescribeAcceleratorAttributesRequest = {
    val __obj = js.Dynamic.literal()
    if (AcceleratorArn != null) __obj.updateDynamic("AcceleratorArn")(AcceleratorArn)
    __obj.asInstanceOf[DescribeAcceleratorAttributesRequest]
  }
}

