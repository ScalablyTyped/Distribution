package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateImportJobResponse extends StObject {
  
  var ImportJobResponse: typings.awsSdk.clientsPinpointMod.ImportJobResponse
}
object CreateImportJobResponse {
  
  inline def apply(ImportJobResponse: ImportJobResponse): CreateImportJobResponse = {
    val __obj = js.Dynamic.literal(ImportJobResponse = ImportJobResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImportJobResponse]
  }
  
  extension [Self <: CreateImportJobResponse](x: Self) {
    
    inline def setImportJobResponse(value: ImportJobResponse): Self = StObject.set(x, "ImportJobResponse", value.asInstanceOf[js.Any])
  }
}
