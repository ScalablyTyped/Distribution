package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSubscriberResponse extends StObject {
  
  /**
    * The account of the subscriber.
    */
  var subscriber: js.UndefOr[SubscriberResource] = js.undefined
}
object UpdateSubscriberResponse {
  
  inline def apply(): UpdateSubscriberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSubscriberResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSubscriberResponse] (val x: Self) extends AnyVal {
    
    inline def setSubscriber(value: SubscriberResource): Self = StObject.set(x, "subscriber", value.asInstanceOf[js.Any])
    
    inline def setSubscriberUndefined: Self = StObject.set(x, "subscriber", js.undefined)
  }
}
