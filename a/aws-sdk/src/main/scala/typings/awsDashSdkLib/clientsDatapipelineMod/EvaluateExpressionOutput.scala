package typings
package awsDashSdkLib.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EvaluateExpressionOutput extends js.Object {
  /**
    * The evaluated expression.
    */
  var evaluatedExpression: longString
}

object EvaluateExpressionOutput {
  @scala.inline
  def apply(evaluatedExpression: longString): EvaluateExpressionOutput = {
    val __obj = js.Dynamic.literal(evaluatedExpression = evaluatedExpression)
  
    __obj.asInstanceOf[EvaluateExpressionOutput]
  }
}

