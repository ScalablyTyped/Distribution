package typings.algoliasearch.mod.Places

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
    * The default is to search around the location of the user determined via their IP address (geoip).
    * https://community.algolia.com/places/api-clients.html#api-options-aroundLatLng
    */
  var aroundLatLng: String
  /**
    * Restrict the search results to a specific type.
    * https://community.algolia.com/places/api-clients.html#api-options-type
    */
  var hitsPerPage: js.UndefOr[Double] = js.undefined
}

object QueryReverseInterface {
  @scala.inline
  def apply(aroundLatLng: String, hitsPerPage: js.UndefOr[Double] = js.undefined): QueryReverseInterface = {
    val __obj = js.Dynamic.literal(aroundLatLng = aroundLatLng.asInstanceOf[js.Any])
    if (!js.isUndefined(hitsPerPage)) __obj.updateDynamic("hitsPerPage")(hitsPerPage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryReverseInterface]
  }
}

