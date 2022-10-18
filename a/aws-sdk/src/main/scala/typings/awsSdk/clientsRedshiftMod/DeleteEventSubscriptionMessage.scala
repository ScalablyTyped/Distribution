package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEventSubscriptionMessage extends StObject {
  
  /**
    * The name of the Amazon Redshift event notification subscription to be deleted.
    */
  var SubscriptionName: String
}
object DeleteEventSubscriptionMessage {
  
  inline def apply(SubscriptionName: String): DeleteEventSubscriptionMessage = {
    val __obj = js.Dynamic.literal(SubscriptionName = SubscriptionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEventSubscriptionMessage]
  }
  
  extension [Self <: DeleteEventSubscriptionMessage](x: Self) {
    
    inline def setSubscriptionName(value: String): Self = StObject.set(x, "SubscriptionName", value.asInstanceOf[js.Any])
  }
}
