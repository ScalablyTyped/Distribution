package typings.angularCompiler.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/expression_parser/ast", "Interpolation")
@js.native
class Interpolation protected () extends AST {
  def this(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, strings: js.Array[_], expressions: js.Array[_]) = this()
  var expressions: js.Array[_] = js.native
  var strings: js.Array[_] = js.native
}

