package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerSearchSourceProperties extends SearchSourceProperties {
  /**
    * The results are displayed using this field. Defaults to the layer's `displayField` or the first string field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#displayField)
    */
  var displayField: js.UndefOr[String] = js.undefined
  /**
    * Indicates to only return results that match the search value exactly. This property only applies to `string` field searches. `exactMatch` is always `true` when searching fields of type `number`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#exactMatch)
    *
    * @default false
    */
  var exactMatch: js.UndefOr[Boolean] = js.undefined
  /**
    * The layer queried in the search. This is **required**.
    * > Layers created from client-side graphics are not supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#layer)
    */
  var layer: js.UndefOr[LayerProperties] = js.undefined
  /**
    * The name of the source for display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * One or more field names used to order the query results. Specfiy `ASC` (ascending) or `DESC` (descending) after the field name to control the order. The default order is `ASC`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#orderByFields)
    */
  var orderByFields: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * An array of string values representing the names of fields in the feature layer to search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#searchFields)
    */
  var searchFields: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A template string used to display multiple fields in a defined order when results are displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#searchTemplate)
    */
  var searchTemplate: js.UndefOr[String] = js.undefined
  /**
    * A template string used to display multiple fields in a defined order when suggestions are displayed. This takes precedence over `displayField`. Field names in the template must have the following format: `{FieldName}`. An example suggestionTemplate could look something like: `Name: {OWNER}, Parcel: {PARCEL_ID}`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#suggestionTemplate)
    */
  var suggestionTemplate: js.UndefOr[String] = js.undefined
}

object LayerSearchSourceProperties {
  @scala.inline
  def apply(
    autoNavigate: js.UndefOr[Boolean] = js.undefined,
    displayField: String = null,
    exactMatch: js.UndefOr[Boolean] = js.undefined,
    filter: SearchSourceFilter = null,
    getResults: /* params */ js.Any => js.Promise[js.Array[SearchResult]] = null,
    getSuggestions: /* params */ js.Any => js.Promise[js.Array[SuggestResult]] = null,
    layer: LayerProperties = null,
    maxResults: Int | Double = null,
    maxSuggestions: Int | Double = null,
    minSuggestCharacters: Int | Double = null,
    name: String = null,
    orderByFields: js.Array[String] = null,
    outFields: js.Array[String] = null,
    placeholder: String = null,
    popupEnabled: js.UndefOr[Boolean] = js.undefined,
    popupTemplate: PopupTemplateProperties = null,
    prefix: String = null,
    resultGraphicEnabled: js.UndefOr[Boolean] = js.undefined,
    resultSymbol: SymbolProperties = null,
    searchFields: js.Array[String] = null,
    searchTemplate: String = null,
    suffix: String = null,
    suggestionTemplate: String = null,
    suggestionsEnabled: js.UndefOr[Boolean] = js.undefined,
    withinViewEnabled: js.UndefOr[Boolean] = js.undefined,
    zoomScale: Int | Double = null
  ): LayerSearchSourceProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoNavigate)) __obj.updateDynamic("autoNavigate")(autoNavigate.asInstanceOf[js.Any])
    if (displayField != null) __obj.updateDynamic("displayField")(displayField.asInstanceOf[js.Any])
    if (!js.isUndefined(exactMatch)) __obj.updateDynamic("exactMatch")(exactMatch.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (getResults != null) __obj.updateDynamic("getResults")(js.Any.fromFunction1(getResults))
    if (getSuggestions != null) __obj.updateDynamic("getSuggestions")(js.Any.fromFunction1(getSuggestions))
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (maxSuggestions != null) __obj.updateDynamic("maxSuggestions")(maxSuggestions.asInstanceOf[js.Any])
    if (minSuggestCharacters != null) __obj.updateDynamic("minSuggestCharacters")(minSuggestCharacters.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (orderByFields != null) __obj.updateDynamic("orderByFields")(orderByFields.asInstanceOf[js.Any])
    if (outFields != null) __obj.updateDynamic("outFields")(outFields.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(popupEnabled)) __obj.updateDynamic("popupEnabled")(popupEnabled.asInstanceOf[js.Any])
    if (popupTemplate != null) __obj.updateDynamic("popupTemplate")(popupTemplate.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(resultGraphicEnabled)) __obj.updateDynamic("resultGraphicEnabled")(resultGraphicEnabled.asInstanceOf[js.Any])
    if (resultSymbol != null) __obj.updateDynamic("resultSymbol")(resultSymbol.asInstanceOf[js.Any])
    if (searchFields != null) __obj.updateDynamic("searchFields")(searchFields.asInstanceOf[js.Any])
    if (searchTemplate != null) __obj.updateDynamic("searchTemplate")(searchTemplate.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (suggestionTemplate != null) __obj.updateDynamic("suggestionTemplate")(suggestionTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(suggestionsEnabled)) __obj.updateDynamic("suggestionsEnabled")(suggestionsEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(withinViewEnabled)) __obj.updateDynamic("withinViewEnabled")(withinViewEnabled.asInstanceOf[js.Any])
    if (zoomScale != null) __obj.updateDynamic("zoomScale")(zoomScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerSearchSourceProperties]
  }
}

