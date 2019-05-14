package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.Geocoder")
@js.native
class Geocoder () extends js.Object {
  def this(options: GeocoderConstructorOptions) = this()
  var getsUserLocation: scala.Boolean = js.native
  var language: java.lang.String = js.native
  def cancel(id: scala.Double): scala.Boolean = js.native
  def lookup(place: java.lang.String, callback: GeocoderLookupCallback): scala.Double = js.native
  def lookup(place: java.lang.String, callback: GeocoderLookupCallback, options: GeocoderLookupOptions): scala.Double = js.native
  def reverseLookup(coordinate: Coordinate, callback: GeocoderLookupCallback): scala.Double = js.native
  def reverseLookup(coordinate: Coordinate, callback: GeocoderLookupCallback, options: GeocoderReverseLookupOptions): scala.Double = js.native
}

