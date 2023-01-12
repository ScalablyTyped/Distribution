package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpRouteAction extends StObject {
  
  /**
    * An object that represents the targets that traffic is routed to when a request matches the route.
    */
  var weightedTargets: WeightedTargets
}
object HttpRouteAction {
  
  inline def apply(weightedTargets: WeightedTargets): HttpRouteAction = {
    val __obj = js.Dynamic.literal(weightedTargets = weightedTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRouteAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpRouteAction] (val x: Self) extends AnyVal {
    
    inline def setWeightedTargets(value: WeightedTargets): Self = StObject.set(x, "weightedTargets", value.asInstanceOf[js.Any])
    
    inline def setWeightedTargetsVarargs(value: WeightedTarget*): Self = StObject.set(x, "weightedTargets", js.Array(value*))
  }
}
