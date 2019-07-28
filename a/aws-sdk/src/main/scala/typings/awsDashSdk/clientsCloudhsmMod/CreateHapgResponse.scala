package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateHapgResponse extends js.Object {
  /**
    * The ARN of the high-availability partition group.
    */
  var HapgArn: js.UndefOr[typings.awsDashSdk.clientsCloudhsmMod.HapgArn] = js.undefined
}

object CreateHapgResponse {
  @scala.inline
  def apply(HapgArn: HapgArn = null): CreateHapgResponse = {
    val __obj = js.Dynamic.literal()
    if (HapgArn != null) __obj.updateDynamic("HapgArn")(HapgArn)
    __obj.asInstanceOf[CreateHapgResponse]
  }
}

