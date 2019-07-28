package typings.awsDashSdk.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAcceleratorRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an accelerator.
    */
  var AcceleratorArn: GenericString
}

object DeleteAcceleratorRequest {
  @scala.inline
  def apply(AcceleratorArn: GenericString): DeleteAcceleratorRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn)
  
    __obj.asInstanceOf[DeleteAcceleratorRequest]
  }
}

