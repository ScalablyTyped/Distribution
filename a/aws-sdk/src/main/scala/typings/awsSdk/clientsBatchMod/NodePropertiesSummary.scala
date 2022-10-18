package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodePropertiesSummary extends StObject {
  
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
  
  inline def apply(): NodePropertiesSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodePropertiesSummary]
  }
  
  extension [Self <: NodePropertiesSummary](x: Self) {
    
    inline def setIsMainNode(value: Boolean): Self = StObject.set(x, "isMainNode", value.asInstanceOf[js.Any])
    
    inline def setIsMainNodeUndefined: Self = StObject.set(x, "isMainNode", js.undefined)
    
    inline def setNodeIndex(value: Integer): Self = StObject.set(x, "nodeIndex", value.asInstanceOf[js.Any])
    
    inline def setNodeIndexUndefined: Self = StObject.set(x, "nodeIndex", js.undefined)
    
    inline def setNumNodes(value: Integer): Self = StObject.set(x, "numNodes", value.asInstanceOf[js.Any])
    
    inline def setNumNodesUndefined: Self = StObject.set(x, "numNodes", js.undefined)
  }
}
