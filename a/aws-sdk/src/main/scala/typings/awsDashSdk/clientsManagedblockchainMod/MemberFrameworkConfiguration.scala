package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberFrameworkConfiguration extends js.Object {
  /**
    * Attributes of Hyperledger Fabric for a member on a Managed Blockchain network that uses Hyperledger Fabric.
    */
  var Fabric: js.UndefOr[MemberFabricConfiguration] = js.undefined
}

object MemberFrameworkConfiguration {
  @scala.inline
  def apply(Fabric: MemberFabricConfiguration = null): MemberFrameworkConfiguration = {
    val __obj = js.Dynamic.literal()
    if (Fabric != null) __obj.updateDynamic("Fabric")(Fabric)
    __obj.asInstanceOf[MemberFrameworkConfiguration]
  }
}

