package typings.awsDashSdk.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluateExpressionOutput extends js.Object {
  /**
    * The evaluated expression.
    */
  var evaluatedExpression: longString = js.native
}

object EvaluateExpressionOutput {
  @scala.inline
  def apply(evaluatedExpression: longString): EvaluateExpressionOutput = {
    val __obj = js.Dynamic.literal(evaluatedExpression = evaluatedExpression.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EvaluateExpressionOutput]
  }
}

