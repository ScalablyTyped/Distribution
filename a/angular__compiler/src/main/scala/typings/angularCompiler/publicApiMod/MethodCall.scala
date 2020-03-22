package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "MethodCall")
@js.native
class MethodCall protected ()
  extends typings.angularCompiler.srcCompilerMod.MethodCall {
  def this(
    span: typings.angularCompiler.astMod.ParseSpan,
    sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan,
    receiver: typings.angularCompiler.astMod.AST,
    name: String,
    args: js.Array[_]
  ) = this()
}

