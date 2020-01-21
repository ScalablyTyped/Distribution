package typings.algoliasearch.mod.Places

import typings.algoliasearch.AnonAdministrative
import typings.algoliasearch.AnonLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Hit of search localized.
  * https://community.algolia.com/places/api-clients.html#api-suggestion-name
  */
trait LocalizedHitInterface extends js.Object {
  /**
    * Associated list of latitude and longitude.
    * https://community.algolia.com/places/api-clients.html#api-suggestion-latlng
    */
  var _geoloc: AnonLat
  /**
    * The associated highlighting information.
    * https://community.algolia.com/places/api-clients.html#api-suggestion-highlightResult
    */
  var _highlightResult: AnonAdministrative
  var _tags: js.Array[String]
  var admin_level: Double
  /**
    * List of associated administrative region names.
    * https://community.algolia.com/places/api-clients.html#api-suggestion-administrative
    */
  var administrative: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * https://community.algolia.com/places/api-clients.html#api-suggestion-city
    * List of the associated city names. If no language parameter is specified, retrieves all of them.
    */
  var city: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Associated country name.
    * https://community.algolia.com/places/api-clients.html#api-suggestion-country
    */
  var country: String
  /**
    * Two letters country code (ISO 639-1).
    * https://community.algolia.com/places/api-clients.html#api-suggestion-countryCode
    */
  var country_code: String
  /**
    * List of the associated county names. If no language parameter is specified, retrieves all of them.
    * https://community.algolia.com/places/api-clients.html#api-suggestion-county
    */
  var county: js.UndefOr[js.Array[String]] = js.undefined
  var district: js.UndefOr[String] = js.undefined
  var importance: Double
  var is_city: Boolean
  var is_country: Boolean
  var is_highway: Boolean
  var is_popular: Boolean
  var is_suburb: Boolean
  /**
    * https://community.algolia.com/places/api-clients.html#api-suggestion-name
    * List of names of the place. If no language parameter is specified, retrieves all of them.
    */
  var locale_names: js.Array[String]
  var objectID: String
  /**
    * Associated population.
    * https://community.algolia.com/places/api-clients.html#api-suggestion-population
    */
  var population: js.UndefOr[Double] = js.undefined
  /**
    * List of associated postcodes.
    * https://community.algolia.com/places/api-clients.html#api-suggestion-postcode
    */
  var postcode: js.UndefOr[js.Array[String]] = js.undefined
}

object LocalizedHitInterface {
  @scala.inline
  def apply(
    _geoloc: AnonLat,
    _highlightResult: AnonAdministrative,
    _tags: js.Array[String],
    admin_level: Double,
    country: String,
    country_code: String,
    importance: Double,
    is_city: Boolean,
    is_country: Boolean,
    is_highway: Boolean,
    is_popular: Boolean,
    is_suburb: Boolean,
    locale_names: js.Array[String],
    objectID: String,
    administrative: js.Array[String] = null,
    city: js.Array[String] = null,
    county: js.Array[String] = null,
    district: String = null,
    population: Int | Double = null,
    postcode: js.Array[String] = null
  ): LocalizedHitInterface = {
    val __obj = js.Dynamic.literal(_geoloc = _geoloc.asInstanceOf[js.Any], _highlightResult = _highlightResult.asInstanceOf[js.Any], _tags = _tags.asInstanceOf[js.Any], admin_level = admin_level.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], importance = importance.asInstanceOf[js.Any], is_city = is_city.asInstanceOf[js.Any], is_country = is_country.asInstanceOf[js.Any], is_highway = is_highway.asInstanceOf[js.Any], is_popular = is_popular.asInstanceOf[js.Any], is_suburb = is_suburb.asInstanceOf[js.Any], locale_names = locale_names.asInstanceOf[js.Any], objectID = objectID.asInstanceOf[js.Any])
    if (administrative != null) __obj.updateDynamic("administrative")(administrative.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (county != null) __obj.updateDynamic("county")(county.asInstanceOf[js.Any])
    if (district != null) __obj.updateDynamic("district")(district.asInstanceOf[js.Any])
    if (population != null) __obj.updateDynamic("population")(population.asInstanceOf[js.Any])
    if (postcode != null) __obj.updateDynamic("postcode")(postcode.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizedHitInterface]
  }
}

