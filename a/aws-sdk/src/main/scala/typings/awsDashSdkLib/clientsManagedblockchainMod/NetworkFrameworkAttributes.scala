package typings
package awsDashSdkLib.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkFrameworkAttributes extends js.Object {
  /**
    * Attributes of Hyperledger Fabric for a Managed Blockchain network that uses Hyperledger Fabric.
    */
  var Fabric: js.UndefOr[NetworkFabricAttributes] = js.undefined
}

object NetworkFrameworkAttributes {
  @scala.inline
  def apply(Fabric: NetworkFabricAttributes = null): NetworkFrameworkAttributes = {
    val __obj = js.Dynamic.literal()
    if (Fabric != null) __obj.updateDynamic("Fabric")(Fabric)
    __obj.asInstanceOf[NetworkFrameworkAttributes]
  }
}

