package typings.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/compiler", "BoundDirectivePropertyAst")
@js.native
class BoundDirectivePropertyAst protected ()
  extends typings.angularCompiler.publicApiMod.BoundDirectivePropertyAst {
  def this(
    directiveName: String,
    templateName: String,
    value: typings.angularCompiler.astMod.ASTWithSource,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

