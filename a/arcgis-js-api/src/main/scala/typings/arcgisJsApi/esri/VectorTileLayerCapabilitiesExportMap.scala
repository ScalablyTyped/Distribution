package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorTileLayerCapabilitiesExportMap extends StObject {
  
  /**
    * Specifies the maximum number of tiles that can be exported to a cache dataset or a tile package.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#capabilities)
    */
  var maxExportTilesCount: Double
}
object VectorTileLayerCapabilitiesExportMap {
  
  inline def apply(maxExportTilesCount: Double): VectorTileLayerCapabilitiesExportMap = {
    val __obj = js.Dynamic.literal(maxExportTilesCount = maxExportTilesCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorTileLayerCapabilitiesExportMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VectorTileLayerCapabilitiesExportMap] (val x: Self) extends AnyVal {
    
    inline def setMaxExportTilesCount(value: Double): Self = StObject.set(x, "maxExportTilesCount", value.asInstanceOf[js.Any])
  }
}
