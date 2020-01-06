package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  /**
    * The Availability Zone (AZ) in which the node has been deployed.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The endpoint for the node, consisting of a DNS name and a port number. Client applications can connect directly to a node endpoint, if desired (as an alternative to allowing DAX client software to intelligently route requests and responses to nodes in the DAX cluster.
    */
  var Endpoint: js.UndefOr[typings.awsDashSdk.clientsDaxMod.Endpoint] = js.native
  /**
    * The date and time (in UNIX epoch format) when the node was launched.
    */
  var NodeCreateTime: js.UndefOr[TStamp] = js.native
  /**
    * A system-generated identifier for the node.
    */
  var NodeId: js.UndefOr[String] = js.native
  /**
    * The current status of the node. For example: available.
    */
  var NodeStatus: js.UndefOr[String] = js.native
  /**
    * The status of the parameter group associated with this node. For example, in-sync.
    */
  var ParameterGroupStatus: js.UndefOr[String] = js.native
}

object Node {
  @scala.inline
  def apply(
    AvailabilityZone: String = null,
    Endpoint: Endpoint = null,
    NodeCreateTime: TStamp = null,
    NodeId: String = null,
    NodeStatus: String = null,
    ParameterGroupStatus: String = null
  ): Node = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint.asInstanceOf[js.Any])
    if (NodeCreateTime != null) __obj.updateDynamic("NodeCreateTime")(NodeCreateTime.asInstanceOf[js.Any])
    if (NodeId != null) __obj.updateDynamic("NodeId")(NodeId.asInstanceOf[js.Any])
    if (NodeStatus != null) __obj.updateDynamic("NodeStatus")(NodeStatus.asInstanceOf[js.Any])
    if (ParameterGroupStatus != null) __obj.updateDynamic("ParameterGroupStatus")(ParameterGroupStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

