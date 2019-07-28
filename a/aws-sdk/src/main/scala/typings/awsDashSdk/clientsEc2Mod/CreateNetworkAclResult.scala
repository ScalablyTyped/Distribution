package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNetworkAclResult extends js.Object {
  /**
    * Information about the network ACL.
    */
  var NetworkAcl: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.NetworkAcl] = js.undefined
}

object CreateNetworkAclResult {
  @scala.inline
  def apply(NetworkAcl: NetworkAcl = null): CreateNetworkAclResult = {
    val __obj = js.Dynamic.literal()
    if (NetworkAcl != null) __obj.updateDynamic("NetworkAcl")(NetworkAcl)
    __obj.asInstanceOf[CreateNetworkAclResult]
  }
}

