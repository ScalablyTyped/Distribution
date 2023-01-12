package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImportJobRequest extends StObject {
  
  /**
    * The ID of the import job.
    */
  var JobId: typings.awsSdk.clientsSesv2Mod.JobId
}
object GetImportJobRequest {
  
  inline def apply(JobId: JobId): GetImportJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImportJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetImportJobRequest] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
