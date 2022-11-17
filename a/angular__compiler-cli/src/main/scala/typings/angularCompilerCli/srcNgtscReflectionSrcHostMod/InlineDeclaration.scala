package typings.angularCompilerCli.srcNgtscReflectionSrcHostMod

import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineDeclaration
  extends StObject
     with BaseDeclaration[Exclude[DeclarationNode, typings.typescript.mod.Declaration]] {
  
  var implementation: js.UndefOr[DeclarationNode] = js.undefined
  
  @JSName("kind")
  var kind_InlineDeclaration: 1
}
object InlineDeclaration {
  
  inline def apply(node: Exclude[DeclarationNode, typings.typescript.mod.Declaration]): InlineDeclaration = {
    val __obj = js.Dynamic.literal(kind = 1, node = node.asInstanceOf[js.Any], known = null, viaModule = null)
    __obj.asInstanceOf[InlineDeclaration]
  }
  
  extension [Self <: InlineDeclaration](x: Self) {
    
    inline def setImplementation(value: DeclarationNode): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
    
    inline def setImplementationUndefined: Self = StObject.set(x, "implementation", js.undefined)
    
    inline def setKind(value: 1): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
