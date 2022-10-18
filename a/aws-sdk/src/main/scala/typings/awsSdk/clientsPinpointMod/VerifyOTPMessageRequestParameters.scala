package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyOTPMessageRequestParameters extends StObject {
  
  /**
    * The destination identity to send OTP to.
    */
  var DestinationIdentity: string
  
  /**
    * The OTP the end user provided for verification.
    */
  var Otp: string
  
  /**
    * The reference identifier provided when the OTP was previously sent.
    */
  var ReferenceId: string
}
object VerifyOTPMessageRequestParameters {
  
  inline def apply(DestinationIdentity: string, Otp: string, ReferenceId: string): VerifyOTPMessageRequestParameters = {
    val __obj = js.Dynamic.literal(DestinationIdentity = DestinationIdentity.asInstanceOf[js.Any], Otp = Otp.asInstanceOf[js.Any], ReferenceId = ReferenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyOTPMessageRequestParameters]
  }
  
  extension [Self <: VerifyOTPMessageRequestParameters](x: Self) {
    
    inline def setDestinationIdentity(value: string): Self = StObject.set(x, "DestinationIdentity", value.asInstanceOf[js.Any])
    
    inline def setOtp(value: string): Self = StObject.set(x, "Otp", value.asInstanceOf[js.Any])
    
    inline def setReferenceId(value: string): Self = StObject.set(x, "ReferenceId", value.asInstanceOf[js.Any])
  }
}
