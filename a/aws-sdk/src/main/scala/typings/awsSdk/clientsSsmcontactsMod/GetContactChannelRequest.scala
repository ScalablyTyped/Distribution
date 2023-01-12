package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContactChannelRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the contact channel you want information about.
    */
  var ContactChannelId: SsmContactsArn
}
object GetContactChannelRequest {
  
  inline def apply(ContactChannelId: SsmContactsArn): GetContactChannelRequest = {
    val __obj = js.Dynamic.literal(ContactChannelId = ContactChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContactChannelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetContactChannelRequest] (val x: Self) extends AnyVal {
    
    inline def setContactChannelId(value: SsmContactsArn): Self = StObject.set(x, "ContactChannelId", value.asInstanceOf[js.Any])
  }
}
