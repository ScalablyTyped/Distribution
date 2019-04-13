package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterNode extends js.Object {
  /**
    * Whether the node is a leader node or a compute node.
    */
  var NodeRole: js.UndefOr[String] = js.undefined
  /**
    * The private IP address of a node within a cluster.
    */
  var PrivateIPAddress: js.UndefOr[String] = js.undefined
  /**
    * The public IP address of a node within a cluster.
    */
  var PublicIPAddress: js.UndefOr[String] = js.undefined
}

object ClusterNode {
  @scala.inline
  def apply(NodeRole: String = null, PrivateIPAddress: String = null, PublicIPAddress: String = null): ClusterNode = {
    val __obj = js.Dynamic.literal()
    if (NodeRole != null) __obj.updateDynamic("NodeRole")(NodeRole)
    if (PrivateIPAddress != null) __obj.updateDynamic("PrivateIPAddress")(PrivateIPAddress)
    if (PublicIPAddress != null) __obj.updateDynamic("PublicIPAddress")(PublicIPAddress)
    __obj.asInstanceOf[ClusterNode]
  }
}

