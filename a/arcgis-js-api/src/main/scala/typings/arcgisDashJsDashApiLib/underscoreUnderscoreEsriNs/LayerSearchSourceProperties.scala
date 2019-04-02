package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerSearchSourceProperties extends SearchSourceProperties {
  /**
    * The results are displayed using this field. Defaults to the layer's `displayField` or the first string field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#displayField)
    */
  var displayField: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates to only return results that match the search value exactly. This property only applies to `string` field searches. `exactMatch` is always `true` when searching fields of type `number`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#exactMatch)
    *
    * @default false
    */
  var exactMatch: js.UndefOr[scala.Boolean] = js.undefined
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
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of string values representing the names of fields in the feature layer to search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#searchFields)
    */
  var searchFields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A template string used to display multiple fields in a defined order when results are displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#searchTemplate)
    */
  var searchTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A template string used to display multiple fields in a defined order when suggestions are displayed. This takes precedence over `displayField`. Field names in the template must have the following format: `{FieldName}`. An example suggestionTemplate could look something like: `Name: {OWNER}, Parcel: {PARCEL_ID}`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#suggestionTemplate)
    */
  var suggestionTemplate: js.UndefOr[java.lang.String] = js.undefined
}

object LayerSearchSourceProperties {
  @scala.inline
  def apply(
    autoNavigate: js.UndefOr[scala.Boolean] = js.undefined,
    displayField: java.lang.String = null,
    exactMatch: js.UndefOr[scala.Boolean] = js.undefined,
    filter: SearchSourceFilter = null,
    layer: LayerProperties = null,
    maxResults: scala.Int | scala.Double = null,
    maxSuggestions: scala.Int | scala.Double = null,
    minSuggestCharacters: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    outFields: js.Array[java.lang.String] = null,
    placeholder: java.lang.String = null,
    popupEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    popupTemplate: PopupTemplateProperties = null,
    prefix: java.lang.String = null,
    resultGraphicEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    resultSymbol: SymbolProperties = null,
    searchFields: js.Array[java.lang.String] = null,
    searchTemplate: java.lang.String = null,
    suffix: java.lang.String = null,
    suggestionTemplate: java.lang.String = null,
    suggestionsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    withinViewEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    zoomScale: scala.Int | scala.Double = null
  ): LayerSearchSourceProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoNavigate)) __obj.updateDynamic("autoNavigate")(autoNavigate)
    if (displayField != null) __obj.updateDynamic("displayField")(displayField)
    if (!js.isUndefined(exactMatch)) __obj.updateDynamic("exactMatch")(exactMatch)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (layer != null) __obj.updateDynamic("layer")(layer)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (maxSuggestions != null) __obj.updateDynamic("maxSuggestions")(maxSuggestions.asInstanceOf[js.Any])
    if (minSuggestCharacters != null) __obj.updateDynamic("minSuggestCharacters")(minSuggestCharacters.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (outFields != null) __obj.updateDynamic("outFields")(outFields)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(popupEnabled)) __obj.updateDynamic("popupEnabled")(popupEnabled)
    if (popupTemplate != null) __obj.updateDynamic("popupTemplate")(popupTemplate)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (!js.isUndefined(resultGraphicEnabled)) __obj.updateDynamic("resultGraphicEnabled")(resultGraphicEnabled)
    if (resultSymbol != null) __obj.updateDynamic("resultSymbol")(resultSymbol)
    if (searchFields != null) __obj.updateDynamic("searchFields")(searchFields)
    if (searchTemplate != null) __obj.updateDynamic("searchTemplate")(searchTemplate)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (suggestionTemplate != null) __obj.updateDynamic("suggestionTemplate")(suggestionTemplate)
    if (!js.isUndefined(suggestionsEnabled)) __obj.updateDynamic("suggestionsEnabled")(suggestionsEnabled)
    if (!js.isUndefined(withinViewEnabled)) __obj.updateDynamic("withinViewEnabled")(withinViewEnabled)
    if (zoomScale != null) __obj.updateDynamic("zoomScale")(zoomScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerSearchSourceProperties]
  }
}

