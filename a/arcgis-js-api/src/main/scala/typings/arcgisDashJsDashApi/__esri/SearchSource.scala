package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchSource extends JSONSupport {
  /**
    * Indicates whether to automatically navigate to the selected result once selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#autoNavigate)
    *
    * @default true
    */
  var autoNavigate: Boolean
  /**
    * This property replaces the now deprecated `searchQueryParams`, `suggestQueryParams`, and `searchExtent` properties. Please see the object specification table below for details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#filter)
    */
  var filter: SearchSourceFilter
  /**
    * Indicates the maximum number of search results to return.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#maxResults)
    *
    * @default 6
    */
  var maxResults: Double
  /**
    * Indicates the maximum number of suggestions to return for the widget's input.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#maxSuggestions)
    *
    * @default 6
    */
  var maxSuggestions: Double
  /**
    * Indicates the minimum number of characters required before querying for a suggestion.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#minSuggestCharacters)
    *
    * @default 1
    */
  var minSuggestCharacters: Double
  /**
    * Specifies the fields returned with the search results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#outFields)
    */
  var outFields: js.Array[String]
  /**
    * Used as a hint for the source input text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#placeholder)
    */
  var placeholder: String
  /**
    * Indicates whether to display a [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) when a selected result is clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#popupEnabled)
    */
  var popupEnabled: Boolean
  /**
    * The popup template used to display search results. If no popup is needed, set the source's popupTemplate to `null`.
    * > This property should be set in instances where there is no existing [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) configured. For example, [feature sources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html) will default to any existing [popupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#popupTemplate) configured on the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#popupTemplate)
    */
  var popupTemplate: PopupTemplate
  /**
    * Specify this to prefix the user's input of the search text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#prefix)
    */
  var prefix: String
  /**
    * Indicates whether to show a graphic on the map for the selected source using the [resultSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#resultSymbol).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#resultGraphicEnabled)
    */
  var resultGraphicEnabled: Boolean
  /**
    * The symbol used to display the result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#resultSymbol)
    */
  var resultSymbol: Symbol
  /**
    * Specify this to add a suffix to the user's input for the search value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#suffix)
    */
  var suffix: String
  /**
    * Indicates whether to display suggestions as the user enters input text in the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#suggestionsEnabled)
    *
    * @default true
    */
  var suggestionsEnabled: Boolean
  /**
    * Indicates whether to constrain the search results to the view's extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#withinViewEnabled)
    *
    * @default false
    */
  var withinViewEnabled: Boolean
  /**
    * The set zoom scale for the resulting search result. This scale is automatically honored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#zoomScale)
    */
  var zoomScale: Double
  /**
    * Method to provide parameters for a given search source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#getResults)
    *
    * @param resultsParams An object that is passed as a parameter to get search results.
    *
    */
  def getResults(resultsParams: GetResultsParameters): IPromise[js.Array[SearchResult]]
  /**
    * Method to provide parameters for search suggestions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#getSuggestions)
    *
    * @param suggestionsParams An object that is passed as a parameter for search suggestions.
    *
    */
  def getSuggestions(suggestionsParams: GetSuggestionsParameters): IPromise[js.Array[SuggestResult]]
}

@JSGlobal("__esri.SearchSource")
@js.native
object SearchSource extends TopLevel[SearchSourceConstructor]

