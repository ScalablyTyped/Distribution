package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyHsmResponse extends js.Object {
  /**
    * The ARN of the HSM.
    */
  var HsmArn: js.UndefOr[typings.awsDashSdk.clientsCloudhsmMod.HsmArn] = js.undefined
}

object ModifyHsmResponse {
  @scala.inline
  def apply(HsmArn: HsmArn = null): ModifyHsmResponse = {
    val __obj = js.Dynamic.literal()
    if (HsmArn != null) __obj.updateDynamic("HsmArn")(HsmArn)
    __obj.asInstanceOf[ModifyHsmResponse]
  }
}

