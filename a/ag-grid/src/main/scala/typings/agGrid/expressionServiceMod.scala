package typings.agGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expressionServiceMod {
  
  @JSImport("ag-grid/dist/lib/valueService/expressionService", "ExpressionService")
  @js.native
  class ExpressionService () extends StObject {
    
    /* private */ def createExpressionFunction(expression: js.Any): js.Any = js.native
    
    /* private */ def createFunctionBody(expression: js.Any): js.Any = js.native
    
    def evaluate(expressionOrFunc: String, params: js.Any): js.Any = js.native
    def evaluate(expressionOrFunc: js.Function, params: js.Any): js.Any = js.native
    
    /* private */ def evaluateExpression(expression: js.Any, params: js.Any): js.Any = js.native
    
    var expressionToFunctionCache: js.Any = js.native
    
    var logger: js.Any = js.native
    
    /* private */ def setBeans(loggerFactory: js.Any): js.Any = js.native
  }
}
