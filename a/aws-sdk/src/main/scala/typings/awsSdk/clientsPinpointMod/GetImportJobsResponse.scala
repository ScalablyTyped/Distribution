package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImportJobsResponse extends StObject {
  
  var ImportJobsResponse: typings.awsSdk.clientsPinpointMod.ImportJobsResponse
}
object GetImportJobsResponse {
  
  inline def apply(ImportJobsResponse: ImportJobsResponse): GetImportJobsResponse = {
    val __obj = js.Dynamic.literal(ImportJobsResponse = ImportJobsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImportJobsResponse]
  }
  
  extension [Self <: GetImportJobsResponse](x: Self) {
    
    inline def setImportJobsResponse(value: ImportJobsResponse): Self = StObject.set(x, "ImportJobsResponse", value.asInstanceOf[js.Any])
  }
}
