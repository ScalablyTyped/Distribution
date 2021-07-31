package typings.angularCore.anon

import typings.angularCore.helpersMod.HelperFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  var node: typings.typescript.mod.Node | Null
  
  var requiredHelpers: js.UndefOr[js.Array[HelperFunction]] = js.undefined
}
object Node {
  
  @scala.inline
  def apply(): Node = {
    val __obj = js.Dynamic.literal(node = null)
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: typings.typescript.mod.Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeNull: Self = StObject.set(x, "node", null)
    
    @scala.inline
    def setRequiredHelpers(value: js.Array[HelperFunction]): Self = StObject.set(x, "requiredHelpers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredHelpersUndefined: Self = StObject.set(x, "requiredHelpers", js.undefined)
    
    @scala.inline
    def setRequiredHelpersVarargs(value: HelperFunction*): Self = StObject.set(x, "requiredHelpers", js.Array(value :_*))
  }
}
