package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSubscriberRequest extends StObject {
  
  /**
    * A value created by Security Lake that uniquely identifies your DeleteSubscriber API request. 
    */
  var id: String
}
object DeleteSubscriberRequest {
  
  inline def apply(id: String): DeleteSubscriberRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSubscriberRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSubscriberRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
