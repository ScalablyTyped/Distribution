package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "LiteralArrayExpr")
@js.native
open class LiteralArrayExpr protected () extends Expression {
  def this(entries: js.Array[Expression]) = this()
  def this(entries: js.Array[Expression], `type`: Type) = this()
  def this(entries: js.Array[Expression], `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(entries: js.Array[Expression], `type`: Unit, sourceSpan: ParseSourceSpan) = this()
  def this(entries: js.Array[Expression], `type`: Type, sourceSpan: ParseSourceSpan) = this()
  
  var entries: js.Array[Expression] = js.native
}
