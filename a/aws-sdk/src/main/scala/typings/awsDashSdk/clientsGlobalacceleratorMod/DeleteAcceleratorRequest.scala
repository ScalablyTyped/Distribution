package typings.awsDashSdk.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAcceleratorRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an accelerator.
    */
  var AcceleratorArn: GenericString = js.native
}

object DeleteAcceleratorRequest {
  @scala.inline
  def apply(AcceleratorArn: GenericString): DeleteAcceleratorRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteAcceleratorRequest]
  }
}

