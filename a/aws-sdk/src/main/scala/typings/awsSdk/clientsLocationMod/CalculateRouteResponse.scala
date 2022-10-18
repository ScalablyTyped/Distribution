package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculateRouteResponse extends StObject {
  
  /**
    * Contains details about each path between a pair of positions included along a route such as: StartPosition, EndPosition, Distance, DurationSeconds, Geometry, and Steps. The number of legs returned corresponds to one fewer than the total number of positions in the request.  For example, a route with a departure position and destination position returns one leg with the positions snapped to a nearby road:   The StartPosition is the departure position.   The EndPosition is the destination position.   A route with a waypoint between the departure and destination position returns two legs with the positions snapped to a nearby road:   Leg 1: The StartPosition is the departure position . The EndPosition is the waypoint positon.   Leg 2: The StartPosition is the waypoint position. The EndPosition is the destination position.  
    */
  var Legs: LegList
  
  /**
    * Contains information about the whole route, such as: RouteBBox, DataSource, Distance, DistanceUnit, and DurationSeconds.
    */
  var Summary: CalculateRouteSummary
}
object CalculateRouteResponse {
  
  inline def apply(Legs: LegList, Summary: CalculateRouteSummary): CalculateRouteResponse = {
    val __obj = js.Dynamic.literal(Legs = Legs.asInstanceOf[js.Any], Summary = Summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculateRouteResponse]
  }
  
  extension [Self <: CalculateRouteResponse](x: Self) {
    
    inline def setLegs(value: LegList): Self = StObject.set(x, "Legs", value.asInstanceOf[js.Any])
    
    inline def setLegsVarargs(value: Leg*): Self = StObject.set(x, "Legs", js.Array(value*))
    
    inline def setSummary(value: CalculateRouteSummary): Self = StObject.set(x, "Summary", value.asInstanceOf[js.Any])
  }
}
