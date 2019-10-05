package typings.appleDashMapkitDashJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options that constrain geocoder lookup results to a specific area or set a
  * language for results.
  */
trait GeocoderLookupOptions extends js.Object {
  /**
    * Coordinates used to constrain the lookup results.
    */
  var coordinate: js.UndefOr[Coordinate] = js.undefined
  /**
    * The language in which to display the lookup results.
    */
  var language: js.UndefOr[String] = js.undefined
  /**
    * A list of countries in which to constrain the lookup results.
    */
  var limitToCountries: js.UndefOr[String] = js.undefined
  /**
    * A region in which to constrain lookup results.
    */
  var region: js.UndefOr[CoordinateRegion] = js.undefined
}

object GeocoderLookupOptions {
  @scala.inline
  def apply(
    coordinate: Coordinate = null,
    language: String = null,
    limitToCountries: String = null,
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

