package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociatedTargetNetwork extends js.Object {
  /**
    * The ID of the subnet.
    */
  var NetworkId: js.UndefOr[String] = js.native
  /**
    * The target network type.
    */
  var NetworkType: js.UndefOr[AssociatedNetworkType] = js.native
}

object AssociatedTargetNetwork {
  @scala.inline
  def apply(NetworkId: String = null, NetworkType: AssociatedNetworkType = null): AssociatedTargetNetwork = {
    val __obj = js.Dynamic.literal()
    if (NetworkId != null) __obj.updateDynamic("NetworkId")(NetworkId.asInstanceOf[js.Any])
    if (NetworkType != null) __obj.updateDynamic("NetworkType")(NetworkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociatedTargetNetwork]
  }
}

