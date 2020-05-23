package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeOverrides extends js.Object {
  /**
    * The node property overrides for the job.
    */
  var nodePropertyOverrides: js.UndefOr[NodePropertyOverrides] = js.native
  /**
    * The number of nodes to use with a multi-node parallel job. This value overrides the number of nodes that are specified in the job definition. To use this override:   There must be at least one node range in your job definition that has an open upper boundary (such as : or n:).   The lower boundary of the node range specified in the job definition must be fewer than the number of nodes specified in the override.   The main node index specified in the job definition must be fewer than the number of nodes specified in the override.  
    */
  var numNodes: js.UndefOr[Integer] = js.native
}

object NodeOverrides {
  @scala.inline
  def apply(nodePropertyOverrides: NodePropertyOverrides = null, numNodes: js.UndefOr[Integer] = js.undefined): NodeOverrides = {
    val __obj = js.Dynamic.literal()
    if (nodePropertyOverrides != null) __obj.updateDynamic("nodePropertyOverrides")(nodePropertyOverrides.asInstanceOf[js.Any])
    if (!js.isUndefined(numNodes)) __obj.updateDynamic("numNodes")(numNodes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeOverrides]
  }
}

