package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyHsmResponse extends js.Object {
  /**
    * The ARN of the HSM.
    */
  var HsmArn: js.UndefOr[typings.awsDashSdk.clientsCloudhsmMod.HsmArn] = js.native
}

object ModifyHsmResponse {
  @scala.inline
  def apply(HsmArn: HsmArn = null): ModifyHsmResponse = {
    val __obj = js.Dynamic.literal()
    if (HsmArn != null) __obj.updateDynamic("HsmArn")(HsmArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyHsmResponse]
  }
}

