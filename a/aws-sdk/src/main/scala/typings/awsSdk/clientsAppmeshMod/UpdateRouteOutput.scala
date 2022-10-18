package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRouteOutput extends StObject {
  
  /**
    * A full description of the route that was updated.
    */
  var route: RouteData
}
object UpdateRouteOutput {
  
  inline def apply(route: RouteData): UpdateRouteOutput = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRouteOutput]
  }
  
  extension [Self <: UpdateRouteOutput](x: Self) {
    
    inline def setRoute(value: RouteData): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
