package typings.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "FunctionCall")
@js.native
class FunctionCall protected ()
  extends typings.angularCompiler.publicApiMod.FunctionCall {
  def this(
    span: typings.angularCompiler.astMod.ParseSpan,
    sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan,
    target: Null,
    args: js.Array[_]
  ) = this()
  def this(
    span: typings.angularCompiler.astMod.ParseSpan,
    sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan,
    target: typings.angularCompiler.astMod.AST,
    args: js.Array[_]
  ) = this()
}

