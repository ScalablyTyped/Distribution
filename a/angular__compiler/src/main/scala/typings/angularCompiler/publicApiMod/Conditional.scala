package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "Conditional")
@js.native
class Conditional protected ()
  extends typings.angularCompiler.srcCompilerMod.Conditional {
  def this(
    span: typings.angularCompiler.astMod.ParseSpan,
    sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan,
    condition: typings.angularCompiler.astMod.AST,
    trueExp: typings.angularCompiler.astMod.AST,
    falseExp: typings.angularCompiler.astMod.AST
  ) = this()
}

