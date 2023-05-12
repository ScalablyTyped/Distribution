package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartVariantImportResponse extends StObject {
  
  /**
    * The job's ID.
    */
  var jobId: ResourceId
}
object StartVariantImportResponse {
  
  inline def apply(jobId: ResourceId): StartVariantImportResponse = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartVariantImportResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartVariantImportResponse] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: ResourceId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
