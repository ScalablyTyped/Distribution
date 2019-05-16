package typings
package algoliasearchLib.algoliasearchMod.PlacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Hit of search.
  * https://community.algolia.com/places/api-clients.html#api-suggestion-name
  */
trait HitInterface extends js.Object {
  /**
    * Associated list of latitude and longitude.
    * https://community.algolia.com/places/api-clients.html#api-suggestion-latlng
    */
  var _geoloc: algoliasearchLib.Anon_Lat
  var admin_level: scala.Double
  /**
    * List of associated administrative region names.
    * https://community.algolia.com/places/api-clients.html#api-suggestion-administrative
    */
  var administrative: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * https://community.algolia.com/places/api-clients.html#api-suggestion-city
    * List of the associated city names. If no language parameter is specified, retrieves all of them.
    */
  var city: js.UndefOr[algoliasearchLib.Anon_DefaultKeyArray] = js.undefined
  /**
    * Associated country name.
    * https://community.algolia.com/places/api-clients.html#api-suggestion-country
    */
  var country: algoliasearchLib.Anon_DefaultKey
  /**
    * Two letters country code (ISO 639-1).
    * https://community.algolia.com/places/api-clients.html#api-suggestion-countryCode
    */
  var country_code: java.lang.String
  /**
    * List of the associated county names. If no language parameter is specified, retrieves all of them.
    * https://community.algolia.com/places/api-clients.html#api-suggestion-county
    */
  var county: js.UndefOr[algoliasearchLib.Anon_DefaultKeyArray] = js.undefined
  var district: java.lang.String
  /**
    * The associated highlighting information.
    * https://community.algolia.com/places/api-clients.html#api-suggestion-highlightResult
    */
  var highlightResult: algoliasearchLib.Anon_Administrative
  var importance: scala.Double
  var is_city: scala.Boolean
  var is_country: scala.Boolean
  var is_highway: scala.Boolean
  var is_popular: scala.Boolean
  var is_suburb: scala.Boolean
  /**
    * https://community.algolia.com/places/api-clients.html#api-suggestion-name
    * List of names of the place. If no language parameter is specified, retrieves all of them.
    */
  var locale_names: algoliasearchLib.Anon_DefaultKeyArray
  var objectID: java.lang.String
  /**
    * Associated population.
    * https://community.algolia.com/places/api-clients.html#api-suggestion-population
    */
  var population: js.UndefOr[scala.Double] = js.undefined
  /**
    * List of associated postcodes.
    * https://community.algolia.com/places/api-clients.html#api-suggestion-postcode
    */
  var postcode: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var tags: js.Array[java.lang.String]
}

object HitInterface {
  @scala.inline
  def apply(
    _geoloc: algoliasearchLib.Anon_Lat,
    admin_level: scala.Double,
    country: algoliasearchLib.Anon_DefaultKey,
    country_code: java.lang.String,
    district: java.lang.String,
    highlightResult: algoliasearchLib.Anon_Administrative,
    importance: scala.Double,
    is_city: scala.Boolean,
    is_country: scala.Boolean,
    is_highway: scala.Boolean,
    is_popular: scala.Boolean,
    is_suburb: scala.Boolean,
    locale_names: algoliasearchLib.Anon_DefaultKeyArray,
    objectID: java.lang.String,
    tags: js.Array[java.lang.String],
    administrative: js.Array[java.lang.String] = null,
    city: algoliasearchLib.Anon_DefaultKeyArray = null,
    county: algoliasearchLib.Anon_DefaultKeyArray = null,
    population: scala.Int | scala.Double = null,
    postcode: js.Array[java.lang.String] = null
  ): HitInterface = {
    val __obj = js.Dynamic.literal(_geoloc = _geoloc, admin_level = admin_level, country = country, country_code = country_code, district = district, highlightResult = highlightResult, importance = importance, is_city = is_city, is_country = is_country, is_highway = is_highway, is_popular = is_popular, is_suburb = is_suburb, locale_names = locale_names, objectID = objectID, tags = tags)
    if (administrative != null) __obj.updateDynamic("administrative")(administrative)
    if (city != null) __obj.updateDynamic("city")(city)
    if (county != null) __obj.updateDynamic("county")(county)
    if (population != null) __obj.updateDynamic("population")(population.asInstanceOf[js.Any])
    if (postcode != null) __obj.updateDynamic("postcode")(postcode)
    __obj.asInstanceOf[HitInterface]
  }
}

