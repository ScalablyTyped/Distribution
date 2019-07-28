package typings.atAngularCompiler

import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompilePipeSummary
import typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pipes extends js.Object {
  var pipes: js.Array[CompilePipeSummary]
  var template: js.Array[TemplateAst]
}

object Anon_Pipes {
  @scala.inline
  def apply(pipes: js.Array[CompilePipeSummary], template: js.Array[TemplateAst]): Anon_Pipes = {
    val __obj = js.Dynamic.literal(pipes = pipes, template = template)
  
    __obj.asInstanceOf[Anon_Pipes]
  }
}

