package typings.awsSdk.clientsIot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimDevicesByClaimCodeResponse extends StObject {
  
  /**
    * The claim code provided by the device manufacturer.
    */
  var ClaimCode: js.UndefOr[stringMin12Max40] = js.undefined
  
  /**
    * The total number of devices associated with the claim code that has been processed in
    the claim request.
    */
  var Total: js.UndefOr[integer] = js.undefined
}
object ClaimDevicesByClaimCodeResponse {
  
  inline def apply(): ClaimDevicesByClaimCodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimDevicesByClaimCodeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClaimDevicesByClaimCodeResponse] (val x: Self) extends AnyVal {
    
    inline def setClaimCode(value: stringMin12Max40): Self = StObject.set(x, "ClaimCode", value.asInstanceOf[js.Any])
    
    inline def setClaimCodeUndefined: Self = StObject.set(x, "ClaimCode", js.undefined)
    
    inline def setTotal(value: integer): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
  }
}
