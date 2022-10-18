package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRouteOutput extends StObject {
  
  /**
    * The full description of your mesh following the create call.
    */
  var route: RouteData
}
object CreateRouteOutput {
  
  inline def apply(route: RouteData): CreateRouteOutput = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRouteOutput]
  }
  
  extension [Self <: CreateRouteOutput](x: Self) {
    
    inline def setRoute(value: RouteData): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
