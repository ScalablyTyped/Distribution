package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSVLayerCapabilities extends Object {
  
  /**
    * Describes characteristics of the data in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var data: CSVLayerCapabilitiesData = js.native
  
  /**
    * Describes editing capabilities that can be performed on the features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var editing: CSVLayerCapabilitiesEditing = js.native
  
  /**
    * Describes operations that can be performed on features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var operations: CSVLayerCapabilitiesOperations = js.native
  
  /**
    * Describes [query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) operations that can be performed on features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var query: CSVLayerCapabilitiesQuery = js.native
  
  /**
    * Indicates if the layer's query operation supports querying features or records related to features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var queryRelated: CSVLayerCapabilitiesQueryRelated = js.native
}
object CSVLayerCapabilities {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    data: CSVLayerCapabilitiesData,
    editing: CSVLayerCapabilitiesEditing,
    hasOwnProperty: PropertyKey => Boolean,
    operations: CSVLayerCapabilitiesOperations,
    propertyIsEnumerable: PropertyKey => Boolean,
    query: CSVLayerCapabilitiesQuery,
    queryRelated: CSVLayerCapabilitiesQueryRelated
  ): CSVLayerCapabilities = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], editing = editing.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), operations = operations.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), query = query.asInstanceOf[js.Any], queryRelated = queryRelated.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSVLayerCapabilities]
  }
  
  @scala.inline
  implicit class CSVLayerCapabilitiesOps[Self <: CSVLayerCapabilities] (val x: Self) extends AnyVal {
    
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
    def setData(value: CSVLayerCapabilitiesData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditing(value: CSVLayerCapabilitiesEditing): Self = this.set("editing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperations(value: CSVLayerCapabilitiesOperations): Self = this.set("operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: CSVLayerCapabilitiesQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryRelated(value: CSVLayerCapabilitiesQueryRelated): Self = this.set("queryRelated", value.asInstanceOf[js.Any])
  }
}
