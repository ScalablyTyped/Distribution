package typings
package atAngularCompilerLib.srcExpressionUnderscoreParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "ParsedEvent")
@js.native
class ParsedEvent protected () extends js.Object {
  def this(name: java.lang.String, targetOrPhase: java.lang.String, `type`: ParsedEventType, handler: AST, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, handlerSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  var handler: AST = js.native
  var handlerSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan = js.native
  var name: java.lang.String = js.native
  var sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan = js.native
  var targetOrPhase: java.lang.String = js.native
  var `type`: ParsedEventType = js.native
}

