package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeProperties extends js.Object {
  /**
    * Specifies the node index for the main node of a multi-node parallel job. This node index value must be fewer than the number of nodes.
    */
  var mainNode: Integer = js.native
  /**
    * A list of node ranges and their properties associated with a multi-node parallel job.
    */
  var nodeRangeProperties: NodeRangeProperties = js.native
  /**
    * The number of nodes associated with a multi-node parallel job.
    */
  var numNodes: Integer = js.native
}

object NodeProperties {
  @scala.inline
  def apply(mainNode: Integer, nodeRangeProperties: NodeRangeProperties, numNodes: Integer): NodeProperties = {
    val __obj = js.Dynamic.literal(mainNode = mainNode.asInstanceOf[js.Any], nodeRangeProperties = nodeRangeProperties.asInstanceOf[js.Any], numNodes = numNodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NodeProperties]
  }
}

