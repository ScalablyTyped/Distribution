package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRouteOutput extends StObject {
  
  /**
    * The route that was deleted.
    */
  var route: RouteData
}
object DeleteRouteOutput {
  
  inline def apply(route: RouteData): DeleteRouteOutput = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRouteOutput]
  }
  
  extension [Self <: DeleteRouteOutput](x: Self) {
    
    inline def setRoute(value: RouteData): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
