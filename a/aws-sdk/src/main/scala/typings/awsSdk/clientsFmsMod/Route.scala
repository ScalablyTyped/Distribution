package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Route extends StObject {
  
  /**
    * The destination of the route.
    */
  var Destination: js.UndefOr[LengthBoundedString] = js.undefined
  
  /**
    * The type of destination for the route.
    */
  var DestinationType: js.UndefOr[typings.awsSdk.clientsFmsMod.DestinationType] = js.undefined
  
  /**
    * The route's target.
    */
  var Target: js.UndefOr[LengthBoundedString] = js.undefined
  
  /**
    * The type of target for the route.
    */
  var TargetType: js.UndefOr[typings.awsSdk.clientsFmsMod.TargetType] = js.undefined
}
object Route {
  
  inline def apply(): Route = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Route]
  }
  
  extension [Self <: Route](x: Self) {
    
    inline def setDestination(value: LengthBoundedString): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationType(value: DestinationType): Self = StObject.set(x, "DestinationType", value.asInstanceOf[js.Any])
    
    inline def setDestinationTypeUndefined: Self = StObject.set(x, "DestinationType", js.undefined)
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setTarget(value: LengthBoundedString): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    inline def setTargetType(value: TargetType): Self = StObject.set(x, "TargetType", value.asInstanceOf[js.Any])
    
    inline def setTargetTypeUndefined: Self = StObject.set(x, "TargetType", js.undefined)
    
    inline def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
  }
}
