package typings
package atAngularCompilerLib.srcExpressionUnderscoreParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "ASTWithSource")
@js.native
class ASTWithSource protected () extends AST {
  def this(ast: AST, source: java.lang.String, location: java.lang.String, errors: js.Array[ParserError]) = this()
  def this(ast: AST, source: scala.Null, location: java.lang.String, errors: js.Array[ParserError]) = this()
  var ast: AST = js.native
  var errors: js.Array[ParserError] = js.native
  var location: java.lang.String = js.native
  var source: java.lang.String | scala.Null = js.native
}

