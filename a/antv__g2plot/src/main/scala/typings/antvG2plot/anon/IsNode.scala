package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsNode extends StObject {
  
  var isNode: Boolean
}
object IsNode {
  
  inline def apply(isNode: Boolean): IsNode = {
    val __obj = js.Dynamic.literal(isNode = isNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsNode] (val x: Self) extends AnyVal {
    
    inline def setIsNode(value: Boolean): Self = StObject.set(x, "isNode", value.asInstanceOf[js.Any])
  }
}
