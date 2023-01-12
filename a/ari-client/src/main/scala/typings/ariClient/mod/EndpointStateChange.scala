package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointStateChange
  extends StObject
     with Event {
  
  /**
    * Endpoint.
    */
  var endpoint: Endpoint
}
object EndpointStateChange {
  
  inline def apply(application: String, endpoint: Endpoint, timestamp: js.Date, `type`: String): EndpointStateChange = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointStateChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndpointStateChange] (val x: Self) extends AnyVal {
    
    inline def setEndpoint(value: Endpoint): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
  }
}
