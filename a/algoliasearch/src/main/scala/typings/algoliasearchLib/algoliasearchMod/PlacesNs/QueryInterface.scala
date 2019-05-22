package typings
package algoliasearchLib.algoliasearchMod.PlacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Restrict the search results to a specific type.
  * https://community.algolia.com/places/api-clients.html#api-options-type
  */
trait QueryInterface extends js.Object {
  /**
    * Force to first search around a specific latitude longitude.
    * The option value must be provided as a string: latitude,longitude like 12.232,23.1.
    * The default is to search around the location of the user determined via his IP address (geoip).
    * https://community.algolia.com/places/api-clients.html#api-options-aroundLatLng
    */
  var aroundLatLng: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether or not to first search around the geolocation of the user found via his IP address. This is true by default.
    * https://community.algolia.com/places/api-clients.html#api-options-aroundLatLngViaIP
    */
  var aroundLatLngViaIP: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Radius in meters to search around the latitude/longitude. Otherwise a default radius is automatically computed given the area density.
    * https://community.algolia.com/places/api-clients.html#api-options-aroundRadius
    */
  var aroundRadius: js.UndefOr[scala.Double] = js.undefined
  /**
    * If specified, restrict the search results to a specific list of comma-separated countries. You can pass two letters country codes (ISO 3166-1).
    * Default: Search on the whole planet.
    * Warning: country codes must be lower-cased.
    * https://community.algolia.com/places/api-clients.html#api-options-countries
    */
  var countries: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Controls whether the _rankingInfo object should be included in the hits. This defaults to false.
    * The _rankingInfo object for a Places query is slightly different from a regular Algolia query
    * and you can read up more about the difference and how to leverage them in our guide.
    * https://community.algolia.com/places/api-clients.html#api-options-getRankingInfo
    */
  var getRankingInfo: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Restrict the search results to a specific type.
    * https://community.algolia.com/places/api-clients.html#api-options-type
    */
  var hitsPerPage: js.UndefOr[scala.Double] = js.undefined
  /**
    * Query used to perform the search.
    */
  var query: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Restrict the search results to a specific type.
    * https://community.algolia.com/places/api-clients.html#api-options-type
    */
  var `type`: js.UndefOr[
    algoliasearchLib.algoliasearchLibStrings.city | algoliasearchLib.algoliasearchLibStrings.country | algoliasearchLib.algoliasearchLibStrings.address | algoliasearchLib.algoliasearchLibStrings.busStop | algoliasearchLib.algoliasearchLibStrings.trainStation | algoliasearchLib.algoliasearchLibStrings.townhall | algoliasearchLib.algoliasearchLibStrings.airport
  ] = js.undefined
}

object QueryInterface {
  @scala.inline
  def apply(
    aroundLatLng: java.lang.String = null,
    aroundLatLngViaIP: java.lang.String = null,
    aroundRadius: scala.Int | scala.Double = null,
    countries: java.lang.String = null,
    getRankingInfo: js.UndefOr[scala.Boolean] = js.undefined,
    hitsPerPage: scala.Int | scala.Double = null,
    query: java.lang.String = null,
    `type`: algoliasearchLib.algoliasearchLibStrings.city | algoliasearchLib.algoliasearchLibStrings.country | algoliasearchLib.algoliasearchLibStrings.address | algoliasearchLib.algoliasearchLibStrings.busStop | algoliasearchLib.algoliasearchLibStrings.trainStation | algoliasearchLib.algoliasearchLibStrings.townhall | algoliasearchLib.algoliasearchLibStrings.airport = null
  ): QueryInterface = {
    val __obj = js.Dynamic.literal()
    if (aroundLatLng != null) __obj.updateDynamic("aroundLatLng")(aroundLatLng)
    if (aroundLatLngViaIP != null) __obj.updateDynamic("aroundLatLngViaIP")(aroundLatLngViaIP)
    if (aroundRadius != null) __obj.updateDynamic("aroundRadius")(aroundRadius.asInstanceOf[js.Any])
    if (countries != null) __obj.updateDynamic("countries")(countries)
    if (!js.isUndefined(getRankingInfo)) __obj.updateDynamic("getRankingInfo")(getRankingInfo)
    if (hitsPerPage != null) __obj.updateDynamic("hitsPerPage")(hitsPerPage.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryInterface]
  }
}

