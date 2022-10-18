package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivateContactChannelRequest extends StObject {
  
  /**
    * The code sent to the contact channel when it was created in the contact. 
    */
  var ActivationCode: typings.awsSdk.clientsSsmcontactsMod.ActivationCode
  
  /**
    * The Amazon Resource Name (ARN) of the contact channel.
    */
  var ContactChannelId: SsmContactsArn
}
object ActivateContactChannelRequest {
  
  inline def apply(ActivationCode: ActivationCode, ContactChannelId: SsmContactsArn): ActivateContactChannelRequest = {
    val __obj = js.Dynamic.literal(ActivationCode = ActivationCode.asInstanceOf[js.Any], ContactChannelId = ContactChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivateContactChannelRequest]
  }
  
  extension [Self <: ActivateContactChannelRequest](x: Self) {
    
    inline def setActivationCode(value: ActivationCode): Self = StObject.set(x, "ActivationCode", value.asInstanceOf[js.Any])
    
    inline def setContactChannelId(value: SsmContactsArn): Self = StObject.set(x, "ContactChannelId", value.asInstanceOf[js.Any])
  }
}
