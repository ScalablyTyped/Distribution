package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Links extends StObject {
  
  var links: Any
  
  var nodes: Any
}
object Links {
  
  inline def apply(links: Any, nodes: Any): Links = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Links]
  }
  
  extension [Self <: Links](x: Self) {
    
    inline def setLinks(value: Any): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: Any): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
  }
}
