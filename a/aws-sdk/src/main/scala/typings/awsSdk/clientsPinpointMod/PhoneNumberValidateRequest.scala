package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneNumberValidateRequest extends StObject {
  
  var NumberValidateRequest: typings.awsSdk.clientsPinpointMod.NumberValidateRequest
}
object PhoneNumberValidateRequest {
  
  inline def apply(NumberValidateRequest: NumberValidateRequest): PhoneNumberValidateRequest = {
    val __obj = js.Dynamic.literal(NumberValidateRequest = NumberValidateRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumberValidateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhoneNumberValidateRequest] (val x: Self) extends AnyVal {
    
    inline def setNumberValidateRequest(value: NumberValidateRequest): Self = StObject.set(x, "NumberValidateRequest", value.asInstanceOf[js.Any])
  }
}
