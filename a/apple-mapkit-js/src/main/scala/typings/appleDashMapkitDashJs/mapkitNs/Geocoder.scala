package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.Geocoder")
@js.native
class Geocoder () extends js.Object {
  def this(options: GeocoderConstructorOptions) = this()
  var getsUserLocation: Boolean = js.native
  var language: String = js.native
  def cancel(id: Double): Boolean = js.native
  def lookup(place: String, callback: GeocoderLookupCallback): Double = js.native
  def lookup(place: String, callback: GeocoderLookupCallback, options: GeocoderLookupOptions): Double = js.native
  def reverseLookup(coordinate: Coordinate, callback: GeocoderLookupCallback): Double = js.native
  def reverseLookup(coordinate: Coordinate, callback: GeocoderLookupCallback, options: GeocoderReverseLookupOptions): Double = js.native
}

