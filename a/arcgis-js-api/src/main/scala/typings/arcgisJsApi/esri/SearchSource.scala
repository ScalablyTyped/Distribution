package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchSource
  extends StObject
     with Accessor
     with JSONSupport
     with Identifiable {
  
  /**
  		 * Indicates whether to automatically navigate to the selected result once selected.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#autoNavigate)
  		 */
  var autoNavigate: Boolean = js.native
  
  /**
  		 * For filtering suggests or search results.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#filter)
  		 */
  var filter: SearchSourceFilter = js.native
  
  /**
  		 * Function used to get search results.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#getResults)
  		 */
  def getResults(params: Any): js.Promise[js.Array[SearchResult]] = js.native
  /**
  		 * Function used to get search results.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#getResults)
  		 */
  @JSName("getResults")
  var getResults_Original: GetResultsHandler = js.native
  
  /**
  		 * Function used to get search suggestions.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#getSuggestions)
  		 */
  def getSuggestions(params: Any): js.Promise[js.Array[SuggestResult]] = js.native
  /**
  		 * Function used to get search suggestions.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#getSuggestions)
  		 */
  @JSName("getSuggestions")
  var getSuggestions_Original: GetSuggestionsParameters = js.native
  
  /**
  		 * Indicates the maximum number of search results to return.
  		 *
  		 * @default 6
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#maxResults)
  		 */
  var maxResults: Double = js.native
  
  /**
  		 * Indicates the maximum number of suggestions to return for the widget's input.
  		 *
  		 * @default 6
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#maxSuggestions)
  		 */
  var maxSuggestions: Double = js.native
  
  /**
  		 * Indicates the minimum number of characters required before querying for a suggestion.
  		 *
  		 * @default 1
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#minSuggestCharacters)
  		 */
  var minSuggestCharacters: Double = js.native
  
  /**
  		 * Specifies the fields returned with the search results.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#outFields)
  		 */
  var outFields: js.Array[String] = js.native
  
  /**
  		 * Used as a hint for the source input text.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#placeholder)
  		 */
  var placeholder: String = js.native
  
  /**
  		 * Indicates whether to display a [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) when a selected result is clicked.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#popupEnabled)
  		 */
  var popupEnabled: Boolean = js.native
  
  /**
  		 * The popup template used to display search results.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#popupTemplate)
  		 */
  var popupTemplate: PopupTemplate = js.native
  
  /**
  		 * Specify this to prefix the user's input of the search text.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#prefix)
  		 */
  var prefix: String = js.native
  
  /**
  		 * Indicates whether to show a graphic on the map for the selected source using the [resultSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#resultSymbol).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#resultGraphicEnabled)
  		 */
  var resultGraphicEnabled: Boolean = js.native
  
  /**
  		 * The symbol used to display the result.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#resultSymbol)
  		 */
  var resultSymbol: Symbol = js.native
  
  /**
  		 * Specify this to add a suffix to the user's input for the search value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#suffix)
  		 */
  var suffix: String = js.native
  
  /**
  		 * Indicates whether to display suggestions as the user enters input text in the widget.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#suggestionsEnabled)
  		 */
  var suggestionsEnabled: Boolean = js.native
  
  /**
  		 * Indicates whether to constrain the search results to the view's extent.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#withinViewEnabled)
  		 */
  var withinViewEnabled: Boolean = js.native
  
  /**
  		 * The set zoom scale for the resulting search result.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#zoomScale)
  		 */
  var zoomScale: Double = js.native
}
