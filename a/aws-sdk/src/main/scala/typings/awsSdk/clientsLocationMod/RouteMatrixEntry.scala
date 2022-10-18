package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteMatrixEntry extends StObject {
  
  /**
    * The total distance of travel for the route.
    */
  var Distance: js.UndefOr[RouteMatrixEntryDistanceDouble] = js.undefined
  
  /**
    * The expected duration of travel for the route.
    */
  var DurationSeconds: js.UndefOr[RouteMatrixEntryDurationSecondsDouble] = js.undefined
  
  /**
    * An error corresponding to the calculation of a route between the DeparturePosition and DestinationPosition.
    */
  var Error: js.UndefOr[RouteMatrixEntryError] = js.undefined
}
object RouteMatrixEntry {
  
  inline def apply(): RouteMatrixEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteMatrixEntry]
  }
  
  extension [Self <: RouteMatrixEntry](x: Self) {
    
    inline def setDistance(value: RouteMatrixEntryDistanceDouble): Self = StObject.set(x, "Distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "Distance", js.undefined)
    
    inline def setDurationSeconds(value: RouteMatrixEntryDurationSecondsDouble): Self = StObject.set(x, "DurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationSecondsUndefined: Self = StObject.set(x, "DurationSeconds", js.undefined)
    
    inline def setError(value: RouteMatrixEntryError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
  }
}
