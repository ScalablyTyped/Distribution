package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchStopJobRunRequest extends StObject {
  
  /**
    * The name of the job definition for which to stop job runs.
    */
  var JobName: NameString
  
  /**
    * A list of the JobRunIds that should be stopped for that job definition.
    */
  var JobRunIds: BatchStopJobRunJobRunIdList
}
object BatchStopJobRunRequest {
  
  inline def apply(JobName: NameString, JobRunIds: BatchStopJobRunJobRunIdList): BatchStopJobRunRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any], JobRunIds = JobRunIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchStopJobRunRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchStopJobRunRequest] (val x: Self) extends AnyVal {
    
    inline def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobRunIds(value: BatchStopJobRunJobRunIdList): Self = StObject.set(x, "JobRunIds", value.asInstanceOf[js.Any])
    
    inline def setJobRunIdsVarargs(value: IdString*): Self = StObject.set(x, "JobRunIds", js.Array(value*))
  }
}
