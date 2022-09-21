package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrpcRouteAction extends StObject {
  
  /**
    * An object that represents the targets that traffic is routed to when a request matches the route.
    */
  var weightedTargets: WeightedTargets
}
object GrpcRouteAction {
  
  inline def apply(weightedTargets: WeightedTargets): GrpcRouteAction = {
    val __obj = js.Dynamic.literal(weightedTargets = weightedTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrpcRouteAction]
  }
  
  extension [Self <: GrpcRouteAction](x: Self) {
    
    inline def setWeightedTargets(value: WeightedTargets): Self = StObject.set(x, "weightedTargets", value.asInstanceOf[js.Any])
    
    inline def setWeightedTargetsVarargs(value: WeightedTarget*): Self = StObject.set(x, "weightedTargets", js.Array(value*))
  }
}
