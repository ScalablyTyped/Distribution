package typings
package awsDashSdkLib.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberFrameworkAttributes extends js.Object {
  /**
    * Attributes of Hyperledger Fabric relevant to a member on a Managed Blockchain network that uses Hyperledger Fabric.
    */
  var Fabric: js.UndefOr[MemberFabricAttributes] = js.undefined
}

object MemberFrameworkAttributes {
  @scala.inline
  def apply(Fabric: MemberFabricAttributes = null): MemberFrameworkAttributes = {
    val __obj = js.Dynamic.literal()
    if (Fabric != null) __obj.updateDynamic("Fabric")(Fabric)
    __obj.asInstanceOf[MemberFrameworkAttributes]
  }
}

