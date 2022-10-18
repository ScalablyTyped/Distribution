package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateContactChannelResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the contact channel.
    */
  var ContactChannelArn: SsmContactsArn
}
object CreateContactChannelResult {
  
  inline def apply(ContactChannelArn: SsmContactsArn): CreateContactChannelResult = {
    val __obj = js.Dynamic.literal(ContactChannelArn = ContactChannelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContactChannelResult]
  }
  
  extension [Self <: CreateContactChannelResult](x: Self) {
    
    inline def setContactChannelArn(value: SsmContactsArn): Self = StObject.set(x, "ContactChannelArn", value.asInstanceOf[js.Any])
  }
}
