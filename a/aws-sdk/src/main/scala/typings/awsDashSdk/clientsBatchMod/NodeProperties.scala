package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeProperties extends js.Object {
  /**
    * Specifies the node index for the main node of a multi-node parallel job. This node index value must be fewer than the number of nodes.
    */
  var mainNode: Integer
  /**
    * A list of node ranges and their properties associated with a multi-node parallel job.
    */
  var nodeRangeProperties: NodeRangeProperties
  /**
    * The number of nodes associated with a multi-node parallel job.
    */
  var numNodes: Integer
}

object NodeProperties {
  @scala.inline
  def apply(mainNode: Integer, nodeRangeProperties: NodeRangeProperties, numNodes: Integer): NodeProperties = {
    val __obj = js.Dynamic.literal(mainNode = mainNode, nodeRangeProperties = nodeRangeProperties, numNodes = numNodes)
  
    __obj.asInstanceOf[NodeProperties]
  }
}

