package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDedicatedIpResponse extends js.Object {
  /**
    * An object that contains information about a dedicated IP address.
    */
  var DedicatedIp: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.DedicatedIp] = js.native
}

object GetDedicatedIpResponse {
  @scala.inline
  def apply(DedicatedIp: DedicatedIp = null): GetDedicatedIpResponse = {
    val __obj = js.Dynamic.literal()
    if (DedicatedIp != null) __obj.updateDynamic("DedicatedIp")(DedicatedIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDedicatedIpResponse]
  }
}

