package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "BoundTextAst")
@js.native
class BoundTextAst protected ()
  extends typings.angularCompiler.srcCompilerMod.BoundTextAst {
  def this(
    value: typings.angularCompiler.astMod.AST,
    ngContentIndex: Double,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

