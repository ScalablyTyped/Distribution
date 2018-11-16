package typings
package atAngularCompilerLib.srcExpressionUnderscoreParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "ParsedProperty")
@js.native
class ParsedProperty protected () extends js.Object {
  def this(name: java.lang.String, expression: ASTWithSource, `type`: ParsedPropertyType, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  var expression: ASTWithSource = js.native
  val isAnimation: scala.Boolean = js.native
  val isLiteral: scala.Boolean = js.native
  var name: java.lang.String = js.native
  var sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan = js.native
  var `type`: ParsedPropertyType = js.native
}

