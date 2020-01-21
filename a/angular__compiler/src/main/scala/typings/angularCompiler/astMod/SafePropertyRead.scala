package typings.angularCompiler.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "SafePropertyRead")
@js.native
class SafePropertyRead protected () extends AST {
  def this(span: ParseSpan, receiver: AST, name: String) = this()
  var name: String = js.native
  var receiver: AST = js.native
}

