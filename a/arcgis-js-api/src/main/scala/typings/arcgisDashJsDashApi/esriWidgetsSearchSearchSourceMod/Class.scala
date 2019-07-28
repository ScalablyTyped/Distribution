package typings.arcgisDashJsDashApi.esriWidgetsSearchSearchSourceMod

import typings.arcgisDashJsDashApi.IPromise
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.GetResultsParameters
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.GetSuggestionsParameters
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.PopupTemplate
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.SearchResult
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.SearchSource
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.SearchSourceFilter
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.SearchSourceProperties
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.SuggestResult
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.Symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/widgets/Search/SearchSource", JSImport.Namespace)
@js.native
class Class () extends SearchSource {
  def this(properties: SearchSourceProperties) = this()
  /**
    * Indicates whether to automatically navigate to the selected result once selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#autoNavigate)
    *
    * @default true
    */
  /* CompleteClass */
  override var autoNavigate: Boolean = js.native
  /**
    * This property replaces the now deprecated `searchQueryParams`, `suggestQueryParams`, and `searchExtent` properties. Please see the object specification table below for details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#filter)
    */
  /* CompleteClass */
  override var filter: SearchSourceFilter = js.native
  /**
    * Indicates the maximum number of search results to return.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#maxResults)
    *
    * @default 6
    */
  /* CompleteClass */
  override var maxResults: Double = js.native
  /**
    * Indicates the maximum number of suggestions to return for the widget's input.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#maxSuggestions)
    *
    * @default 6
    */
  /* CompleteClass */
  override var maxSuggestions: Double = js.native
  /**
    * Indicates the minimum number of characters required before querying for a suggestion.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#minSuggestCharacters)
    *
    * @default 1
    */
  /* CompleteClass */
  override var minSuggestCharacters: Double = js.native
  /**
    * Specifies the fields returned with the search results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#outFields)
    */
  /* CompleteClass */
  override var outFields: js.Array[String] = js.native
  /**
    * Used as a hint for the source input text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#placeholder)
    */
  /* CompleteClass */
  override var placeholder: String = js.native
  /**
    * Indicates whether to display a [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) when a selected result is clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#popupEnabled)
    */
  /* CompleteClass */
  override var popupEnabled: Boolean = js.native
  /**
    * The popup template used to display search results. If no popup is needed, set the source's popupTemplate to `null`.
    * > This property should be set in instances where there is no existing [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) configured. For example, [feature sources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html) will default to any existing [popupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#popupTemplate) configured on the layer.
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
  override var prefix: String = js.native
  /**
    * Indicates whether to show a graphic on the map for the selected source using the [resultSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#resultSymbol).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#resultGraphicEnabled)
    */
  /* CompleteClass */
  override var resultGraphicEnabled: Boolean = js.native
  /**
    * The symbol used to display the result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#resultSymbol)
    */
  /* CompleteClass */
  override var resultSymbol: Symbol = js.native
  /**
    * Specify this to add a suffix to the user's input for the search value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#suffix)
    */
  /* CompleteClass */
  override var suffix: String = js.native
  /**
    * Indicates whether to display suggestions as the user enters input text in the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#suggestionsEnabled)
    *
    * @default true
    */
  /* CompleteClass */
  override var suggestionsEnabled: Boolean = js.native
  /**
    * Indicates whether to constrain the search results to the view's extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#withinViewEnabled)
    *
    * @default false
    */
  /* CompleteClass */
  override var withinViewEnabled: Boolean = js.native
  /**
    * The set zoom scale for the resulting search result. This scale is automatically honored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#zoomScale)
    */
  /* CompleteClass */
  override var zoomScale: Double = js.native
  /**
    * Method to provide parameters for a given search source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#getResults)
    *
    * @param resultsParams An object that is passed as a parameter to get search results.
    *
    */
  /* CompleteClass */
  override def getResults(resultsParams: GetResultsParameters): IPromise[js.Array[SearchResult]] = js.native
  /**
    * Method to provide parameters for search suggestions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#getSuggestions)
    *
    * @param suggestionsParams An object that is passed as a parameter for search suggestions.
    *
    */
  /* CompleteClass */
  override def getSuggestions(suggestionsParams: GetSuggestionsParameters): IPromise[js.Array[SuggestResult]] = js.native
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

