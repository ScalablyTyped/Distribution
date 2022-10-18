package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endpoint extends StObject {
  
  var endpoint: String
}
object Endpoint {
  
  inline def apply(endpoint: String): Endpoint = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
  
  extension [Self <: Endpoint](x: Self) {
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
  }
}
