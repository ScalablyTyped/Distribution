package typings.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "Binary")
@js.native
class Binary protected ()
  extends typings.angularCompiler.publicApiMod.Binary {
  def this(
    span: typings.angularCompiler.astMod.ParseSpan,
    sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan,
    operation: String,
    left: typings.angularCompiler.astMod.AST,
    right: typings.angularCompiler.astMod.AST
  ) = this()
}

