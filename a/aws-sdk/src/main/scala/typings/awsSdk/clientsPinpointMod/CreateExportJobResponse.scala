package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateExportJobResponse extends StObject {
  
  var ExportJobResponse: typings.awsSdk.clientsPinpointMod.ExportJobResponse
}
object CreateExportJobResponse {
  
  inline def apply(ExportJobResponse: ExportJobResponse): CreateExportJobResponse = {
    val __obj = js.Dynamic.literal(ExportJobResponse = ExportJobResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExportJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateExportJobResponse] (val x: Self) extends AnyVal {
    
    inline def setExportJobResponse(value: ExportJobResponse): Self = StObject.set(x, "ExportJobResponse", value.asInstanceOf[js.Any])
  }
}
