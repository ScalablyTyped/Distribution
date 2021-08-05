package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The directions and estimated travel time returned for a route.
  */
trait DirectionsResponse extends StObject {
  
  var request: js.Any
  
  var routes: js.Array[Route]
}
object DirectionsResponse {
  
  inline def apply(request: js.Any, routes: js.Array[Route]): DirectionsResponse = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsResponse]
  }
  
  extension [Self <: DirectionsResponse](x: Self) {
    
    inline def setRequest(value: js.Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRoutes(value: js.Array[Route]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesVarargs(value: Route*): Self = StObject.set(x, "routes", js.Array(value :_*))
  }
}
