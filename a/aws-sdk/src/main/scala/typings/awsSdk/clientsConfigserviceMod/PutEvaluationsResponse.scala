package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEvaluationsResponse extends StObject {
  
  /**
    * Requests that failed because of a client or server error.
    */
  var FailedEvaluations: js.UndefOr[Evaluations] = js.undefined
}
object PutEvaluationsResponse {
  
  inline def apply(): PutEvaluationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutEvaluationsResponse]
  }
  
  extension [Self <: PutEvaluationsResponse](x: Self) {
    
    inline def setFailedEvaluations(value: Evaluations): Self = StObject.set(x, "FailedEvaluations", value.asInstanceOf[js.Any])
    
    inline def setFailedEvaluationsUndefined: Self = StObject.set(x, "FailedEvaluations", js.undefined)
    
    inline def setFailedEvaluationsVarargs(value: Evaluation*): Self = StObject.set(x, "FailedEvaluations", js.Array(value*))
  }
}
