package typings.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEvaluationOutput extends StObject {
  
  /**
    * A user-supplied ID that uniquely identifies the Evaluation. This value should be identical to the value of the EvaluationId in the request.
    */
  var EvaluationId: js.UndefOr[EntityId] = js.undefined
}
object DeleteEvaluationOutput {
  
  inline def apply(): DeleteEvaluationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteEvaluationOutput]
  }
  
  extension [Self <: DeleteEvaluationOutput](x: Self) {
    
    inline def setEvaluationId(value: EntityId): Self = StObject.set(x, "EvaluationId", value.asInstanceOf[js.Any])
    
    inline def setEvaluationIdUndefined: Self = StObject.set(x, "EvaluationId", js.undefined)
  }
}
