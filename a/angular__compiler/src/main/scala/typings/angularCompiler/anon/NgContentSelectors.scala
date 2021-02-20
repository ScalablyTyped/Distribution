package typings.angularCompiler.anon

import typings.angularCompiler.r3AstMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NgContentSelectors extends StObject {
  
  /**
    * Any ng-content selectors extracted from the template. Contains `null` when an ng-content
    * element without selector is present.
    */
  var ngContentSelectors: js.Array[String] = js.native
  
  /**
    * Parsed nodes of the template.
    */
  var nodes: js.Array[Node] = js.native
}
object NgContentSelectors {
  
  @scala.inline
  def apply(ngContentSelectors: js.Array[String], nodes: js.Array[Node]): NgContentSelectors = {
    val __obj = js.Dynamic.literal(ngContentSelectors = ngContentSelectors.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgContentSelectors]
  }
  
  @scala.inline
  implicit class NgContentSelectorsMutableBuilder[Self <: NgContentSelectors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNgContentSelectors(value: js.Array[String]): Self = StObject.set(x, "ngContentSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNgContentSelectorsVarargs(value: String*): Self = StObject.set(x, "ngContentSelectors", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: Node*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
