package typings.angularCompilerCli.srcNgtscIndexerSrcApiMod

import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A reference to a directive node and its selector. */
trait DirectiveReference extends StObject {
  
  var node: ClassDeclarationDeclarati
  
  var selector: String
}
object DirectiveReference {
  
  inline def apply(node: ClassDeclarationDeclarati, selector: String): DirectiveReference = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectiveReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectiveReference] (val x: Self) extends AnyVal {
    
    inline def setNode(value: ClassDeclarationDeclarati): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
  }
}
