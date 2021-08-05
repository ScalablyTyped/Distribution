package typings.angularCompiler.anon

import typings.angularCompiler.compileMetadataMod.CompilePipeSummary
import typings.angularCompiler.templateAstMod.TemplateAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pipes extends StObject {
  
  var pipes: js.Array[CompilePipeSummary]
  
  var template: js.Array[TemplateAst]
}
object Pipes {
  
  inline def apply(pipes: js.Array[CompilePipeSummary], template: js.Array[TemplateAst]): Pipes = {
    val __obj = js.Dynamic.literal(pipes = pipes.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pipes]
  }
  
  extension [Self <: Pipes](x: Self) {
    
    inline def setPipes(value: js.Array[CompilePipeSummary]): Self = StObject.set(x, "pipes", value.asInstanceOf[js.Any])
    
    inline def setPipesVarargs(value: CompilePipeSummary*): Self = StObject.set(x, "pipes", js.Array(value :_*))
    
    inline def setTemplate(value: js.Array[TemplateAst]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateVarargs(value: TemplateAst*): Self = StObject.set(x, "template", js.Array(value :_*))
  }
}
