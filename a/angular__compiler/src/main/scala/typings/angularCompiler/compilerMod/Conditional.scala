package typings.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "Conditional")
@js.native
class Conditional protected ()
  extends typings.angularCompiler.publicApiMod.Conditional {
  def this(
    span: typings.angularCompiler.astMod.ParseSpan,
    sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan,
    condition: typings.angularCompiler.astMod.AST,
    trueExp: typings.angularCompiler.astMod.AST,
    falseExp: typings.angularCompiler.astMod.AST
  ) = this()
}
