package typings.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/compiler", "ASTWithName")
@js.native
abstract class ASTWithName protected ()
  extends typings.angularCompiler.publicApiMod.ASTWithName {
  def this(
    span: typings.angularCompiler.astMod.ParseSpan,
    sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan,
    nameSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan
  ) = this()
}

