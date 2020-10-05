package typings.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "BindingPipe")
@js.native
class BindingPipe protected ()
  extends typings.angularCompiler.publicApiMod.BindingPipe {
  def this(
    span: typings.angularCompiler.astMod.ParseSpan,
    sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan,
    exp: typings.angularCompiler.astMod.AST,
    name: String,
    args: js.Array[_],
    nameSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan
  ) = this()
}

