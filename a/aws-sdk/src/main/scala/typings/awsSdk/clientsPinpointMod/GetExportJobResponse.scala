package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExportJobResponse extends StObject {
  
  var ExportJobResponse: typings.awsSdk.clientsPinpointMod.ExportJobResponse
}
object GetExportJobResponse {
  
  inline def apply(ExportJobResponse: ExportJobResponse): GetExportJobResponse = {
    val __obj = js.Dynamic.literal(ExportJobResponse = ExportJobResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExportJobResponse]
  }
  
  extension [Self <: GetExportJobResponse](x: Self) {
    
    inline def setExportJobResponse(value: ExportJobResponse): Self = StObject.set(x, "ExportJobResponse", value.asInstanceOf[js.Any])
  }
}
