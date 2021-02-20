package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeProperties extends StObject {
  
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
  implicit class NodePropertiesMutableBuilder[Self <: NodeProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMainNode(value: Integer): Self = StObject.set(x, "mainNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeRangeProperties(value: NodeRangeProperties): Self = StObject.set(x, "nodeRangeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeRangePropertiesVarargs(value: NodeRangeProperty*): Self = StObject.set(x, "nodeRangeProperties", js.Array(value :_*))
    
    @scala.inline
    def setNumNodes(value: Integer): Self = StObject.set(x, "numNodes", value.asInstanceOf[js.Any])
  }
}
