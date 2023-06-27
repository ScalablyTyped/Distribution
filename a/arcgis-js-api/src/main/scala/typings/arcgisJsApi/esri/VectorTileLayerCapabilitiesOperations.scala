package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorTileLayerCapabilitiesOperations extends StObject {
  
  /**
  		 * Indicates if the tiles from the service can be exported.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#capabilities)
  		 */
  var supportsExportTiles: Boolean
  
  /**
  		 * Indicates if the service exposes a tile map that describes the presence of tiles.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#capabilities)
  		 */
  var supportsTileMap: Boolean
}
object VectorTileLayerCapabilitiesOperations {
  
  inline def apply(supportsExportTiles: Boolean, supportsTileMap: Boolean): VectorTileLayerCapabilitiesOperations = {
    val __obj = js.Dynamic.literal(supportsExportTiles = supportsExportTiles.asInstanceOf[js.Any], supportsTileMap = supportsTileMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorTileLayerCapabilitiesOperations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VectorTileLayerCapabilitiesOperations] (val x: Self) extends AnyVal {
    
    inline def setSupportsExportTiles(value: Boolean): Self = StObject.set(x, "supportsExportTiles", value.asInstanceOf[js.Any])
    
    inline def setSupportsTileMap(value: Boolean): Self = StObject.set(x, "supportsTileMap", value.asInstanceOf[js.Any])
  }
}
