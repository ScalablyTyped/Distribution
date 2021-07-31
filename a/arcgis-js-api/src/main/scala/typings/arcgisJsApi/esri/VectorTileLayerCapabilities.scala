package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorTileLayerCapabilities
  extends StObject
     with Object {
  
  var exportMap: VectorTileLayerCapabilitiesExportMap
  
  /**
    * Indicates options supported by the exportTiles operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#capabilities)
    */
  var exportTiles: js.Any
  
  /**
    * Indicates operations that can be performed on the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#capabilities)
    */
  var operations: VectorTileLayerCapabilitiesOperations
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
  implicit class VectorTileLayerCapabilitiesMutableBuilder[Self <: VectorTileLayerCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportMap(value: VectorTileLayerCapabilitiesExportMap): Self = StObject.set(x, "exportMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportTiles(value: js.Any): Self = StObject.set(x, "exportTiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperations(value: VectorTileLayerCapabilitiesOperations): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
  }
}
