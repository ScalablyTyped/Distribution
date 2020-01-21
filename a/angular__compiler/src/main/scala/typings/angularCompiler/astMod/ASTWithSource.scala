package typings.angularCompiler.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "ASTWithSource")
@js.native
class ASTWithSource protected () extends AST {
  def this(ast: AST, source: String, location: String, absoluteOffset: Double, errors: js.Array[ParserError]) = this()
  def this(ast: AST, source: Null, location: String, absoluteOffset: Double, errors: js.Array[ParserError]) = this()
  var ast: AST = js.native
  var errors: js.Array[ParserError] = js.native
  var location: String = js.native
  var source: String | Null = js.native
  var sourceSpan: AbsoluteSourceSpan = js.native
}

