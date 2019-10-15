package typings.algoliasearch.algoliasearchMod.Places

import typings.algoliasearch.algoliasearchStrings.address
import typings.algoliasearch.algoliasearchStrings.airport
import typings.algoliasearch.algoliasearchStrings.busStop
import typings.algoliasearch.algoliasearchStrings.city
import typings.algoliasearch.algoliasearchStrings.country
import typings.algoliasearch.algoliasearchStrings.townhall
import typings.algoliasearch.algoliasearchStrings.trainStation
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
    * The default is to search around the location of the user determined via their IP address (geoip).
    * https://community.algolia.com/places/api-clients.html#api-options-aroundLatLng
    */
  var aroundLatLng: js.UndefOr[String] = js.undefined
  /**
    * Whether or not to first search around the geolocation of the user found via their IP address. This is true by default.
    * https://community.algolia.com/places/api-clients.html#api-options-aroundLatLngViaIP
    */
  var aroundLatLngViaIP: js.UndefOr[String] = js.undefined
  /**
    * Radius in meters to search around the latitude/longitude. Otherwise a default radius is automatically computed given the area density.
    * https://community.algolia.com/places/api-clients.html#api-options-aroundRadius
    */
  var aroundRadius: js.UndefOr[Double] = js.undefined
  /**
    * If specified, restrict the search results to a specific list of comma-separated countries. You can pass two letters country codes (ISO 3166-1).
    * Default: Search on the whole planet.
    * Warning: country codes must be lower-cased.
    * https://community.algolia.com/places/api-clients.html#api-options-countries
    */
  var countries: js.UndefOr[String] = js.undefined
  /**
    * Controls whether the _rankingInfo object should be included in the hits. This defaults to false.
    * The _rankingInfo object for a Places query is slightly different from a regular Algolia query
    * and you can read up more about the difference and how to leverage them in our guide.
    * https://community.algolia.com/places/api-clients.html#api-options-getRankingInfo
    */
  var getRankingInfo: js.UndefOr[Boolean] = js.undefined
  /**
    * Restrict the search results to a specific type.
    * https://community.algolia.com/places/api-clients.html#api-options-type
    */
  var hitsPerPage: js.UndefOr[Double] = js.undefined
  /**
    * Query used to perform the search.
    */
  var query: js.UndefOr[String] = js.undefined
  /**
    * Restrict the search results to a specific type.
    * https://community.algolia.com/places/api-clients.html#api-options-type
    */
  var `type`: js.UndefOr[city | country | address | busStop | trainStation | townhall | airport] = js.undefined
}

object QueryInterface {
  @scala.inline
  def apply(
    aroundLatLng: String = null,
    aroundLatLngViaIP: String = null,
    aroundRadius: Int | Double = null,
    countries: String = null,
    getRankingInfo: js.UndefOr[Boolean] = js.undefined,
    hitsPerPage: Int | Double = null,
    query: String = null,
    `type`: city | country | address | busStop | trainStation | townhall | airport = null
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

