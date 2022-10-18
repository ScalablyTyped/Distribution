package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNodesResponse extends StObject {
  
  /**
    * A pagination token that's included if more results are available.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * A list of nodes.
    */
  var Nodes: js.UndefOr[NodesList] = js.undefined
}
object ListNodesResponse {
  
  inline def apply(): ListNodesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNodesResponse]
  }
  
  extension [Self <: ListNodesResponse](x: Self) {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setNodes(value: NodesList): Self = StObject.set(x, "Nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "Nodes", js.undefined)
    
    inline def setNodesVarargs(value: Node*): Self = StObject.set(x, "Nodes", js.Array(value*))
  }
}
