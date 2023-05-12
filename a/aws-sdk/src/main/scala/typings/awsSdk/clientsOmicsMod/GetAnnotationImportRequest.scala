package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAnnotationImportRequest extends StObject {
  
  /**
    * The job's ID.
    */
  var jobId: ResourceId
}
object GetAnnotationImportRequest {
  
  inline def apply(jobId: ResourceId): GetAnnotationImportRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAnnotationImportRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAnnotationImportRequest] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: ResourceId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
