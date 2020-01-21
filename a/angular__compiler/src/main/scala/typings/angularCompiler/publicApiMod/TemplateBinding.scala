package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "TemplateBinding")
@js.native
class TemplateBinding protected ()
  extends typings.angularCompiler.srcCompilerMod.TemplateBinding {
  def this(span: typings.angularCompiler.astMod.ParseSpan, key: String, keyIsVar: Boolean, name: String) = this()
  def this(
    span: typings.angularCompiler.astMod.ParseSpan,
    key: String,
    keyIsVar: Boolean,
    name: String,
    expression: typings.angularCompiler.astMod.ASTWithSource
  ) = this()
}

