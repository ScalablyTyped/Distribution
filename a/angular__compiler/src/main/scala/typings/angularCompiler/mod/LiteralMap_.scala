package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "LiteralMap")
@js.native
open class LiteralMap_ protected () extends AST {
  def this(
    span: ParseSpan,
    sourceSpan: AbsoluteSourceSpan,
    keys: js.Array[LiteralMapKey],
    values: js.Array[Any]
  ) = this()
  
  var keys: js.Array[LiteralMapKey] = js.native
  
  var values: js.Array[Any] = js.native
}
