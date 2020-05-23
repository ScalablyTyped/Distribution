package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeDetails extends js.Object {
  /**
    * Specifies whether the current node is the main node for a multi-node parallel job.
    */
  var isMainNode: js.UndefOr[Boolean] = js.native
  /**
    * The node index for the node. Node index numbering begins at zero. This index is also available on the node with the AWS_BATCH_JOB_NODE_INDEX environment variable.
    */
  var nodeIndex: js.UndefOr[Integer] = js.native
}

object NodeDetails {
  @scala.inline
  def apply(isMainNode: js.UndefOr[Boolean] = js.undefined, nodeIndex: js.UndefOr[Integer] = js.undefined): NodeDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isMainNode)) __obj.updateDynamic("isMainNode")(isMainNode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nodeIndex)) __obj.updateDynamic("nodeIndex")(nodeIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeDetails]
  }
}

