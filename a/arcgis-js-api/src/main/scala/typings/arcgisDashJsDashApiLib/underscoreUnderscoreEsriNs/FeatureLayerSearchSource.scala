package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureLayerSearchSource extends SearchSource {
  /**
    * The results are displayed using this field. Defaults to the layer's `displayField` or the first string field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-FeatureLayerSearchSource.html#displayField)
    */
  var displayField: java.lang.String
  /**
    * Indicates to only return results that match the search value exactly. This property only applies to `string` field searches. `exactMatch` is always `true` when searching fields of type `number`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-FeatureLayerSearchSource.html#exactMatch)
    *
    * @default false
    */
  var exactMatch: scala.Boolean
  /**
    * The feature layer queried in the search. This is **required**.
    * > Feature layers created from client-side graphics are not supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-FeatureLayerSearchSource.html#featureLayer)
    */
  var featureLayer: FeatureLayer
  /**
    * The name of the source for display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-FeatureLayerSearchSource.html#name)
    */
  var name: java.lang.String
  /**
    * An array of string values representing the names of fields in the feature layer to search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-FeatureLayerSearchSource.html#searchFields)
    */
  var searchFields: js.Array[java.lang.String]
  /**
    * A template string used to display multiple fields in a defined order when results are displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-FeatureLayerSearchSource.html#searchTemplate)
    */
  var searchTemplate: java.lang.String
  /**
    * A template string used to display multiple fields in a defined order when suggestions are displayed. This takes precedence over `displayField`. Field names in the template must have the following format: `{FieldName}`. An example suggestionTemplate could look something like: `Name: {OWNER}, Parcel: {PARCEL_ID}`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-FeatureLayerSearchSource.html#suggestionTemplate)
    */
  var suggestionTemplate: java.lang.String
}

object FeatureLayerSearchSource {
  @scala.inline
  def apply(
    autoNavigate: scala.Boolean,
    clone: js.Function0[FeatureLayerSearchSource],
    displayField: java.lang.String,
    exactMatch: scala.Boolean,
    featureLayer: FeatureLayer,
    filter: SearchSourceFilter,
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
    searchFields: js.Array[java.lang.String],
    searchTemplate: java.lang.String,
    suffix: java.lang.String,
    suggestionTemplate: java.lang.String,
    suggestionsEnabled: scala.Boolean,
    toJSON: js.Function0[js.Any],
    withinViewEnabled: scala.Boolean,
    zoomScale: scala.Double
  ): FeatureLayerSearchSource = {
    val __obj = js.Dynamic.literal(autoNavigate = autoNavigate, clone = clone, displayField = displayField, exactMatch = exactMatch, featureLayer = featureLayer, filter = filter, maxResults = maxResults, maxSuggestions = maxSuggestions, minSuggestCharacters = minSuggestCharacters, name = name, outFields = outFields, placeholder = placeholder, popupEnabled = popupEnabled, popupTemplate = popupTemplate, prefix = prefix, resultGraphicEnabled = resultGraphicEnabled, resultSymbol = resultSymbol, searchFields = searchFields, searchTemplate = searchTemplate, suffix = suffix, suggestionTemplate = suggestionTemplate, suggestionsEnabled = suggestionsEnabled, toJSON = toJSON, withinViewEnabled = withinViewEnabled, zoomScale = zoomScale)
  
    __obj.asInstanceOf[FeatureLayerSearchSource]
  }
}

