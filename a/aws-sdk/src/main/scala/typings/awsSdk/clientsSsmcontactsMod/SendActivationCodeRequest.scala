package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendActivationCodeRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the contact channel.
    */
  var ContactChannelId: SsmContactsArn
}
object SendActivationCodeRequest {
  
  inline def apply(ContactChannelId: SsmContactsArn): SendActivationCodeRequest = {
    val __obj = js.Dynamic.literal(ContactChannelId = ContactChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendActivationCodeRequest]
  }
  
  extension [Self <: SendActivationCodeRequest](x: Self) {
    
    inline def setContactChannelId(value: SsmContactsArn): Self = StObject.set(x, "ContactChannelId", value.asInstanceOf[js.Any])
  }
}
