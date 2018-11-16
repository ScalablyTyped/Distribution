package typings
package atAngularCompilerLib.srcExpressionUnderscoreParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "Binary")
@js.native
class Binary protected () extends AST {
  def this(span: ParseSpan, operation: java.lang.String, left: AST, right: AST) = this()
  var left: AST = js.native
  var operation: java.lang.String = js.native
  var right: AST = js.native
}

