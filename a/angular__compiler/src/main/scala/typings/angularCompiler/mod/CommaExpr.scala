package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "CommaExpr")
@js.native
open class CommaExpr protected () extends Expression {
  def this(parts: js.Array[Expression]) = this()
  def this(parts: js.Array[Expression], sourceSpan: ParseSourceSpan) = this()
  
  var parts: js.Array[Expression] = js.native
}
