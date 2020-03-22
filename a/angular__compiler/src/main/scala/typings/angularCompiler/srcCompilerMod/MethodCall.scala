package typings.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "MethodCall")
@js.native
class MethodCall protected ()
  extends typings.angularCompiler.astMod.MethodCall {
  def this(
    span: typings.angularCompiler.astMod.ParseSpan,
    sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan,
    receiver: typings.angularCompiler.astMod.AST,
    name: String,
    args: js.Array[_]
  ) = this()
}

