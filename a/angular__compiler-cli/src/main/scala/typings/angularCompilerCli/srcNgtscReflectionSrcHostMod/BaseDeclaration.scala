package typings.angularCompilerCli.srcNgtscReflectionSrcHostMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseDeclaration[T /* <: DeclarationNode */] extends StObject {
  
  /**
    * The type of the underlying `node`.
    */
  var kind: DeclarationKind
  
  /**
    * If set, describes the type of the known declaration this declaration resolves to.
    */
  var known: KnownDeclaration | Null
  
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
object BaseDeclaration {
  
  inline def apply[T /* <: DeclarationNode */](kind: DeclarationKind, node: T): BaseDeclaration[T] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], known = null, viaModule = null)
    __obj.asInstanceOf[BaseDeclaration[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseDeclaration[?], T /* <: DeclarationNode */] (val x: Self & BaseDeclaration[T]) extends AnyVal {
    
    inline def setKind(value: DeclarationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKnown(value: KnownDeclaration): Self = StObject.set(x, "known", value.asInstanceOf[js.Any])
    
    inline def setKnownNull: Self = StObject.set(x, "known", null)
    
    inline def setNode(value: T): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setViaModule(value: String): Self = StObject.set(x, "viaModule", value.asInstanceOf[js.Any])
    
    inline def setViaModuleNull: Self = StObject.set(x, "viaModule", null)
  }
}
