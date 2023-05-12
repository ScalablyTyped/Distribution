package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationFormScoringStrategy extends StObject {
  
  /**
    * The scoring mode of the evaluation form.
    */
  var Mode: EvaluationFormScoringMode
  
  /**
    * The scoring status of the evaluation form.
    */
  var Status: EvaluationFormScoringStatus
}
object EvaluationFormScoringStrategy {
  
  inline def apply(Mode: EvaluationFormScoringMode, Status: EvaluationFormScoringStatus): EvaluationFormScoringStrategy = {
    val __obj = js.Dynamic.literal(Mode = Mode.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationFormScoringStrategy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationFormScoringStrategy] (val x: Self) extends AnyVal {
    
    inline def setMode(value: EvaluationFormScoringMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: EvaluationFormScoringStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
