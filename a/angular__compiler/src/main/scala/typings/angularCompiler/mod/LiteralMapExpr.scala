package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "LiteralMapExpr")
@js.native
open class LiteralMapExpr protected () extends Expression {
  def this(entries: js.Array[LiteralMapEntry]) = this()
  def this(entries: js.Array[LiteralMapEntry], `type`: MapType) = this()
  def this(entries: js.Array[LiteralMapEntry], `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(entries: js.Array[LiteralMapEntry], `type`: Unit, sourceSpan: ParseSourceSpan) = this()
  def this(entries: js.Array[LiteralMapEntry], `type`: MapType, sourceSpan: ParseSourceSpan) = this()
  
  var entries: js.Array[LiteralMapEntry] = js.native
  
  var valueType: Type | Null = js.native
}
