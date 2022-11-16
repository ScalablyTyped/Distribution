package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorTileLayerCapabilities extends StObject {
  
  var exportMap: VectorTileLayerCapabilitiesExportMap
  
  /**
    * Indicates options supported by the exportTiles operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#capabilities)
    */
  var exportTiles: Any
  
  /**
    * Indicates operations that can be performed on the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#capabilities)
    */
  var operations: VectorTileLayerCapabilitiesOperations
}
object VectorTileLayerCapabilities {
  
  inline def apply(
    exportMap: VectorTileLayerCapabilitiesExportMap,
    exportTiles: Any,
    operations: VectorTileLayerCapabilitiesOperations
  ): VectorTileLayerCapabilities = {
    val __obj = js.Dynamic.literal(exportMap = exportMap.asInstanceOf[js.Any], exportTiles = exportTiles.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorTileLayerCapabilities]
  }
  
  extension [Self <: VectorTileLayerCapabilities](x: Self) {
    
    inline def setExportMap(value: VectorTileLayerCapabilitiesExportMap): Self = StObject.set(x, "exportMap", value.asInstanceOf[js.Any])
    
    inline def setExportTiles(value: Any): Self = StObject.set(x, "exportTiles", value.asInstanceOf[js.Any])
    
    inline def setOperations(value: VectorTileLayerCapabilitiesOperations): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
  }
}
