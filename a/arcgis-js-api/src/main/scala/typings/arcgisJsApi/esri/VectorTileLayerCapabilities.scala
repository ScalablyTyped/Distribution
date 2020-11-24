package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorTileLayerCapabilities extends Object {
  
  var exportMap: VectorTileLayerCapabilitiesExportMap = js.native
  
  /**
    * Indicates options supported by the exportTiles operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#capabilities)
    */
  var exportTiles: js.Any = js.native
  
  /**
    * Indicates operations that can be performed on the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#capabilities)
    */
  var operations: VectorTileLayerCapabilitiesOperations = js.native
}
object VectorTileLayerCapabilities {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    exportMap: VectorTileLayerCapabilitiesExportMap,
    exportTiles: js.Any,
    hasOwnProperty: PropertyKey => Boolean,
    operations: VectorTileLayerCapabilitiesOperations,
    propertyIsEnumerable: PropertyKey => Boolean
  ): VectorTileLayerCapabilities = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], exportMap = exportMap.asInstanceOf[js.Any], exportTiles = exportTiles.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), operations = operations.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[VectorTileLayerCapabilities]
  }
  
  @scala.inline
  implicit class VectorTileLayerCapabilitiesOps[Self <: VectorTileLayerCapabilities] (val x: Self) extends AnyVal {
    
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
    def setExportMap(value: VectorTileLayerCapabilitiesExportMap): Self = this.set("exportMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportTiles(value: js.Any): Self = this.set("exportTiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperations(value: VectorTileLayerCapabilitiesOperations): Self = this.set("operations", value.asInstanceOf[js.Any])
  }
}
