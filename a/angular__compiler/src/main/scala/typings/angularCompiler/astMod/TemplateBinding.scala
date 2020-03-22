package typings.angularCompiler.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "TemplateBinding")
@js.native
class TemplateBinding protected () extends js.Object {
  def this(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, key: String, keyIsVar: Boolean, name: String) = this()
  def this(
    span: ParseSpan,
    sourceSpan: AbsoluteSourceSpan,
    key: String,
    keyIsVar: Boolean,
    name: String,
    value: ASTWithSource
  ) = this()
  var key: String = js.native
  var keyIsVar: Boolean = js.native
  var name: String = js.native
  var span: ParseSpan = js.native
  var value: ASTWithSource | Null = js.native
}

