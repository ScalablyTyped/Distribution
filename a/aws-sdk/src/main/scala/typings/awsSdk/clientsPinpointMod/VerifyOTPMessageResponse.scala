package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyOTPMessageResponse extends StObject {
  
  var VerificationResponse: typings.awsSdk.clientsPinpointMod.VerificationResponse
}
object VerifyOTPMessageResponse {
  
  inline def apply(VerificationResponse: VerificationResponse): VerifyOTPMessageResponse = {
    val __obj = js.Dynamic.literal(VerificationResponse = VerificationResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyOTPMessageResponse]
  }
  
  extension [Self <: VerifyOTPMessageResponse](x: Self) {
    
    inline def setVerificationResponse(value: VerificationResponse): Self = StObject.set(x, "VerificationResponse", value.asInstanceOf[js.Any])
  }
}
