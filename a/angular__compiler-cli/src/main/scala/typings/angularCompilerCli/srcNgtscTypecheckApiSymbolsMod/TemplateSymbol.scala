package typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod

import typings.angularCompiler.mod.TmplAstTemplate
import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateSymbol
  extends StObject
     with Symbol {
  
  /** A list of directives applied to the element. */
  var directives: js.Array[DirectiveSymbol]
  
  var kind: Template
  
  var templateNode: TmplAstTemplate
}
object TemplateSymbol {
  
  inline def apply(directives: js.Array[DirectiveSymbol], kind: Template, templateNode: TmplAstTemplate): TemplateSymbol = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], templateNode = templateNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateSymbol]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplateSymbol] (val x: Self) extends AnyVal {
    
    inline def setDirectives(value: js.Array[DirectiveSymbol]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    inline def setDirectivesVarargs(value: DirectiveSymbol*): Self = StObject.set(x, "directives", js.Array(value*))
    
    inline def setKind(value: Template): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTemplateNode(value: TmplAstTemplate): Self = StObject.set(x, "templateNode", value.asInstanceOf[js.Any])
  }
}
