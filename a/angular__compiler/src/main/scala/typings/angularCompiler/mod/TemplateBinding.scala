package typings.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "TemplateBinding")
@js.native
class TemplateBinding protected ()
  extends typings.angularCompiler.publicApiMod.TemplateBinding {
  def this(
    span: typings.angularCompiler.astMod.ParseSpan,
    sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan,
    key: String,
    keyIsVar: Boolean,
    name: String
  ) = this()
  def this(
    span: typings.angularCompiler.astMod.ParseSpan,
    sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan,
    key: String,
    keyIsVar: Boolean,
    name: String,
    expression: typings.angularCompiler.astMod.ASTWithSource
  ) = this()
}

