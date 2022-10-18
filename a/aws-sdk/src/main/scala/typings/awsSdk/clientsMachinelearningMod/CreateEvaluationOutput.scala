package typings.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEvaluationOutput extends StObject {
  
  /**
    * The user-supplied ID that uniquely identifies the Evaluation. This value should be identical to the value of the EvaluationId in the request.
    */
  var EvaluationId: js.UndefOr[EntityId] = js.undefined
}
object CreateEvaluationOutput {
  
  inline def apply(): CreateEvaluationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEvaluationOutput]
  }
  
  extension [Self <: CreateEvaluationOutput](x: Self) {
    
    inline def setEvaluationId(value: EntityId): Self = StObject.set(x, "EvaluationId", value.asInstanceOf[js.Any])
    
    inline def setEvaluationIdUndefined: Self = StObject.set(x, "EvaluationId", js.undefined)
  }
}
