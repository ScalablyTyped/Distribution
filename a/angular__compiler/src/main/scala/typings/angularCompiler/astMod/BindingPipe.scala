package typings.angularCompiler.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "BindingPipe")
@js.native
class BindingPipe protected () extends AST {
  def this(
    span: ParseSpan,
    sourceSpan: AbsoluteSourceSpan,
    exp: AST,
    name: String,
    args: js.Array[_],
    nameSpan: AbsoluteSourceSpan
  ) = this()
  var args: js.Array[_] = js.native
  var exp: AST = js.native
  var name: String = js.native
  var nameSpan: AbsoluteSourceSpan = js.native
}

