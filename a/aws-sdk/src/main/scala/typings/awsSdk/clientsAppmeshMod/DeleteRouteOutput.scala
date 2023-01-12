package typings.awsSdk.clientsAppmeshMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRouteOutput] (val x: Self) extends AnyVal {
    
    inline def setRoute(value: RouteData): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
