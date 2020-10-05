package typings.angularCompiler.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/expression_parser/ast", "LiteralMap")
@js.native
class LiteralMap protected () extends AST {
  def this(
    span: ParseSpan,
    sourceSpan: AbsoluteSourceSpan,
    keys: js.Array[LiteralMapKey],
    values: js.Array[_]
  ) = this()
  var keys: js.Array[LiteralMapKey] = js.native
  var values: js.Array[_] = js.native
}

