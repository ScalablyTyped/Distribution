package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pipes extends js.Object {
  var pipes: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompilePipeSummary]
  var template: js.Array[
    atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst
  ]
}

object Anon_Pipes {
  @scala.inline
  def apply(
    pipes: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompilePipeSummary],
    template: js.Array[
      atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst
    ]
  ): Anon_Pipes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pipes")(pipes)
    __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[Anon_Pipes]
  }
}

