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
  
  inline def apply(expression: InvokeFunctionExpr, `type`: ExpressionType_): Expression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  
  extension [Self <: Expression](x: Self) {
    
    inline def setExpression(value: InvokeFunctionExpr): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: ExpressionType_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
