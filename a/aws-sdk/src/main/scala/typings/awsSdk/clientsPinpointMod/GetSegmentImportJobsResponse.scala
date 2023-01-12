package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSegmentImportJobsResponse extends StObject {
  
  var ImportJobsResponse: typings.awsSdk.clientsPinpointMod.ImportJobsResponse
}
object GetSegmentImportJobsResponse {
  
  inline def apply(ImportJobsResponse: ImportJobsResponse): GetSegmentImportJobsResponse = {
    val __obj = js.Dynamic.literal(ImportJobsResponse = ImportJobsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSegmentImportJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSegmentImportJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setImportJobsResponse(value: ImportJobsResponse): Self = StObject.set(x, "ImportJobsResponse", value.asInstanceOf[js.Any])
  }
}
