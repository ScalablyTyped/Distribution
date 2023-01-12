package typings.angularCompilerCli.srcNgtscIndexerSrcApiMod

import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A reference to a directive node and its selector. */
trait DirectiveReference extends StObject {
  
  var node: ClassDeclaration[DeclarationNode]
  
  var selector: String
}
object DirectiveReference {
  
  inline def apply(node: ClassDeclaration[DeclarationNode], selector: String): DirectiveReference = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectiveReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectiveReference] (val x: Self) extends AnyVal {
    
    inline def setNode(value: ClassDeclaration[DeclarationNode]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
  }
}
