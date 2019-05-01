package typings
package awsDashSdkLib.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNodeOutput extends js.Object {
  /**
    * The unique identifier of the node.
    */
  var NodeId: js.UndefOr[ResourceIdString] = js.undefined
}

object CreateNodeOutput {
  @scala.inline
  def apply(NodeId: ResourceIdString = null): CreateNodeOutput = {
    val __obj = js.Dynamic.literal()
    if (NodeId != null) __obj.updateDynamic("NodeId")(NodeId)
    __obj.asInstanceOf[CreateNodeOutput]
  }
}

