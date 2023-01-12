package typings.angularCompilerCli.anon

import typings.typescript.mod.Declaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From extends StObject {
  
  var from: String | Null
  
  var node: Declaration
}
object From {
  
  inline def apply(node: Declaration): From = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], from = null)
    __obj.asInstanceOf[From]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: From] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromNull: Self = StObject.set(x, "from", null)
    
    inline def setNode(value: Declaration): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
