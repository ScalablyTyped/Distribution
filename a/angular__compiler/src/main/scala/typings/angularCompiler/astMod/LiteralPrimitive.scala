package typings.angularCompiler.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/expression_parser/ast", "LiteralPrimitive")
@js.native
class LiteralPrimitive protected () extends AST {
  def this(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, value: js.Any) = this()
  var value: js.Any = js.native
}

