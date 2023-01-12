package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Secondary extends StObject {
  
  /**
    * Defines the secondary Region.
    */
  var Route: typings.awsSdk.clientsEventbridgeMod.Route
}
object Secondary {
  
  inline def apply(Route: Route): Secondary = {
    val __obj = js.Dynamic.literal(Route = Route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Secondary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Secondary] (val x: Self) extends AnyVal {
    
    inline def setRoute(value: Route): Self = StObject.set(x, "Route", value.asInstanceOf[js.Any])
  }
}
