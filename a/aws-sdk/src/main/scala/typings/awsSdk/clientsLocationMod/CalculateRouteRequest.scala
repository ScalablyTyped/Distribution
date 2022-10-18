package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculateRouteRequest extends StObject {
  
  /**
    * The name of the route calculator resource that you want to use to calculate the route. 
    */
  var CalculatorName: ResourceName
  
  /**
    * Specifies route preferences when traveling by Car, such as avoiding routes that use ferries or tolls. Requirements: TravelMode must be specified as Car.
    */
  var CarModeOptions: js.UndefOr[CalculateRouteCarModeOptions] = js.undefined
  
  /**
    * Sets the time of departure as the current time. Uses the current time to calculate a route. Otherwise, the best time of day to travel with the best traffic conditions is used to calculate the route. Default Value: false  Valid Values: false | true 
    */
  var DepartNow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The start position for the route. Defined in World Geodetic System (WGS 84) format: [longitude, latitude].   For example, [-123.115, 49.285]     If you specify a departure that's not located on a road, Amazon Location moves the position to the nearest road. If Esri is the provider for your route calculator, specifying a route that is longer than 400 km returns a 400 RoutesValidationException error.  Valid Values: [-180 to 180,-90 to 90] 
    */
  var DeparturePosition: Position
  
  /**
    * Specifies the desired time of departure. Uses the given time to calculate the route. Otherwise, the best time of day to travel with the best traffic conditions is used to calculate the route.  Setting a departure time in the past returns a 400 ValidationException error.    In ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ. For example, 2020–07-2T12:15:20.000Z+01:00   
    */
  var DepartureTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The finish position for the route. Defined in World Geodetic System (WGS 84) format: [longitude, latitude].    For example, [-122.339, 47.615]     If you specify a destination that's not located on a road, Amazon Location moves the position to the nearest road.   Valid Values: [-180 to 180,-90 to 90] 
    */
  var DestinationPosition: Position
  
  /**
    * Set the unit system to specify the distance. Default Value: Kilometers 
    */
  var DistanceUnit: js.UndefOr[typings.awsSdk.clientsLocationMod.DistanceUnit] = js.undefined
  
  /**
    * Set to include the geometry details in the result for each path between a pair of positions. Default Value: false  Valid Values: false | true 
    */
  var IncludeLegGeometry: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the mode of transport when calculating a route. Used in estimating the speed of travel and road compatibility. You can choose Car, Truck, or Walking as options for the TravelMode. The TravelMode you specify also determines how you specify route preferences:    If traveling by Car use the CarModeOptions parameter.   If traveling by Truck use the TruckModeOptions parameter.   Default Value: Car 
    */
  var TravelMode: js.UndefOr[typings.awsSdk.clientsLocationMod.TravelMode] = js.undefined
  
  /**
    * Specifies route preferences when traveling by Truck, such as avoiding routes that use ferries or tolls, and truck specifications to consider when choosing an optimal road. Requirements: TravelMode must be specified as Truck.
    */
  var TruckModeOptions: js.UndefOr[CalculateRouteTruckModeOptions] = js.undefined
  
  /**
    * Specifies an ordered list of up to 23 intermediate positions to include along a route between the departure position and destination position.    For example, from the DeparturePosition [-123.115, 49.285], the route follows the order that the waypoint positions are given [[-122.757, 49.0021],[-122.349, 47.620]]     If you specify a waypoint position that's not located on a road, Amazon Location moves the position to the nearest road.  Specifying more than 23 waypoints returns a 400 ValidationException error. If Esri is the provider for your route calculator, specifying a route that is longer than 400 km returns a 400 RoutesValidationException error.  Valid Values: [-180 to 180,-90 to 90] 
    */
  var WaypointPositions: js.UndefOr[CalculateRouteRequestWaypointPositionsList] = js.undefined
}
object CalculateRouteRequest {
  
  inline def apply(CalculatorName: ResourceName, DeparturePosition: Position, DestinationPosition: Position): CalculateRouteRequest = {
    val __obj = js.Dynamic.literal(CalculatorName = CalculatorName.asInstanceOf[js.Any], DeparturePosition = DeparturePosition.asInstanceOf[js.Any], DestinationPosition = DestinationPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculateRouteRequest]
  }
  
  extension [Self <: CalculateRouteRequest](x: Self) {
    
    inline def setCalculatorName(value: ResourceName): Self = StObject.set(x, "CalculatorName", value.asInstanceOf[js.Any])
    
    inline def setCarModeOptions(value: CalculateRouteCarModeOptions): Self = StObject.set(x, "CarModeOptions", value.asInstanceOf[js.Any])
    
    inline def setCarModeOptionsUndefined: Self = StObject.set(x, "CarModeOptions", js.undefined)
    
    inline def setDepartNow(value: Boolean): Self = StObject.set(x, "DepartNow", value.asInstanceOf[js.Any])
    
    inline def setDepartNowUndefined: Self = StObject.set(x, "DepartNow", js.undefined)
    
    inline def setDeparturePosition(value: Position): Self = StObject.set(x, "DeparturePosition", value.asInstanceOf[js.Any])
    
    inline def setDeparturePositionVarargs(value: Double*): Self = StObject.set(x, "DeparturePosition", js.Array(value*))
    
    inline def setDepartureTime(value: js.Date): Self = StObject.set(x, "DepartureTime", value.asInstanceOf[js.Any])
    
    inline def setDepartureTimeUndefined: Self = StObject.set(x, "DepartureTime", js.undefined)
    
    inline def setDestinationPosition(value: Position): Self = StObject.set(x, "DestinationPosition", value.asInstanceOf[js.Any])
    
    inline def setDestinationPositionVarargs(value: Double*): Self = StObject.set(x, "DestinationPosition", js.Array(value*))
    
    inline def setDistanceUnit(value: DistanceUnit): Self = StObject.set(x, "DistanceUnit", value.asInstanceOf[js.Any])
    
    inline def setDistanceUnitUndefined: Self = StObject.set(x, "DistanceUnit", js.undefined)
    
    inline def setIncludeLegGeometry(value: Boolean): Self = StObject.set(x, "IncludeLegGeometry", value.asInstanceOf[js.Any])
    
    inline def setIncludeLegGeometryUndefined: Self = StObject.set(x, "IncludeLegGeometry", js.undefined)
    
    inline def setTravelMode(value: TravelMode): Self = StObject.set(x, "TravelMode", value.asInstanceOf[js.Any])
    
    inline def setTravelModeUndefined: Self = StObject.set(x, "TravelMode", js.undefined)
    
    inline def setTruckModeOptions(value: CalculateRouteTruckModeOptions): Self = StObject.set(x, "TruckModeOptions", value.asInstanceOf[js.Any])
    
    inline def setTruckModeOptionsUndefined: Self = StObject.set(x, "TruckModeOptions", js.undefined)
    
    inline def setWaypointPositions(value: CalculateRouteRequestWaypointPositionsList): Self = StObject.set(x, "WaypointPositions", value.asInstanceOf[js.Any])
    
    inline def setWaypointPositionsUndefined: Self = StObject.set(x, "WaypointPositions", js.undefined)
    
    inline def setWaypointPositionsVarargs(value: Position*): Self = StObject.set(x, "WaypointPositions", js.Array(value*))
  }
}
