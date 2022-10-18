package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchStopJobRunError extends StObject {
  
  /**
    * Specifies details about the error that was encountered.
    */
  var ErrorDetail: js.UndefOr[typings.awsSdk.clientsGlueMod.ErrorDetail] = js.undefined
  
  /**
    * The name of the job definition that is used in the job run in question.
    */
  var JobName: js.UndefOr[NameString] = js.undefined
  
  /**
    * The JobRunId of the job run in question.
    */
  var JobRunId: js.UndefOr[IdString] = js.undefined
}
object BatchStopJobRunError {
  
  inline def apply(): BatchStopJobRunError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStopJobRunError]
  }
  
  extension [Self <: BatchStopJobRunError](x: Self) {
    
    inline def setErrorDetail(value: ErrorDetail): Self = StObject.set(x, "ErrorDetail", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailUndefined: Self = StObject.set(x, "ErrorDetail", js.undefined)
    
    inline def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setJobRunId(value: IdString): Self = StObject.set(x, "JobRunId", value.asInstanceOf[js.Any])
    
    inline def setJobRunIdUndefined: Self = StObject.set(x, "JobRunId", js.undefined)
  }
}
