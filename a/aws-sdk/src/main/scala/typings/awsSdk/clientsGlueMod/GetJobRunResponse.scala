package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobRunResponse extends StObject {
  
  /**
    * The requested job-run metadata.
    */
  var JobRun: js.UndefOr[typings.awsSdk.clientsGlueMod.JobRun] = js.undefined
}
object GetJobRunResponse {
  
  inline def apply(): GetJobRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobRunResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetJobRunResponse] (val x: Self) extends AnyVal {
    
    inline def setJobRun(value: JobRun): Self = StObject.set(x, "JobRun", value.asInstanceOf[js.Any])
    
    inline def setJobRunUndefined: Self = StObject.set(x, "JobRun", js.undefined)
  }
}
