package typings.angularCompiler.anon

import typings.angularCompiler.outputAstMod.ExpressionType_
import typings.angularCompiler.outputAstMod.InvokeFunctionExpr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expression extends StObject {
  
  var expression: InvokeFunctionExpr
  
  var `type`: ExpressionType_
}
object Expression {
  
  @scala.inline
  def apply(expression: InvokeFunctionExpr, `type`: ExpressionType_): Expression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  
  @scala.inline
  implicit class ExpressionMutableBuilder[Self <: Expression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: InvokeFunctionExpr): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ExpressionType_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
