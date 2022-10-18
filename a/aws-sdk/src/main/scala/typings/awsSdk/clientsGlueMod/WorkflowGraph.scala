package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowGraph extends StObject {
  
  /**
    * A list of all the directed connections between the nodes belonging to the workflow.
    */
  var Edges: js.UndefOr[EdgeList] = js.undefined
  
  /**
    * A list of the the Glue components belong to the workflow represented as nodes.
    */
  var Nodes: js.UndefOr[NodeList] = js.undefined
}
object WorkflowGraph {
  
  inline def apply(): WorkflowGraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowGraph]
  }
  
  extension [Self <: WorkflowGraph](x: Self) {
    
    inline def setEdges(value: EdgeList): Self = StObject.set(x, "Edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesUndefined: Self = StObject.set(x, "Edges", js.undefined)
    
    inline def setEdgesVarargs(value: Edge*): Self = StObject.set(x, "Edges", js.Array(value*))
    
    inline def setNodes(value: NodeList): Self = StObject.set(x, "Nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "Nodes", js.undefined)
    
    inline def setNodesVarargs(value: Node*): Self = StObject.set(x, "Nodes", js.Array(value*))
  }
}
