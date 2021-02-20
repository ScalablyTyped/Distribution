package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerSearchSourceProperties extends SearchSourceProperties {
  
  /**
    * The results are displayed using this field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#displayField)
    */
  var displayField: js.UndefOr[String] = js.native
  
  /**
    * Indicates to only return results that match the search value exactly.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#exactMatch)
    */
  var exactMatch: js.UndefOr[Boolean] = js.native
  
  /**
    * The layer queried in the search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#layer)
    */
  var layer: js.UndefOr[LayerProperties] = js.native
  
  /**
    * The name of the source for display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#name)
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * One or more field names used to order the query results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#orderByFields)
    */
  var orderByFields: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An array of string values representing the names of fields in the feature layer to search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#searchFields)
    */
  var searchFields: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A template string used to display multiple fields in a defined order when results are displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#searchTemplate)
    */
  var searchTemplate: js.UndefOr[String] = js.native
  
  /**
    * A template string used to display multiple fields in a defined order when suggestions are displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#suggestionTemplate)
    */
  var suggestionTemplate: js.UndefOr[String] = js.native
}
object LayerSearchSourceProperties {
  
  @scala.inline
  def apply(): LayerSearchSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerSearchSourceProperties]
  }
  
  @scala.inline
  implicit class LayerSearchSourcePropertiesMutableBuilder[Self <: LayerSearchSourceProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayField(value: String): Self = StObject.set(x, "displayField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayFieldUndefined: Self = StObject.set(x, "displayField", js.undefined)
    
    @scala.inline
    def setExactMatch(value: Boolean): Self = StObject.set(x, "exactMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactMatchUndefined: Self = StObject.set(x, "exactMatch", js.undefined)
    
    @scala.inline
    def setLayer(value: LayerProperties): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrderByFields(value: js.Array[String]): Self = StObject.set(x, "orderByFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByFieldsUndefined: Self = StObject.set(x, "orderByFields", js.undefined)
    
    @scala.inline
    def setOrderByFieldsVarargs(value: String*): Self = StObject.set(x, "orderByFields", js.Array(value :_*))
    
    @scala.inline
    def setSearchFields(value: js.Array[String]): Self = StObject.set(x, "searchFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchFieldsUndefined: Self = StObject.set(x, "searchFields", js.undefined)
    
    @scala.inline
    def setSearchFieldsVarargs(value: String*): Self = StObject.set(x, "searchFields", js.Array(value :_*))
    
    @scala.inline
    def setSearchTemplate(value: String): Self = StObject.set(x, "searchTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTemplateUndefined: Self = StObject.set(x, "searchTemplate", js.undefined)
    
    @scala.inline
    def setSuggestionTemplate(value: String): Self = StObject.set(x, "suggestionTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionTemplateUndefined: Self = StObject.set(x, "suggestionTemplate", js.undefined)
  }
}
