package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeClusterMessage extends js.Object {
  /**
    * A boolean value indicating whether the resize operation is using the classic resize process. If you don't provide this parameter or set the value to false, the resize type is elastic. 
    */
  var Classic: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The unique identifier for the cluster to resize.
    */
  var ClusterIdentifier: String
  /**
    * The new cluster type for the specified cluster.
    */
  var ClusterType: js.UndefOr[String] = js.undefined
  /**
    * The new node type for the nodes you are adding.
    */
  var NodeType: js.UndefOr[String] = js.undefined
  /**
    * The new number of nodes for the cluster.
    */
  var NumberOfNodes: Integer
}

object ResizeClusterMessage {
  @scala.inline
  def apply(
    ClusterIdentifier: String,
    NumberOfNodes: Integer,
    Classic: js.UndefOr[BooleanOptional] = js.undefined,
    ClusterType: String = null,
    NodeType: String = null
  ): ResizeClusterMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier, NumberOfNodes = NumberOfNodes)
    if (!js.isUndefined(Classic)) __obj.updateDynamic("Classic")(Classic)
    if (ClusterType != null) __obj.updateDynamic("ClusterType")(ClusterType)
    if (NodeType != null) __obj.updateDynamic("NodeType")(NodeType)
    __obj.asInstanceOf[ResizeClusterMessage]
  }
}

