package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateBillingGroupResponse extends js.Object {
  /**
    * The latest version of the billing group.
    */
  var version: js.UndefOr[Version] = js.undefined
}

object UpdateBillingGroupResponse {
  @scala.inline
  def apply(version: js.UndefOr[Version] = js.undefined): UpdateBillingGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[UpdateBillingGroupResponse]
  }
}

