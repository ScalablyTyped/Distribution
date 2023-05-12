package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationStatus extends StObject {
  
  /**
    * An explanation for failed execution status.
    */
  var FailureReason: js.UndefOr[StringWithCharLimit1024] = js.undefined
  
  /**
    * The status of an execution. The valid values are In_Progress, Succeeded or Failed. 
    */
  var Status: ResourceEvaluationStatus
}
object EvaluationStatus {
  
  inline def apply(Status: ResourceEvaluationStatus): EvaluationStatus = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationStatus] (val x: Self) extends AnyVal {
    
    inline def setFailureReason(value: StringWithCharLimit1024): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setStatus(value: ResourceEvaluationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
