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
  
  @scala.inline
  def apply(route: RouteData): DeleteRouteOutput = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRouteOutput]
  }
  
  @scala.inline
  implicit class DeleteRouteOutputMutableBuilder[Self <: DeleteRouteOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoute(value: RouteData): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
