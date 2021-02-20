package typings.ariClient.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointStateChange extends Event {
  
  /**
    * Endpoint.
    */
  var endpoint: Endpoint = js.native
}
object EndpointStateChange {
  
  @scala.inline
  def apply(application: String, endpoint: Endpoint, timestamp: Date, `type`: String): EndpointStateChange = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointStateChange]
  }
  
  @scala.inline
  implicit class EndpointStateChangeMutableBuilder[Self <: EndpointStateChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: Endpoint): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
  }
}
