package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchStopJobRunResponse extends StObject {
  
  /**
    * A list of the errors that were encountered in trying to stop JobRuns, including the JobRunId for which each error was encountered and details about the error.
    */
  var Errors: js.UndefOr[BatchStopJobRunErrorList] = js.undefined
  
  /**
    * A list of the JobRuns that were successfully submitted for stopping.
    */
  var SuccessfulSubmissions: js.UndefOr[BatchStopJobRunSuccessfulSubmissionList] = js.undefined
}
object BatchStopJobRunResponse {
  
  inline def apply(): BatchStopJobRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStopJobRunResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchStopJobRunResponse] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: BatchStopJobRunErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: BatchStopJobRunError*): Self = StObject.set(x, "Errors", js.Array(value*))
    
    inline def setSuccessfulSubmissions(value: BatchStopJobRunSuccessfulSubmissionList): Self = StObject.set(x, "SuccessfulSubmissions", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulSubmissionsUndefined: Self = StObject.set(x, "SuccessfulSubmissions", js.undefined)
    
    inline def setSuccessfulSubmissionsVarargs(value: BatchStopJobRunSuccessfulSubmission*): Self = StObject.set(x, "SuccessfulSubmissions", js.Array(value*))
  }
}
