package typings.angularRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeNode[T] extends StObject {
  
  var children: js.Array[TreeNode[T]]
  
  var value: T
}
object TreeNode {
  
  inline def apply[T](children: js.Array[TreeNode[T]], value: T): TreeNode[T] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNode[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeNode[?], T] (val x: Self & TreeNode[T]) extends AnyVal {
    
    inline def setChildren(value: js.Array[TreeNode[T]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: TreeNode[T]*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
