package typings.angularCompiler.anon

import typings.angularCompiler.compileMetadataMod.CompilePipeSummary
import typings.angularCompiler.templateAstMod.TemplateAst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pipes extends js.Object {
  
  var pipes: js.Array[CompilePipeSummary] = js.native
  
  var template: js.Array[TemplateAst] = js.native
}
object Pipes {
  
  @scala.inline
  def apply(pipes: js.Array[CompilePipeSummary], template: js.Array[TemplateAst]): Pipes = {
    val __obj = js.Dynamic.literal(pipes = pipes.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pipes]
  }
  
  @scala.inline
  implicit class PipesOps[Self <: Pipes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPipesVarargs(value: CompilePipeSummary*): Self = this.set("pipes", js.Array(value :_*))
    
    @scala.inline
    def setPipes(value: js.Array[CompilePipeSummary]): Self = this.set("pipes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateVarargs(value: TemplateAst*): Self = this.set("template", js.Array(value :_*))
    
    @scala.inline
    def setTemplate(value: js.Array[TemplateAst]): Self = this.set("template", value.asInstanceOf[js.Any])
  }
}
