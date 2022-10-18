package typings.angularCompilerCli.anon

import typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.ElementIdentifier
import typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.TemplateIdentifier
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Directive extends StObject {
  
  /**
    * The directive on `node` that the reference targets. If no directive is targeted, this is
    * `null`.
    */
  var directive: ClassDeclaration[DeclarationNode] | Null
  
  /** The template AST node that the reference targets. */
  var node: ElementIdentifier | TemplateIdentifier
}
object Directive {
  
  inline def apply(node: ElementIdentifier | TemplateIdentifier): Directive = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], directive = null)
    __obj.asInstanceOf[Directive]
  }
  
  extension [Self <: Directive](x: Self) {
    
    inline def setDirective(value: ClassDeclaration[DeclarationNode]): Self = StObject.set(x, "directive", value.asInstanceOf[js.Any])
    
    inline def setDirectiveNull: Self = StObject.set(x, "directive", null)
    
    inline def setNode(value: ElementIdentifier | TemplateIdentifier): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
