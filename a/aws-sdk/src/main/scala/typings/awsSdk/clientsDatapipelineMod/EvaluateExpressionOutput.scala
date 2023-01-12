package typings.awsSdk.clientsDatapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluateExpressionOutput extends StObject {
  
  /**
    * The evaluated expression.
    */
  var evaluatedExpression: longString
}
object EvaluateExpressionOutput {
  
  inline def apply(evaluatedExpression: longString): EvaluateExpressionOutput = {
    val __obj = js.Dynamic.literal(evaluatedExpression = evaluatedExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateExpressionOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluateExpressionOutput] (val x: Self) extends AnyVal {
    
    inline def setEvaluatedExpression(value: longString): Self = StObject.set(x, "evaluatedExpression", value.asInstanceOf[js.Any])
  }
}
