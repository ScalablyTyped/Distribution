package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOTAUpdateRequest extends StObject {
  
  /**
    * The OTA update ID.
    */
  var otaUpdateId: OTAUpdateId
}
object GetOTAUpdateRequest {
  
  inline def apply(otaUpdateId: OTAUpdateId): GetOTAUpdateRequest = {
    val __obj = js.Dynamic.literal(otaUpdateId = otaUpdateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOTAUpdateRequest]
  }
  
  extension [Self <: GetOTAUpdateRequest](x: Self) {
    
    inline def setOtaUpdateId(value: OTAUpdateId): Self = StObject.set(x, "otaUpdateId", value.asInstanceOf[js.Any])
  }
}
