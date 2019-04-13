package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyVpcEndpointServicePermissionsResult extends js.Object {
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var ReturnValue: js.UndefOr[Boolean] = js.undefined
}

object ModifyVpcEndpointServicePermissionsResult {
  @scala.inline
  def apply(ReturnValue: js.UndefOr[Boolean] = js.undefined): ModifyVpcEndpointServicePermissionsResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ReturnValue)) __obj.updateDynamic("ReturnValue")(ReturnValue)
    __obj.asInstanceOf[ModifyVpcEndpointServicePermissionsResult]
  }
}

