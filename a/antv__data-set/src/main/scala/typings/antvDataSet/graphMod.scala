package typings.antvDataSet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphMod {
  
  trait Options extends StObject {
    
    var edges: js.UndefOr[js.Function1[/* data */ Any, js.Array[Any]]] = js.undefined
    
    var nodes: js.UndefOr[js.Function1[/* data */ Any, js.Array[Any]]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEdges(value: /* data */ Any => js.Array[Any]): Self = StObject.set(x, "edges", js.Any.fromFunction1(value))
      
      inline def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
      
      inline def setNodes(value: /* data */ Any => js.Array[Any]): Self = StObject.set(x, "nodes", js.Any.fromFunction1(value))
      
      inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    }
  }
}
