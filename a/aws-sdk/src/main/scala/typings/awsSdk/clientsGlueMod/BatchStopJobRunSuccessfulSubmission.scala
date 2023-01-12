package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchStopJobRunSuccessfulSubmission extends StObject {
  
  /**
    * The name of the job definition used in the job run that was stopped.
    */
  var JobName: js.UndefOr[NameString] = js.undefined
  
  /**
    * The JobRunId of the job run that was stopped.
    */
  var JobRunId: js.UndefOr[IdString] = js.undefined
}
object BatchStopJobRunSuccessfulSubmission {
  
  inline def apply(): BatchStopJobRunSuccessfulSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStopJobRunSuccessfulSubmission]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchStopJobRunSuccessfulSubmission] (val x: Self) extends AnyVal {
    
    inline def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setJobRunId(value: IdString): Self = StObject.set(x, "JobRunId", value.asInstanceOf[js.Any])
    
    inline def setJobRunIdUndefined: Self = StObject.set(x, "JobRunId", js.undefined)
  }
}
