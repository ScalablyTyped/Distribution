package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkFrameworkAttributes extends js.Object {
  /**
    * Attributes of Hyperledger Fabric for a Managed Blockchain network that uses Hyperledger Fabric.
    */
  var Fabric: js.UndefOr[NetworkFabricAttributes] = js.native
}

object NetworkFrameworkAttributes {
  @scala.inline
  def apply(Fabric: NetworkFabricAttributes = null): NetworkFrameworkAttributes = {
    val __obj = js.Dynamic.literal()
    if (Fabric != null) __obj.updateDynamic("Fabric")(Fabric.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkFrameworkAttributes]
  }
}

