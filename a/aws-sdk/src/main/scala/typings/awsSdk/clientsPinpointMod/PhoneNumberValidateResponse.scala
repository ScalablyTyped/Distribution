package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneNumberValidateResponse extends StObject {
  
  var NumberValidateResponse: typings.awsSdk.clientsPinpointMod.NumberValidateResponse
}
object PhoneNumberValidateResponse {
  
  inline def apply(NumberValidateResponse: NumberValidateResponse): PhoneNumberValidateResponse = {
    val __obj = js.Dynamic.literal(NumberValidateResponse = NumberValidateResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumberValidateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhoneNumberValidateResponse] (val x: Self) extends AnyVal {
    
    inline def setNumberValidateResponse(value: NumberValidateResponse): Self = StObject.set(x, "NumberValidateResponse", value.asInstanceOf[js.Any])
  }
}
