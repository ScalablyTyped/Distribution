package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRouteOutput extends StObject {
  
  /**
    * A full description of the route that was updated.
    */
  var route: RouteData = js.native
}
object UpdateRouteOutput {
  
  @scala.inline
  def apply(route: RouteData): UpdateRouteOutput = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRouteOutput]
  }
  
  @scala.inline
  implicit class UpdateRouteOutputMutableBuilder[Self <: UpdateRouteOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoute(value: RouteData): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
