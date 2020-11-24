package typings.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "Binary")
@js.native
class Binary protected ()
  extends typings.angularCompiler.astMod.Binary {
  def this(
    span: typings.angularCompiler.astMod.ParseSpan,
    sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan,
    operation: String,
    left: typings.angularCompiler.astMod.AST,
    right: typings.angularCompiler.astMod.AST
  ) = this()
}
