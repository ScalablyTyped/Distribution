package typings.angularCompiler.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/expression_parser/ast", "Interpolation")
@js.native
class Interpolation protected () extends AST {
  def this(
    span: ParseSpan,
    sourceSpan: AbsoluteSourceSpan,
    strings: js.Array[js.Any],
    expressions: js.Array[js.Any]
  ) = this()
  
  var expressions: js.Array[js.Any] = js.native
  
  var strings: js.Array[js.Any] = js.native
}
