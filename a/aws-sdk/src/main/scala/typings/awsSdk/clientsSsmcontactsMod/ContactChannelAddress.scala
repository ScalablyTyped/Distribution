package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactChannelAddress extends StObject {
  
  /**
    * The format is dependent on the type of the contact channel. The following are the expected formats:   SMS - '+' followed by the country code and phone number   VOICE - '+' followed by the country code and phone number   EMAIL - any standard email format  
    */
  var SimpleAddress: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.SimpleAddress] = js.undefined
}
object ContactChannelAddress {
  
  inline def apply(): ContactChannelAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactChannelAddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContactChannelAddress] (val x: Self) extends AnyVal {
    
    inline def setSimpleAddress(value: SimpleAddress): Self = StObject.set(x, "SimpleAddress", value.asInstanceOf[js.Any])
    
    inline def setSimpleAddressUndefined: Self = StObject.set(x, "SimpleAddress", js.undefined)
  }
}
