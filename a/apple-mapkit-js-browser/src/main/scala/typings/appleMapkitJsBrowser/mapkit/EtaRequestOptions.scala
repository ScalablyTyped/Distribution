package typings.appleMapkitJsBrowser.mapkit

import typings.appleMapkitJsBrowser.mapkit.Directions.Transport
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options you may provide for requesting estimated arrival times.
  */
@js.native
trait EtaRequestOptions extends js.Object {
  
  /**
    * The mode of transportation the server uses when estimating arrival times.
    */
  var departureDate: Date = js.native
  
  /**
    * The time of departure used in an estimated arrival time request.
    */
  var destinations: js.Array[Coordinate] = js.native
  
  /**
    * The starting point for estimated arrival time requests.
    */
  var origin: Coordinate = js.native
  
  /**
    * An array of coordinates that represent end points for estimated arrival time requests.
    */
  var transportType: Transport = js.native
}
object EtaRequestOptions {
  
  @scala.inline
  def apply(
    departureDate: Date,
    destinations: js.Array[Coordinate],
    origin: Coordinate,
    transportType: Transport
  ): EtaRequestOptions = {
    val __obj = js.Dynamic.literal(departureDate = departureDate.asInstanceOf[js.Any], destinations = destinations.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], transportType = transportType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EtaRequestOptions]
  }
  
  @scala.inline
  implicit class EtaRequestOptionsOps[Self <: EtaRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDepartureDate(value: Date): Self = this.set("departureDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationsVarargs(value: Coordinate*): Self = this.set("destinations", js.Array(value :_*))
    
    @scala.inline
    def setDestinations(value: js.Array[Coordinate]): Self = this.set("destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: Coordinate): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportType(value: Transport): Self = this.set("transportType", value.asInstanceOf[js.Any])
  }
}
