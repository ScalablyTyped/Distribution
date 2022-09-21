package typings.angularCompiler.anon

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgContentSelectors extends StObject {
  
  /**
    * Any ng-content selectors extracted from the template. Contains `*` when an ng-content
    * element without selector is present.
    */
  var ngContentSelectors: js.Array[String]
  
  /**
    * Parsed nodes of the template.
    */
  var nodes: js.Array[Node]
}
object NgContentSelectors {
  
  inline def apply(ngContentSelectors: js.Array[String], nodes: js.Array[Node]): NgContentSelectors = {
    val __obj = js.Dynamic.literal(ngContentSelectors = ngContentSelectors.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgContentSelectors]
  }
  
  extension [Self <: NgContentSelectors](x: Self) {
    
    inline def setNgContentSelectors(value: js.Array[String]): Self = StObject.set(x, "ngContentSelectors", value.asInstanceOf[js.Any])
    
    inline def setNgContentSelectorsVarargs(value: String*): Self = StObject.set(x, "ngContentSelectors", js.Array(value*))
    
    inline def setNodes(value: js.Array[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: Node*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
