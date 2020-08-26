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
  @scala.inline
  implicit class NodePropertiesOps[Self <: NodeProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMainNode(value: Integer): Self = this.set("mainNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeRangePropertiesVarargs(value: NodeRangeProperty*): Self = this.set("nodeRangeProperties", js.Array(value :_*))
    @scala.inline
    def setNodeRangeProperties(value: NodeRangeProperties): Self = this.set("nodeRangeProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumNodes(value: Integer): Self = this.set("numNodes", value.asInstanceOf[js.Any])
  }
  
}

