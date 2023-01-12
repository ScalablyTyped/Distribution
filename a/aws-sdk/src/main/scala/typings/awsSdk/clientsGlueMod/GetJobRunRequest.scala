package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobRunRequest extends StObject {
  
  /**
    * Name of the job definition being run.
    */
  var JobName: NameString
  
  /**
    * True if a list of predecessor runs should be returned.
    */
  var PredecessorsIncluded: js.UndefOr[BooleanValue] = js.undefined
  
  /**
    * The ID of the job run.
    */
  var RunId: IdString
}
object GetJobRunRequest {
  
  inline def apply(JobName: NameString, RunId: IdString): GetJobRunRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any], RunId = RunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobRunRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetJobRunRequest] (val x: Self) extends AnyVal {
    
    inline def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setPredecessorsIncluded(value: BooleanValue): Self = StObject.set(x, "PredecessorsIncluded", value.asInstanceOf[js.Any])
    
    inline def setPredecessorsIncludedUndefined: Self = StObject.set(x, "PredecessorsIncluded", js.undefined)
    
    inline def setRunId(value: IdString): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
  }
}
