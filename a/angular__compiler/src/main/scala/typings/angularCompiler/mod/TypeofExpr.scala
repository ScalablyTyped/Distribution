package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "TypeofExpr")
@js.native
open class TypeofExpr protected () extends Expression {
  def this(expr: Expression) = this()
  def this(expr: Expression, `type`: Type) = this()
  def this(expr: Expression, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(expr: Expression, `type`: Unit, sourceSpan: ParseSourceSpan) = this()
  def this(expr: Expression, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  
  var expr: Expression = js.native
}
