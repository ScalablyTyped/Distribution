package typings
package algoliasearchLib.algoliasearchMod.PlacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Params for endpoint reverse.
  * https://community.algolia.com/places/api-clients.html#reverse-geocoding
  */
trait QueryReverseInterface extends js.Object {
  /**
    * Force to first search around a specific latitude longitude.
    * The option value must be provided as a string: latitude,longitude like 12.232,23.1.
    * The default is to search around the location of the user determined via his IP address (geoip).
    * https://community.algolia.com/places/api-clients.html#api-options-aroundLatLng
    */
  var aroundLatLng: java.lang.String
  /**
    * Restrict the search results to a specific type.
    * https://community.algolia.com/places/api-clients.html#api-options-type
    */
  var hitsPerPage: js.UndefOr[scala.Double] = js.undefined
}

object QueryReverseInterface {
  @scala.inline
  def apply(aroundLatLng: java.lang.String, hitsPerPage: scala.Int | scala.Double = null): QueryReverseInterface = {
    val __obj = js.Dynamic.literal(aroundLatLng = aroundLatLng)
    if (hitsPerPage != null) __obj.updateDynamic("hitsPerPage")(hitsPerPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryReverseInterface]
  }
}

