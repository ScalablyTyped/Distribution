package typings.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "MethodCall")
@js.native
class MethodCall protected ()
  extends typings.angularCompiler.compilerMod.MethodCall {
  def this(
    span: typings.angularCompiler.astMod.ParseSpan,
    sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan,
    nameSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan,
    receiver: typings.angularCompiler.astMod.AST,
    name: String,
    args: js.Array[_]
  ) = this()
}
