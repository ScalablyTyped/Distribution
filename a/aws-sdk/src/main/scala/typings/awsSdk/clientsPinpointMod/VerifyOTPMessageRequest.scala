package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyOTPMessageRequest extends StObject {
  
  /**
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: string
  
  var VerifyOTPMessageRequestParameters: typings.awsSdk.clientsPinpointMod.VerifyOTPMessageRequestParameters
}
object VerifyOTPMessageRequest {
  
  inline def apply(ApplicationId: string, VerifyOTPMessageRequestParameters: VerifyOTPMessageRequestParameters): VerifyOTPMessageRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], VerifyOTPMessageRequestParameters = VerifyOTPMessageRequestParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyOTPMessageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifyOTPMessageRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setVerifyOTPMessageRequestParameters(value: VerifyOTPMessageRequestParameters): Self = StObject.set(x, "VerifyOTPMessageRequestParameters", value.asInstanceOf[js.Any])
  }
}
