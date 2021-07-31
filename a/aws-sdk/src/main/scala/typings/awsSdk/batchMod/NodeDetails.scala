package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeDetails extends StObject {
  
  /**
    * Specifies whether the current node is the main node for a multi-node parallel job.
    */
  var isMainNode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The node index for the node. Node index numbering begins at zero. This index is also available on the node with the AWS_BATCH_JOB_NODE_INDEX environment variable.
    */
  var nodeIndex: js.UndefOr[Integer] = js.undefined
}
object NodeDetails {
  
  @scala.inline
  def apply(): NodeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeDetails]
  }
  
  @scala.inline
  implicit class NodeDetailsMutableBuilder[Self <: NodeDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsMainNode(value: Boolean): Self = StObject.set(x, "isMainNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMainNodeUndefined: Self = StObject.set(x, "isMainNode", js.undefined)
    
    @scala.inline
    def setNodeIndex(value: Integer): Self = StObject.set(x, "nodeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIndexUndefined: Self = StObject.set(x, "nodeIndex", js.undefined)
  }
}
