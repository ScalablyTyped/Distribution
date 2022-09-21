package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "Interpolation")
@js.native
open class Interpolation protected () extends AST {
  def this(
    span: ParseSpan,
    sourceSpan: AbsoluteSourceSpan,
    strings: js.Array[Any],
    expressions: js.Array[Any]
  ) = this()
  
  var expressions: js.Array[Any] = js.native
  
  var strings: js.Array[Any] = js.native
}
