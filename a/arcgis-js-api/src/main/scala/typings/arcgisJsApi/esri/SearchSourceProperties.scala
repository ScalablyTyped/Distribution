package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchSourceProperties extends js.Object {
  /**
    * Indicates whether to automatically navigate to the selected result once selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#autoNavigate)
    *
    * @default true
    */
  var autoNavigate: js.UndefOr[Boolean] = js.native
  /**
    * For filtering suggests or search results. Please see the object specification table below for details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#filter)
    */
  var filter: js.UndefOr[SearchSourceFilter] = js.native
  /**
    * Function used to get search results. See [GetResultsHandler](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#GetResultsHandler) for the function definition. When resolved, returns an object containing an array of [search results](esri-widgets-Search.html#SearchResult).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#getResults)
    *
    * @default null
    */
  var getResults: js.UndefOr[GetResultsHandler] = js.native
  /**
    * Function used to get search suggestions. See [GetSuggestionsParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#GetSuggestionsParameters) for the function definition. When resolved, returns an object containing an array of [suggest results](esri-widgets-Search.html#SuggestResult).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#getSuggestions)
    *
    * @default null
    */
  var getSuggestions: js.UndefOr[GetSuggestionsParameters] = js.native
  /**
    * Indicates the maximum number of search results to return.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#maxResults)
    *
    * @default 6
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Indicates the maximum number of suggestions to return for the widget's input.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#maxSuggestions)
    *
    * @default 6
    */
  var maxSuggestions: js.UndefOr[Double] = js.native
  /**
    * Indicates the minimum number of characters required before querying for a suggestion.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#minSuggestCharacters)
    *
    * @default 1
    */
  var minSuggestCharacters: js.UndefOr[Double] = js.native
  /**
    * Specifies the fields returned with the search results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#outFields)
    */
  var outFields: js.UndefOr[js.Array[String]] = js.native
  /**
    * Used as a hint for the source input text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#placeholder)
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * Indicates whether to display a [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) when a selected result is clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#popupEnabled)
    */
  var popupEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The popup template used to display search results. If no popup is needed, set the source's popupTemplate to `null`.
    * > This property should be set in instances where there is no existing [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) configured. For example, [feature sources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html) will default to any existing [popupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#popupTemplate) configured on the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#popupTemplate)
    */
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.native
  /**
    * Specify this to prefix the user's input of the search text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#prefix)
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * Indicates whether to show a graphic on the map for the selected source using the [resultSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#resultSymbol).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#resultGraphicEnabled)
    */
  var resultGraphicEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The symbol used to display the result.
    * > **Known Limitations**  This property only applies when the layer/locator/source is not part of the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#resultSymbol)
    */
  var resultSymbol: js.UndefOr[SymbolProperties] = js.native
  /**
    * Specify this to add a suffix to the user's input for the search value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#suffix)
    */
  var suffix: js.UndefOr[String] = js.native
  /**
    * Indicates whether to display suggestions as the user enters input text in the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#suggestionsEnabled)
    *
    * @default true
    */
  var suggestionsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to constrain the search results to the view's extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#withinViewEnabled)
    *
    * @default false
    */
  var withinViewEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The set zoom scale for the resulting search result. This scale is automatically honored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#zoomScale)
    *
    * @default null
    */
  var zoomScale: js.UndefOr[Double] = js.native
}

object SearchSourceProperties {
  @scala.inline
  def apply(): SearchSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSourceProperties]
  }
  @scala.inline
  implicit class SearchSourcePropertiesOps[Self <: SearchSourceProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoNavigate(value: Boolean): Self = this.set("autoNavigate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoNavigate: Self = this.set("autoNavigate", js.undefined)
    @scala.inline
    def setFilter(value: SearchSourceFilter): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setGetResults(value: /* params */ js.Any => js.Promise[js.Array[SearchResult]]): Self = this.set("getResults", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetResults: Self = this.set("getResults", js.undefined)
    @scala.inline
    def setGetSuggestions(value: /* params */ js.Any => js.Promise[js.Array[SuggestResult]]): Self = this.set("getSuggestions", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetSuggestions: Self = this.set("getSuggestions", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setMaxSuggestions(value: Double): Self = this.set("maxSuggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSuggestions: Self = this.set("maxSuggestions", js.undefined)
    @scala.inline
    def setMinSuggestCharacters(value: Double): Self = this.set("minSuggestCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSuggestCharacters: Self = this.set("minSuggestCharacters", js.undefined)
    @scala.inline
    def setOutFieldsVarargs(value: String*): Self = this.set("outFields", js.Array(value :_*))
    @scala.inline
    def setOutFields(value: js.Array[String]): Self = this.set("outFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutFields: Self = this.set("outFields", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPopupEnabled(value: Boolean): Self = this.set("popupEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupEnabled: Self = this.set("popupEnabled", js.undefined)
    @scala.inline
    def setPopupTemplate(value: PopupTemplateProperties): Self = this.set("popupTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupTemplate: Self = this.set("popupTemplate", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setResultGraphicEnabled(value: Boolean): Self = this.set("resultGraphicEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultGraphicEnabled: Self = this.set("resultGraphicEnabled", js.undefined)
    @scala.inline
    def setResultSymbol(value: SymbolProperties): Self = this.set("resultSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultSymbol: Self = this.set("resultSymbol", js.undefined)
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    @scala.inline
    def setSuggestionsEnabled(value: Boolean): Self = this.set("suggestionsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestionsEnabled: Self = this.set("suggestionsEnabled", js.undefined)
    @scala.inline
    def setWithinViewEnabled(value: Boolean): Self = this.set("withinViewEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithinViewEnabled: Self = this.set("withinViewEnabled", js.undefined)
    @scala.inline
    def setZoomScale(value: Double): Self = this.set("zoomScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomScale: Self = this.set("zoomScale", js.undefined)
  }
  
}

