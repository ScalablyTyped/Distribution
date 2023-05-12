package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSubscriberResponse extends StObject {
  
  /**
    * The subscription information for the specified subscription ID.
    */
  var subscriber: js.UndefOr[SubscriberResource] = js.undefined
}
object GetSubscriberResponse {
  
  inline def apply(): GetSubscriberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSubscriberResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSubscriberResponse] (val x: Self) extends AnyVal {
    
    inline def setSubscriber(value: SubscriberResource): Self = StObject.set(x, "subscriber", value.asInstanceOf[js.Any])
    
    inline def setSubscriberUndefined: Self = StObject.set(x, "subscriber", js.undefined)
  }
}
