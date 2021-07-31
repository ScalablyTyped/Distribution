package typings.appleMapkitJsBrowser.mapkit

import typings.appleMapkitJsBrowser.anon.PickGeocoderConstructorOp
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A geocoder that converts human-readable addresses to geographic coordinates
  * and vice versa.
  */
@js.native
trait Geocoder extends StObject {
  
  /**
    * Cancels the pending lookup or reverse lookup specified by its request ID.
    *
    * @param id The request ID of the lookup or reverseLookup to cancel.
    */
  def cancel(id: Double): Boolean = js.native
  
  /**
    * A Boolean value that indicates whether the geocoder should return results
    * near the user's current location.
    */
  var getsUserLocation: String = js.native
  
  /**
    * A Boolean value that indicates whether the geocoder should return results
    * near the user's current location.
    */
  var language: String = js.native
  
  /**
    * Converts an address to geographic coordinates.
    */
  def lookup(place: String, callback: js.Function2[/* error */ Error | Null, /* data */ GeocoderResponse, Unit]): Double = js.native
  def lookup(
    place: String,
    callback: js.Function2[/* error */ Error | Null, /* data */ GeocoderResponse, Unit],
    options: GeocoderLookupOptions
  ): Double = js.native
  
  /**
    * Converts a geographic coordinate to an address.
    *
    * @param The coordinate to convert to a human-readable address.
    * @param callback This callback function is invoked with two arguments,
    * error on failure and data on success.
    * @param language language is the only option that can be set for the
    * reverse geocoder.
    */
  def reverseLookup(
    coordinate: Coordinate,
    callback: js.Function2[/* error */ Error | Null, /* data */ GeocoderResponse, Unit]
  ): Double = js.native
  def reverseLookup(
    coordinate: Coordinate,
    callback: js.Function2[/* error */ Error | Null, /* data */ GeocoderResponse, Unit],
    options: PickGeocoderConstructorOp
  ): Double = js.native
}
