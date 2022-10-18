package typings.awsSdk.clientsDatapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluateExpressionInput extends StObject {
  
  /**
    * The expression to evaluate.
    */
  var expression: longString
  
  /**
    * The ID of the object.
    */
  var objectId: id
  
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id
}
object EvaluateExpressionInput {
  
  inline def apply(expression: longString, objectId: id, pipelineId: id): EvaluateExpressionInput = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], pipelineId = pipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateExpressionInput]
  }
  
  extension [Self <: EvaluateExpressionInput](x: Self) {
    
    inline def setExpression(value: longString): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setObjectId(value: id): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setPipelineId(value: id): Self = StObject.set(x, "pipelineId", value.asInstanceOf[js.Any])
  }
}
