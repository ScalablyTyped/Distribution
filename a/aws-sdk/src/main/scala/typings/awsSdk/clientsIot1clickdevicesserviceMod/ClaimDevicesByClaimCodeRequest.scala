package typings.awsSdk.clientsIot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimDevicesByClaimCodeRequest extends StObject {
  
  /**
    * The claim code, starting with "C-", as provided by the device manufacturer.
    */
  var ClaimCode: string
}
object ClaimDevicesByClaimCodeRequest {
  
  inline def apply(ClaimCode: string): ClaimDevicesByClaimCodeRequest = {
    val __obj = js.Dynamic.literal(ClaimCode = ClaimCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimDevicesByClaimCodeRequest]
  }
  
  extension [Self <: ClaimDevicesByClaimCodeRequest](x: Self) {
    
    inline def setClaimCode(value: string): Self = StObject.set(x, "ClaimCode", value.asInstanceOf[js.Any])
  }
}
