package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendOTPMessageRequest extends StObject {
  
  /**
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: string
  
  var SendOTPMessageRequestParameters: typings.awsSdk.clientsPinpointMod.SendOTPMessageRequestParameters
}
object SendOTPMessageRequest {
  
  inline def apply(ApplicationId: string, SendOTPMessageRequestParameters: SendOTPMessageRequestParameters): SendOTPMessageRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SendOTPMessageRequestParameters = SendOTPMessageRequestParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendOTPMessageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendOTPMessageRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setSendOTPMessageRequestParameters(value: SendOTPMessageRequestParameters): Self = StObject.set(x, "SendOTPMessageRequestParameters", value.asInstanceOf[js.Any])
  }
}
