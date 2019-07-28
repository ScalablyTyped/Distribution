package typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "ParsedVariable")
@js.native
class ParsedVariable protected () extends js.Object {
  def this(name: String, value: String, sourceSpan: ParseSourceSpan) = this()
  var name: String = js.native
  var sourceSpan: ParseSourceSpan = js.native
  var value: String = js.native
}

