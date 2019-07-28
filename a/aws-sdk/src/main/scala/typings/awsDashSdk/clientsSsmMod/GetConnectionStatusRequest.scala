package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectionStatusRequest extends js.Object {
  /**
    * The ID of the instance.
    */
  var Target: SessionTarget
}

object GetConnectionStatusRequest {
  @scala.inline
  def apply(Target: SessionTarget): GetConnectionStatusRequest = {
    val __obj = js.Dynamic.literal(Target = Target)
  
    __obj.asInstanceOf[GetConnectionStatusRequest]
  }
}

