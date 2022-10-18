package typings.angularCompilerCli.srcNgtscReflectionSrcHostMod

import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ConcreteDeclaration[T]
  - typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.InlineDeclaration
*/
trait Declaration[T /* <: typings.typescript.mod.Declaration */] extends StObject
object Declaration {
  
  inline def ConcreteDeclaration[T /* <: typings.typescript.mod.Declaration */](node: T): typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ConcreteDeclaration[T] = {
    val __obj = js.Dynamic.literal(kind = 0, node = node.asInstanceOf[js.Any], identity = null, known = null, viaModule = null)
    __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ConcreteDeclaration[T]]
  }
  
  inline def InlineDeclaration(node: Exclude[DeclarationNode, typings.typescript.mod.Declaration]): typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.InlineDeclaration = {
    val __obj = js.Dynamic.literal(kind = 1, node = node.asInstanceOf[js.Any], known = null, viaModule = null)
    __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.InlineDeclaration]
  }
}
