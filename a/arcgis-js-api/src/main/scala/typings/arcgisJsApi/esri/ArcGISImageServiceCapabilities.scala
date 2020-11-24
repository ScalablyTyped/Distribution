package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArcGISImageServiceCapabilities extends Object {
  
  /**
    * Describes operations supported by the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var operations: ArcGISImageServiceCapabilitiesOperations = js.native
  
  /**
    * Describes [query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) operations supported by the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var query: ArcGISImageServiceCapabilitiesQuery = js.native
}
object ArcGISImageServiceCapabilities {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    operations: ArcGISImageServiceCapabilitiesOperations,
    propertyIsEnumerable: PropertyKey => Boolean,
    query: ArcGISImageServiceCapabilitiesQuery
  ): ArcGISImageServiceCapabilities = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), operations = operations.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGISImageServiceCapabilities]
  }
  
  @scala.inline
  implicit class ArcGISImageServiceCapabilitiesOps[Self <: ArcGISImageServiceCapabilities] (val x: Self) extends AnyVal {
    
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
    def setOperations(value: ArcGISImageServiceCapabilitiesOperations): Self = this.set("operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: ArcGISImageServiceCapabilitiesQuery): Self = this.set("query", value.asInstanceOf[js.Any])
  }
}
