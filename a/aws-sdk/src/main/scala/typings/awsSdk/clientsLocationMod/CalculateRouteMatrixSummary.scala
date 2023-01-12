package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculateRouteMatrixSummary extends StObject {
  
  /**
    * The data provider of traffic and road network data used to calculate the routes. Indicates one of the available providers:    Esri     Here    For more information about data providers, see Amazon Location Service data providers.
    */
  var DataSource: String
  
  /**
    * The unit of measurement for route distances.
    */
  var DistanceUnit: typings.awsSdk.clientsLocationMod.DistanceUnit
  
  /**
    * The count of error results in the route matrix. If this number is 0, all routes were calculated successfully.
    */
  var ErrorCount: CalculateRouteMatrixSummaryErrorCountInteger
  
  /**
    * The count of cells in the route matrix. Equal to the number of DeparturePositions multiplied by the number of DestinationPositions.
    */
  var RouteCount: CalculateRouteMatrixSummaryRouteCountInteger
}
object CalculateRouteMatrixSummary {
  
  inline def apply(
    DataSource: String,
    DistanceUnit: DistanceUnit,
    ErrorCount: CalculateRouteMatrixSummaryErrorCountInteger,
    RouteCount: CalculateRouteMatrixSummaryRouteCountInteger
  ): CalculateRouteMatrixSummary = {
    val __obj = js.Dynamic.literal(DataSource = DataSource.asInstanceOf[js.Any], DistanceUnit = DistanceUnit.asInstanceOf[js.Any], ErrorCount = ErrorCount.asInstanceOf[js.Any], RouteCount = RouteCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculateRouteMatrixSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalculateRouteMatrixSummary] (val x: Self) extends AnyVal {
    
    inline def setDataSource(value: String): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setDistanceUnit(value: DistanceUnit): Self = StObject.set(x, "DistanceUnit", value.asInstanceOf[js.Any])
    
    inline def setErrorCount(value: CalculateRouteMatrixSummaryErrorCountInteger): Self = StObject.set(x, "ErrorCount", value.asInstanceOf[js.Any])
    
    inline def setRouteCount(value: CalculateRouteMatrixSummaryRouteCountInteger): Self = StObject.set(x, "RouteCount", value.asInstanceOf[js.Any])
  }
}
