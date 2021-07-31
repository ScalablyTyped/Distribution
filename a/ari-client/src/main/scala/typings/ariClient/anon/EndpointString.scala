package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointString extends StObject {
  
  var endpoint: String
}
object EndpointString {
  
  @scala.inline
  def apply(endpoint: String): EndpointString = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointString]
  }
  
  @scala.inline
  implicit class EndpointStringMutableBuilder[Self <: EndpointString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
  }
}
