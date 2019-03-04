package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocatorSearchSource extends SearchSource {
  /**
    * A string array which limits the results to one or more categories. For example, `Populated Place` or `airport`. Only applicable when using the World Geocode Service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#categories)
    */
  var categories: js.Array[java.lang.String]
  /**
    * Constricts search results to a specified country code. For example, `US` for United States or `SE` for Sweden. Only applies to the World Geocode Service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#countryCode)
    */
  var countryCode: java.lang.String
  /**
    * Sets the sources for local `distance` and `minScale` for searching. See the object specification table below for details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#localSearchOptions)
    */
  var localSearchOptions: LocatorSearchSourceLocalSearchOptions
  /**
    * When reverse geocoding a result, use this distance in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#locationToAddressDistance)
    *
    * @default 1500
    */
  var locationToAddressDistance: scala.Double
  /**
    * The locator task used to search. This is **required** and defaults to the [World Geocoding Service](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#locator)
    */
  var locator: Locator
  /**
    * The name of the source for display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#name)
    */
  var name: java.lang.String
  /**
    * A template string used to display multiple fields in a defined order when results are displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#searchTemplate)
    */
  var searchTemplate: java.lang.String
  /**
    * The field name of the Single Line Address Field in the REST services directory for the locator service. Common values are `SingleLine` and `SingleLineFieldName`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#singleLineFieldName)
    */
  var singleLineFieldName: java.lang.String
}

object LocatorSearchSource {
  @scala.inline
  def apply(
    autoNavigate: scala.Boolean,
    categories: js.Array[java.lang.String],
    clone: js.Function0[LocatorSearchSource],
    countryCode: java.lang.String,
    filter: SearchSourceFilter,
    localSearchOptions: LocatorSearchSourceLocalSearchOptions,
    locationToAddressDistance: scala.Double,
    locator: Locator,
    maxResults: scala.Double,
    maxSuggestions: scala.Double,
    minSuggestCharacters: scala.Double,
    name: java.lang.String,
    outFields: js.Array[java.lang.String],
    placeholder: java.lang.String,
    popupEnabled: scala.Boolean,
    popupTemplate: PopupTemplate,
    prefix: java.lang.String,
    resultGraphicEnabled: scala.Boolean,
    resultSymbol: Symbol,
    searchTemplate: java.lang.String,
    singleLineFieldName: java.lang.String,
    suffix: java.lang.String,
    suggestionsEnabled: scala.Boolean,
    toJSON: js.Function0[js.Any],
    withinViewEnabled: scala.Boolean,
    zoomScale: scala.Double
  ): LocatorSearchSource = {
    val __obj = js.Dynamic.literal(autoNavigate = autoNavigate, categories = categories, clone = clone, countryCode = countryCode, filter = filter, localSearchOptions = localSearchOptions, locationToAddressDistance = locationToAddressDistance, locator = locator, maxResults = maxResults, maxSuggestions = maxSuggestions, minSuggestCharacters = minSuggestCharacters, name = name, outFields = outFields, placeholder = placeholder, popupEnabled = popupEnabled, popupTemplate = popupTemplate, prefix = prefix, resultGraphicEnabled = resultGraphicEnabled, resultSymbol = resultSymbol, searchTemplate = searchTemplate, singleLineFieldName = singleLineFieldName, suffix = suffix, suggestionsEnabled = suggestionsEnabled, toJSON = toJSON, withinViewEnabled = withinViewEnabled, zoomScale = zoomScale)
  
    __obj.asInstanceOf[LocatorSearchSource]
  }
}

