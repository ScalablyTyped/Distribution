package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePartnerEventSourceRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID that is permitted to create a matching partner event bus for this partner event source.
    */
  var Account: AccountId
  
  /**
    * The name of the partner event source. This name must be unique and must be in the format  partner_name/event_namespace/event_name . The Amazon Web Services account that wants to use this partner event source must create a partner event bus with a name that matches the name of the partner event source.
    */
  var Name: EventSourceName
}
object CreatePartnerEventSourceRequest {
  
  inline def apply(Account: AccountId, Name: EventSourceName): CreatePartnerEventSourceRequest = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePartnerEventSourceRequest]
  }
  
  extension [Self <: CreatePartnerEventSourceRequest](x: Self) {
    
    inline def setAccount(value: AccountId): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setName(value: EventSourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
