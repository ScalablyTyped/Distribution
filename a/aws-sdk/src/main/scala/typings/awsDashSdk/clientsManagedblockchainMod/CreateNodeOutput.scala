package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNodeOutput extends js.Object {
  /**
    * The unique identifier of the node.
    */
  var NodeId: js.UndefOr[ResourceIdString] = js.native
}

object CreateNodeOutput {
  @scala.inline
  def apply(NodeId: ResourceIdString = null): CreateNodeOutput = {
    val __obj = js.Dynamic.literal()
    if (NodeId != null) __obj.updateDynamic("NodeId")(NodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNodeOutput]
  }
}

