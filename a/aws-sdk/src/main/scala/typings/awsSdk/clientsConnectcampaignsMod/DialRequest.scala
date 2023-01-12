package typings.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialRequest extends StObject {
  
  var attributes: Attributes
  
  var clientToken: ClientToken
  
  var expirationTime: js.Date
  
  var phoneNumber: DestinationPhoneNumber
}
object DialRequest {
  
  inline def apply(
    attributes: Attributes,
    clientToken: ClientToken,
    expirationTime: js.Date,
    phoneNumber: DestinationPhoneNumber
  ): DialRequest = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], clientToken = clientToken.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialRequest] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setExpirationTime(value: js.Date): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumber(value: DestinationPhoneNumber): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
  }
}
