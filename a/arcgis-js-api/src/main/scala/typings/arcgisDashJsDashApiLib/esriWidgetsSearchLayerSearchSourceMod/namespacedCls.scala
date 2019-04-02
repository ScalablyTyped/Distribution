package typings
package arcgisDashJsDashApiLib.esriWidgetsSearchLayerSearchSourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/widgets/Search/LayerSearchSource", JSImport.Namespace)
@js.native
/**
  * The following properties define a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html)-based [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#sources) whose features may be searched by a [Search](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html) widget instance.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html)
  */
class namespacedCls ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.LayerSearchSource {
  def this(properties: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.LayerSearchSourceProperties) = this()
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
    * The results are displayed using this field. Defaults to the layer's `displayField` or the first string field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#displayField)
    */
  /* CompleteClass */
  override var displayField: java.lang.String = js.native
  /**
    * Indicates to only return results that match the search value exactly. This property only applies to `string` field searches. `exactMatch` is always `true` when searching fields of type `number`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#exactMatch)
    *
    * @default false
    */
  /* CompleteClass */
  override var exactMatch: scala.Boolean = js.native
  /**
    * This property replaces the now deprecated `searchQueryParams`, `suggestQueryParams`, and `searchExtent` properties. Please see the object specification table below for details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#filter)
    */
  /* CompleteClass */
  override var filter: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.SearchSourceFilter = js.native
  /**
    * The layer queried in the search. This is **required**.
    * > Layers created from client-side graphics are not supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#layer)
    */
  /* CompleteClass */
  override var layer: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Layer = js.native
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#name)
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
    * > This property should be set in instances where there is no existing [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) configured. For example, [feature sources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html) will default to any existing [popupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#popupTemplate) configured on the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#popupTemplate)
    */
  /* CompleteClass */
  override var popupTemplate: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.PopupTemplate = js.native
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
  override var resultSymbol: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Symbol = js.native
  /**
    * An array of string values representing the names of fields in the feature layer to search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#searchFields)
    */
  /* CompleteClass */
  override var searchFields: js.Array[java.lang.String] = js.native
  /**
    * A template string used to display multiple fields in a defined order when results are displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#searchTemplate)
    */
  /* CompleteClass */
  override var searchTemplate: java.lang.String = js.native
  /**
    * Specify this to add a suffix to the user's input for the search value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#suffix)
    */
  /* CompleteClass */
  override var suffix: java.lang.String = js.native
  /**
    * A template string used to display multiple fields in a defined order when suggestions are displayed. This takes precedence over `displayField`. Field names in the template must have the following format: `{FieldName}`. An example suggestionTemplate could look something like: `Name: {OWNER}, Parcel: {PARCEL_ID}`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#suggestionTemplate)
    */
  /* CompleteClass */
  override var suggestionTemplate: java.lang.String = js.native
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
    * Method to provide parameters for a given search source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#getResults)
    *
    * @param resultsParams An object that is passed as a parameter to get search results.
    *
    */
  /* CompleteClass */
  override def getResults(resultsParams: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.GetResultsParameters): arcgisDashJsDashApiLib.IPromise[js.Array[arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.SearchResult]] = js.native
  /**
    * Method to provide parameters for search suggestions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#getSuggestions)
    *
    * @param suggestionsParams An object that is passed as a parameter for search suggestions.
    *
    */
  /* CompleteClass */
  override def getSuggestions(suggestionsParams: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.GetSuggestionsParameters): arcgisDashJsDashApiLib.IPromise[js.Array[arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.SuggestResult]] = js.native
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

