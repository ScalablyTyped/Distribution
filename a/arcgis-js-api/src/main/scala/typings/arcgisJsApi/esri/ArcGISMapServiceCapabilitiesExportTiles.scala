package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcGISMapServiceCapabilitiesExportTiles extends StObject {
  
  /**
    * Specifies the maximum number of tiles that can be exported to a cache dataset or a tile package.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var maxExportTilesCount: Double
}
object ArcGISMapServiceCapabilitiesExportTiles {
  
  inline def apply(maxExportTilesCount: Double): ArcGISMapServiceCapabilitiesExportTiles = {
    val __obj = js.Dynamic.literal(maxExportTilesCount = maxExportTilesCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGISMapServiceCapabilitiesExportTiles]
  }
  
  extension [Self <: ArcGISMapServiceCapabilitiesExportTiles](x: Self) {
    
    inline def setMaxExportTilesCount(value: Double): Self = StObject.set(x, "maxExportTilesCount", value.asInstanceOf[js.Any])
  }
}
