package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "SafeMethodCall")
@js.native
class SafeMethodCall protected ()
  extends typings.angularCompiler.srcCompilerMod.SafeMethodCall {
  def this(
    span: typings.angularCompiler.astMod.ParseSpan,
    receiver: typings.angularCompiler.astMod.AST,
    name: String,
    args: js.Array[_]
  ) = this()
}

