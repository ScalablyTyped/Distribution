package typings
package awsDashSdkLib.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNodeOutput extends js.Object {
  /**
    * Properties of the node configuration.
    */
  var Node: js.UndefOr[Node] = js.undefined
}

object GetNodeOutput {
  @scala.inline
  def apply(Node: Node = null): GetNodeOutput = {
    val __obj = js.Dynamic.literal()
    if (Node != null) __obj.updateDynamic("Node")(Node)
    __obj.asInstanceOf[GetNodeOutput]
  }
}

