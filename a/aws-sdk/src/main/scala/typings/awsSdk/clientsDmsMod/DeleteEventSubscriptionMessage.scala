package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEventSubscriptionMessage extends StObject {
  
  /**
    * The name of the DMS event notification subscription to be deleted.
    */
  var SubscriptionName: String
}
object DeleteEventSubscriptionMessage {
  
  inline def apply(SubscriptionName: String): DeleteEventSubscriptionMessage = {
    val __obj = js.Dynamic.literal(SubscriptionName = SubscriptionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEventSubscriptionMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteEventSubscriptionMessage] (val x: Self) extends AnyVal {
    
    inline def setSubscriptionName(value: String): Self = StObject.set(x, "SubscriptionName", value.asInstanceOf[js.Any])
  }
}
