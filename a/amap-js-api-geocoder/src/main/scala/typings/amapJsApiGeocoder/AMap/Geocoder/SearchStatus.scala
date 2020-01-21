package typings.amapJsApiGeocoder.AMap.Geocoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.complete
  - typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.no_data
  - typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.error
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.complete = this.cast("complete")
  @scala.inline
  def error: typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.error = this.cast("error")
  @scala.inline
  def no_data: typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.no_data = this.cast("no_data")
}

