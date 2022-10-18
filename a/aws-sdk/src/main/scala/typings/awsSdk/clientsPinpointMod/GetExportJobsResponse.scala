package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExportJobsResponse extends StObject {
  
  var ExportJobsResponse: typings.awsSdk.clientsPinpointMod.ExportJobsResponse
}
object GetExportJobsResponse {
  
  inline def apply(ExportJobsResponse: ExportJobsResponse): GetExportJobsResponse = {
    val __obj = js.Dynamic.literal(ExportJobsResponse = ExportJobsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExportJobsResponse]
  }
  
  extension [Self <: GetExportJobsResponse](x: Self) {
    
    inline def setExportJobsResponse(value: ExportJobsResponse): Self = StObject.set(x, "ExportJobsResponse", value.asInstanceOf[js.Any])
  }
}
