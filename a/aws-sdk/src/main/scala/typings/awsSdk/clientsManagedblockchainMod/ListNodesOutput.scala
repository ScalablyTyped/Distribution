package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNodesOutput extends StObject {
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * An array of NodeSummary objects that contain configuration properties for each node.
    */
  var Nodes: js.UndefOr[NodeSummaryList] = js.undefined
}
object ListNodesOutput {
  
  inline def apply(): ListNodesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNodesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListNodesOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setNodes(value: NodeSummaryList): Self = StObject.set(x, "Nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "Nodes", js.undefined)
    
    inline def setNodesVarargs(value: NodeSummary*): Self = StObject.set(x, "Nodes", js.Array(value*))
  }
}
