package typings.angularCompiler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionSelector extends StObject {
  
  var expression: typings.angularCompiler.outputAstMod.Expression
  
  var selector: String
}
object ExpressionSelector {
  
  @scala.inline
  def apply(expression: typings.angularCompiler.outputAstMod.Expression, selector: String): ExpressionSelector = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionSelector]
  }
  
  @scala.inline
  implicit class ExpressionSelectorMutableBuilder[Self <: ExpressionSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: typings.angularCompiler.outputAstMod.Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
  }
}
