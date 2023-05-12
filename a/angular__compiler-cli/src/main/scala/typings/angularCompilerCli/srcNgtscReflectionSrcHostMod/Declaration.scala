package typings.angularCompilerCli.srcNgtscReflectionSrcHostMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Declaration[T /* <: typings.typescript.mod.Declaration */] extends StObject {
  
  /**
    * TypeScript reference to the declaration itself, if one exists.
    */
  var node: T
  
  /**
    * The absolute module path from which the symbol was imported into the application, if the symbol
    * was imported via an absolute module (even through a chain of re-exports). If the symbol is part
    * of the application and was not imported from an absolute path, this will be `null`.
    */
  var viaModule: String | Null
}
object Declaration {
  
  inline def apply[T /* <: typings.typescript.mod.Declaration */](node: T): Declaration[T] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], viaModule = null)
    __obj.asInstanceOf[Declaration[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Declaration[?], T /* <: typings.typescript.mod.Declaration */] (val x: Self & Declaration[T]) extends AnyVal {
    
    inline def setNode(value: T): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setViaModule(value: String): Self = StObject.set(x, "viaModule", value.asInstanceOf[js.Any])
    
    inline def setViaModuleNull: Self = StObject.set(x, "viaModule", null)
  }
}
