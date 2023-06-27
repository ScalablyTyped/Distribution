package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcGISMapServiceCapabilities extends StObject {
  
  /**
  		 * Indicates options supported by the exportMap operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
  		 */
  var exportMap: ArcGISMapServiceCapabilitiesExportMap
  
  /**
  		 * Indicates options supported by the exportTiles operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
  		 */
  var exportTiles: ArcGISMapServiceCapabilitiesExportTiles
  
  /**
  		 * Indicates operations that can be performed on the service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
  		 */
  var operations: ArcGISMapServiceCapabilitiesOperations
}
object ArcGISMapServiceCapabilities {
  
  inline def apply(
    exportMap: ArcGISMapServiceCapabilitiesExportMap,
    exportTiles: ArcGISMapServiceCapabilitiesExportTiles,
    operations: ArcGISMapServiceCapabilitiesOperations
  ): ArcGISMapServiceCapabilities = {
    val __obj = js.Dynamic.literal(exportMap = exportMap.asInstanceOf[js.Any], exportTiles = exportTiles.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGISMapServiceCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArcGISMapServiceCapabilities] (val x: Self) extends AnyVal {
    
    inline def setExportMap(value: ArcGISMapServiceCapabilitiesExportMap): Self = StObject.set(x, "exportMap", value.asInstanceOf[js.Any])
    
    inline def setExportTiles(value: ArcGISMapServiceCapabilitiesExportTiles): Self = StObject.set(x, "exportTiles", value.asInstanceOf[js.Any])
    
    inline def setOperations(value: ArcGISMapServiceCapabilitiesOperations): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
  }
}
