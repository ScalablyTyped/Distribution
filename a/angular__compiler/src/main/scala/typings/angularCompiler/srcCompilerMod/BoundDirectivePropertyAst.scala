package typings.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "BoundDirectivePropertyAst")
@js.native
class BoundDirectivePropertyAst protected ()
  extends typings.angularCompiler.templateAstMod.BoundDirectivePropertyAst {
  def this(
    directiveName: String,
    templateName: String,
    value: typings.angularCompiler.astMod.AST,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

