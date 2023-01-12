package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculateRouteMatrixResponse extends StObject {
  
  /**
    * The calculated route matrix containing the results for all pairs of DeparturePositions to DestinationPositions. Each row corresponds to one entry in DeparturePositions. Each entry in the row corresponds to the route from that entry in DeparturePositions to an entry in DestinationPositions. 
    */
  var RouteMatrix: typings.awsSdk.clientsLocationMod.RouteMatrix
  
  /**
    * For routes calculated using an Esri route calculator resource, departure positions are snapped to the closest road. For Esri route calculator resources, this returns the list of departure/origin positions used for calculation of the RouteMatrix.
    */
  var SnappedDeparturePositions: js.UndefOr[CalculateRouteMatrixResponseSnappedDeparturePositionsList] = js.undefined
  
  /**
    * The list of destination positions for the route matrix used for calculation of the RouteMatrix.
    */
  var SnappedDestinationPositions: js.UndefOr[CalculateRouteMatrixResponseSnappedDestinationPositionsList] = js.undefined
  
  /**
    * Contains information about the route matrix, DataSource, DistanceUnit, RouteCount and ErrorCount.
    */
  var Summary: CalculateRouteMatrixSummary
}
object CalculateRouteMatrixResponse {
  
  inline def apply(RouteMatrix: RouteMatrix, Summary: CalculateRouteMatrixSummary): CalculateRouteMatrixResponse = {
    val __obj = js.Dynamic.literal(RouteMatrix = RouteMatrix.asInstanceOf[js.Any], Summary = Summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculateRouteMatrixResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalculateRouteMatrixResponse] (val x: Self) extends AnyVal {
    
    inline def setRouteMatrix(value: RouteMatrix): Self = StObject.set(x, "RouteMatrix", value.asInstanceOf[js.Any])
    
    inline def setRouteMatrixVarargs(value: RouteMatrixRow*): Self = StObject.set(x, "RouteMatrix", js.Array(value*))
    
    inline def setSnappedDeparturePositions(value: CalculateRouteMatrixResponseSnappedDeparturePositionsList): Self = StObject.set(x, "SnappedDeparturePositions", value.asInstanceOf[js.Any])
    
    inline def setSnappedDeparturePositionsUndefined: Self = StObject.set(x, "SnappedDeparturePositions", js.undefined)
    
    inline def setSnappedDeparturePositionsVarargs(value: Position*): Self = StObject.set(x, "SnappedDeparturePositions", js.Array(value*))
    
    inline def setSnappedDestinationPositions(value: CalculateRouteMatrixResponseSnappedDestinationPositionsList): Self = StObject.set(x, "SnappedDestinationPositions", value.asInstanceOf[js.Any])
    
    inline def setSnappedDestinationPositionsUndefined: Self = StObject.set(x, "SnappedDestinationPositions", js.undefined)
    
    inline def setSnappedDestinationPositionsVarargs(value: Position*): Self = StObject.set(x, "SnappedDestinationPositions", js.Array(value*))
    
    inline def setSummary(value: CalculateRouteMatrixSummary): Self = StObject.set(x, "Summary", value.asInstanceOf[js.Any])
  }
}
