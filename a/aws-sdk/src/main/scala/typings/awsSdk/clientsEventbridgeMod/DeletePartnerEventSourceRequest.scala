package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePartnerEventSourceRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID of the Amazon Web Services customer that the event source was created for.
    */
  var Account: AccountId
  
  /**
    * The name of the event source to delete.
    */
  var Name: EventSourceName
}
object DeletePartnerEventSourceRequest {
  
  inline def apply(Account: AccountId, Name: EventSourceName): DeletePartnerEventSourceRequest = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePartnerEventSourceRequest]
  }
  
  extension [Self <: DeletePartnerEventSourceRequest](x: Self) {
    
    inline def setAccount(value: AccountId): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setName(value: EventSourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
