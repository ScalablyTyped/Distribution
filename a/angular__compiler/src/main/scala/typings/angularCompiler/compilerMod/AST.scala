package typings.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "AST")
@js.native
class AST protected ()
  extends typings.angularCompiler.publicApiMod.AST {
  def this(
    span: typings.angularCompiler.astMod.ParseSpan,
    /**
    * Absolute location of the expression AST in a source code file.
    */
  sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan
  ) = this()
}

