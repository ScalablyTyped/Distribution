package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSubscriberRequest extends StObject {
  
  /**
    * A value created by Amazon Security Lake that uniquely identifies your GetSubscriber API request.
    */
  var id: String
}
object GetSubscriberRequest {
  
  inline def apply(id: String): GetSubscriberRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSubscriberRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSubscriberRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
