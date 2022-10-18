package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSegmentExportJobsResponse extends StObject {
  
  var ExportJobsResponse: typings.awsSdk.clientsPinpointMod.ExportJobsResponse
}
object GetSegmentExportJobsResponse {
  
  inline def apply(ExportJobsResponse: ExportJobsResponse): GetSegmentExportJobsResponse = {
    val __obj = js.Dynamic.literal(ExportJobsResponse = ExportJobsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSegmentExportJobsResponse]
  }
  
  extension [Self <: GetSegmentExportJobsResponse](x: Self) {
    
    inline def setExportJobsResponse(value: ExportJobsResponse): Self = StObject.set(x, "ExportJobsResponse", value.asInstanceOf[js.Any])
  }
}
