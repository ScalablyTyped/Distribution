package typings
package awsDashSdkLib.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyHapgResponse extends js.Object {
  /**
    * The ARN of the high-availability partition group.
    */
  var HapgArn: js.UndefOr[HapgArn] = js.undefined
}

object ModifyHapgResponse {
  @scala.inline
  def apply(HapgArn: HapgArn = null): ModifyHapgResponse = {
    val __obj = js.Dynamic.literal()
    if (HapgArn != null) __obj.updateDynamic("HapgArn")(HapgArn)
    __obj.asInstanceOf[ModifyHapgResponse]
  }
}

