package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactContent extends StObject {
  
  /**
    * A list of channels to filter on for related items of type Contact.
    */
  var channel: Channel
  
  /**
    * The difference between the InitiationTimestamp and the DisconnectTimestamp of the contact.
    */
  var connectedToSystemTime: js.Date
  
  /**
    * A unique identifier of a contact in Amazon Connect.
    */
  var contactArn: ContactArn
}
object ContactContent {
  
  inline def apply(channel: Channel, connectedToSystemTime: js.Date, contactArn: ContactArn): ContactContent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], connectedToSystemTime = connectedToSystemTime.asInstanceOf[js.Any], contactArn = contactArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContactContent] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setConnectedToSystemTime(value: js.Date): Self = StObject.set(x, "connectedToSystemTime", value.asInstanceOf[js.Any])
    
    inline def setContactArn(value: ContactArn): Self = StObject.set(x, "contactArn", value.asInstanceOf[js.Any])
  }
}
