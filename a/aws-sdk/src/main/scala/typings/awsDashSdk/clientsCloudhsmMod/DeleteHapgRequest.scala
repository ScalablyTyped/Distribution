package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteHapgRequest extends js.Object {
  /**
    * The ARN of the high-availability partition group to delete.
    */
  var HapgArn: typings.awsDashSdk.clientsCloudhsmMod.HapgArn
}

object DeleteHapgRequest {
  @scala.inline
  def apply(HapgArn: HapgArn): DeleteHapgRequest = {
    val __obj = js.Dynamic.literal(HapgArn = HapgArn)
  
    __obj.asInstanceOf[DeleteHapgRequest]
  }
}

