package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodePropertiesSummary extends js.Object {
  /**
    * Specifies whether the current node is the main node for a multi-node parallel job.
    */
  var isMainNode: js.UndefOr[Boolean] = js.undefined
  /**
    * The node index for the node. Node index numbering begins at zero. This index is also available on the node with the AWS_BATCH_JOB_NODE_INDEX environment variable.
    */
  var nodeIndex: js.UndefOr[Integer] = js.undefined
  /**
    * The number of nodes associated with a multi-node parallel job.
    */
  var numNodes: js.UndefOr[Integer] = js.undefined
}

object NodePropertiesSummary {
  @scala.inline
  def apply(
    isMainNode: js.UndefOr[Boolean] = js.undefined,
    nodeIndex: js.UndefOr[Integer] = js.undefined,
    numNodes: js.UndefOr[Integer] = js.undefined
  ): NodePropertiesSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isMainNode)) __obj.updateDynamic("isMainNode")(isMainNode)
    if (!js.isUndefined(nodeIndex)) __obj.updateDynamic("nodeIndex")(nodeIndex)
    if (!js.isUndefined(numNodes)) __obj.updateDynamic("numNodes")(numNodes)
    __obj.asInstanceOf[NodePropertiesSummary]
  }
}

