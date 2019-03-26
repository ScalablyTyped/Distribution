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

@JSGlobal("__esri.LocatorSearchSource")
@js.native
class LocatorSearchSourceCls () extends LocatorSearchSource {
  def this(properties: LocatorSearchSourceProperties) = this()
  /**
    * Indicates whether to automatically navigate to the selected result once selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#autoNavigate)
    *
    * @default true
    */
  /* CompleteClass */
  override var autoNavigate: scala.Boolean = js.native
  /**
    * A string array which limits the results to one or more categories. For example, `Populated Place` or `airport`. Only applicable when using the World Geocode Service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#categories)
    */
  /* CompleteClass */
  override var categories: js.Array[java.lang.String] = js.native
  /**
    * Constricts search results to a specified country code. For example, `US` for United States or `SE` for Sweden. Only applies to the World Geocode Service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#countryCode)
    */
  /* CompleteClass */
  override var countryCode: java.lang.String = js.native
  /**
    * This property replaces the now deprecated `searchQueryParams`, `suggestQueryParams`, and `searchExtent` properties. Please see the object specification table below for details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#filter)
    */
  /* CompleteClass */
  override var filter: SearchSourceFilter = js.native
  /**
    * Sets the sources for local `distance` and `minScale` for searching. See the object specification table below for details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#localSearchOptions)
    */
  /* CompleteClass */
  override var localSearchOptions: LocatorSearchSourceLocalSearchOptions = js.native
  /**
    * When reverse geocoding a result, use this distance in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#locationToAddressDistance)
    *
    * @default 1500
    */
  /* CompleteClass */
  override var locationToAddressDistance: scala.Double = js.native
  /**
    * The locator task used to search. This is **required** and defaults to the [World Geocoding Service](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#locator)
    */
  /* CompleteClass */
  override var locator: Locator = js.native
  /**
    * Indicates the maximum number of search results to return.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#maxResults)
    *
    * @default 6
    */
  /* CompleteClass */
  override var maxResults: scala.Double = js.native
  /**
    * Indicates the maximum number of suggestions to return for the widget's input.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#maxSuggestions)
    *
    * @default 6
    */
  /* CompleteClass */
  override var maxSuggestions: scala.Double = js.native
  /**
    * Indicates the minimum number of characters required before querying for a suggestion.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#minSuggestCharacters)
    *
    * @default 1
    */
  /* CompleteClass */
  override var minSuggestCharacters: scala.Double = js.native
  /**
    * The name of the source for display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#name)
    */
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /**
    * Specifies the fields returned with the search results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#outFields)
    */
  /* CompleteClass */
  override var outFields: js.Array[java.lang.String] = js.native
  /**
    * Used as a hint for the source input text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#placeholder)
    */
  /* CompleteClass */
  override var placeholder: java.lang.String = js.native
  /**
    * Indicates whether to display a [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) when a selected result is clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#popupEnabled)
    */
  /* CompleteClass */
  override var popupEnabled: scala.Boolean = js.native
  /**
    * The popup template used to display search results. If no popup is needed, set the source's popupTemplate to `null`.
    * > This property should be set in instances where there is no existing [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) configured. For example, [feature sources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-FeatureLayerSearchSource.html) will default to any existing [popupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#popupTemplate) configured on the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#popupTemplate)
    */
  /* CompleteClass */
  override var popupTemplate: PopupTemplate = js.native
  /**
    * Specify this to prefix the user's input of the search text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#prefix)
    */
  /* CompleteClass */
  override var prefix: java.lang.String = js.native
  /**
    * Indicates whether to show a graphic on the map for the selected source using the [resultSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#resultSymbol).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#resultGraphicEnabled)
    */
  /* CompleteClass */
  override var resultGraphicEnabled: scala.Boolean = js.native
  /**
    * The symbol used to display the result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#resultSymbol)
    */
  /* CompleteClass */
  override var resultSymbol: Symbol = js.native
  /**
    * A template string used to display multiple fields in a defined order when results are displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#searchTemplate)
    */
  /* CompleteClass */
  override var searchTemplate: java.lang.String = js.native
  /**
    * The field name of the Single Line Address Field in the REST services directory for the locator service. Common values are `SingleLine` and `SingleLineFieldName`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#singleLineFieldName)
    */
  /* CompleteClass */
  override var singleLineFieldName: java.lang.String = js.native
  /**
    * Specify this to add a suffix to the user's input for the search value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#suffix)
    */
  /* CompleteClass */
  override var suffix: java.lang.String = js.native
  /**
    * Indicates whether to display suggestions as the user enters input text in the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#suggestionsEnabled)
    *
    * @default true
    */
  /* CompleteClass */
  override var suggestionsEnabled: scala.Boolean = js.native
  /**
    * Indicates whether to constrain the search results to the view's extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#withinViewEnabled)
    *
    * @default false
    */
  /* CompleteClass */
  override var withinViewEnabled: scala.Boolean = js.native
  /**
    * The set zoom scale for the resulting search result. This scale is automatically honored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#zoomScale)
    */
  /* CompleteClass */
  override var zoomScale: scala.Double = js.native
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

object LocatorSearchSource {
  @scala.inline
  def apply(
    autoNavigate: scala.Boolean,
    categories: js.Array[java.lang.String],
    clone: () => LocatorSearchSource,
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
    toJSON: () => js.Any,
    withinViewEnabled: scala.Boolean,
    zoomScale: scala.Double
  ): LocatorSearchSource = {
    val __obj = js.Dynamic.literal(autoNavigate = autoNavigate, categories = categories, clone = js.Any.fromFunction0(clone), countryCode = countryCode, filter = filter, localSearchOptions = localSearchOptions, locationToAddressDistance = locationToAddressDistance, locator = locator, maxResults = maxResults, maxSuggestions = maxSuggestions, minSuggestCharacters = minSuggestCharacters, name = name, outFields = outFields, placeholder = placeholder, popupEnabled = popupEnabled, popupTemplate = popupTemplate, prefix = prefix, resultGraphicEnabled = resultGraphicEnabled, resultSymbol = resultSymbol, searchTemplate = searchTemplate, singleLineFieldName = singleLineFieldName, suffix = suffix, suggestionsEnabled = suggestionsEnabled, toJSON = js.Any.fromFunction0(toJSON), withinViewEnabled = withinViewEnabled, zoomScale = zoomScale)
  
    __obj.asInstanceOf[LocatorSearchSource]
  }
}

