package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSubscribersResponse extends StObject {
  
  /**
    * If nextToken is returned, there are more results available. You can repeat the call using the returned token to retrieve the next page.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The subscribers available for the specified Security Lake account ID.
    */
  var subscribers: SubscriberList
}
object ListSubscribersResponse {
  
  inline def apply(subscribers: SubscriberList): ListSubscribersResponse = {
    val __obj = js.Dynamic.literal(subscribers = subscribers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSubscribersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSubscribersResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSubscribers(value: SubscriberList): Self = StObject.set(x, "subscribers", value.asInstanceOf[js.Any])
    
    inline def setSubscribersVarargs(value: SubscriberResource*): Self = StObject.set(x, "subscribers", js.Array(value*))
  }
}
