package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImportJobResponse extends StObject {
  
  var ImportJobResponse: typings.awsSdk.clientsPinpointMod.ImportJobResponse
}
object GetImportJobResponse {
  
  inline def apply(ImportJobResponse: ImportJobResponse): GetImportJobResponse = {
    val __obj = js.Dynamic.literal(ImportJobResponse = ImportJobResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImportJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetImportJobResponse] (val x: Self) extends AnyVal {
    
    inline def setImportJobResponse(value: ImportJobResponse): Self = StObject.set(x, "ImportJobResponse", value.asInstanceOf[js.Any])
  }
}
