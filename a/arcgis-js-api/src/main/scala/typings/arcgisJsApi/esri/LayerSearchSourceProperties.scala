package typings.arcgisJsApi.esri

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
  implicit class LayerSearchSourcePropertiesOps[Self <: LayerSearchSourceProperties] (val x: Self) extends AnyVal {
    
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
    def setDisplayField(value: String): Self = this.set("displayField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayField: Self = this.set("displayField", js.undefined)
    
    @scala.inline
    def setExactMatch(value: Boolean): Self = this.set("exactMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExactMatch: Self = this.set("exactMatch", js.undefined)
    
    @scala.inline
    def setLayer(value: LayerProperties): Self = this.set("layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayer: Self = this.set("layer", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOrderByFieldsVarargs(value: String*): Self = this.set("orderByFields", js.Array(value :_*))
    
    @scala.inline
    def setOrderByFields(value: js.Array[String]): Self = this.set("orderByFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderByFields: Self = this.set("orderByFields", js.undefined)
    
    @scala.inline
    def setSearchFieldsVarargs(value: String*): Self = this.set("searchFields", js.Array(value :_*))
    
    @scala.inline
    def setSearchFields(value: js.Array[String]): Self = this.set("searchFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchFields: Self = this.set("searchFields", js.undefined)
    
    @scala.inline
    def setSearchTemplate(value: String): Self = this.set("searchTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchTemplate: Self = this.set("searchTemplate", js.undefined)
    
    @scala.inline
    def setSuggestionTemplate(value: String): Self = this.set("suggestionTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestionTemplate: Self = this.set("suggestionTemplate", js.undefined)
  }
}
