package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimDeviceRequest extends StObject {
  
  /**
    * The id of the device you want to claim.
    */
  var Id: js.UndefOr[string] = js.undefined
}
object ClaimDeviceRequest {
  
  inline def apply(): ClaimDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimDeviceRequest]
  }
  
  extension [Self <: ClaimDeviceRequest](x: Self) {
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
