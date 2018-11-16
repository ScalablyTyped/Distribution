package typings
package atAngularCompilerLib.srcExpressionUnderscoreParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "TemplateBinding")
@js.native
class TemplateBinding protected () extends js.Object {
  def this(span: ParseSpan, key: java.lang.String, keyIsVar: scala.Boolean, name: java.lang.String) = this()
  def this(span: ParseSpan, key: java.lang.String, keyIsVar: scala.Boolean, name: java.lang.String, expression: ASTWithSource) = this()
  var expression: ASTWithSource | scala.Null = js.native
  var key: java.lang.String = js.native
  var keyIsVar: scala.Boolean = js.native
  var name: java.lang.String = js.native
  var span: ParseSpan = js.native
}

