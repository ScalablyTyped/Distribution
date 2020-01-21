package typings.angularCompiler.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "MethodCall")
@js.native
class MethodCall protected () extends AST {
  def this(span: ParseSpan, receiver: AST, name: String, args: js.Array[_]) = this()
  var args: js.Array[_] = js.native
  var name: String = js.native
  var receiver: AST = js.native
}

