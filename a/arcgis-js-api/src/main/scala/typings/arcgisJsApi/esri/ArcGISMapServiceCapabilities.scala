package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArcGISMapServiceCapabilities extends Object {
  
  /**
    * Indicates options supported by the exportMap operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var exportMap: ArcGISMapServiceCapabilitiesExportMap = js.native
  
  /**
    * Indicates options supported by the exportTiles operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var exportTiles: ArcGISMapServiceCapabilitiesExportTiles = js.native
  
  /**
    * Indicates operations that can be performed on the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var operations: ArcGISMapServiceCapabilitiesOperations = js.native
}
object ArcGISMapServiceCapabilities {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    exportMap: ArcGISMapServiceCapabilitiesExportMap,
    exportTiles: ArcGISMapServiceCapabilitiesExportTiles,
    hasOwnProperty: PropertyKey => Boolean,
    operations: ArcGISMapServiceCapabilitiesOperations,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ArcGISMapServiceCapabilities = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], exportMap = exportMap.asInstanceOf[js.Any], exportTiles = exportTiles.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), operations = operations.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ArcGISMapServiceCapabilities]
  }
  
  @scala.inline
  implicit class ArcGISMapServiceCapabilitiesOps[Self <: ArcGISMapServiceCapabilities] (val x: Self) extends AnyVal {
    
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
    def setExportMap(value: ArcGISMapServiceCapabilitiesExportMap): Self = this.set("exportMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportTiles(value: ArcGISMapServiceCapabilitiesExportTiles): Self = this.set("exportTiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperations(value: ArcGISMapServiceCapabilitiesOperations): Self = this.set("operations", value.asInstanceOf[js.Any])
  }
}
