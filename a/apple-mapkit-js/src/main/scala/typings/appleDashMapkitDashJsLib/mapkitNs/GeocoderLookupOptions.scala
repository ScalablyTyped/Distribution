package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocoderLookupOptions extends js.Object {
  var coordinate: js.UndefOr[Coordinate] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var limitToCountries: js.UndefOr[java.lang.String] = js.undefined
  var region: js.UndefOr[CoordinateRegion] = js.undefined
}

object GeocoderLookupOptions {
  @scala.inline
  def apply(
    coordinate: Coordinate = null,
    language: java.lang.String = null,
    limitToCountries: java.lang.String = null,
    region: CoordinateRegion = null
  ): GeocoderLookupOptions = {
    val __obj = js.Dynamic.literal()
    if (coordinate != null) __obj.updateDynamic("coordinate")(coordinate)
    if (language != null) __obj.updateDynamic("language")(language)
    if (limitToCountries != null) __obj.updateDynamic("limitToCountries")(limitToCountries)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[GeocoderLookupOptions]
  }
}

