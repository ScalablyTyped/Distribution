package typings.agDashGrid.distLibValueServiceExpressionServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/valueService/expressionService", "ExpressionService")
@js.native
class ExpressionService () extends js.Object {
  var expressionToFunctionCache: js.Any = js.native
  var logger: js.Any = js.native
  /* private */ def createExpressionFunction(expression: js.Any): js.Any = js.native
  /* private */ def createFunctionBody(expression: js.Any): js.Any = js.native
  def evaluate(expressionOrFunc: String, params: js.Any): js.Any = js.native
  def evaluate(expressionOrFunc: js.Function, params: js.Any): js.Any = js.native
  /* private */ def evaluateExpression(expression: js.Any, params: js.Any): js.Any = js.native
  /* private */ def setBeans(loggerFactory: js.Any): js.Any = js.native
}

