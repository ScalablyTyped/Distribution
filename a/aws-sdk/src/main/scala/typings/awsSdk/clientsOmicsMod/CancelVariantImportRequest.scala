package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelVariantImportRequest extends StObject {
  
  /**
    * The job's ID.
    */
  var jobId: ResourceId
}
object CancelVariantImportRequest {
  
  inline def apply(jobId: ResourceId): CancelVariantImportRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelVariantImportRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelVariantImportRequest] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: ResourceId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
