package typings.amapDashJsDashApiDashGeocoder.AMap.Geocoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapDashJsDashApiDashGeocoder.amapDashJsDashApiDashGeocoderStrings.complete
  - typings.amapDashJsDashApiDashGeocoder.amapDashJsDashApiDashGeocoderStrings.no_data
  - typings.amapDashJsDashApiDashGeocoder.amapDashJsDashApiDashGeocoderStrings.error
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typings.amapDashJsDashApiDashGeocoder.amapDashJsDashApiDashGeocoderStrings.complete = this.cast("complete")
  @scala.inline
  def error: typings.amapDashJsDashApiDashGeocoder.amapDashJsDashApiDashGeocoderStrings.error = this.cast("error")
  @scala.inline
  def no_data: typings.amapDashJsDashApiDashGeocoder.amapDashJsDashApiDashGeocoderStrings.no_data = this.cast("no_data")
}

