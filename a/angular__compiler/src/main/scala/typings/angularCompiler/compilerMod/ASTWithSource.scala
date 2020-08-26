package typings.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/compiler", "ASTWithSource")
@js.native
class ASTWithSource protected ()
  extends typings.angularCompiler.publicApiMod.ASTWithSource {
  def this(
    ast: typings.angularCompiler.astMod.AST,
    source: String,
    location: String,
    absoluteOffset: Double,
    errors: js.Array[typings.angularCompiler.astMod.ParserError]
  ) = this()
  def this(
    ast: typings.angularCompiler.astMod.AST,
    source: Null,
    location: String,
    absoluteOffset: Double,
    errors: js.Array[typings.angularCompiler.astMod.ParserError]
  ) = this()
}

