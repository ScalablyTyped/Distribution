package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Edges extends StObject {
  
  var edges: js.Array[Source]
  
  var nodes: js.Array[IsNode]
}
object Edges {
  
  inline def apply(edges: js.Array[Source], nodes: js.Array[IsNode]): Edges = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edges]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Edges] (val x: Self) extends AnyVal {
    
    inline def setEdges(value: js.Array[Source]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesVarargs(value: Source*): Self = StObject.set(x, "edges", js.Array(value*))
    
    inline def setNodes(value: js.Array[IsNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: IsNode*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
