package typings.awsSdk.clientsDiscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopContinuousExportRequest extends StObject {
  
  /**
    * The unique ID assigned to this export.
    */
  var exportId: ConfigurationsExportId
}
object StopContinuousExportRequest {
  
  inline def apply(exportId: ConfigurationsExportId): StopContinuousExportRequest = {
    val __obj = js.Dynamic.literal(exportId = exportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopContinuousExportRequest]
  }
  
  extension [Self <: StopContinuousExportRequest](x: Self) {
    
    inline def setExportId(value: ConfigurationsExportId): Self = StObject.set(x, "exportId", value.asInstanceOf[js.Any])
  }
}
