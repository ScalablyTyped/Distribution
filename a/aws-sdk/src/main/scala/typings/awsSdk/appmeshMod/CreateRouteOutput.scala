package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRouteOutput extends StObject {
  
  /**
    * The full description of your mesh following the create call.
    */
  var route: RouteData = js.native
}
object CreateRouteOutput {
  
  @scala.inline
  def apply(route: RouteData): CreateRouteOutput = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRouteOutput]
  }
  
  @scala.inline
  implicit class CreateRouteOutputMutableBuilder[Self <: CreateRouteOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoute(value: RouteData): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
