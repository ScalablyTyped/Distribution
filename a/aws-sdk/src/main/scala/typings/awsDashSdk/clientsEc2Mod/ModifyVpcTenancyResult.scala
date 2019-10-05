package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyVpcTenancyResult extends js.Object {
  /**
    * Returns true if the request succeeds; otherwise, returns an error.
    */
  var ReturnValue: js.UndefOr[Boolean] = js.undefined
}

object ModifyVpcTenancyResult {
  @scala.inline
  def apply(ReturnValue: js.UndefOr[scala.Boolean] = js.undefined): ModifyVpcTenancyResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ReturnValue)) __obj.updateDynamic("ReturnValue")(ReturnValue)
    __obj.asInstanceOf[ModifyVpcTenancyResult]
  }
}

