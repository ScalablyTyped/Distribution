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
  
  inline def apply(): Node = {
    val __obj = js.Dynamic.literal(node = null)
    __obj.asInstanceOf[Node]
  }
  
  extension [Self <: Node](x: Self) {
    
    inline def setNode(value: typings.typescript.mod.Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeNull: Self = StObject.set(x, "node", null)
    
    inline def setRequiredHelpers(value: js.Array[HelperFunction]): Self = StObject.set(x, "requiredHelpers", value.asInstanceOf[js.Any])
    
    inline def setRequiredHelpersUndefined: Self = StObject.set(x, "requiredHelpers", js.undefined)
    
    inline def setRequiredHelpersVarargs(value: HelperFunction*): Self = StObject.set(x, "requiredHelpers", js.Array(value :_*))
  }
}
