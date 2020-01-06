package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteHapgRequest extends js.Object {
  /**
    * The ARN of the high-availability partition group to delete.
    */
  var HapgArn: typings.awsDashSdk.clientsCloudhsmMod.HapgArn = js.native
}

object DeleteHapgRequest {
  @scala.inline
  def apply(HapgArn: HapgArn): DeleteHapgRequest = {
    val __obj = js.Dynamic.literal(HapgArn = HapgArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteHapgRequest]
  }
}

