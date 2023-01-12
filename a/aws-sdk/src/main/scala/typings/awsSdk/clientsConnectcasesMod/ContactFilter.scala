package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactFilter extends StObject {
  
  /**
    * A list of channels to filter on for related items of type Contact.
    */
  var channel: js.UndefOr[ContactFilterChannelList] = js.undefined
  
  /**
    * A unique identifier of a contact in Amazon Connect.
    */
  var contactArn: js.UndefOr[ContactArn] = js.undefined
}
object ContactFilter {
  
  inline def apply(): ContactFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContactFilter] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: ContactFilterChannelList): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setChannelVarargs(value: Channel*): Self = StObject.set(x, "channel", js.Array(value*))
    
    inline def setContactArn(value: ContactArn): Self = StObject.set(x, "contactArn", value.asInstanceOf[js.Any])
    
    inline def setContactArnUndefined: Self = StObject.set(x, "contactArn", js.undefined)
  }
}
