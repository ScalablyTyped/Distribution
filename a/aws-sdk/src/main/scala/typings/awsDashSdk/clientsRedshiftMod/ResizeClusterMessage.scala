package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeClusterMessage extends js.Object {
  /**
    * A boolean value indicating whether the resize operation is using the classic resize process. If you don't provide this parameter or set the value to false, the resize type is elastic. 
    */
  var Classic: js.UndefOr[BooleanOptional] = js.native
  /**
    * The unique identifier for the cluster to resize.
    */
  var ClusterIdentifier: String = js.native
  /**
    * The new cluster type for the specified cluster.
    */
  var ClusterType: js.UndefOr[String] = js.native
  /**
    * The new node type for the nodes you are adding. If not specified, the cluster's current node type is used.
    */
  var NodeType: js.UndefOr[String] = js.native
  /**
    * The new number of nodes for the cluster.
    */
  var NumberOfNodes: Integer = js.native
}

object ResizeClusterMessage {
  @scala.inline
  def apply(
    ClusterIdentifier: String,
    NumberOfNodes: Integer,
    Classic: js.UndefOr[scala.Boolean] = js.undefined,
    ClusterType: String = null,
    NodeType: String = null
  ): ResizeClusterMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any], NumberOfNodes = NumberOfNodes.asInstanceOf[js.Any])
    if (!js.isUndefined(Classic)) __obj.updateDynamic("Classic")(Classic.asInstanceOf[js.Any])
    if (ClusterType != null) __obj.updateDynamic("ClusterType")(ClusterType.asInstanceOf[js.Any])
    if (NodeType != null) __obj.updateDynamic("NodeType")(NodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeClusterMessage]
  }
}

