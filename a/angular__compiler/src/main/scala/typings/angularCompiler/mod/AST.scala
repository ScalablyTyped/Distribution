package typings.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "AST")
@js.native
class AST protected ()
  extends typings.angularCompiler.compilerMod.AST {
  def this(
    span: typings.angularCompiler.astMod.ParseSpan,
    /**
    * Absolute location of the expression AST in a source code file.
    */
  sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan
  ) = this()
}

