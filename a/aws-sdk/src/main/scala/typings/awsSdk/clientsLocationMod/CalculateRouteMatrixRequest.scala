package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculateRouteMatrixRequest extends StObject {
  
  /**
    * The name of the route calculator resource that you want to use to calculate the route matrix. 
    */
  var CalculatorName: ResourceName
  
  /**
    * Specifies route preferences when traveling by Car, such as avoiding routes that use ferries or tolls. Requirements: TravelMode must be specified as Car.
    */
  var CarModeOptions: js.UndefOr[CalculateRouteCarModeOptions] = js.undefined
  
  /**
    * Sets the time of departure as the current time. Uses the current time to calculate the route matrix. You can't set both DepartureTime and DepartNow. If neither is set, the best time of day to travel with the best traffic conditions is used to calculate the route matrix. Default Value: false  Valid Values: false | true 
    */
  var DepartNow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The list of departure (origin) positions for the route matrix. An array of points, each of which is itself a 2-value array defined in WGS 84 format: [longitude, latitude]. For example, [-123.115, 49.285].  Depending on the data provider selected in the route calculator resource there may be additional restrictions on the inputs you can choose. See  Position restrictions in the Amazon Location Service Developer Guide.   For route calculators that use Esri as the data provider, if you specify a departure that's not located on a road, Amazon Location  moves the position to the nearest road. The snapped value is available in the result in SnappedDeparturePositions.  Valid Values: [-180 to 180,-90 to 90] 
    */
  var DeparturePositions: CalculateRouteMatrixRequestDeparturePositionsList
  
  /**
    * Specifies the desired time of departure. Uses the given time to calculate the route matrix. You can't set both DepartureTime and DepartNow. If neither is set, the best time of day to travel with the best traffic conditions is used to calculate the route matrix.  Setting a departure time in the past returns a 400 ValidationException error.    In ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ. For example, 2020–07-2T12:15:20.000Z+01:00   
    */
  var DepartureTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The list of destination positions for the route matrix. An array of points, each of which is itself a 2-value array defined in WGS 84 format: [longitude, latitude]. For example, [-122.339, 47.615]   Depending on the data provider selected in the route calculator resource there may be additional restrictions on the inputs you can choose. See  Position restrictions in the Amazon Location Service Developer Guide.   For route calculators that use Esri as the data provider, if you specify a destination that's not located on a road, Amazon Location  moves the position to the nearest road. The snapped value is available in the result in SnappedDestinationPositions.  Valid Values: [-180 to 180,-90 to 90] 
    */
  var DestinationPositions: CalculateRouteMatrixRequestDestinationPositionsList
  
  /**
    * Set the unit system to specify the distance. Default Value: Kilometers 
    */
  var DistanceUnit: js.UndefOr[typings.awsSdk.clientsLocationMod.DistanceUnit] = js.undefined
  
  /**
    * Specifies the mode of transport when calculating a route. Used in estimating the speed of travel and road compatibility. The TravelMode you specify also determines how you specify route preferences:    If traveling by Car use the CarModeOptions parameter.   If traveling by Truck use the TruckModeOptions parameter.   Default Value: Car 
    */
  var TravelMode: js.UndefOr[typings.awsSdk.clientsLocationMod.TravelMode] = js.undefined
  
  /**
    * Specifies route preferences when traveling by Truck, such as avoiding routes that use ferries or tolls, and truck specifications to consider when choosing an optimal road. Requirements: TravelMode must be specified as Truck.
    */
  var TruckModeOptions: js.UndefOr[CalculateRouteTruckModeOptions] = js.undefined
}
object CalculateRouteMatrixRequest {
  
  inline def apply(
    CalculatorName: ResourceName,
    DeparturePositions: CalculateRouteMatrixRequestDeparturePositionsList,
    DestinationPositions: CalculateRouteMatrixRequestDestinationPositionsList
  ): CalculateRouteMatrixRequest = {
    val __obj = js.Dynamic.literal(CalculatorName = CalculatorName.asInstanceOf[js.Any], DeparturePositions = DeparturePositions.asInstanceOf[js.Any], DestinationPositions = DestinationPositions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculateRouteMatrixRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalculateRouteMatrixRequest] (val x: Self) extends AnyVal {
    
    inline def setCalculatorName(value: ResourceName): Self = StObject.set(x, "CalculatorName", value.asInstanceOf[js.Any])
    
    inline def setCarModeOptions(value: CalculateRouteCarModeOptions): Self = StObject.set(x, "CarModeOptions", value.asInstanceOf[js.Any])
    
    inline def setCarModeOptionsUndefined: Self = StObject.set(x, "CarModeOptions", js.undefined)
    
    inline def setDepartNow(value: Boolean): Self = StObject.set(x, "DepartNow", value.asInstanceOf[js.Any])
    
    inline def setDepartNowUndefined: Self = StObject.set(x, "DepartNow", js.undefined)
    
    inline def setDeparturePositions(value: CalculateRouteMatrixRequestDeparturePositionsList): Self = StObject.set(x, "DeparturePositions", value.asInstanceOf[js.Any])
    
    inline def setDeparturePositionsVarargs(value: Position*): Self = StObject.set(x, "DeparturePositions", js.Array(value*))
    
    inline def setDepartureTime(value: js.Date): Self = StObject.set(x, "DepartureTime", value.asInstanceOf[js.Any])
    
    inline def setDepartureTimeUndefined: Self = StObject.set(x, "DepartureTime", js.undefined)
    
    inline def setDestinationPositions(value: CalculateRouteMatrixRequestDestinationPositionsList): Self = StObject.set(x, "DestinationPositions", value.asInstanceOf[js.Any])
    
    inline def setDestinationPositionsVarargs(value: Position*): Self = StObject.set(x, "DestinationPositions", js.Array(value*))
    
    inline def setDistanceUnit(value: DistanceUnit): Self = StObject.set(x, "DistanceUnit", value.asInstanceOf[js.Any])
    
    inline def setDistanceUnitUndefined: Self = StObject.set(x, "DistanceUnit", js.undefined)
    
    inline def setTravelMode(value: TravelMode): Self = StObject.set(x, "TravelMode", value.asInstanceOf[js.Any])
    
    inline def setTravelModeUndefined: Self = StObject.set(x, "TravelMode", js.undefined)
    
    inline def setTruckModeOptions(value: CalculateRouteTruckModeOptions): Self = StObject.set(x, "TruckModeOptions", value.asInstanceOf[js.Any])
    
    inline def setTruckModeOptionsUndefined: Self = StObject.set(x, "TruckModeOptions", js.undefined)
  }
}
