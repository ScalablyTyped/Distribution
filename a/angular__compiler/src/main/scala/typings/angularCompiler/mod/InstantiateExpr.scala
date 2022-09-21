package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "InstantiateExpr")
@js.native
open class InstantiateExpr protected () extends Expression {
  def this(classExpr: Expression, args: js.Array[Expression]) = this()
  def this(classExpr: Expression, args: js.Array[Expression], `type`: Type) = this()
  def this(classExpr: Expression, args: js.Array[Expression], `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(classExpr: Expression, args: js.Array[Expression], `type`: Unit, sourceSpan: ParseSourceSpan) = this()
  def this(classExpr: Expression, args: js.Array[Expression], `type`: Type, sourceSpan: ParseSourceSpan) = this()
  
  var args: js.Array[Expression] = js.native
  
  var classExpr: Expression = js.native
}
