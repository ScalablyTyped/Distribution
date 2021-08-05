package typings.appleMapkitJsBrowser.mapkit

import typings.appleMapkitJsBrowser.mapkit.Directions.Transport
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options you may provide for requesting estimated arrival times.
  */
trait EtaRequestOptions extends StObject {
  
  /**
    * The mode of transportation the server uses when estimating arrival times.
    */
  var departureDate: Date
  
  /**
    * The time of departure used in an estimated arrival time request.
    */
  var destinations: js.Array[Coordinate]
  
  /**
    * The starting point for estimated arrival time requests.
    */
  var origin: Coordinate
  
  /**
    * An array of coordinates that represent end points for estimated arrival time requests.
    */
  var transportType: Transport
}
object EtaRequestOptions {
  
  inline def apply(
    departureDate: Date,
    destinations: js.Array[Coordinate],
    origin: Coordinate,
    transportType: Transport
  ): EtaRequestOptions = {
    val __obj = js.Dynamic.literal(departureDate = departureDate.asInstanceOf[js.Any], destinations = destinations.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], transportType = transportType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EtaRequestOptions]
  }
  
  extension [Self <: EtaRequestOptions](x: Self) {
    
    inline def setDepartureDate(value: Date): Self = StObject.set(x, "departureDate", value.asInstanceOf[js.Any])
    
    inline def setDestinations(value: js.Array[Coordinate]): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsVarargs(value: Coordinate*): Self = StObject.set(x, "destinations", js.Array(value :_*))
    
    inline def setOrigin(value: Coordinate): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setTransportType(value: Transport): Self = StObject.set(x, "transportType", value.asInstanceOf[js.Any])
  }
}
