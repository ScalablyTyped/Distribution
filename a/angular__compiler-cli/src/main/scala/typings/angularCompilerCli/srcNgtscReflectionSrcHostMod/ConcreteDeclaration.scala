package typings.angularCompilerCli.srcNgtscReflectionSrcHostMod

import typings.angularCompilerCli.angularCompilerCliInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConcreteDeclaration[T /* <: typings.typescript.mod.Declaration */]
  extends StObject
     with BaseDeclaration[T]
     with Declaration[T] {
  
  /**
    * Optionally represents a special identity of the declaration, or `null` if the declaration
    * does not have a special identity.
    */
  var identity: SpecialDeclarationIdentity | Null
  
  @JSName("kind")
  var kind_ConcreteDeclaration: `0`
}
object ConcreteDeclaration {
  
  inline def apply[T /* <: typings.typescript.mod.Declaration */](node: T): ConcreteDeclaration[T] = {
    val __obj = js.Dynamic.literal(kind = 0, node = node.asInstanceOf[js.Any], identity = null, known = null, viaModule = null)
    __obj.asInstanceOf[ConcreteDeclaration[T]]
  }
  
  extension [Self <: ConcreteDeclaration[?], T /* <: typings.typescript.mod.Declaration */](x: Self & ConcreteDeclaration[T]) {
    
    inline def setIdentity(value: SpecialDeclarationIdentity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityNull: Self = StObject.set(x, "identity", null)
    
    inline def setKind(value: `0`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
