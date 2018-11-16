package typings
package atAngularCompilerLib.srcExpressionUnderscoreParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "PropertyWrite")
@js.native
class PropertyWrite protected () extends AST {
  def this(span: ParseSpan, receiver: AST, name: java.lang.String, value: AST) = this()
  var name: java.lang.String = js.native
  var receiver: AST = js.native
  var value: AST = js.native
}

