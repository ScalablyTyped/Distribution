package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiplexMediaConnectOutputDestinationSettings extends js.Object {
  /**
    * The MediaConnect entitlement ARN available as a Flow source.
    */
  var EntitlementArn: js.UndefOr[__stringMin1] = js.native
}

object MultiplexMediaConnectOutputDestinationSettings {
  @scala.inline
  def apply(EntitlementArn: __stringMin1 = null): MultiplexMediaConnectOutputDestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (EntitlementArn != null) __obj.updateDynamic("EntitlementArn")(EntitlementArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexMediaConnectOutputDestinationSettings]
  }
}

