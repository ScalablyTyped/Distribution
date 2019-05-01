package typings
package awsDashSdkLib.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeFrameworkAttributes extends js.Object {
  /**
    * Attributes of Hyperledger Fabric for a peer node on a Managed Blockchain network that uses Hyperledger Fabric.
    */
  var Fabric: js.UndefOr[NodeFabricAttributes] = js.undefined
}

object NodeFrameworkAttributes {
  @scala.inline
  def apply(Fabric: NodeFabricAttributes = null): NodeFrameworkAttributes = {
    val __obj = js.Dynamic.literal()
    if (Fabric != null) __obj.updateDynamic("Fabric")(Fabric)
    __obj.asInstanceOf[NodeFrameworkAttributes]
  }
}

